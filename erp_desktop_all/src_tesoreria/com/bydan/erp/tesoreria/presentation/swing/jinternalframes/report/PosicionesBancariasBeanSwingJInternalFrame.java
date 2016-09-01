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

//import com.bydan.erp.tesoreria.util.PosicionesBancariasConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.PosicionesBancariasParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.PosicionesBancariasParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.PosicionesBancariasBean;
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
public class PosicionesBancariasBeanSwingJInternalFrame extends PosicionesBancariasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PosicionesBancariasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PosicionesBancarias> posicionesbancariasValidator = new ClassValidator<PosicionesBancarias>(PosicionesBancarias.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PosicionesBancarias posicionesbancarias;	
	public PosicionesBancarias posicionesbancariasAux;
	public PosicionesBancarias posicionesbancariasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PosicionesBancarias posicionesbancariasTotales;
	public Long idPosicionesBancariasActual;
	public Long iIdNuevoPosicionesBancarias=0L;
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
	
	public Boolean isPermisoTodoPosicionesBancarias;
	public Boolean isPermisoNuevoPosicionesBancarias;
	public Boolean isPermisoActualizarPosicionesBancarias;
	public Boolean isPermisoActualizarOriginalPosicionesBancarias;
	public Boolean isPermisoEliminarPosicionesBancarias;
	public Boolean isPermisoGuardarCambiosPosicionesBancarias;
	public Boolean isPermisoConsultaPosicionesBancarias;
	public Boolean isPermisoBusquedaPosicionesBancarias;
	public Boolean isPermisoReportePosicionesBancarias;
	public Boolean isPermisoPaginacionMedioPosicionesBancarias;
	public Boolean isPermisoPaginacionAltoPosicionesBancarias;
	public Boolean isPermisoPaginacionTodoPosicionesBancarias;
	public Boolean isPermisoCopiarPosicionesBancarias;
	public Boolean isPermisoVerFormPosicionesBancarias;
	public Boolean isPermisoDuplicarPosicionesBancarias;
	public Boolean isPermisoOrdenPosicionesBancarias;
	
	
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
	
	public PosicionesBancariasParameterReturnGeneral posicionesbancariasReturnGeneral;
	public PosicionesBancariasParameterReturnGeneral posicionesbancariasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPosicionesBancarias=false;
	public Boolean esParaAccionDesdeFormularioPosicionesBancarias=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PosicionesBancariasSessionBeanAdditional posicionesbancariasSessionBeanAdditional=null;
	
	public PosicionesBancariasSessionBeanAdditional getPosicionesBancariasSessionBeanAdditional() {
		return this.posicionesbancariasSessionBeanAdditional;
	}
	
	public void setPosicionesBancariasSessionBeanAdditional(PosicionesBancariasSessionBeanAdditional posicionesbancariasSessionBeanAdditional) {
		try {
			this.posicionesbancariasSessionBeanAdditional=posicionesbancariasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PosicionesBancariasBeanSwingJInternalFrameAdditional posicionesbancariasBeanSwingJInternalFrameAdditional=null;
	//public class PosicionesBancariasBeanSwingJInternalFrame
	
	public PosicionesBancariasBeanSwingJInternalFrameAdditional getPosicionesBancariasBeanSwingJInternalFrameAdditional() {
		return this.posicionesbancariasBeanSwingJInternalFrameAdditional;
	}
	
	public void setPosicionesBancariasBeanSwingJInternalFrameAdditional(PosicionesBancariasBeanSwingJInternalFrameAdditional posicionesbancariasBeanSwingJInternalFrameAdditional) {
		try {
			this.posicionesbancariasBeanSwingJInternalFrameAdditional=posicionesbancariasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PosicionesBancariasLogic posicionesbancariasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PosicionesBancarias posicionesbancariasBean;
	public PosicionesBancariasConstantesFunciones posicionesbancariasConstantesFunciones;
	//public PosicionesBancariasParameterReturnGeneral posicionesbancariasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<PosicionesBancarias> posicionesbancariass;	
	//public List<PosicionesBancarias> posicionesbancariassEliminados;
	//public List<PosicionesBancarias> posicionesbancariassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPosicionesBancarias=false;
	public Boolean isVisibilidadCeldaDuplicarPosicionesBancarias=true;
	public Boolean isVisibilidadCeldaCopiarPosicionesBancarias=true;
	public Boolean isVisibilidadCeldaVerFormPosicionesBancarias=true;
	public Boolean isVisibilidadCeldaOrdenPosicionesBancarias=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
	public Boolean isVisibilidadCeldaModificarPosicionesBancarias=false;
	public Boolean isVisibilidadCeldaActualizarPosicionesBancarias=false;
	public Boolean isVisibilidadCeldaEliminarPosicionesBancarias=false;
	public Boolean isVisibilidadCeldaCancelarPosicionesBancarias=false;
	public Boolean isVisibilidadCeldaGuardarPosicionesBancarias=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;	
	
	
	public Boolean isVisibilidadBusquedaPosicionesBancarias=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoPosicionesBancarias() {
		return this.iIdNuevoPosicionesBancarias;
	}

	public void setiIdNuevoPosicionesBancarias(Long iIdNuevoPosicionesBancarias) {
		this.iIdNuevoPosicionesBancarias = iIdNuevoPosicionesBancarias;
	}
	
	public Long getidPosicionesBancariasActual() {
		return this.idPosicionesBancariasActual;
	}

	public void setidPosicionesBancariasActual(Long idPosicionesBancariasActual) {
		this.idPosicionesBancariasActual = idPosicionesBancariasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PosicionesBancarias getposicionesbancarias() {
		return this.posicionesbancarias;
	}

	public void setposicionesbancarias(PosicionesBancarias posicionesbancarias) {
		this.posicionesbancarias = posicionesbancarias;
	}
	
	public PosicionesBancarias getposicionesbancariasAux() {
		return this.posicionesbancariasAux;
	}

	public void setposicionesbancariasAux(PosicionesBancarias posicionesbancariasAux) {
		this.posicionesbancariasAux = posicionesbancariasAux;
	}				
	
	public PosicionesBancarias getposicionesbancariasAnterior() {
		return this.posicionesbancariasAnterior;
	}

	public void setposicionesbancariasAnterior(PosicionesBancarias posicionesbancariasAnterior) {
		this.posicionesbancariasAnterior = posicionesbancariasAnterior;
	}	
	
	public PosicionesBancarias getposicionesbancariasTotales() {
		return this.posicionesbancariasTotales;
	}

	public void setposicionesbancariasTotales(PosicionesBancarias posicionesbancariasTotales) {
		this.posicionesbancariasTotales = posicionesbancariasTotales;
	}	
	
	public PosicionesBancarias getposicionesbancariasBean() {
		return this.posicionesbancariasBean;
	}

	public void setposicionesbancariasBean(PosicionesBancarias posicionesbancariasBean) {
		this.posicionesbancariasBean = posicionesbancariasBean;
	}	
	
	public PosicionesBancariasParameterReturnGeneral getposicionesbancariasReturnGeneral() {
		return this.posicionesbancariasReturnGeneral;
	}

	public void setposicionesbancariasReturnGeneral(PosicionesBancariasParameterReturnGeneral posicionesbancariasReturnGeneral) {
		this.posicionesbancariasReturnGeneral = posicionesbancariasReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaPosicionesBancarias=-1L;

	public Long getid_ejercicioBusquedaPosicionesBancarias() {
		return this.id_ejercicioBusquedaPosicionesBancarias;
	}

	public void setid_ejercicioBusquedaPosicionesBancarias(Long id_ejercicioBusquedaPosicionesBancarias) {
		this.id_ejercicioBusquedaPosicionesBancarias = id_ejercicioBusquedaPosicionesBancarias;
	}

;
	public Long id_tipo_movimientoBusquedaPosicionesBancarias=-1L;

	public Long getid_tipo_movimientoBusquedaPosicionesBancarias() {
		return this.id_tipo_movimientoBusquedaPosicionesBancarias;
	}

	public void setid_tipo_movimientoBusquedaPosicionesBancarias(Long id_tipo_movimientoBusquedaPosicionesBancarias) {
		this.id_tipo_movimientoBusquedaPosicionesBancarias = id_tipo_movimientoBusquedaPosicionesBancarias;
	}

;
	public Date fecha_desdeBusquedaPosicionesBancarias=new Date();

	public Date getfecha_desdeBusquedaPosicionesBancarias() {
		return this.fecha_desdeBusquedaPosicionesBancarias;
	}

	public void setfecha_desdeBusquedaPosicionesBancarias(Date fecha_desdeBusquedaPosicionesBancarias) {
		this.fecha_desdeBusquedaPosicionesBancarias = fecha_desdeBusquedaPosicionesBancarias;
	}

;
	public Date fecha_hastaBusquedaPosicionesBancarias=new Date();

	public Date getfecha_hastaBusquedaPosicionesBancarias() {
		return this.fecha_hastaBusquedaPosicionesBancarias;
	}

	public void setfecha_hastaBusquedaPosicionesBancarias(Date fecha_hastaBusquedaPosicionesBancarias) {
		this.fecha_hastaBusquedaPosicionesBancarias = fecha_hastaBusquedaPosicionesBancarias;
	}

;
	public Long orden_desdeBusquedaPosicionesBancarias=0L;

	public Long getorden_desdeBusquedaPosicionesBancarias() {
		return this.orden_desdeBusquedaPosicionesBancarias;
	}

	public void setorden_desdeBusquedaPosicionesBancarias(Long orden_desdeBusquedaPosicionesBancarias) {
		this.orden_desdeBusquedaPosicionesBancarias = orden_desdeBusquedaPosicionesBancarias;
	}

;
	public Long orden_hastaBusquedaPosicionesBancarias=0L;

	public Long getorden_hastaBusquedaPosicionesBancarias() {
		return this.orden_hastaBusquedaPosicionesBancarias;
	}

	public void setorden_hastaBusquedaPosicionesBancarias(Long orden_hastaBusquedaPosicionesBancarias) {
		this.orden_hastaBusquedaPosicionesBancarias = orden_hastaBusquedaPosicionesBancarias;
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

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PosicionesBancariasLogic getPosicionesBancariasLogic()	{		
		return posicionesbancariasLogic;
	}

	public void setPosicionesBancariasLogic(PosicionesBancariasLogic posicionesbancariasLogic) {
		this.posicionesbancariasLogic = posicionesbancariasLogic;
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
	
	public Boolean getIsEsNuevoPosicionesBancarias() {
		return isEsNuevoPosicionesBancarias;
	}

	public void setIsEsNuevoPosicionesBancarias(Boolean isEsNuevoPosicionesBancarias) {
		this.isEsNuevoPosicionesBancarias = isEsNuevoPosicionesBancarias;
	}

	public Boolean getEsParaAccionDesdeFormularioPosicionesBancarias() {
		return esParaAccionDesdeFormularioPosicionesBancarias;
	}
	
	public void setEsParaAccionDesdeFormularioPosicionesBancarias(Boolean esParaAccionDesdeFormularioPosicionesBancarias) {
		this.esParaAccionDesdeFormularioPosicionesBancarias = esParaAccionDesdeFormularioPosicionesBancarias;
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

			if(this.posicionesbancariasSessionBean==null) {
				this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
			}

			if(!this.posicionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(posicionesbancariasSessionBean.getlidEmpresaActual());
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

			if(this.posicionesbancariasSessionBean==null) {
				this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
			}

			if(!this.posicionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(posicionesbancariasSessionBean.getlidEjercicioActual());
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

			if(this.posicionesbancariasSessionBean==null) {
				this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
			}

			if(!this.posicionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
					tipomovimientoLogic.getEntityWithConnection(posicionesbancariasSessionBean.getlidTipoMovimientoActual());
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

					if(this.posicionesbancarias!=null) {
						this.posicionesbancarias.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
						this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPosicionesBancarias.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPosicionesBancariasGenerico)throws Exception
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
				jComboBoxid_empresaPosicionesBancariasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPosicionesBancariasGenerico!=null && jComboBoxid_empresaPosicionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_empresaPosicionesBancariasGenerico.setSelectedIndex(0);
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

					if(this.posicionesbancarias!=null) {
						this.posicionesbancarias.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
						this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPosicionesBancarias.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPosicionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias!=null) {
						jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias!=null) {
							//jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPosicionesBancariasGenerico)throws Exception
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
				jComboBoxid_ejercicioPosicionesBancariasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPosicionesBancariasGenerico!=null && jComboBoxid_ejercicioPosicionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPosicionesBancariasGenerico.setSelectedIndex(0);
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

					if(this.posicionesbancarias!=null) {
						this.posicionesbancarias.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
						this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoPosicionesBancarias.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPosicionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias!=null) {
						jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias!=null) {
							//jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setSelectedIndex(0);
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
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoPosicionesBancariasGenerico)throws Exception
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
				jComboBoxid_tipo_movimientoPosicionesBancariasGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoPosicionesBancariasGenerico!=null && jComboBoxid_tipo_movimientoPosicionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoPosicionesBancariasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PosicionesBancarias posicionesbancarias,JComboBox jComboBoxid_empresaPosicionesBancariasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPosicionesBancariasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPosicionesBancariasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				posicionesbancarias.setid_empresa(empresaAux.getId());
				posicionesbancarias.setempresa_descripcion(PosicionesBancariasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				posicionesbancarias.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PosicionesBancarias posicionesbancarias,JComboBox jComboBoxid_ejercicioPosicionesBancariasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPosicionesBancariasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPosicionesBancariasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				posicionesbancarias.setid_ejercicio(ejercicioAux.getId());
				posicionesbancarias.setejercicio_descripcion(PosicionesBancariasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				posicionesbancarias.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(PosicionesBancarias posicionesbancarias,JComboBox jComboBoxid_tipo_movimientoPosicionesBancariasGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoPosicionesBancariasGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoPosicionesBancariasGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				posicionesbancarias.setid_tipo_movimiento(tipomovimientoAux.getId());
				posicionesbancarias.settipomovimiento_descripcion(PosicionesBancariasConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				posicionesbancarias.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { 
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { 
					}

					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { 
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { 
					}

					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPosicionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.addItem(ejercicio);
							}
						}

						if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { 
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { 
					}

					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPosicionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.addItem(tipomovimiento);
							}
						}

						if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPosicionesBancarias() throws Exception {
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
		
	public PosicionesBancariasParameterReturnGeneral getPosicionesBancariasParameterGeneral() {
		return this.posicionesbancariasParameterGeneral;
	}
	
	public void setPosicionesBancariasParameterGeneral(PosicionesBancariasParameterReturnGeneral posicionesbancariasParameterGeneral) {
		this.posicionesbancariasParameterGeneral = posicionesbancariasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPosicionesBancarias() {
		return isPermisoTodoPosicionesBancarias;
	}

	public void setIsPermisoTodoPosicionesBancarias(Boolean isPermisoTodoPosicionesBancarias) {
		this.isPermisoTodoPosicionesBancarias = isPermisoTodoPosicionesBancarias;
	}

	public Boolean getIsPermisoNuevoPosicionesBancarias() {
		return isPermisoNuevoPosicionesBancarias;
	}

	public void setIsPermisoNuevoPosicionesBancarias(Boolean isPermisoNuevoPosicionesBancarias) {
		this.isPermisoNuevoPosicionesBancarias = isPermisoNuevoPosicionesBancarias;
	}

	public Boolean getIsPermisoActualizarPosicionesBancarias() {
		return isPermisoActualizarPosicionesBancarias;
	}

	public void setIsPermisoActualizarPosicionesBancarias(Boolean isPermisoActualizarPosicionesBancarias) {
		this.isPermisoActualizarPosicionesBancarias = isPermisoActualizarPosicionesBancarias;
	}

	public Boolean getIsPermisoEliminarPosicionesBancarias() {
		return isPermisoEliminarPosicionesBancarias;
	}

	public void setIsPermisoEliminarPosicionesBancarias(Boolean isPermisoEliminarPosicionesBancarias) {
		this.isPermisoEliminarPosicionesBancarias = isPermisoEliminarPosicionesBancarias;
	}

	public Boolean getIsPermisoGuardarCambiosPosicionesBancarias() {
		return isPermisoGuardarCambiosPosicionesBancarias;
	}

	public void setIsPermisoGuardarCambiosPosicionesBancarias(Boolean isPermisoGuardarCambiosPosicionesBancarias) {
		this.isPermisoGuardarCambiosPosicionesBancarias = isPermisoGuardarCambiosPosicionesBancarias;
	}
	
	public Boolean getIsPermisoConsultaPosicionesBancarias() {
		return isPermisoConsultaPosicionesBancarias;
	}

	public void setIsPermisoConsultaPosicionesBancarias(Boolean isPermisoConsultaPosicionesBancarias) {
		this.isPermisoConsultaPosicionesBancarias = isPermisoConsultaPosicionesBancarias;
	}

	public Boolean getIsPermisoBusquedaPosicionesBancarias() {
		return isPermisoBusquedaPosicionesBancarias;
	}

	public void setIsPermisoBusquedaPosicionesBancarias(Boolean isPermisoBusquedaPosicionesBancarias) {
		this.isPermisoBusquedaPosicionesBancarias = isPermisoBusquedaPosicionesBancarias;
	}

	public Boolean getIsPermisoReportePosicionesBancarias() {
		return isPermisoReportePosicionesBancarias;
	}

	public void setIsPermisoReportePosicionesBancarias(Boolean isPermisoReportePosicionesBancarias) {
		this.isPermisoReportePosicionesBancarias = isPermisoReportePosicionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionMedioPosicionesBancarias() {
		return isPermisoPaginacionMedioPosicionesBancarias;
	}

	public void setIsPermisoPaginacionMedioPosicionesBancarias(Boolean isPermisoPaginacionMedioPosicionesBancarias) {
		this.isPermisoPaginacionMedioPosicionesBancarias = isPermisoPaginacionMedioPosicionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionTodoPosicionesBancarias() {
		return isPermisoPaginacionTodoPosicionesBancarias;
	}

	public void setIsPermisoPaginacionTodoPosicionesBancarias(Boolean isPermisoPaginacionTodoPosicionesBancarias) {
		this.isPermisoPaginacionTodoPosicionesBancarias = isPermisoPaginacionTodoPosicionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionAltoPosicionesBancarias() {
		return isPermisoPaginacionAltoPosicionesBancarias;
	}

	public void setIsPermisoPaginacionAltoPosicionesBancarias(Boolean isPermisoPaginacionAltoPosicionesBancarias) {
		this.isPermisoPaginacionAltoPosicionesBancarias = isPermisoPaginacionAltoPosicionesBancarias;
	}
	
	public Boolean getIsPermisoCopiarPosicionesBancarias() {
		return isPermisoCopiarPosicionesBancarias;
	}

	public void setIsPermisoCopiarPosicionesBancarias(Boolean isPermisoCopiarPosicionesBancarias) {
		this.isPermisoCopiarPosicionesBancarias = isPermisoCopiarPosicionesBancarias;
	}
	
	public Boolean getIsPermisoVerFormPosicionesBancarias() {
		return isPermisoVerFormPosicionesBancarias;
	}

	public void setIsPermisoVerFormPosicionesBancarias(Boolean isPermisoVerFormPosicionesBancarias) {
		this.isPermisoVerFormPosicionesBancarias = isPermisoVerFormPosicionesBancarias;
	}
	
	public Boolean getIsPermisoDuplicarPosicionesBancarias() {
		return isPermisoDuplicarPosicionesBancarias;
	}

	public void setIsPermisoDuplicarPosicionesBancarias(Boolean isPermisoDuplicarPosicionesBancarias) {
		this.isPermisoDuplicarPosicionesBancarias = isPermisoDuplicarPosicionesBancarias;
	}
	
	public Boolean getIsPermisoOrdenPosicionesBancarias() {
		return isPermisoOrdenPosicionesBancarias;
	}

	public void setIsPermisoOrdenPosicionesBancarias(Boolean isPermisoOrdenPosicionesBancarias) {
		this.isPermisoOrdenPosicionesBancarias = isPermisoOrdenPosicionesBancarias;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPosicionesBancarias() {
		return isVisibilidadCeldaNuevoPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaNuevoPosicionesBancarias(Boolean isVisibilidadCeldaNuevoPosicionesBancarias) {
		this.isVisibilidadCeldaNuevoPosicionesBancarias = isVisibilidadCeldaNuevoPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPosicionesBancarias() {
		return isVisibilidadCeldaDuplicarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaDuplicarPosicionesBancarias(Boolean isVisibilidadCeldaDuplicarPosicionesBancarias) {
		this.isVisibilidadCeldaDuplicarPosicionesBancarias = isVisibilidadCeldaDuplicarPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPosicionesBancarias() {
		return isVisibilidadCeldaCopiarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaCopiarPosicionesBancarias(Boolean isVisibilidadCeldaCopiarPosicionesBancarias) {
		this.isVisibilidadCeldaCopiarPosicionesBancarias = isVisibilidadCeldaCopiarPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPosicionesBancarias() {
		return isVisibilidadCeldaVerFormPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaVerFormPosicionesBancarias(Boolean isVisibilidadCeldaVerFormPosicionesBancarias) {
		this.isVisibilidadCeldaVerFormPosicionesBancarias = isVisibilidadCeldaVerFormPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPosicionesBancarias() {
		return isVisibilidadCeldaOrdenPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaOrdenPosicionesBancarias(Boolean isVisibilidadCeldaOrdenPosicionesBancarias) {
		this.isVisibilidadCeldaOrdenPosicionesBancarias = isVisibilidadCeldaOrdenPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPosicionesBancarias() {
		return isVisibilidadCeldaNuevoRelacionesPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPosicionesBancarias(Boolean isVisibilidadCeldaNuevoRelacionesPosicionesBancarias) {
		this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias = isVisibilidadCeldaNuevoRelacionesPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPosicionesBancarias() {
		return isVisibilidadCeldaModificarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaModificarPosicionesBancarias(Boolean isVisibilidadCeldaModificarPosicionesBancarias) {
		this.isVisibilidadCeldaModificarPosicionesBancarias = isVisibilidadCeldaModificarPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPosicionesBancarias() {
		return isVisibilidadCeldaActualizarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaActualizarPosicionesBancarias(Boolean isVisibilidadCeldaActualizarPosicionesBancarias) {
		this.isVisibilidadCeldaActualizarPosicionesBancarias = isVisibilidadCeldaActualizarPosicionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaEliminarPosicionesBancarias() {
		return isVisibilidadCeldaEliminarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaEliminarPosicionesBancarias(Boolean isVisibilidadCeldaEliminarPosicionesBancarias) {
		this.isVisibilidadCeldaEliminarPosicionesBancarias = isVisibilidadCeldaEliminarPosicionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaCancelarPosicionesBancarias() {
		return isVisibilidadCeldaCancelarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaCancelarPosicionesBancarias(Boolean isVisibilidadCeldaCancelarPosicionesBancarias) {
		this.isVisibilidadCeldaCancelarPosicionesBancarias = isVisibilidadCeldaCancelarPosicionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaGuardarPosicionesBancarias() {
		return isVisibilidadCeldaGuardarPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaGuardarPosicionesBancarias(Boolean isVisibilidadCeldaGuardarPosicionesBancarias) {
		this.isVisibilidadCeldaGuardarPosicionesBancarias = isVisibilidadCeldaGuardarPosicionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPosicionesBancarias() {
		return isVisibilidadCeldaGuardarCambiosPosicionesBancarias;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPosicionesBancarias(Boolean isVisibilidadCeldaGuardarCambiosPosicionesBancarias) {
		this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias = isVisibilidadCeldaGuardarCambiosPosicionesBancarias;
	}
		
	public PosicionesBancariasSessionBean getposicionesbancariasSessionBean() {
		return this.posicionesbancariasSessionBean;
	}
	
	public void setposicionesbancariasSessionBean(PosicionesBancariasSessionBean posicionesbancariasSessionBean) {
		this.posicionesbancariasSessionBean=posicionesbancariasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPosicionesBancarias() {
		return this.isVisibilidadBusquedaPosicionesBancarias;
	}

	public void setisVisibilidadBusquedaPosicionesBancarias(Boolean isVisibilidadBusquedaPosicionesBancarias) {
		this.isVisibilidadBusquedaPosicionesBancarias=isVisibilidadBusquedaPosicionesBancarias;
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

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(PosicionesBancarias posicionesbancarias)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(posicionesbancarias,null);
				this.setActualParaGuardarEjercicioForeignKey(posicionesbancarias,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(posicionesbancarias,null);
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
	
	public void bugActualizarReferenciaActual(PosicionesBancarias posicionesbancarias,PosicionesBancarias posicionesbancariasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPosicionesBancarias(posicionesbancarias);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		posicionesbancariasAux.setId(posicionesbancarias.getId());
		posicionesbancariasAux.setVersionRow(posicionesbancarias.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PosicionesBancarias posicionesbancariasLocal) throws Exception {
		
		if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PosicionesBancarias posicionesbancariasLocal) throws Exception {	
		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				posicionesbancariasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				posicionesbancariasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				posicionesbancariasLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPosicionesBancariasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = posicionesbancariasValidator.getInvalidValues(this.posicionesbancarias);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PosicionesBancarias posicionesbancarias,List<PosicionesBancarias> posicionesbancariass) throws Exception {
	}		
	
	public void actualizarSelectedLista(PosicionesBancarias posicionesbancarias,List<PosicionesBancarias> posicionesbancariass) throws Exception {
		try	{			
			PosicionesBancariasConstantesFunciones.actualizarSelectedLista(posicionesbancarias,posicionesbancariass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PosicionesBancarias> posicionesbancariassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				posicionesbancariassLocal=this.posicionesbancariasLogic.getPosicionesBancariass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				posicionesbancariassLocal=this.posicionesbancariass;
			}
			//ARCHITECTURE
		
			for(PosicionesBancarias posicionesbancariasLocal:posicionesbancariassLocal) {
				if(this.permiteMantenimiento(posicionesbancariasLocal) && posicionesbancariasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PosicionesBancariasConstantesFunciones.getPosicionesBancariasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.TIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeltipo_documentoPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeldetallePosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.CODIGOCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelcodigo_cuentaPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.NOMBRECUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelnombre_cuentaPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelnumero_mayorPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeldebito_localPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelcredito_localPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeltipo_movimientoPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelfecha_emisionPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelfechaPosicionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PosicionesBancariasConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelbeneficiarioPosicionesBancarias,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeltipo_documentoPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeldetallePosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelcodigo_cuentaPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelnombre_cuentaPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelnumero_mayorPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeldebito_localPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelcredito_localPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeltipo_movimientoPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelfecha_emisionPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelfechaPosicionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelbeneficiarioPosicionesBancarias,"");
		
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
		this.iIdNuevoPosicionesBancarias--;	
		
		
		this.posicionesbancariasAux=new PosicionesBancarias();
		
		this.posicionesbancariasAux.setId(this.iIdNuevoPosicionesBancarias);
		this.posicionesbancariasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.posicionesbancariasLogic.getPosicionesBancariass().add(this.posicionesbancariasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.posicionesbancariass.add(this.posicionesbancariasAux);
		}
		//ARCHITECTURE
		
		this.posicionesbancarias=this.posicionesbancariasAux;
		
		if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancarias);
			this.setVariablesObjetoActualToFormularioForeignKeyPosicionesBancarias(this.posicionesbancarias);
		}
				
		//this.setDefaultControlesPosicionesBancarias();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPosicionesBancarias();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPosicionesBancarias();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPosicionesBancarias();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPosicionesBancarias(this.posicionesbancariasBean,this.posicionesbancarias,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPosicionesBancarias(this.posicionesbancariasReturnGeneral,this.posicionesbancariasBean,false);
		
		if(this.posicionesbancariasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPosicionesBancarias(this.posicionesbancariasReturnGeneral.getPosicionesBancarias());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancariasReturnGeneral.getPosicionesBancarias());
		}
		
		if(this.posicionesbancariasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancariasReturnGeneral.getPosicionesBancarias(),classes);//this.posicionesbancariasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPosicionesBancarias();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPosicionesBancarias();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.RecargarFormPosicionesBancarias(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPosicionesBancarias(false);
						
			if(posicionesbancariasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPosicionesBancarias();
			}
			
			this.actualizarVisualTableDatosPosicionesBancarias();
			
			this.jTableDatosPosicionesBancarias.setRowSelectionInterval(this.getIndiceNuevoPosicionesBancarias(), this.getIndiceNuevoPosicionesBancarias());
			
			this.seleccionarFilaTablaPosicionesBancariasActual();
						
			this.actualizarEstadoCeldasBotonesPosicionesBancarias("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPosicionesBancarias(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_desdePosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarfecha_desdePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_hastaPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarfecha_hastaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_desdePosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarorden_desdePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_hastaPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarorden_hastaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activartipo_documentoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activardetallePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarcodigo_cuentaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarnombre_cuentaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarnumero_mayorPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activardebito_localPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarcredito_localPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activartipo_movimientoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarfecha_emisionPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarfechaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarbeneficiarioPosicionesBancarias);	
		//
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarid_empresaPosicionesBancarias);//
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarid_ejercicioPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setEnabled(isHabilitar && this.posicionesbancariasConstantesFunciones.activarid_tipo_movimientoPosicionesBancarias);
	};
	
	public void setDefaultControlesPosicionesBancarias() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPosicionesBancarias(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.posicionesbancariasSessionBean.setConGuardarRelaciones(true);			
			this.posicionesbancariasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.setVisible(true);
			
					
		} else {
			//this.posicionesbancariasSessionBean.setConGuardarRelaciones(false);			
			this.posicionesbancariasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPosicionesBancarias() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
				if(posicionesbancariasAux.getId().equals(this.iIdNuevoPosicionesBancarias)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariass) {
				if(posicionesbancariasAux.getId().equals(this.iIdNuevoPosicionesBancarias)) {
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
	
	public int getIndiceActualPosicionesBancarias(PosicionesBancarias posicionesbancarias,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
				if(posicionesbancariasAux.getId().equals(posicionesbancarias.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariass) {
				if(posicionesbancariasAux.getId().equals(posicionesbancarias.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPosicionesBancarias(PosicionesBancarias posicionesbancariasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
				if(posicionesbancariasAux.getPosicionesBancariasOriginal().getId().equals(posicionesbancariasOriginal.getId())) {
					existe=true;
					posicionesbancariasOriginal.setId(posicionesbancariasAux.getId());
					posicionesbancariasOriginal.setVersionRow(posicionesbancariasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariass) {
				if(posicionesbancariasAux.getPosicionesBancariasOriginal().getId().equals(posicionesbancariasOriginal.getId())) {
					existe=true;
					posicionesbancariasOriginal.setId(posicionesbancariasAux.getId());
					posicionesbancariasOriginal.setVersionRow(posicionesbancariasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPosicionesBancarias(Boolean esParaCancelar) throws Exception {
		posicionesbancariassAux=new ArrayList<PosicionesBancarias>();
		posicionesbancariasAux=new PosicionesBancarias();
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
					if(posicionesbancariasAux.getId()<0) {
						posicionesbancariassAux.add(posicionesbancariasAux);
					}		
				}
				this.iIdNuevoPosicionesBancarias=0L;
				this.posicionesbancariasLogic.getPosicionesBancariass().removeAll(posicionesbancariassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariass) {
					if(posicionesbancariasAux.getId()<0) {
						posicionesbancariassAux.add(posicionesbancariasAux);
					}		
				}
				this.iIdNuevoPosicionesBancarias=0L;
				this.posicionesbancariass.removeAll(posicionesbancariassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPosicionesBancarias 
					&& this.posicionesbancariasLogic.getPosicionesBancariass().size()>0
					) {
					posicionesbancariasAux=this.posicionesbancariasLogic.getPosicionesBancariass().get(this.posicionesbancariasLogic.getPosicionesBancariass().size() - 1);
				
					if(posicionesbancariasAux.getId()<0) {
						this.posicionesbancariasLogic.getPosicionesBancariass().remove(posicionesbancariasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPosicionesBancarias && this.posicionesbancariass.size()>0) {
					posicionesbancariasAux=this.posicionesbancariass.get(this.posicionesbancariass.size() - 1);
				
					if(posicionesbancariasAux.getId()<0) {
						this.posicionesbancariass.remove(posicionesbancariasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPosicionesBancarias(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(posicionesbancarias.getId()<0) {
				this.posicionesbancariasLogic.getPosicionesBancariass().remove(this.posicionesbancarias);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(posicionesbancarias.getId()<0) {
				this.posicionesbancariass.remove(this.posicionesbancarias);
			}
		}			
	}
	
	public void setEstadosInicialesPosicionesBancarias(List<PosicionesBancarias> posicionesbancariassAux) throws Exception {
		PosicionesBancariasConstantesFunciones.setEstadosInicialesPosicionesBancarias(posicionesbancariassAux);
	}
	
	public void setEstadosInicialesPosicionesBancarias(PosicionesBancarias posicionesbancariasAux) throws Exception {
		PosicionesBancariasConstantesFunciones.setEstadosInicialesPosicionesBancarias(posicionesbancariasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPosicionesBancariasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPosicionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPosicionesBancariasActual()) {
				if(!this.isEsNuevoPosicionesBancarias) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPosicionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPosicionesBancarias=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPosicionesBancariasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Posiciones Bancarias ?", "MANTENIMIENTO DE Posiciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPosicionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PosicionesBancarias posicionesbancarias) throws Exception {
		PosicionesBancariasConstantesFunciones.seleccionarAsignar(this.posicionesbancarias,posicionesbancarias);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPosicionesBancarias=this.isPermisoActualizarOriginalPosicionesBancarias;
			
			
			this.seleccionarAsignar(posicionesbancarias);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPosicionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.posicionesbancariasSessionBean.setsFuncionBusquedaRapida(this.posicionesbancariasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPosicionesBancarias) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPosicionesBancarias(esParaCancelar);				
				this.cancelarNuevoPosicionesBancarias(esParaCancelar);								
			}
			
			this.posicionesbancarias=new PosicionesBancarias();
			
			this.inicializarPosicionesBancarias();
			
			this.actualizarEstadoCeldasBotonesPosicionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPosicionesBancarias() throws Exception {
		try {
			PosicionesBancariasConstantesFunciones.inicializarPosicionesBancarias(this.posicionesbancarias);
			
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
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.posicionesbancariasLogic.getPosicionesBancariass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePosicionesBancariass(String sAccionBusqueda,List<PosicionesBancarias> posicionesbancariassParaReportes) throws Exception {
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
					sPathReporteFinal="PosicionesBancarias"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PosicionesBancariasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PosicionesBancariasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PosicionesBancarias"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Posiciones Bancariases");		
		parameters.put("busquedapor", PosicionesBancariasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePosicionesBancarias=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PosicionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PosicionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePosicionesBancarias=new JRBeanArrayDataSource(PosicionesBancariasJInternalFrame.TraerPosicionesBancariasBeans(posicionesbancariassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePosicionesBancarias);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PosicionesBancariasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PosicionesBancariasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PosicionesBancariasBean.TraerPosicionesBancariasBeans(posicionesbancariassParaReportes).toArray()));
							
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
				this.generarExcelReportePosicionesBancariass(sAccionBusqueda,sTipoArchivoReporte,posicionesbancariassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPosicionesBancariass(sAccionBusqueda,sTipoArchivoReporte,posicionesbancariassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPosicionesBancariasActionPerformed(null);
					//this.generarExcelReportePosicionesBancariass(sAccionBusqueda,sTipoArchivoReporte,posicionesbancariassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPosicionesBancariass(sAccionBusqueda,sTipoArchivoReporte,posicionesbancariassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPosicionesBancariass(sAccionBusqueda,sTipoArchivoReporte,posicionesbancariassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPosicionesBancariass(sAccionBusqueda,sTipoArchivoReporte,posicionesbancariassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePosicionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<PosicionesBancarias> posicionesbancariassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PosicionesBancariass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPosicionesBancarias("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PosicionesBancarias posicionesbancarias : posicionesbancariassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PosicionesBancariasConstantesFunciones.generarExcelReporteDataPosicionesBancarias("NORMAL",row,workbook,posicionesbancarias,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPosicionesBancarias(String sTipo,Row row,Workbook workbook) {
		
		PosicionesBancariasConstantesFunciones.generarExcelReporteHeaderPosicionesBancarias(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPosicionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<PosicionesBancarias> posicionesbancariassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PosicionesBancariass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PosicionesBancarias posicionesbancarias : posicionesbancariassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PosicionesBancariasConstantesFunciones.getPosicionesBancariasDescripcion(posicionesbancarias));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getorden_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getorden_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.gettipo_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getcodigo_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getnombre_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(posicionesbancarias.getbeneficiario());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPosicionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<PosicionesBancarias> posicionesbancariassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PosicionesBancarias> posicionesbancariassRespaldo=null;
		
		classes=PosicionesBancariasConstantesFunciones.getClassesRelationshipsOfPosicionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.posicionesbancariasLogic.setDatosCliente(this.datosCliente);
		this.posicionesbancariasLogic.setDatosDeep(this.datosDeep);
		this.posicionesbancariasLogic.setIsConDeep(true);
		
		posicionesbancariassRespaldo=this.posicionesbancariasLogic.getPosicionesBancariass();
		
		this.posicionesbancariasLogic.setPosicionesBancariass(posicionesbancariassParaReportes);	
		this.posicionesbancariasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		posicionesbancariassParaReportes=this.posicionesbancariasLogic.getPosicionesBancariass();
		this.posicionesbancariasLogic.setPosicionesBancariass(posicionesbancariassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PosicionesBancariass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPosicionesBancarias("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PosicionesBancarias posicionesbancarias : posicionesbancariassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPosicionesBancarias("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PosicionesBancariasConstantesFunciones.generarExcelReporteDataPosicionesBancarias("NORMAL",row,workbook,posicionesbancarias,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PosicionesBancariasConstantesFunciones.getPosicionesBancariasDescripcion(posicionesbancarias));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPosicionesBancarias() throws Exception {		
		this.startProcessPosicionesBancarias(true);
	}
	
	public void startProcessPosicionesBancarias(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPosicionesBancarias ,this.jPanelParametrosReportesPosicionesBancarias, this.jScrollPanelDatosPosicionesBancarias,this.jPanelPaginacionPosicionesBancarias, this.jScrollPanelDatosEdicionPosicionesBancarias, this.jPanelAccionesPosicionesBancarias,this.jPanelAccionesFormularioPosicionesBancarias,this.jmenuBarPosicionesBancarias,this.jmenuBarDetallePosicionesBancarias,this.jTtoolBarPosicionesBancarias,this.jTtoolBarDetallePosicionesBancarias);		
		
		final JTabbedPane jTabbedPaneBusquedasPosicionesBancarias=this.jTabbedPaneBusquedasPosicionesBancarias; 
		
		final JPanel jPanelParametrosReportesPosicionesBancarias=this.jPanelParametrosReportesPosicionesBancarias;
		//final JScrollPane jScrollPanelDatosPosicionesBancarias=this.jScrollPanelDatosPosicionesBancarias;
		final JTable jTableDatosPosicionesBancarias=this.jTableDatosPosicionesBancarias;		
		final JPanel jPanelPaginacionPosicionesBancarias=this.jPanelPaginacionPosicionesBancarias;
		//final JScrollPane jScrollPanelDatosEdicionPosicionesBancarias=this.jScrollPanelDatosEdicionPosicionesBancarias;
		final JPanel jPanelAccionesPosicionesBancarias=this.jPanelAccionesPosicionesBancarias;
		
		JPanel jPanelCamposAuxiliarPosicionesBancarias=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPosicionesBancarias=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			jPanelCamposAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jPanelCamposPosicionesBancarias;
			jPanelAccionesFormularioAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jPanelAccionesFormularioPosicionesBancarias;
		}
		
		final JPanel jPanelCamposPosicionesBancarias=jPanelCamposAuxiliarPosicionesBancarias;
		final JPanel jPanelAccionesFormularioPosicionesBancarias=jPanelAccionesFormularioAuxiliarPosicionesBancarias;
		
		
		final JMenuBar jmenuBarPosicionesBancarias=this.jmenuBarPosicionesBancarias;
		final JToolBar jTtoolBarPosicionesBancarias=this.jTtoolBarPosicionesBancarias;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPosicionesBancarias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPosicionesBancarias=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			jmenuBarDetalleAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jmenuBarDetallePosicionesBancarias;
			jTtoolBarDetalleAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jTtoolBarDetallePosicionesBancarias;
		}
		
		final JMenuBar jmenuBarDetallePosicionesBancarias=jmenuBarDetalleAuxiliarPosicionesBancarias;
		final JToolBar jTtoolBarDetallePosicionesBancarias=jTtoolBarDetalleAuxiliarPosicionesBancarias;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPosicionesBancarias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPosicionesBancarias;
			processRunnable.jTableDatos=jTableDatosPosicionesBancarias;
			processRunnable.jPanelCampos=jPanelCamposPosicionesBancarias;
			processRunnable.jPanelPaginacion=jPanelPaginacionPosicionesBancarias;
			processRunnable.jPanelAcciones=jPanelAccionesPosicionesBancarias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPosicionesBancarias;
			
			
			processRunnable.jmenuBar=jmenuBarPosicionesBancarias;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePosicionesBancarias;
			processRunnable.jTtoolBar=jTtoolBarPosicionesBancarias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePosicionesBancarias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPosicionesBancarias ,jPanelParametrosReportesPosicionesBancarias,jTableDatosPosicionesBancarias, /*jScrollPanelDatosPosicionesBancarias,*/jPanelCamposPosicionesBancarias,jPanelPaginacionPosicionesBancarias, /*jScrollPanelDatosEdicionPosicionesBancarias,*/ jPanelAccionesPosicionesBancarias,jPanelAccionesFormularioPosicionesBancarias,jmenuBarPosicionesBancarias,jmenuBarDetallePosicionesBancarias,jTtoolBarPosicionesBancarias,jTtoolBarDetallePosicionesBancarias);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPosicionesBancarias ,jPanelParametrosReportesPosicionesBancarias, jScrollPanelDatosPosicionesBancarias,jPanelPaginacionPosicionesBancarias, jScrollPanelDatosEdicionPosicionesBancarias, jPanelAccionesPosicionesBancarias,jPanelAccionesFormularioPosicionesBancarias,jmenuBarPosicionesBancarias,jmenuBarDetallePosicionesBancarias,jTtoolBarPosicionesBancarias,jTtoolBarDetallePosicionesBancarias);
						
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
	
	public void finishProcessPosicionesBancarias() {// throws Exception 
		this.finishProcessPosicionesBancarias(true);
	}
	
	public void finishProcessPosicionesBancarias(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPosicionesBancarias ,this.jPanelParametrosReportesPosicionesBancarias, this.jScrollPanelDatosPosicionesBancarias,this.jPanelPaginacionPosicionesBancarias, this.jScrollPanelDatosEdicionPosicionesBancarias, this.jPanelAccionesPosicionesBancarias,this.jPanelAccionesFormularioPosicionesBancarias,this.jmenuBarPosicionesBancarias,this.jmenuBarDetallePosicionesBancarias,this.jTtoolBarPosicionesBancarias,this.jTtoolBarDetallePosicionesBancarias);		
		
		final JTabbedPane jTabbedPaneBusquedasPosicionesBancarias=this.jTabbedPaneBusquedasPosicionesBancarias; 
		
		final JPanel jPanelParametrosReportesPosicionesBancarias=this.jPanelParametrosReportesPosicionesBancarias;
		//final JScrollPane jScrollPanelDatosPosicionesBancarias=this.jScrollPanelDatosPosicionesBancarias;
		final JTable jTableDatosPosicionesBancarias=this.jTableDatosPosicionesBancarias;		
		final JPanel jPanelPaginacionPosicionesBancarias=this.jPanelPaginacionPosicionesBancarias;
		//final JScrollPane jScrollPanelDatosEdicionPosicionesBancarias=this.jScrollPanelDatosEdicionPosicionesBancarias;
		final JPanel jPanelAccionesPosicionesBancarias=this.jPanelAccionesPosicionesBancarias;
		
		JPanel jPanelCamposAuxiliarPosicionesBancarias=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPosicionesBancarias=new JPanel();
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			jPanelCamposAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jPanelCamposPosicionesBancarias;
			jPanelAccionesFormularioAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jPanelAccionesFormularioPosicionesBancarias;
		}
		
		final JPanel jPanelCamposPosicionesBancarias=jPanelCamposAuxiliarPosicionesBancarias;
		final JPanel jPanelAccionesFormularioPosicionesBancarias=jPanelAccionesFormularioAuxiliarPosicionesBancarias;
		
		
		final JMenuBar jmenuBarPosicionesBancarias=this.jmenuBarPosicionesBancarias;		
		final JToolBar jTtoolBarPosicionesBancarias=this.jTtoolBarPosicionesBancarias;
				
		JMenuBar jmenuBarDetalleAuxiliarPosicionesBancarias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPosicionesBancarias=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			jmenuBarDetalleAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jmenuBarDetallePosicionesBancarias;
			jTtoolBarDetalleAuxiliarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jTtoolBarDetallePosicionesBancarias;		
		}
		
		final JMenuBar jmenuBarDetallePosicionesBancarias=jmenuBarDetalleAuxiliarPosicionesBancarias;
		final JToolBar jTtoolBarDetallePosicionesBancarias=jTtoolBarDetalleAuxiliarPosicionesBancarias;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPosicionesBancarias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPosicionesBancarias;
			processRunnable.jTableDatos=jTableDatosPosicionesBancarias;
			processRunnable.jPanelCampos=jPanelCamposPosicionesBancarias;
			processRunnable.jPanelPaginacion=jPanelPaginacionPosicionesBancarias;
			processRunnable.jPanelAcciones=jPanelAccionesPosicionesBancarias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPosicionesBancarias;
			
			
			processRunnable.jmenuBar=jmenuBarPosicionesBancarias;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePosicionesBancarias;
			processRunnable.jTtoolBar=jTtoolBarPosicionesBancarias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePosicionesBancarias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPosicionesBancarias ,jPanelParametrosReportesPosicionesBancarias, jTableDatosPosicionesBancarias,/*jScrollPanelDatosPosicionesBancarias,*/jPanelCamposPosicionesBancarias,jPanelPaginacionPosicionesBancarias, /*jScrollPanelDatosEdicionPosicionesBancarias,*/ jPanelAccionesPosicionesBancarias,jPanelAccionesFormularioPosicionesBancarias,jmenuBarPosicionesBancarias,jmenuBarDetallePosicionesBancarias,jTtoolBarPosicionesBancarias,jTtoolBarDetallePosicionesBancarias));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPosicionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPosicionesBancarias(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPosicionesBancarias(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPosicionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPosicionesBancarias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePosicionesBancarias,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPosicionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPosicionesBancarias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePosicionesBancarias,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.posicionesbancariasConstantesFunciones.getsFinalQueryPosicionesBancarias();
		String  finalQueryPaginacionTodos=this.posicionesbancariasConstantesFunciones.getsFinalQueryPosicionesBancarias();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PosicionesBancariasConstantesFunciones.getArrayColumnasGlobalesNoPosicionesBancarias(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PosicionesBancariasConstantesFunciones.getArrayColumnasGlobalesPosicionesBancarias(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PosicionesBancariasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.posicionesbancariassEliminados= new ArrayList<PosicionesBancarias>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPosicionesBancarias();
		
				///*PosicionesBancariasSessionBean*/this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
			
			if(this.posicionesbancariasSessionBean==null) {
				this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
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
					this.iNumeroPaginacion=PosicionesBancariasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PosicionesBancariasConstantesFunciones.getClassesForeignKeysOfPosicionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/posicionesbancarias."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			posicionesbancariassAux= new ArrayList<PosicionesBancarias>();
			
				
			posicionesbancariasLogic.setDatosCliente(this.datosCliente);
			posicionesbancariasLogic.setDatosDeep(this.datosDeep);
			posicionesbancariasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPosicionesBancarias")) {
				this.sDetalleReporte=PosicionesBancariasConstantesFunciones.getDetalleIndiceBusquedaPosicionesBancarias(id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					posicionesbancariasLogic.getPosicionesBancariassBusquedaPosicionesBancarias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PosicionesBancariasConstantesFunciones.getDetalleIndiceBusquedaPosicionesBancarias(id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PosicionesBancariasConstantesFunciones.getDetalleIndiceBusquedaPosicionesBancarias(id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=posicionesbancariasLogic.getPosicionesBancariass()==null||posicionesbancariasLogic.getPosicionesBancariass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=posicionesbancariass==null|| posicionesbancariass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						posicionesbancariassAux=new ArrayList<PosicionesBancarias>();
						posicionesbancariassAux.addAll(posicionesbancariasLogic.getPosicionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							posicionesbancariassAux=new ArrayList<PosicionesBancarias>();
							posicionesbancariassAux.addAll(posicionesbancariass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							posicionesbancariasLogic.getPosicionesBancariassBusquedaPosicionesBancarias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PosicionesBancariasConstantesFunciones.getDetalleIndiceBusquedaPosicionesBancarias(id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PosicionesBancariasConstantesFunciones.getDetalleIndiceBusquedaPosicionesBancarias(id_ejercicioBusquedaPosicionesBancarias,id_tipo_movimientoBusquedaPosicionesBancarias,fecha_desdeBusquedaPosicionesBancarias,fecha_hastaBusquedaPosicionesBancarias,orden_desdeBusquedaPosicionesBancarias,orden_hastaBusquedaPosicionesBancarias);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePosicionesBancariass("BusquedaPosicionesBancarias",posicionesbancariasLogic.getPosicionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePosicionesBancariass("BusquedaPosicionesBancarias",posicionesbancariass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						posicionesbancariasLogic.setPosicionesBancariass(new ArrayList<PosicionesBancarias>());
						posicionesbancariasLogic.getPosicionesBancariass().addAll(posicionesbancariassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							posicionesbancariass=new ArrayList<PosicionesBancarias>();
							posicionesbancariass.addAll(posicionesbancariassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPosicionesBancarias();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPosicionesBancarias();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=posicionesbancariasLogic.getPosicionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=posicionesbancariass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=posicionesbancariasLogic.getPosicionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=posicionesbancariass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PosicionesBancarias posicionesbancarias) {
		Boolean permite=true;
		
		if(this.posicionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PosicionesBancariasConstantesFunciones.getOrderByListaPosicionesBancarias();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PosicionesBancariasConstantesFunciones.getOrderByListaPosicionesBancarias();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PosicionesBancarias posicionesbancarias:posicionesbancariasLogic.getPosicionesBancariass()) {
				if(posicionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					posicionesbancariasTotales=posicionesbancarias;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PosicionesBancarias posicionesbancarias:this.posicionesbancariass) {
				if(posicionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					posicionesbancariasTotales=posicionesbancarias;
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
			this.posicionesbancariasAux=new PosicionesBancarias();
			this.posicionesbancariasAux.setsType(Constantes2.S_TOTALES);
			this.posicionesbancariasAux.setIsNew(false);
			this.posicionesbancariasAux.setIsChanged(false);
			this.posicionesbancariasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PosicionesBancariasConstantesFunciones.TotalizarValoresFilaPosicionesBancarias(this.posicionesbancariasLogic.getPosicionesBancariass(),this.posicionesbancariasAux);
				
				//this.posicionesbancariasLogic.getPosicionesBancariass().add(this.posicionesbancariasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PosicionesBancariasConstantesFunciones.TotalizarValoresFilaPosicionesBancarias(this.posicionesbancariass,this.posicionesbancariasAux);
				
				this.posicionesbancariass.add(this.posicionesbancariasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		posicionesbancariasTotales=new PosicionesBancarias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.posicionesbancariasLogic.getPosicionesBancariass().remove(posicionesbancariasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.posicionesbancariass.remove(posicionesbancariasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		posicionesbancariasTotales=new PosicionesBancarias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PosicionesBancarias posicionesbancarias:posicionesbancariasLogic.getPosicionesBancariass()) {
				if(posicionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					posicionesbancariasTotales=posicionesbancarias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PosicionesBancariasConstantesFunciones.TotalizarValoresFilaPosicionesBancarias(this.posicionesbancariasLogic.getPosicionesBancariass(),posicionesbancariasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PosicionesBancarias posicionesbancarias:this.posicionesbancariass) {
				if(posicionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					posicionesbancariasTotales=posicionesbancarias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PosicionesBancariasConstantesFunciones.TotalizarValoresFilaPosicionesBancarias(this.posicionesbancariass,posicionesbancariasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPosicionesBancariassBusquedaPosicionesBancarias()throws Exception {
		try {
			sAccionBusqueda="BusquedaPosicionesBancarias";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPosicionesBancariassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPosicionesBancariassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPosicionesBancariassFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPosicionesBancariassBusquedaPosicionesBancarias(String sFinalQuery,Long id_ejercicio,Long id_tipo_movimiento,Date fecha_desde,Date fecha_hasta,Long orden_desde,Long orden_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//posicionesbancariasLogic.getPosicionesBancariassBusquedaPosicionesBancarias(sFinalQuery,this.pagination,id_ejercicio,id_tipo_movimiento,fecha_desde,fecha_hasta,orden_desde,orden_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPosicionesBancariassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//posicionesbancariasLogic.getPosicionesBancariassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPosicionesBancariassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//posicionesbancariasLogic.getPosicionesBancariassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPosicionesBancariassFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//posicionesbancariasLogic.getPosicionesBancariassFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosPosicionesBancarias() {
		this.isPermisoTodoPosicionesBancarias=false;
		this.isPermisoNuevoPosicionesBancarias=false;
		this.isPermisoActualizarPosicionesBancarias=false;
		this.isPermisoActualizarOriginalPosicionesBancarias=false;
		this.isPermisoEliminarPosicionesBancarias=false;
		this.isPermisoGuardarCambiosPosicionesBancarias=false;
		this.isPermisoConsultaPosicionesBancarias=true;
		this.isPermisoBusquedaPosicionesBancarias=true;
		this.isPermisoReportePosicionesBancarias=true;
		this.isPermisoOrdenPosicionesBancarias=false;		
		this.isPermisoPaginacionMedioPosicionesBancarias=false;		
		this.isPermisoPaginacionAltoPosicionesBancarias=false;		
		this.isPermisoPaginacionTodoPosicionesBancarias=false;		
		this.isPermisoCopiarPosicionesBancarias=false;		
		this.isPermisoVerFormPosicionesBancarias=false;		
		this.isPermisoDuplicarPosicionesBancarias=false;
		this.isPermisoOrdenPosicionesBancarias=false;
	}
	
	public void setPermisosUsuarioPosicionesBancarias(Boolean isPermiso) {
		this.isPermisoTodoPosicionesBancarias=isPermiso;
		this.isPermisoNuevoPosicionesBancarias=isPermiso;
		this.isPermisoActualizarPosicionesBancarias=isPermiso;
		this.isPermisoActualizarOriginalPosicionesBancarias=isPermiso;
		this.isPermisoEliminarPosicionesBancarias=isPermiso;
		this.isPermisoGuardarCambiosPosicionesBancarias=isPermiso;
		this.isPermisoConsultaPosicionesBancarias=isPermiso;
		this.isPermisoBusquedaPosicionesBancarias=isPermiso;
		this.isPermisoReportePosicionesBancarias=isPermiso;
		this.isPermisoOrdenPosicionesBancarias=isPermiso;		
		this.isPermisoPaginacionMedioPosicionesBancarias=isPermiso;		
		this.isPermisoPaginacionAltoPosicionesBancarias=isPermiso;		
		this.isPermisoPaginacionTodoPosicionesBancarias=isPermiso;		
		this.isPermisoCopiarPosicionesBancarias=isPermiso;		
		this.isPermisoVerFormPosicionesBancarias=isPermiso;		
		this.isPermisoDuplicarPosicionesBancarias=isPermiso;
		this.isPermisoOrdenPosicionesBancarias=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPosicionesBancarias(Boolean isPermiso) {
		//this.isPermisoTodoPosicionesBancarias=isPermiso;
		this.isPermisoNuevoPosicionesBancarias=isPermiso;
		this.isPermisoActualizarPosicionesBancarias=isPermiso;
		this.isPermisoActualizarOriginalPosicionesBancarias=isPermiso;
		this.isPermisoEliminarPosicionesBancarias=isPermiso;
		this.isPermisoGuardarCambiosPosicionesBancarias=isPermiso;
		//this.isPermisoConsultaPosicionesBancarias=isPermiso;
		//this.isPermisoBusquedaPosicionesBancarias=isPermiso;
		//this.isPermisoReportePosicionesBancarias=isPermiso;
		//this.isPermisoOrdenPosicionesBancarias=isPermiso;		
		//this.isPermisoPaginacionMedioPosicionesBancarias=isPermiso;		
		//this.isPermisoPaginacionAltoPosicionesBancarias=isPermiso;		
		//this.isPermisoPaginacionTodoPosicionesBancarias=isPermiso;		
		//this.isPermisoCopiarPosicionesBancarias=isPermiso;		
		//this.isPermisoDuplicarPosicionesBancarias=isPermiso;
		//this.isPermisoOrdenPosicionesBancarias=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPosicionesBancariasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PosicionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPosicionesBancarias(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPosicionesBancariasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPosicionesBancariasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPosicionesBancariasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPosicionesBancariasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPosicionesBancarias() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PosicionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PosicionesBancariasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPosicionesBancarias=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPosicionesBancarias=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPosicionesBancarias=this.isPermisoActualizarPosicionesBancarias;
			this.isPermisoEliminarPosicionesBancarias=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPosicionesBancarias=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPosicionesBancarias=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPosicionesBancarias=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPosicionesBancarias=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePosicionesBancarias=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPosicionesBancarias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPosicionesBancarias=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPosicionesBancarias=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPosicionesBancarias=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPosicionesBancarias=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPosicionesBancarias=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPosicionesBancarias=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPosicionesBancarias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPosicionesBancarias.setToolTipText(this.jTableDatosPosicionesBancarias.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPosicionesBancarias(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPosicionesBancarias(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PosicionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PosicionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPosicionesBancarias() throws Exception {
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
	public void inicializarCombosForeignKeyPosicionesBancariasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPosicionesBancariasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PosicionesBancariasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPosicionesBancarias()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.posicionesbancariasSessionBean==null) {
				this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
			}

			if(!this.posicionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.posicionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.posicionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
	
	public void initActionsCombosTodosForeignKeyPosicionesBancarias()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPosicionesBancarias(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPosicionesBancarias()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPosicionesBancarias();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPosicionesBancarias(PosicionesBancarias posicionesbancarias)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPosicionesBancarias(PosicionesBancarias posicionesbancarias,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPosicionesBancarias()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPosicionesBancarias()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPosicionesBancarias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPosicionesBancarias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPosicionesBancarias()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPosicionesBancarias()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPosicionesBancarias(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPosicionesBancarias()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public PosicionesBancariasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PosicionesBancariasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PosicionesBancariasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean(); 
		this.posicionesbancariasConstantesFunciones=new PosicionesBancariasConstantesFunciones(); 
		this.posicionesbancariasBean=new PosicionesBancarias();//(this.posicionesbancariasConstantesFunciones); 		
		this.posicionesbancariasReturnGeneral=new PosicionesBancariasParameterReturnGeneral(); 
		
		this.posicionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.posicionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PosicionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PosicionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PosicionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPosicionesBancarias(true);
			
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
			
			this.posicionesbancariasConstantesFunciones=new PosicionesBancariasConstantesFunciones(); 
			this.posicionesbancariasBean=new PosicionesBancarias();//this.posicionesbancariasConstantesFunciones); 			
			this.posicionesbancariasReturnGeneral=new PosicionesBancariasParameterReturnGeneral(); 
		
			PosicionesBancariasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Posiciones Bancarias Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.posicionesbancarias=new PosicionesBancarias();
			this.posicionesbancariass = new ArrayList<PosicionesBancarias>();
			this.posicionesbancariassAux = new ArrayList<PosicionesBancarias>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic=new PosicionesBancariasLogic();
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			//this.posicionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.posicionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPosicionesBancarias);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPosicionesBancarias);	
					}
					
					if(this.jInternalFrameImportacionPosicionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPosicionesBancarias);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPosicionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPosicionesBancarias);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPosicionesBancarias);
				this.jInternalFrameDetalleFormPosicionesBancarias.setVisible(false);
				this.jInternalFrameDetalleFormPosicionesBancarias.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPosicionesBancarias);
					this.jInternalFrameReporteDinamicoPosicionesBancarias.setVisible(false);
					this.jInternalFrameReporteDinamicoPosicionesBancarias.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPosicionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPosicionesBancarias);
					this.jInternalFrameImportacionPosicionesBancarias.setVisible(false);
					this.jInternalFrameImportacionPosicionesBancarias.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPosicionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPosicionesBancarias);
					this.jInternalFrameOrderByPosicionesBancarias.setVisible(false);
					this.jInternalFrameOrderByPosicionesBancarias.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPosicionesBancariasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PosicionesBancariasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.posicionesbancariasReturnGeneral=new PosicionesBancariasParameterReturnGeneral();
			
			this.posicionesbancariasParameterGeneral=new PosicionesBancariasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.posicionesbancariasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PosicionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PosicionesBancariasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),this.posicionesbancariasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PosicionesBancariasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),this.posicionesbancariasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaDuplicarPosicionesBancarias=true;
			this.isVisibilidadCeldaCopiarPosicionesBancarias=true;
			this.isVisibilidadCeldaVerFormPosicionesBancarias=true;
			this.isVisibilidadCeldaOrdenPosicionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
			this.isVisibilidadCeldaModificarPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
			
			
			this.isVisibilidadBusquedaPosicionesBancarias=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPosicionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPosicionesBancarias();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPosicionesBancarias(false);
			
			this.setPermisosUsuarioPosicionesBancarias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado() 
				|| (this.posicionesbancariasSessionBean.getEsGuardarRelacionado() && this.posicionesbancariasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPosicionesBancariasClasesRelacionadas();
			}
			
			if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPosicionesBancariasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPosicionesBancarias();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPosicionesBancarias();
			}
			
			if(!this.isPermisoBusquedaPosicionesBancarias) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PosicionesBancariasConstantesFunciones.getTiposSeleccionarPosicionesBancarias());
				
				this.tiposColumnasSelect=PosicionesBancariasConstantesFunciones.getTiposSeleccionarPosicionesBancarias(true);
				
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
			//if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPosicionesBancarias();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPosicionesBancarias(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPosicionesBancarias(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPosicionesBancarias() ;
			
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
				posicionesbancariasImplementable= (PosicionesBancariasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PosicionesBancariasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				posicionesbancariasImplementableHome= (PosicionesBancariasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PosicionesBancariasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.posicionesbancariass= new ArrayList<PosicionesBancarias>();
			this.posicionesbancariassEliminados= new ArrayList<PosicionesBancarias>();
						
			this.isEsNuevoPosicionesBancarias=false;
			this.esParaAccionDesdeFormularioPosicionesBancarias=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPosicionesBancarias(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPosicionesBancarias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PosicionesBancariasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PosicionesBancariasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPosicionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPosicionesBancarias(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPosicionesBancarias();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPosicionesBancarias();
			}
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPosicionesBancarias.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPosicionesBancarias.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPosicionesBancarias.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPosicionesBancarias(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PosicionesBancarias: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPosicionesBancarias() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPosicionesBancarias")) {
				iIndex=this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPosicionesBancarias();	
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
	
	public void cargarCombosForeignKeyPosicionesBancarias(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPosicionesBancarias(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPosicionesBancarias(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPosicionesBancariasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPosicionesBancarias();
		
		this.cargarCombosFrameForeignKeyPosicionesBancarias();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPosicionesBancarias();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPosicionesBancarias();
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
	
	public void jButtonNuevoPosicionesBancariasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			
			if(jTableDatosPosicionesBancarias.getRowCount()>=1) {
				jTableDatosPosicionesBancarias.removeRowSelectionInterval(0, jTableDatosPosicionesBancarias.getRowCount()-1);						
			}
			
			this.isEsNuevoPosicionesBancarias=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPosicionesBancarias(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPosicionesBancarias(true);			
			//this.posicionesbancarias=new PosicionesBancarias();
			//this.posicionesbancarias.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPosicionesBancarias(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPosicionesBancarias() ;
			
			if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePosicionesBancarias(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.posicionesbancarias);	
			this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);				
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PosicionesBancarias: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPosicionesBancariasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPosicionesBancarias.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPosicionesBancarias.getSelectedRows().length;			
			}
			
			posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPosicionesBancarias--;			
				//PosicionesBancarias posicionesbancariasAux= new PosicionesBancarias();			
				//posicionesbancariasAux.setId(this.iIdNuevoPosicionesBancarias);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PosicionesBancarias posicionesbancariasOrigen=new PosicionesBancarias();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PosicionesBancarias posicionesbancariasOrigen : posicionesbancariassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							posicionesbancariasOrigen =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							posicionesbancariasOrigen =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPosicionesBancarias();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.posicionesbancarias.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPosicionesBancarias(posicionesbancariasOrigen,this.posicionesbancarias,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.posicionesbancariasLogic.getPosicionesBancariass().add(this.posicionesbancariasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.posicionesbancariass.add(this.posicionesbancariasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
				
				this.jTableDatosPosicionesBancarias.setRowSelectionInterval(this.getIndiceNuevoPosicionesBancarias(), this.getIndiceNuevoPosicionesBancarias());
				
				int iLastRow =  this.jTableDatosPosicionesBancarias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPosicionesBancarias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPosicionesBancarias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPosicionesBancarias(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();									
		
			PosicionesBancarias posicionesbancariasOrigen=new PosicionesBancarias();
			PosicionesBancarias posicionesbancariasDestino=new PosicionesBancarias();
				
			posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPosicionesBancarias.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || posicionesbancariassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPosicionesBancarias.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						posicionesbancariasOrigen =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						posicionesbancariasOrigen =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						posicionesbancariasDestino =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						posicionesbancariasDestino =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				posicionesbancariasOrigen =posicionesbancariassSeleccionados.get(0);
				posicionesbancariasDestino =posicionesbancariassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPosicionesBancarias(posicionesbancariasOrigen,posicionesbancariasDestino,true,false);
				
				posicionesbancariasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(posicionesbancariasDestino,posicionesbancariasLogic.getPosicionesBancariass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(posicionesbancariasDestino,posicionesbancariass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
				
				//this.jTableDatosPosicionesBancarias.setRowSelectionInterval(this.getIndiceNuevoPosicionesBancarias(), this.getIndiceNuevoPosicionesBancarias());
				
				int iLastRow =  this.jTableDatosPosicionesBancarias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPosicionesBancarias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPosicionesBancarias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPosicionesBancarias(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPosicionesBancarias.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPosicionesBancarias.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPosicionesBancarias.setVisible(!isVisible);
			this.jPanelPaginacionPosicionesBancarias.setVisible(!isVisible);
			this.jPanelAccionesPosicionesBancarias.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePosicionesBancarias();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPosicionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPosicionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPosicionesBancarias();
			
			this.abrirFrameOrderByPosicionesBancarias();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPosicionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePosicionesBancarias(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPosicionesBancarias);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPosicionesBancarias.isMaximum()) {
					this.jInternalFrameDetalleFormPosicionesBancarias.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPosicionesBancarias.setSize(this.jInternalFrameDetalleFormPosicionesBancarias.iWidthFormulario,this.jInternalFrameDetalleFormPosicionesBancarias.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPosicionesBancarias.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPosicionesBancarias.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPosicionesBancarias.isMaximum()) {
						this.jInternalFrameDetalleFormPosicionesBancarias.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPosicionesBancarias.jContentPaneDetallePosicionesBancarias.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPosicionesBancarias.jContentPaneDetallePosicionesBancarias.getWidth(),PosicionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPosicionesBancarias.jContentPaneDetallePosicionesBancarias.getWidth(),PosicionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPosicionesBancarias.jContentPaneDetallePosicionesBancarias.getWidth(),PosicionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPosicionesBancarias.setVisible(true);
	        this.jInternalFrameDetalleFormPosicionesBancarias.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPosicionesBancarias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPosicionesBancarias==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPosicionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPosicionesBancarias,false,this);
				} else {
					this.jInternalFrameOrderByPosicionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPosicionesBancarias,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPosicionesBancarias);
				this.jInternalFrameOrderByPosicionesBancarias.setVisible(false);
				this.jInternalFrameOrderByPosicionesBancarias.setSelected(false);
				
				this.jInternalFrameOrderByPosicionesBancarias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPosicionesBancarias"));
				
				this.inicializarActualizarBindingTablaOrderByPosicionesBancarias();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPosicionesBancarias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPosicionesBancarias==null) {
				
				this.jInternalFrameImportacionPosicionesBancarias=new ImportacionJInternalFrame(PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPosicionesBancarias);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPosicionesBancarias);
				this.jInternalFrameImportacionPosicionesBancarias.setVisible(false);
				this.jInternalFrameImportacionPosicionesBancarias.setSelected(false);


				this.jInternalFrameImportacionPosicionesBancarias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPosicionesBancarias"));
				this.jInternalFrameImportacionPosicionesBancarias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPosicionesBancarias"));
				this.jInternalFrameImportacionPosicionesBancarias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPosicionesBancarias"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPosicionesBancarias() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPosicionesBancarias==null) {
				this.jInternalFrameReporteDinamicoPosicionesBancarias=new ReporteDinamicoJInternalFrame(PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPosicionesBancarias);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPosicionesBancarias);
				this.jInternalFrameReporteDinamicoPosicionesBancarias.setVisible(false);
				this.jInternalFrameReporteDinamicoPosicionesBancarias.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPosicionesBancarias"));
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPosicionesBancarias"));
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPosicionesBancarias"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPosicionesBancarias();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePosicionesBancarias() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPosicionesBancarias);
			
	       	this.jInternalFrameDetalleFormPosicionesBancarias.setVisible(false);
	        this.jInternalFrameDetalleFormPosicionesBancarias.setSelected(false);
			
			//this.jInternalFrameDetalleFormPosicionesBancarias.dispose();
			//this.jInternalFrameDetalleFormPosicionesBancarias=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPosicionesBancarias() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPosicionesBancarias.setVisible(true);
	        this.jInternalFrameReporteDinamicoPosicionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPosicionesBancarias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPosicionesBancarias.setVisible(true);
	        this.jInternalFrameImportacionPosicionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPosicionesBancarias() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPosicionesBancarias.setVisible(true);
	        this.jInternalFrameOrderByPosicionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPosicionesBancarias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPosicionesBancarias.setVisible(false);
	        this.jInternalFrameOrderByPosicionesBancarias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPosicionesBancarias() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPosicionesBancarias.setVisible(false);
	        this.jInternalFrameReporteDinamicoPosicionesBancarias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPosicionesBancarias() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPosicionesBancarias.setVisible(false);
	        this.jInternalFrameImportacionPosicionesBancarias.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPosicionesBancarias(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPosicionesBancarias(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPosicionesBancarias(true);
			//this.isEsNuevoPosicionesBancarias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPosicionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPosicionesBancarias(false) ;
			
			if(posicionesbancariasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePosicionesBancarias(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPosicionesBancarias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPosicionesBancariasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPosicionesBancarias(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPosicionesBancarias(true);
			//this.isEsNuevoPosicionesBancarias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.posicionesbancarias.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPosicionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPosicionesBancarias(false) ;
			
			if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePosicionesBancarias(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPosicionesBancarias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPosicionesBancarias.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPosicionesBancarias(false);
			
			//if(!this.isEsNuevoPosicionesBancarias) {								
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				
			}
			
			if(this.permiteMantenimiento(this.posicionesbancarias)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPosicionesBancarias=true;
					this.inicializarActualizarBindingTablaPosicionesBancarias(false);
					this.isEsNuevoPosicionesBancarias=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPosicionesBancarias=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPosicionesBancarias=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPosicionesBancarias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPosicionesBancarias(false);
				
				this.habilitarDeshabilitarControlesPosicionesBancarias(false);
			
												
				
				if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePosicionesBancarias();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPosicionesBancariasActionPerformed(evt,posicionesbancariasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPosicionesBancarias(this.posicionesbancarias,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPosicionesBancarias.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,posicionesbancariasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.posicionesbancarias.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				this.posicionesbancarias.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				this.posicionesbancarias.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.posicionesbancarias)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PosicionesBancariasModel) this.jTableDatosPosicionesBancarias.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPosicionesBancarias=true;
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
				this.isEsNuevoPosicionesBancarias=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPosicionesBancarias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPosicionesBancarias(false);
				
				this.habilitarDeshabilitarControlesPosicionesBancarias(false);
				
				
				
				if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePosicionesBancarias();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPosicionesBancarias.getRowCount()>=1) {
				jTableDatosPosicionesBancarias.removeRowSelectionInterval(0, jTableDatosPosicionesBancarias.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPosicionesBancarias(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPosicionesBancarias(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPosicionesBancarias(false) ;
			
			this.isEsNuevoPosicionesBancarias=false;
			
			if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePosicionesBancarias();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPosicionesBancarias(false);
				
				//SI ES MANUAL
				if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPosicionesBancarias();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPosicionesBancarias--;			
			//PosicionesBancarias posicionesbancariasAux= new PosicionesBancarias();			
			//posicionesbancariasAux.setId(this.iIdNuevoPosicionesBancarias);
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPosicionesBancarias();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
			
			this.posicionesbancarias.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.posicionesbancariasLogic.getPosicionesBancariass().add(this.posicionesbancariasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.posicionesbancariass.add(this.posicionesbancariasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			
			this.jTableDatosPosicionesBancarias.setRowSelectionInterval(this.getIndiceNuevoPosicionesBancarias(), this.getIndiceNuevoPosicionesBancarias());
			
			int iLastRow =  this.jTableDatosPosicionesBancarias.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPosicionesBancarias.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPosicionesBancarias.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPosicionesBancarias(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPosicionesBancarias(false);
			
			//SI ES MANUAL
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPosicionesBancarias();
			}
			
			//this.abrirFrameTreePosicionesBancarias();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPosicionesBancarias.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPosicionesBancarias.setFileImportacion(this.jInternalFrameImportacionPosicionesBancarias.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPosicionesBancarias.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPosicionesBancarias.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPosicionesBancarias.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPosicionesBancarias.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		

		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PosicionesBancariasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PosicionesBancariasBaseDesign.jrxml";
			
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
			
			this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					sNombreCampoCategoria="tipo_documento";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoria="codigo_cuenta";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					sNombreCampoCategoria="nombre_cuenta";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					sNombreCampoCategoriaValor="tipo_documento";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoriaValor="codigo_cuenta";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					sNombreCampoCategoriaValor="nombre_cuenta";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_documento");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
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
	
	public void jButtonGenerarExcelReporteDinamicoPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PosicionesBancariass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getorden_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getorden_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.gettipo_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getcodigo_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getnombre_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(PosicionesBancarias posicionesbancarias:posicionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(posicionesbancarias.getbeneficiario());
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
			//	this.getFilaCabeceraExportarExcelPosicionesBancarias(row);				
			//	iRow++;
			//}				
			
			//for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPosicionesBancarias(posicionesbancariasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
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
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPosicionesBancarias(false);
			
			//SI ES MANUAL
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPosicionesBancarias();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPosicionesBancarias(false);
			
			//SI ES MANUAL
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPosicionesBancarias();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPosicionesBancarias(false);
			
			//SI ES MANUAL
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPosicionesBancarias();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPosicionesBancarias() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPosicionesBancarias.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPosicionesBancarias.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPosicionesBancarias.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPosicionesBancarias.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPosicionesBancarias.setMinimumSize(dimensionMinimum);
		this.jTableDatosPosicionesBancarias.setMaximumSize(dimensionMaximum);
		this.jTableDatosPosicionesBancarias.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPosicionesBancarias(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPosicionesBancarias(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPosicionesBancarias(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPosicionesBancarias(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPosicionesBancarias(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPosicionesBancarias(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPosicionesBancarias(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPosicionesBancarias(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPosicionesBancarias() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPosicionesBancarias();
		
		this.inicializarActualizarBindingBotonesManualPosicionesBancarias(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPosicionesBancarias();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPosicionesBancarias() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPosicionesBancarias(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPosicionesBancarias(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPosicionesBancarias.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPosicionesBancarias.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePosicionesBancarias.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPosicionesBancarias.jCheckBoxPostAccionNuevoPosicionesBancarias.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPosicionesBancarias.jCheckBoxPostAccionSinCerrarPosicionesBancarias.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPosicionesBancarias.jCheckBoxPostAccionSinMensajePosicionesBancarias.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPosicionesBancarias.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPosicionesBancarias.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePosicionesBancarias.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
				this.jInternalFrameDetalleFormPosicionesBancarias.jCheckBoxPostAccionNuevoPosicionesBancarias.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPosicionesBancarias.jCheckBoxPostAccionSinCerrarPosicionesBancarias.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPosicionesBancarias.jCheckBoxPostAccionSinMensajePosicionesBancarias.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPosicionesBancarias.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPosicionesBancarias.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPosicionesBancarias.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPosicionesBancarias.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPosicionesBancarias.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPosicionesBancarias.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPosicionesBancarias.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPosicionesBancarias.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPosicionesBancarias.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPosicionesBancarias(Boolean esInicializar) throws Exception {
		try	{	
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPosicionesBancarias(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPosicionesBancarias() throws Exception {
		try	{
			if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPosicionesBancarias();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePosicionesBancarias() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPosicionesBancarias() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPosicionesBancarias.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPosicionesBancarias.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPosicionesBancarias.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPosicionesBancarias.addItem(reporte);
			}
			
			
			if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPosicionesBancarias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPosicionesBancarias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPosicionesBancarias.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPosicionesBancarias.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPosicionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPosicionesBancarias.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPosicionesBancarias.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPosicionesBancarias();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPosicionesBancarias() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
				
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PosicionesBancariasConstantesFunciones.getTiposSeleccionarPosicionesBancarias(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PosicionesBancariasConstantesFunciones.getTiposSeleccionarPosicionesBancarias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PosicionesBancariasConstantesFunciones.getTiposSeleccionarPosicionesBancarias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPosicionesBancarias.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPosicionesBancarias()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.getSelectedItem()!=null){this.id_ejercicioBusquedaPosicionesBancarias=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaPosicionesBancarias=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaPosicionesBancarias=new Date(this.jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.getDate().getTime());
		this.fecha_hastaBusquedaPosicionesBancarias=new Date(this.jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.getDate().getTime());
		this.orden_desdeBusquedaPosicionesBancarias=Long.parseLong(this.jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.getText());
		this.orden_hastaBusquedaPosicionesBancarias=Long.parseLong(this.jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPosicionesBancarias(Boolean esInicializar) throws Exception {				
		if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPosicionesBancarias();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPosicionesBancarias() throws Exception {
		this.inicializarActualizarBindingTablaPosicionesBancarias(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPosicionesBancarias() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPosicionesBancariasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancariasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPosicionesBancarias(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=posicionesbancariasLogic.getPosicionesBancariass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=posicionesbancariass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPosicionesBancarias.setModel(new PosicionesBancariasModel(this.posicionesbancariasLogic.getPosicionesBancariass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPosicionesBancarias.setModel(new PosicionesBancariasModel(this.posicionesbancariass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPosicionesBancarias!=null && this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPosicionesBancarias();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO,posicionesbancariasConstantesFunciones.resaltarSeleccionarPosicionesBancarias,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO,posicionesbancariasConstantesFunciones.resaltarSeleccionarPosicionesBancarias,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_ID));

		if(this.posicionesbancariasConstantesFunciones.mostraridPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.posicionesbancariasConstantesFunciones.resaltaridPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activaridPosicionesBancarias,iSizeTabla,this,true,"idPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltaridPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activaridPosicionesBancarias,this,true,"idPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO));

		if(this.posicionesbancariasConstantesFunciones.mostrartipo_documentoPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltartipo_documentoPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activartipo_documentoPosicionesBancarias,iSizeTabla,this,true,"tipo_documentoPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltartipo_documentoPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activartipo_documentoPosicionesBancarias,this,true,"tipo_documentoPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_DETALLE));

		if(this.posicionesbancariasConstantesFunciones.mostrardetallePosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltardetallePosicionesBancarias,this.posicionesbancariasConstantesFunciones.activardetallePosicionesBancarias,iSizeTabla,this,true,"detallePosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltardetallePosicionesBancarias,this.posicionesbancariasConstantesFunciones.activardetallePosicionesBancarias,this,true,"detallePosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA));

		if(this.posicionesbancariasConstantesFunciones.mostrarcodigo_cuentaPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltarcodigo_cuentaPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarcodigo_cuentaPosicionesBancarias,iSizeTabla,this,true,"codigo_cuentaPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarcodigo_cuentaPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarcodigo_cuentaPosicionesBancarias,this,true,"codigo_cuentaPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA));

		if(this.posicionesbancariasConstantesFunciones.mostrarnombre_cuentaPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltarnombre_cuentaPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarnombre_cuentaPosicionesBancarias,iSizeTabla,this,true,"nombre_cuentaPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarnombre_cuentaPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarnombre_cuentaPosicionesBancarias,this,true,"nombre_cuentaPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.posicionesbancariasConstantesFunciones.mostrarnumero_mayorPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltarnumero_mayorPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarnumero_mayorPosicionesBancarias,iSizeTabla,this,true,"numero_mayorPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarnumero_mayorPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarnumero_mayorPosicionesBancarias,this,true,"numero_mayorPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.posicionesbancariasConstantesFunciones.mostrardebito_localPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.posicionesbancariasConstantesFunciones.resaltardebito_localPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activardebito_localPosicionesBancarias,iSizeTabla,this,true,"debito_localPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltardebito_localPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activardebito_localPosicionesBancarias,this,true,"debito_localPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.posicionesbancariasConstantesFunciones.mostrarcredito_localPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.posicionesbancariasConstantesFunciones.resaltarcredito_localPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarcredito_localPosicionesBancarias,iSizeTabla,this,true,"credito_localPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarcredito_localPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarcredito_localPosicionesBancarias,this,true,"credito_localPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.posicionesbancariasConstantesFunciones.mostrartipo_movimientoPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltartipo_movimientoPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activartipo_movimientoPosicionesBancarias,iSizeTabla,this,true,"tipo_movimientoPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltartipo_movimientoPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activartipo_movimientoPosicionesBancarias,this,true,"tipo_movimientoPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.posicionesbancariasConstantesFunciones.mostrarfecha_emisionPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.posicionesbancariasConstantesFunciones.resaltarfecha_emisionPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarfecha_emisionPosicionesBancarias,iSizeTabla,this,true,"fecha_emisionPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarfecha_emisionPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarfecha_emisionPosicionesBancarias,this,true,"fecha_emisionPosicionesBancarias","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_FECHA));

		if(this.posicionesbancariasConstantesFunciones.mostrarfechaPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.posicionesbancariasConstantesFunciones.resaltarfechaPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarfechaPosicionesBancarias,iSizeTabla,this,true,"fechaPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarfechaPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarfechaPosicionesBancarias,this,true,"fechaPosicionesBancarias","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.posicionesbancariasConstantesFunciones.mostrarbeneficiarioPosicionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.posicionesbancariasConstantesFunciones.resaltarbeneficiarioPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarbeneficiarioPosicionesBancarias,iSizeTabla,this,true,"beneficiarioPosicionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.posicionesbancariasConstantesFunciones.resaltarbeneficiarioPosicionesBancarias,this.posicionesbancariasConstantesFunciones.activarbeneficiarioPosicionesBancarias,this,true,"beneficiarioPosicionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PosicionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPosicionesBancarias.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPosicionesBancarias.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPosicionesBancarias.addColumn(tableColumn);
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
			
			this.jTableDatosPosicionesBancarias.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPosicionesBancarias.moveColumn(this.jTableDatosPosicionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPosicionesBancarias.moveColumn(this.jTableDatosPosicionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPosicionesBancarias.moveColumn(this.jTableDatosPosicionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPosicionesBancarias.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPosicionesBancarias.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPosicionesBancarias,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPosicionesBancarias.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPosicionesBancarias.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPosicionesBancarias.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPosicionesBancarias.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=posicionesbancariasLogic.getPosicionesBancariass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=posicionesbancariass.size()-1;
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
		//this.jTableDatosPosicionesBancarias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPosicionesBancarias();
			
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
				
				//this.isEsNuevoPosicionesBancarias=false;
					
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
				if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPosicionesBancarias==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPosicionesBancarias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPosicionesBancarias.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.posicionesbancarias.getsType().equals("DUPLICADO")
				   || this.posicionesbancarias.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPosicionesBancarias=true;
				
				} else {
					this.isEsNuevoPosicionesBancarias=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
					if(this.posicionesbancarias.getId()>=0 && !this.posicionesbancarias.getIsNew()) {						
						this.isEsNuevoPosicionesBancarias=false;
						
					} else {
						this.isEsNuevoPosicionesBancarias=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPosicionesBancarias(esRelaciones);						
				
				this.seleccionarPosicionesBancarias(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.posicionesbancarias.getId()<0) {
					this.isEsNuevoPosicionesBancarias=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPosicionesBancarias(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPosicionesBancarias(evt,rowIndex);
				}	
				
				if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PosicionesBancarias: " + this.dDif); 
					}
				}								
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPosicionesBancarias(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.posicionesbancarias)) {
					if(this.posicionesbancarias.getId()>0) {
						this.posicionesbancarias.setIsDeleted(true);
						
						this.posicionesbancariassEliminados.add(this.posicionesbancarias);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.posicionesbancariasLogic.getPosicionesBancariass().remove(this.posicionesbancarias);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.posicionesbancariass.remove(this.posicionesbancarias);				
					}
					
					
					((PosicionesBancariasModel) this.jTableDatosPosicionesBancarias.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPosicionesBancarias(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPosicionesBancarias(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPosicionesBancarias) {
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPosicionesBancarias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPosicionesBancarias.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancarias);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPosicionesBancarias("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPosicionesBancarias(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPosicionesBancarias() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPosicionesBancarias(PosicionesBancarias posicionesbancarias) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPosicionesBancarias(posicionesbancarias,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPosicionesBancarias(PosicionesBancarias posicionesbancarias,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPosicionesBancarias(posicionesbancarias);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPosicionesBancarias(posicionesbancarias,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPosicionesBancarias(posicionesbancarias);
	}
	
	public void setVariablesObjetoActualToFormularioPosicionesBancarias(PosicionesBancarias posicionesbancarias) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setText(posicionesbancarias.getId().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setText(posicionesbancarias.gettipo_documento());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setText(posicionesbancarias.getdetalle());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setText(posicionesbancarias.getcodigo_cuenta());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setText(posicionesbancarias.getnombre_cuenta());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setText(posicionesbancarias.getnumero_mayor());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setText(posicionesbancarias.getdebito_local().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setText(posicionesbancarias.getcredito_local().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setText(posicionesbancarias.gettipo_movimiento());
			this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setDate(posicionesbancarias.getfecha_emision());
			this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setDate(posicionesbancarias.getfecha());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setText(posicionesbancarias.getbeneficiario());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PosicionesBancarias posicionesbancariasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,posicionesbancariasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PosicionesBancarias posicionesbancariasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				posicionesbancariasLocal=this.posicionesbancarias;
			} else {
				posicionesbancariasLocal=this.posicionesbancariasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(posicionesbancariasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPosicionesBancarias(posicionesbancariasLocal,true);
					
					if(posicionesbancariasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(posicionesbancariasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(posicionesbancariasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPosicionesBancarias(PosicionesBancarias posicionesbancarias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPosicionesBancarias(posicionesbancarias,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(posicionesbancarias);
	}
	
	public void setVariablesFormularioToObjetoActualPosicionesBancarias(PosicionesBancarias posicionesbancarias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPosicionesBancarias(posicionesbancarias,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPosicionesBancarias(PosicionesBancarias posicionesbancarias,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.getText()==null || this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.getText()=="" || this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.getText()=="Id") {
				this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setText("0");
			}

			if(conColumnasBase) {posicionesbancarias.setId(Long.parseLong(this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelIdPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.settipo_documento(this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeltipo_documentoPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setdetalle(this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeldetallePosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setcodigo_cuenta(this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelcodigo_cuentaPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setnombre_cuenta(this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelnombre_cuentaPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setnumero_mayor(this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelnumero_mayorPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeldebito_localPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelcredito_localPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.settipo_movimiento(this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabeltipo_movimientoPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setfecha_emision(this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelfecha_emisionPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setfecha(this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelfechaPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			posicionesbancarias.setbeneficiario(this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPosicionesBancarias.jLabelbeneficiarioPosicionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPosicionesBancarias(PosicionesBancarias posicionesbancariasBean,PosicionesBancarias posicionesbancarias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPosicionesBancarias(PosicionesBancarias posicionesbancariasOrigen,PosicionesBancarias posicionesbancarias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && posicionesbancariasOrigen.getId()!=null && !posicionesbancariasOrigen.getId().equals(0L))) {posicionesbancarias.setId(posicionesbancariasOrigen.getId());}}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getfecha_desde()!=null && !posicionesbancariasOrigen.getfecha_desde().equals(new Date()))) {posicionesbancarias.setfecha_desde(posicionesbancariasOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getfecha_hasta()!=null && !posicionesbancariasOrigen.getfecha_hasta().equals(new Date()))) {posicionesbancarias.setfecha_hasta(posicionesbancariasOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getorden_desde()!=null && !posicionesbancariasOrigen.getorden_desde().equals(0L))) {posicionesbancarias.setorden_desde(posicionesbancariasOrigen.getorden_desde());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getorden_hasta()!=null && !posicionesbancariasOrigen.getorden_hasta().equals(0L))) {posicionesbancarias.setorden_hasta(posicionesbancariasOrigen.getorden_hasta());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.gettipo_documento()!=null && !posicionesbancariasOrigen.gettipo_documento().equals(""))) {posicionesbancarias.settipo_documento(posicionesbancariasOrigen.gettipo_documento());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getdetalle()!=null && !posicionesbancariasOrigen.getdetalle().equals(""))) {posicionesbancarias.setdetalle(posicionesbancariasOrigen.getdetalle());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getcodigo_cuenta()!=null && !posicionesbancariasOrigen.getcodigo_cuenta().equals(""))) {posicionesbancarias.setcodigo_cuenta(posicionesbancariasOrigen.getcodigo_cuenta());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getnombre_cuenta()!=null && !posicionesbancariasOrigen.getnombre_cuenta().equals(""))) {posicionesbancarias.setnombre_cuenta(posicionesbancariasOrigen.getnombre_cuenta());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getnumero_mayor()!=null && !posicionesbancariasOrigen.getnumero_mayor().equals(""))) {posicionesbancarias.setnumero_mayor(posicionesbancariasOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getdebito_local()!=null && !posicionesbancariasOrigen.getdebito_local().equals(0.0))) {posicionesbancarias.setdebito_local(posicionesbancariasOrigen.getdebito_local());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getcredito_local()!=null && !posicionesbancariasOrigen.getcredito_local().equals(0.0))) {posicionesbancarias.setcredito_local(posicionesbancariasOrigen.getcredito_local());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.gettipo_movimiento()!=null && !posicionesbancariasOrigen.gettipo_movimiento().equals(""))) {posicionesbancarias.settipo_movimiento(posicionesbancariasOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getfecha_emision()!=null && !posicionesbancariasOrigen.getfecha_emision().equals(new Date()))) {posicionesbancarias.setfecha_emision(posicionesbancariasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getfecha()!=null && !posicionesbancariasOrigen.getfecha().equals(new Date()))) {posicionesbancarias.setfecha(posicionesbancariasOrigen.getfecha());}
			if(conDefault || (!conDefault && posicionesbancariasOrigen.getbeneficiario()!=null && !posicionesbancariasOrigen.getbeneficiario().equals(""))) {posicionesbancarias.setbeneficiario(posicionesbancariasOrigen.getbeneficiario());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPosicionesBancarias(PosicionesBancarias posicionesbancarias) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setText(posicionesbancarias.getId().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setText(posicionesbancarias.gettipo_documento());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setText(posicionesbancarias.getdetalle());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setText(posicionesbancarias.getcodigo_cuenta());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setText(posicionesbancarias.getnombre_cuenta());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setText(posicionesbancarias.getnumero_mayor());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setText(posicionesbancarias.getdebito_local().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setText(posicionesbancarias.getcredito_local().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setText(posicionesbancarias.gettipo_movimiento());
			this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setDate(posicionesbancarias.getfecha_emision());
			this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setDate(posicionesbancarias.getfecha());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setText(posicionesbancarias.getbeneficiario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPosicionesBancarias(PosicionesBancariasBean posicionesbancariasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setText(posicionesbancariasBean.getId().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setText(posicionesbancariasBean.gettipo_documento());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setText(posicionesbancariasBean.getdetalle());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setText(posicionesbancariasBean.getcodigo_cuenta());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setText(posicionesbancariasBean.getnombre_cuenta());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setText(posicionesbancariasBean.getnumero_mayor());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setText(posicionesbancariasBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setText(posicionesbancariasBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setText(posicionesbancariasBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setDate(posicionesbancariasBean.getfecha_emision());
			this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setDate(posicionesbancariasBean.getfecha());
			this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setText(posicionesbancariasBean.getbeneficiario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPosicionesBancarias(PosicionesBancariasParameterReturnGeneral posicionesbancariasReturnGeneral,PosicionesBancariasBean posicionesbancariasBean,Boolean conDefault) throws Exception { 
		try {
			PosicionesBancarias posicionesbancariasLocal=new PosicionesBancarias();
			
			posicionesbancariasLocal=posicionesbancariasReturnGeneral.getPosicionesBancarias();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && posicionesbancariasLocal.getId()!=null && !posicionesbancariasLocal.getId().equals(0L))) {posicionesbancariasBean.setId(posicionesbancariasLocal.getId());}}
			if(conDefault || (!conDefault && posicionesbancariasLocal.gettipo_documento()!=null && !posicionesbancariasLocal.gettipo_documento().equals(""))) {posicionesbancariasBean.settipo_documento(posicionesbancariasLocal.gettipo_documento());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getdetalle()!=null && !posicionesbancariasLocal.getdetalle().equals(""))) {posicionesbancariasBean.setdetalle(posicionesbancariasLocal.getdetalle());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getcodigo_cuenta()!=null && !posicionesbancariasLocal.getcodigo_cuenta().equals(""))) {posicionesbancariasBean.setcodigo_cuenta(posicionesbancariasLocal.getcodigo_cuenta());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getnombre_cuenta()!=null && !posicionesbancariasLocal.getnombre_cuenta().equals(""))) {posicionesbancariasBean.setnombre_cuenta(posicionesbancariasLocal.getnombre_cuenta());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getnumero_mayor()!=null && !posicionesbancariasLocal.getnumero_mayor().equals(""))) {posicionesbancariasBean.setnumero_mayor(posicionesbancariasLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getdebito_local()!=null && !posicionesbancariasLocal.getdebito_local().equals(0.0))) {posicionesbancariasBean.setdebito_local(posicionesbancariasLocal.getdebito_local());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getcredito_local()!=null && !posicionesbancariasLocal.getcredito_local().equals(0.0))) {posicionesbancariasBean.setcredito_local(posicionesbancariasLocal.getcredito_local());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.gettipo_movimiento()!=null && !posicionesbancariasLocal.gettipo_movimiento().equals(""))) {posicionesbancariasBean.settipo_movimiento(posicionesbancariasLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getfecha_emision()!=null && !posicionesbancariasLocal.getfecha_emision().equals(new Date()))) {posicionesbancariasBean.setfecha_emision(posicionesbancariasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getfecha()!=null && !posicionesbancariasLocal.getfecha().equals(new Date()))) {posicionesbancariasBean.setfecha(posicionesbancariasLocal.getfecha());}
			if(conDefault || (!conDefault && posicionesbancariasLocal.getbeneficiario()!=null && !posicionesbancariasLocal.getbeneficiario().equals(""))) {posicionesbancariasBean.setbeneficiario(posicionesbancariasLocal.getbeneficiario());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPosicionesBancariasGenerico(Long idPosicionesBancariasSeleccionado,JComboBox jComboBoxPosicionesBancarias,List<PosicionesBancarias> posicionesbancariassLocal)throws Exception {
		try {
			PosicionesBancarias  posicionesbancariasTemp=null;

			for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassLocal) {
				if(posicionesbancariasAux.getId()!=null && posicionesbancariasAux.getId().equals(idPosicionesBancariasSeleccionado)) {
					posicionesbancariasTemp=posicionesbancariasAux;
					break;
				}
			}

			jComboBoxPosicionesBancarias.setSelectedItem(posicionesbancariasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPosicionesBancariasGenerico(JComboBox jComboBoxPosicionesBancarias,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPosicionesBancarias.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPosicionesBancarias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPosicionesBancarias.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPosicionesBancarias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			posicionesbancarias=(PosicionesBancarias) posicionesbancariasLogic.getPosicionesBancariass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			posicionesbancarias =(PosicionesBancarias) posicionesbancariass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!posicionesbancarias.getIsNew() && !posicionesbancarias.getIsChanged() && !posicionesbancarias.getIsDeleted()) {
				sDescripcion=posicionesbancarias.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=posicionesbancarias.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!posicionesbancarias.getIsNew() && !posicionesbancarias.getIsChanged() && !posicionesbancarias.getIsDeleted()) {
				sDescripcion=posicionesbancarias.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=posicionesbancarias.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!posicionesbancarias.getIsNew() && !posicionesbancarias.getIsChanged() && !posicionesbancarias.getIsDeleted()) {
				sDescripcion=posicionesbancarias.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=posicionesbancarias.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PosicionesBancarias posicionesbancariasRow=new PosicionesBancarias();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			posicionesbancariasRow=(PosicionesBancarias) posicionesbancariasLogic.getPosicionesBancariass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			posicionesbancariasRow=(PosicionesBancarias) posicionesbancariass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPosicionesBancarias(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias));			
			this.jButtonDuplicarPosicionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarPosicionesBancarias && this.isPermisoDuplicarPosicionesBancarias));			
			this.jButtonCopiarPosicionesBancarias.setVisible((this.isVisibilidadCeldaCopiarPosicionesBancarias && this.isPermisoCopiarPosicionesBancarias));
			this.jButtonVerFormPosicionesBancarias.setVisible((this.isVisibilidadCeldaVerFormPosicionesBancarias && this.isPermisoVerFormPosicionesBancarias));
			
			this.jButtonAbrirOrderByPosicionesBancarias.setVisible((this.isVisibilidadCeldaOrdenPosicionesBancarias && this.isPermisoOrdenPosicionesBancarias));			
			
			this.jButtonNuevoRelacionesPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias));			
			this.jButtonNuevoGuardarCambiosPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarPosicionesBancarias.setVisible((this.isVisibilidadCeldaModificarPosicionesBancarias && this.isPermisoActualizarPosicionesBancarias));	
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarPosicionesBancarias.setVisible((this.isVisibilidadCeldaActualizarPosicionesBancarias && this.isPermisoActualizarPosicionesBancarias));	
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarPosicionesBancarias.setVisible((this.isVisibilidadCeldaEliminarPosicionesBancarias && this.isPermisoEliminarPosicionesBancarias));
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarPosicionesBancarias.setVisible(this.isVisibilidadCeldaCancelarPosicionesBancarias);							
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));			
			
			}
						
			this.jButtonGuardarCambiosTablaPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias));						
			this.jButtonDuplicarToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarPosicionesBancarias && this.isPermisoDuplicarPosicionesBancarias));						
			this.jButtonCopiarToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaCopiarPosicionesBancarias && this.isPermisoCopiarPosicionesBancarias));			
			this.jButtonVerFormToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaVerFormPosicionesBancarias && this.isPermisoVerFormPosicionesBancarias));			
			this.jButtonAbrirOrderByToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaOrdenPosicionesBancarias && this.isPermisoOrdenPosicionesBancarias));
			this.jButtonNuevoRelacionesToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias));			
			this.jButtonNuevoGuardarCambiosToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));			
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaModificarPosicionesBancarias && this.isPermisoActualizarPosicionesBancarias));	
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaActualizarPosicionesBancarias  && this.isPermisoActualizarPosicionesBancarias));	
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaEliminarPosicionesBancarias && this.isPermisoEliminarPosicionesBancarias));
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarToolBarPosicionesBancarias.setVisible(this.isVisibilidadCeldaCancelarPosicionesBancarias);				
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias));			
			this.jMenuItemDuplicarPosicionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarPosicionesBancarias && this.isPermisoDuplicarPosicionesBancarias));			
			this.jMenuItemCopiarPosicionesBancarias.setVisible((this.isVisibilidadCeldaCopiarPosicionesBancarias && this.isPermisoCopiarPosicionesBancarias));			
			this.jMenuItemVerFormPosicionesBancarias.setVisible((this.isVisibilidadCeldaVerFormPosicionesBancarias && this.isPermisoVerFormPosicionesBancarias));			
			this.jMenuItemAbrirOrderByPosicionesBancarias.setVisible((this.isVisibilidadCeldaOrdenPosicionesBancarias && this.isPermisoOrdenPosicionesBancarias));			
			//this.jMenuItemMostrarOcultarPosicionesBancarias.setVisible((this.isVisibilidadCeldaOrdenPosicionesBancarias && this.isPermisoOrdenPosicionesBancarias));
			this.jMenuItemDetalleAbrirOrderByPosicionesBancarias.setVisible((this.isVisibilidadCeldaOrdenPosicionesBancarias && this.isPermisoOrdenPosicionesBancarias));			
			//this.jMenuItemDetalleMostrarOcultarPosicionesBancarias.setVisible((this.isVisibilidadCeldaOrdenPosicionesBancarias && this.isPermisoOrdenPosicionesBancarias));			
			this.jMenuItemNuevoRelacionesPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias));			
			this.jMenuItemNuevoGuardarCambiosPosicionesBancarias.setVisible((this.isVisibilidadCeldaNuevoPosicionesBancarias && this.isPermisoNuevoPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));									
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemModificarPosicionesBancarias.setVisible((this.isVisibilidadCeldaModificarPosicionesBancarias && this.isPermisoActualizarPosicionesBancarias));	
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemActualizarPosicionesBancarias.setVisible((this.isVisibilidadCeldaActualizarPosicionesBancarias && this.isPermisoActualizarPosicionesBancarias));	
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemEliminarPosicionesBancarias.setVisible((this.isVisibilidadCeldaEliminarPosicionesBancarias && this.isPermisoEliminarPosicionesBancarias));
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemCancelarPosicionesBancarias.setVisible(this.isVisibilidadCeldaCancelarPosicionesBancarias);				
			}
			
			this.jMenuItemGuardarCambiosPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));						
			this.jMenuItemGuardarCambiosTablaPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=this.jButtonNuevoPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaDuplicarPosicionesBancarias=this.jButtonDuplicarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaCopiarPosicionesBancarias=this.jButtonCopiarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaVerFormPosicionesBancarias=this.jButtonVerFormPosicionesBancarias.isVisible();
			
			this.isVisibilidadCeldaOrdenPosicionesBancarias=this.jButtonAbrirOrderByPosicionesBancarias.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=this.jButtonNuevoRelacionesPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaModificarPosicionesBancarias=this.jButtonModificarPosicionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.isVisibilidadCeldaActualizarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=this.jButtonGuardarCambiosTablaPosicionesBancarias.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPosicionesBancarias=this.jButtonNuevoToolBarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=this.jButtonNuevoRelacionesToolBarPosicionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.isVisibilidadCeldaModificarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarToolBarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaActualizarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarToolBarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarToolBarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarToolBarPosicionesBancarias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPosicionesBancarias=this.jButtonGuardarCambiosToolBarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=this.jButtonGuardarCambiosTablaToolBarPosicionesBancarias.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPosicionesBancarias=this.jMenuItemNuevoPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=this.jMenuItemNuevoRelacionesPosicionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.isVisibilidadCeldaModificarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemModificarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaActualizarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemActualizarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemEliminarPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarPosicionesBancarias=this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemCancelarPosicionesBancarias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPosicionesBancarias=this.jMenuItemGuardarCambiosPosicionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=this.jMenuItemGuardarCambiosTablaPosicionesBancarias.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPosicionesBancarias(Boolean esInicializar) {
		if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
				//if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPosicionesBancarias();
			}
			
			this.inicializarActualizarBindingBotonesManualPosicionesBancarias(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPosicionesBancarias() {
		this.jButtonNuevoPosicionesBancarias.setVisible(this.isPermisoNuevoPosicionesBancarias);			
		this.jButtonDuplicarPosicionesBancarias.setVisible(this.isPermisoDuplicarPosicionesBancarias);			
		this.jButtonCopiarPosicionesBancarias.setVisible(this.isPermisoCopiarPosicionesBancarias);			
		this.jButtonVerFormPosicionesBancarias.setVisible(this.isPermisoVerFormPosicionesBancarias);			
		
		this.jButtonAbrirOrderByPosicionesBancarias.setVisible(this.isPermisoOrdenPosicionesBancarias);					
		
		this.jButtonNuevoRelacionesPosicionesBancarias.setVisible(this.isPermisoNuevoPosicionesBancarias);			
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarPosicionesBancarias.setVisible(this.isPermisoActualizarPosicionesBancarias);	
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarPosicionesBancarias.setVisible(this.isPermisoActualizarPosicionesBancarias);	
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarPosicionesBancarias.setVisible(this.isPermisoEliminarPosicionesBancarias);
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarPosicionesBancarias.setVisible(this.isVisibilidadCeldaCancelarPosicionesBancarias);						
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.setVisible(this.isPermisoGuardarCambiosPosicionesBancarias);							
		}
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.setVisible(this.isPermisoActualizarPosicionesBancarias);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePosicionesBancarias() {
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarPosicionesBancarias.setVisible(this.isPermisoActualizarPosicionesBancarias);	
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarPosicionesBancarias.setVisible(this.isPermisoActualizarPosicionesBancarias);	
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarPosicionesBancarias.setVisible(this.isPermisoEliminarPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarPosicionesBancarias.setVisible(this.isVisibilidadCeldaCancelarPosicionesBancarias);							
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.setVisible((this.isVisibilidadCeldaGuardarPosicionesBancarias && this.isPermisoGuardarCambiosPosicionesBancarias));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPosicionesBancarias() {
		if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPosicionesBancarias();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPosicionesBancarias() {
	}
	
	public void jTableDatosPosicionesBancariasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPosicionesBancarias(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.posicionesbancarias.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPosicionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPosicionesBancarias(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPosicionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPosicionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.posicionesbancariasLogic.getConnexion());

				if(this.posicionesbancarias.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.posicionesbancarias.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPosicionesBancarias=(TitledBorder)this.jScrollPanelDatosPosicionesBancarias.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPosicionesBancarias.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.posicionesbancarias.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPosicionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPosicionesBancarias(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPosicionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPosicionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.posicionesbancariasLogic.getConnexion());

				if(this.posicionesbancarias.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.posicionesbancarias.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPosicionesBancarias=(TitledBorder)this.jScrollPanelDatosPosicionesBancarias.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPosicionesBancarias.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.posicionesbancarias.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoPosicionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebPosicionesBancarias(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPosicionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPosicionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.posicionesbancariasLogic.getConnexion());

				if(this.posicionesbancarias.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.posicionesbancarias.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPosicionesBancarias=(TitledBorder)this.jScrollPanelDatosPosicionesBancarias.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderPosicionesBancarias.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.posicionesbancarias.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdePosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.posicionesbancarias.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.posicionesbancarias.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonorden_desdePosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getorden_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden_desde = "+this.posicionesbancarias.getorden_desde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonorden_hastaPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getorden_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden_hasta = "+this.posicionesbancarias.getorden_hasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_documentoPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.gettipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_documento like '%"+this.posicionesbancarias.gettipo_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetallePosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.posicionesbancarias.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuentaPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getcodigo_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta like '%"+this.posicionesbancarias.getcodigo_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuentaPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getnombre_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta like '%"+this.posicionesbancarias.getnombre_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.posicionesbancarias.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.posicionesbancarias.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.posicionesbancarias.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.posicionesbancarias.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.posicionesbancarias.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.posicionesbancarias.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioPosicionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.getposicionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.posicionesbancarias==null) {
						this.posicionesbancarias = new PosicionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);
				}

				if(this.posicionesbancarias.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.posicionesbancarias.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPosicionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPosicionesBancariasPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPosicionesBancarias(false,false);

			this.getPosicionesBancariassBusquedaPosicionesBancarias();

			this.inicializarActualizarBindingPosicionesBancarias(false);

			//if(PosicionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPosicionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPosicionesBancarias(false,false);

			this.getPosicionesBancariassFK_IdEjercicio();

			this.inicializarActualizarBindingPosicionesBancarias(false);

			//if(PosicionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPosicionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPosicionesBancarias(false,false);

			this.getPosicionesBancariassFK_IdEmpresa();

			this.inicializarActualizarBindingPosicionesBancarias(false);

			//if(PosicionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPosicionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoPosicionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPosicionesBancarias(false,false);

			this.getPosicionesBancariassFK_IdTipoMovimiento();

			this.inicializarActualizarBindingPosicionesBancarias(false);

			//if(PosicionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPosicionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.posicionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePosicionesBancarias() {
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
			this.jInternalFrameDetalleFormPosicionesBancarias.setVisible(false);	    			
			this.jInternalFrameDetalleFormPosicionesBancarias.dispose();
			this.jInternalFrameDetalleFormPosicionesBancarias=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
			this.jInternalFrameReporteDinamicoPosicionesBancarias.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPosicionesBancarias.dispose();
			this.jInternalFrameReporteDinamicoPosicionesBancarias=null;
		}
		
		if(this.jInternalFrameImportacionPosicionesBancarias!=null) {
			this.jInternalFrameImportacionPosicionesBancarias.setVisible(false);	    			
			this.jInternalFrameImportacionPosicionesBancarias.dispose();
			this.jInternalFrameImportacionPosicionesBancarias=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPosicionesBancarias();
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			
			if(sTipo.equals("NuevoPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPosicionesBancarias")) {
				jButtonDuplicarPosicionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPosicionesBancarias")) {
				jButtonCopiarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("VerFormPosicionesBancarias")) {
				jButtonVerFormPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPosicionesBancarias")) {
				jButtonDuplicarPosicionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPosicionesBancarias")) {
				jButtonDuplicarPosicionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPosicionesBancarias")) {
				jButtonModificarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPosicionesBancarias")) {
				jButtonModificarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPosicionesBancarias")) {
				jButtonModificarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPosicionesBancarias")) {
				jButtonActualizarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPosicionesBancarias")) {
				jButtonActualizarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPosicionesBancarias")) {
				jButtonActualizarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("EliminarPosicionesBancarias")) {
				jButtonEliminarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPosicionesBancarias")) {
				jButtonEliminarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPosicionesBancarias")) {
				jButtonEliminarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CancelarPosicionesBancarias")) {
				jButtonCancelarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPosicionesBancarias")) {
				jButtonCancelarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPosicionesBancarias")) {
				jButtonCancelarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CerrarPosicionesBancarias")) {
				jButtonCerrarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPosicionesBancarias")) {
				jButtonCerrarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPosicionesBancarias")) {
				jButtonCerrarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPosicionesBancarias")) {
				jButtonMostrarOcultarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPosicionesBancarias")) {
				jButtonCancelarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPosicionesBancarias")) {
				jButtonCopiarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPosicionesBancarias")) {
				jButtonVerFormPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPosicionesBancarias")) {
				jButtonCopiarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPosicionesBancarias")) {
				jButtonVerFormPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPosicionesBancarias")) {
				jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPosicionesBancarias")) {
				jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPosicionesBancarias")) {
				jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPosicionesBancarias")) {
				jButtonAnterioresPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPosicionesBancarias")) {
				jButtonAnterioresPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePosicionesBancarias")) {
				jButtonAnterioresPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPosicionesBancarias")) {
				jButtonSiguientesPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPosicionesBancarias")) {
				jButtonSiguientesPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPosicionesBancarias")) {
				jButtonSiguientesPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPosicionesBancarias") || sTipo.equals("MenuItemDetalleAbrirOrderByPosicionesBancarias")) {
				jButtonAbrirOrderByPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPosicionesBancarias") || sTipo.equals("MenuItemDetalleMostrarOcultarPosicionesBancarias")) {
				jButtonMostrarOcultarPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPosicionesBancarias")) {
				jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPosicionesBancarias")) {
				jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPosicionesBancarias")) {
				jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPosicionesBancarias")) {
				jButtonCerrarReporteDinamicoPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPosicionesBancarias")) {
				jButtonGenerarReporteDinamicoPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPosicionesBancarias")) {
				
				jButtonGenerarExcelReporteDinamicoPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPosicionesBancarias")) {
				jButtonCerrarImportacionPosicionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPosicionesBancarias")) {
				
				jButtonGenerarImportacionPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPosicionesBancarias")) {
				
				jButtonAbrirImportacionPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPosicionesBancarias")) {
				jComboBoxTiposAccionesPosicionesBancariasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPosicionesBancarias")) {
				jComboBoxTiposRelacionesPosicionesBancariasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPosicionesBancarias")) {
				jComboBoxTiposAccionesPosicionesBancariasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPosicionesBancarias")) {
				
				jComboBoxTiposSeleccionarPosicionesBancariasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPosicionesBancarias")) {
				jTextFieldValorCampoGeneralPosicionesBancariasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPosicionesBancarias")) {
				jButtonAbrirOrderByPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPosicionesBancarias")) {
				jButtonAbrirOrderByPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPosicionesBancarias")) {
				jButtonCerrarOrderByPosicionesBancariasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPosicionesBancariasBusqueda")) {
				this.jButtonidPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPosicionesBancariasUpdate")) {
				this.jButtonid_empresaPosicionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPosicionesBancariasBusqueda")) {
				this.jButtonid_empresaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPosicionesBancariasUpdate")) {
				this.jButtonid_ejercicioPosicionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPosicionesBancariasBusqueda")) {
				this.jButtonid_ejercicioPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoPosicionesBancariasUpdate")) {
				this.jButtonid_tipo_movimientoPosicionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoPosicionesBancariasBusqueda")) {
				this.jButtonid_tipo_movimientoPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdePosicionesBancariasBusqueda")) {
				this.jButtonfecha_desdePosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaPosicionesBancariasBusqueda")) {
				this.jButtonfecha_hastaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("orden_desdePosicionesBancariasBusqueda")) {
				this.jButtonorden_desdePosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("orden_hastaPosicionesBancariasBusqueda")) {
				this.jButtonorden_hastaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_documentoPosicionesBancariasBusqueda")) {
				this.jButtontipo_documentoPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detallePosicionesBancariasBusqueda")) {
				this.jButtondetallePosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaPosicionesBancariasBusqueda")) {
				this.jButtoncodigo_cuentaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuentaPosicionesBancariasBusqueda")) {
				this.jButtonnombre_cuentaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorPosicionesBancariasBusqueda")) {
				this.jButtonnumero_mayorPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localPosicionesBancariasBusqueda")) {
				this.jButtondebito_localPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localPosicionesBancariasBusqueda")) {
				this.jButtoncredito_localPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoPosicionesBancariasBusqueda")) {
				this.jButtontipo_movimientoPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPosicionesBancariasBusqueda")) {
				this.jButtonfecha_emisionPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPosicionesBancariasBusqueda")) {
				this.jButtonfechaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioPosicionesBancariasBusqueda")) {
				this.jButtonbeneficiarioPosicionesBancariasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPosicionesBancariasPosicionesBancarias")) {
				this.jButtonBusquedaPosicionesBancariasPosicionesBancariasActionPerformed(evt);
			}
			
			;
			
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPosicionesBancarias();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PosicionesBancarias posicionesbancariasLocal=null;
			
			if(!this.getEsControlTabla()) {
				posicionesbancariasLocal=this.posicionesbancarias;
			} else {
				posicionesbancariasLocal=this.posicionesbancariasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
							
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
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
			
			


			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
								
						
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
								
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
							
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
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
			
			


			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
								
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPosicionesBancarias")) {
					jCheckBoxSeleccionarTodosPosicionesBancariasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPosicionesBancarias")) {
					jCheckBoxSeleccionadosPosicionesBancariasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPosicionesBancarias")) {
					
				}
				
				


				
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
												
				
				


				
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
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
			
			


			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPosicionesBancariasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.posicionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.posicionesbancarias);
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
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
				
				


				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PosicionesBancarias.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PosicionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPosicionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.posicionesbancariasAnterior =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPosicionesBancarias")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPosicionesBancariasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPosicionesBancarias.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.posicionesbancarias =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.posicionesbancarias);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPosicionesBancarias")) {
				
				}
				
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPosicionesBancarias")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPosicionesBancarias.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPosicionesBancarias")) {
			
			}
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPosicionesBancarias();
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			if(sTipo.equals("NuevoPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPosicionesBancarias")) {
				jButtonDuplicarPosicionesBancariasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPosicionesBancarias")) {
				jButtonCopiarPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPosicionesBancarias")) {
				jButtonVerFormPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPosicionesBancarias")) {
				jButtonNuevoPosicionesBancariasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPosicionesBancarias")) {
				jButtonModificarPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPosicionesBancarias")) {
				jButtonActualizarPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPosicionesBancarias")) {
				jButtonEliminarPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPosicionesBancarias")) {
				jButtonCancelarPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPosicionesBancarias")) {
				jButtonCerrarPosicionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPosicionesBancarias")) {
				jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPosicionesBancarias")) {
				jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPosicionesBancarias")) {
				jButtonAbrirOrderByPosicionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPosicionesBancarias")) {
				jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPosicionesBancarias")) {
				jButtonAnterioresPosicionesBancariasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPosicionesBancarias")) {
				jButtonSiguientesPosicionesBancariasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPosicionesBancariasBusqueda")) {
				this.jButtonidPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPosicionesBancariasUpdate")) {
				this.jButtonid_empresaPosicionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPosicionesBancariasBusqueda")) {
				this.jButtonid_empresaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPosicionesBancariasUpdate")) {
				this.jButtonid_ejercicioPosicionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPosicionesBancariasBusqueda")) {
				this.jButtonid_ejercicioPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoPosicionesBancariasUpdate")) {
				this.jButtonid_tipo_movimientoPosicionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoPosicionesBancariasBusqueda")) {
				this.jButtonid_tipo_movimientoPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdePosicionesBancariasBusqueda")) {
				this.jButtonfecha_desdePosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaPosicionesBancariasBusqueda")) {
				this.jButtonfecha_hastaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("orden_desdePosicionesBancariasBusqueda")) {
				this.jButtonorden_desdePosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("orden_hastaPosicionesBancariasBusqueda")) {
				this.jButtonorden_hastaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_documentoPosicionesBancariasBusqueda")) {
				this.jButtontipo_documentoPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detallePosicionesBancariasBusqueda")) {
				this.jButtondetallePosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaPosicionesBancariasBusqueda")) {
				this.jButtoncodigo_cuentaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuentaPosicionesBancariasBusqueda")) {
				this.jButtonnombre_cuentaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorPosicionesBancariasBusqueda")) {
				this.jButtonnumero_mayorPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localPosicionesBancariasBusqueda")) {
				this.jButtondebito_localPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localPosicionesBancariasBusqueda")) {
				this.jButtoncredito_localPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoPosicionesBancariasBusqueda")) {
				this.jButtontipo_movimientoPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPosicionesBancariasBusqueda")) {
				this.jButtonfecha_emisionPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPosicionesBancariasBusqueda")) {
				this.jButtonfechaPosicionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioPosicionesBancariasBusqueda")) {
				this.jButtonbeneficiarioPosicionesBancariasBusquedaActionPerformed(evt);
			}
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPosicionesBancarias();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePosicionesBancarias")) {
				closingInternalFramePosicionesBancarias();
				
			} else if(sTipo.equals("jButtonCancelarPosicionesBancarias")) {
				JInternalFrameBase jInternalFrameDetalleFormPosicionesBancarias = (JInternalFrameBase)evt.getSource();
	            	
	            PosicionesBancariasBeanSwingJInternalFrame jInternalFrameParent=(PosicionesBancariasBeanSwingJInternalFrame)jInternalFrameDetalleFormPosicionesBancarias.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPosicionesBancariasActionPerformed(null);
			}
			
			PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.posicionesbancarias,new Object(),this.posicionesbancariasParameterGeneral,this.posicionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPosicionesBancarias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPosicionesBancarias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPosicionesBancarias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.posicionesbancarias)) {
			if(!esControlTabla) {
				if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);			
				}
				
				if(this.posicionesbancariasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPosicionesBancarias(this.posicionesbancarias,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPosicionesBancarias(this.posicionesbancariasReturnGeneral,this.posicionesbancariasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.posicionesbancariasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPosicionesBancarias(classes,this.posicionesbancariasReturnGeneral,this.posicionesbancariasBean,false);
					}
						
					if(this.posicionesbancariasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPosicionesBancarias(this.posicionesbancariasReturnGeneral.getPosicionesBancarias());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancariasReturnGeneral.getPosicionesBancarias());	
					}
						
					if(this.posicionesbancariasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancariasReturnGeneral.getPosicionesBancarias(),classes);//this.posicionesbancariasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPosicionesBancarias(this.posicionesbancarias,classes);//this.posicionesbancariasBean);									
				}
			
				if(PosicionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPosicionesBancarias(this.posicionesbancarias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPosicionesBancarias(this.posicionesbancarias);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.posicionesbancariasAnterior!=null) {
						this.posicionesbancarias=this.posicionesbancariasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.posicionesbancariasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.posicionesbancariasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.posicionesbancariasReturnGeneral.getPosicionesBancarias(),posicionesbancariasLogic.getPosicionesBancariass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.posicionesbancariasReturnGeneral.getPosicionesBancarias(),this.posicionesbancariass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPosicionesBancarias.repaint();
				
				//((AbstractTableModel) this.jTableDatosPosicionesBancarias.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPosicionesBancarias();
			}
		}
	}
	
	public void actualizarVisualTableDatosPosicionesBancarias() throws Exception {
		
		PosicionesBancariasModel posicionesbancariasModel=(PosicionesBancariasModel)this.jTableDatosPosicionesBancarias.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			posicionesbancariasModel.posicionesbancariass=this.posicionesbancariasLogic.getPosicionesBancariass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			posicionesbancariasModel.posicionesbancariass=this.posicionesbancariass;
		}
		
		
		((PosicionesBancariasModel) this.jTableDatosPosicionesBancarias.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPosicionesBancarias() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getposicionesbancariasAnterior(),this.posicionesbancariasLogic.getPosicionesBancariass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getposicionesbancariasAnterior(),this.posicionesbancariass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPosicionesBancarias();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPosicionesBancarias(PosicionesBancarias posicionesbancarias,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
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
										
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.posicionesbancarias,new Object(),generalEntityParameterGeneral,this.posicionesbancariasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PosicionesBancariasConstantesFunciones.getClassesRelationshipsOfPosicionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PosicionesBancariasConstantesFunciones.getClassesRelationshipsFromStringsOfPosicionesBancarias(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPosicionesBancarias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PosicionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.posicionesbancarias,new Object(),generalEntityParameterGeneral,this.posicionesbancariasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPosicionesBancarias(PosicionesBancariasBean posicionesbancariasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPosicionesBancarias(ArrayList<Classe> classes,PosicionesBancariasReturnGeneral posicionesbancariasReturnGeneral,PosicionesBancariasBean posicionesbancariasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPosicionesBancarias(PosicionesBancarias posicionesbancarias,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.posicionesbancarias)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPosicionesBancarias = new PosicionesBancariasDetalleFormJInternalFrame(jDesktopPane,this.posicionesbancariasSessionBean.getConGuardarRelaciones(),this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.setVisible(false);
		this.jInternalFrameDetalleFormPosicionesBancarias.setSelected(false);						
		
		this.jInternalFrameDetalleFormPosicionesBancarias.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPosicionesBancarias.posicionesbancariasLogic=this.posicionesbancariasLogic;
		
		this.cargarCombosFrameForeignKeyPosicionesBancarias("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePosicionesBancarias();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePosicionesBancarias();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPosicionesBancarias("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPosicionesBancarias();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPosicionesBancarias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPosicionesBancarias"));
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarPosicionesBancarias"));

		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarToolBarPosicionesBancarias"));
					
		this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemModificarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemModificarPosicionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"ActualizarPosicionesBancarias"));
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPosicionesBancarias"));
						
		this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemActualizarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPosicionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarPosicionesBancarias"));
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarToolBarPosicionesBancarias"));
								
		this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemEliminarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPosicionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarPosicionesBancarias"));
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarToolBarPosicionesBancarias"));
					
		this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemCancelarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPosicionesBancarias"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemDetalleCerrarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPosicionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPosicionesBancarias"));
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPosicionesBancarias"));
		
		
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPosicionesBancarias"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonidPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_empresaPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_empresaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_ejercicioPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_ejercicioPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_tipo_movimientoPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_desdePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_hastaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonorden_desdePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"orden_desdePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonorden_hastaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"orden_hastaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtontipo_documentoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_documentoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtondetallePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detallePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtoncodigo_cuentaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonnombre_cuentaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuentaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonnumero_mayorPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtondebito_localPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtoncredito_localPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtontipo_movimientoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_emisionPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfechaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonbeneficiarioPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioPosicionesBancariasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPosicionesBancarias"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePosicionesBancarias"));
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPosicionesBancarias"));
		}
		
		this.jTableDatosPosicionesBancarias.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPosicionesBancarias"));
		
		this.jTableDatosPosicionesBancarias.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPosicionesBancarias"));
		
		this.jButtonNuevoPosicionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoPosicionesBancarias"));
		
		this.jButtonDuplicarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"DuplicarPosicionesBancarias"));
		
		this.jButtonCopiarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"CopiarPosicionesBancarias"));
		
		this.jButtonVerFormPosicionesBancarias.addActionListener(new ButtonActionListener(this,"VerFormPosicionesBancarias"));
		
		
		this.jButtonNuevoToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoToolBarPosicionesBancarias"));
			
		this.jButtonDuplicarToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPosicionesBancarias"));
			
		this.jMenuItemNuevoPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPosicionesBancarias"));
			
		this.jMenuItemDuplicarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPosicionesBancarias"));		
		
		
		this.jButtonNuevoRelacionesPosicionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPosicionesBancarias"));
		
		
		this.jButtonNuevoRelacionesToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPosicionesBancarias"));
			
		this.jMenuItemNuevoRelacionesPosicionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPosicionesBancarias"));		
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarPosicionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonModificarToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarToolBarPosicionesBancarias"));
			
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemModificarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemModificarPosicionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"ActualizarPosicionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonActualizarToolBarPosicionesBancarias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPosicionesBancarias"));
				
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemActualizarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPosicionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarPosicionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonEliminarToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarToolBarPosicionesBancarias"));
						
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemEliminarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPosicionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarPosicionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonCancelarToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarToolBarPosicionesBancarias"));
			
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemCancelarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPosicionesBancarias"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPosicionesBancarias"));		
		
		
		this.jButtonCerrarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarPosicionesBancarias"));
		
		
		this.jButtonCerrarToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarToolBarPosicionesBancarias"));
			
		this.jMenuItemCerrarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPosicionesBancarias"));
			
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jMenuItemDetalleCerrarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPosicionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosPosicionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPosicionesBancarias"));
		}
		
		this.jButtonCopiarToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CopiarToolBarPosicionesBancarias"));
			
		this.jButtonVerFormToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"VerFormToolBarPosicionesBancarias"));
		
		this.jMenuItemGuardarCambiosPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPosicionesBancarias"));
			
		this.jMenuItemCopiarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPosicionesBancarias"));		
		
		this.jMenuItemVerFormPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPosicionesBancarias"));		
		
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPosicionesBancarias"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPosicionesBancarias"));
			
		this.jMenuItemGuardarCambiosTablaPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPosicionesBancarias"));		
		
		
		
		this.jButtonRecargarInformacionPosicionesBancarias.addActionListener (new ButtonActionListener(this,"RecargarInformacionPosicionesBancarias"));
					
		this.jButtonRecargarInformacionToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPosicionesBancarias"));
		
		this.jMenuItemRecargarInformacionPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPosicionesBancarias"));		
		
		
		
		this.jButtonAnterioresPosicionesBancarias.addActionListener (new ButtonActionListener(this,"AnterioresPosicionesBancarias"));
		
		
		this.jButtonAnterioresToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPosicionesBancarias"));
		
		this.jMenuItemAnterioresPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPosicionesBancarias"));		
		
		
		this.jButtonSiguientesPosicionesBancarias.addActionListener (new ButtonActionListener(this,"SiguientesPosicionesBancarias"));
		
		
		this.jButtonSiguientesToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPosicionesBancarias"));
			
		this.jMenuItemSiguientesPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPosicionesBancarias"));
			
		this.jMenuItemAbrirOrderByPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPosicionesBancarias"));
			
		this.jMenuItemMostrarOcultarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPosicionesBancarias"));
			
		this.jMenuItemDetalleAbrirOrderByPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPosicionesBancarias"));
			
		this.jMenuItemDetalleMostarOcultarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPosicionesBancarias"));		
		
		
		this.jButtonNuevoGuardarCambiosPosicionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPosicionesBancarias"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPosicionesBancarias"));
			
		this.jMenuItemNuevoGuardarCambiosPosicionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPosicionesBancarias"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPosicionesBancarias.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPosicionesBancarias"));

		this.jCheckBoxSeleccionadosPosicionesBancarias.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPosicionesBancarias"));
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPosicionesBancarias"));
		}
		
		
		this.jComboBoxTiposRelacionesPosicionesBancarias.addActionListener (new ButtonActionListener(this,"TiposRelacionesPosicionesBancarias"));
			
		this.jComboBoxTiposAccionesPosicionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesPosicionesBancarias"));
					
		this.jComboBoxTiposSeleccionarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPosicionesBancarias"));
			
		this.jTextFieldValorCampoGeneralPosicionesBancarias.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPosicionesBancarias"));		
		
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonidPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_empresaPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_empresaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_ejercicioPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_ejercicioPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_tipo_movimientoPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_desdePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_hastaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonorden_desdePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"orden_desdePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonorden_hastaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"orden_hastaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtontipo_documentoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_documentoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtondetallePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detallePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtoncodigo_cuentaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonnombre_cuentaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuentaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonnumero_mayorPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtondebito_localPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtoncredito_localPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtontipo_movimientoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_emisionPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfechaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonbeneficiarioPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioPosicionesBancariasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPosicionesBancariasPosicionesBancarias.addActionListener(new ButtonActionListener(this,"BusquedaPosicionesBancariasPosicionesBancarias"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPosicionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPosicionesBancarias"));
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPosicionesBancarias"));
				this.jInternalFrameReporteDinamicoPosicionesBancarias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPosicionesBancarias"));
			}
			
			//this.jButtonCerrarReporteDinamicoPosicionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPosicionesBancarias"));				
			//this.jButtonGenerarReporteDinamicoPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPosicionesBancarias"));
			//this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPosicionesBancarias"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPosicionesBancarias!=null) {
				this.jInternalFrameImportacionPosicionesBancarias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPosicionesBancarias"));
				this.jInternalFrameImportacionPosicionesBancarias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPosicionesBancarias"));
				this.jInternalFrameImportacionPosicionesBancarias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPosicionesBancarias"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPosicionesBancarias.addActionListener (new ButtonActionListener(this,"AbrirOrderByPosicionesBancarias"));
			
			this.jButtonAbrirOrderByToolBarPosicionesBancarias.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPosicionesBancarias"));			
			
			if(this.jInternalFrameOrderByPosicionesBancarias!=null) {
				this.jInternalFrameOrderByPosicionesBancarias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPosicionesBancarias"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPosicionesBancarias.jTabbedPaneRelacionesPosicionesBancarias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPosicionesBancarias"));
		
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
            		closingInternalFramePosicionesBancarias();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPosicionesBancarias.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPosicionesBancarias = (JInternalFrameBase)event.getSource();
	            	
	            PosicionesBancariasBeanSwingJInternalFrame jInternalFrameParent=(PosicionesBancariasBeanSwingJInternalFrame)jInternalFrameDetalleFormPosicionesBancarias.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPosicionesBancariasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPosicionesBancarias.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPosicionesBancariasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPosicionesBancarias.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPosicionesBancarias.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPosicionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPosicionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPosicionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPosicionesBancarias";
		inputMap = this.jButtonNuevoPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPosicionesBancariasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPosicionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPosicionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPosicionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPosicionesBancarias";
		inputMap = this.jButtonNuevoRelacionesPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPosicionesBancariasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPosicionesBancarias";
		inputMap = this.jButtonModificarPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPosicionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPosicionesBancarias";
		inputMap = this.jButtonActualizarPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPosicionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPosicionesBancarias";
		inputMap = this.jButtonEliminarPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPosicionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPosicionesBancarias";
		inputMap = this.jButtonCancelarPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPosicionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPosicionesBancarias";
		inputMap = this.jButtonCerrarPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPosicionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPosicionesBancarias";
		inputMap = this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonGuardarCambiosPosicionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPosicionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPosicionesBancarias.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPosicionesBancariasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPosicionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPosicionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPosicionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPosicionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPosicionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPosicionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonidPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_empresaPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_empresaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_ejercicioPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_ejercicioPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPosicionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_tipo_movimientoPosicionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoPosicionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_desdePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_hastaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonorden_desdePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"orden_desdePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonorden_hastaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"orden_hastaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtontipo_documentoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_documentoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtondetallePosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detallePosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtoncodigo_cuentaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonnombre_cuentaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuentaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonnumero_mayorPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtondebito_localPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtoncredito_localPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtontipo_movimientoPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfecha_emisionPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonfechaPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaPosicionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPosicionesBancarias.jButtonbeneficiarioPosicionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioPosicionesBancariasBusqueda"));
		
		
		this.jButtonBusquedaPosicionesBancariasPosicionesBancarias.addActionListener(new ButtonActionListener(this,"BusquedaPosicionesBancariasPosicionesBancarias"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPosicionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPosicionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPosicionesBancariasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPosicionesBancarias.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPosicionesBancarias(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
					posicionesbancariasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PosicionesBancarias posicionesbancariasAux:posicionesbancariass) {
					posicionesbancariasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPosicionesBancariasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPosicionesBancarias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
						posicionesbancariasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PosicionesBancarias posicionesbancariasAux:posicionesbancariass) {
						posicionesbancariasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PosicionesBancarias posicionesbancariasAux:posicionesbancariass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPosicionesBancarias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPosicionesBancarias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPosicionesBancariasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPosicionesBancarias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPosicionesBancarias.getSelectedRows();
			
			PosicionesBancarias posicionesbancariasLocal=new PosicionesBancarias();
			
			//this.seleccionarTodosPosicionesBancarias(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					posicionesbancariasLocal =(PosicionesBancarias) this.posicionesbancariasLogic.getPosicionesBancariass().toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					posicionesbancariasLocal =(PosicionesBancarias) this.posicionesbancariass.toArray()[this.jTableDatosPosicionesBancarias.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				posicionesbancariasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
						posicionesbancariasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PosicionesBancarias posicionesbancariasAux:posicionesbancariass) {
						posicionesbancariasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPosicionesBancarias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPosicionesBancarias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPosicionesBancarias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPosicionesBancariasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPosicionesBancariasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPosicionesBancariasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPosicionesBancarias(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPosicionesBancarias.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariasLogic.getPosicionesBancariass()) {
				
						if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							posicionesbancariasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							posicionesbancariasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE)) {
							existe=true;
							posicionesbancariasAux.setorden_desde(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA)) {
							existe=true;
							posicionesbancariasAux.setorden_hasta(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO)) {
							existe=true;
							posicionesbancariasAux.settipo_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							posicionesbancariasAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							posicionesbancariasAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA)) {
							existe=true;
							posicionesbancariasAux.setnombre_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							posicionesbancariasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							posicionesbancariasAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							posicionesbancariasAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							posicionesbancariasAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							posicionesbancariasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							posicionesbancariasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							posicionesbancariasAux.setbeneficiario(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PosicionesBancarias posicionesbancariasAux:posicionesbancariass) {
					
						if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							posicionesbancariasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							posicionesbancariasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE)) {
							existe=true;
							posicionesbancariasAux.setorden_desde(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA)) {
							existe=true;
							posicionesbancariasAux.setorden_hasta(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO)) {
							existe=true;
							posicionesbancariasAux.settipo_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							posicionesbancariasAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							posicionesbancariasAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA)) {
							existe=true;
							posicionesbancariasAux.setnombre_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							posicionesbancariasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							posicionesbancariasAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							posicionesbancariasAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							posicionesbancariasAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							posicionesbancariasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							posicionesbancariasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							posicionesbancariasAux.setbeneficiario(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPosicionesBancariasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPosicionesBancarias(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPosicionesBancarias=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPosicionesBancarias.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePosicionesBancarias) {				
					conSplash=true;//false;										
					
					//this.startProcessPosicionesBancarias(conSplash);
				
					this.generarReportePosicionesBancariassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPosicionesBancariassSeleccionados();
				//this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPosicionesBancariassSeleccionados(false);
				//this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPosicionesBancariassSeleccionados(true);
				//this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPosicionesBancarias();
				
				this.exportarPosicionesBancariassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPosicionesBancariass();
				//this.importarPosicionesBancariass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPosicionesBancarias();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPosicionesBancariassSeleccionados();
				//this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Posiciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPosicionesBancarias();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPosicionesBancarias)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPosicionesBancarias(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
				}	
			} 			
			else if(PosicionesBancariasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePosicionesBancarias) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPosicionesBancarias(conSplash);
					
						//this.actualizarParametrosGeneralPosicionesBancarias();
						
						this.generarReporteProcesoAccionPosicionesBancariassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PosicionesBancariasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Posiciones BancariasES SELECCIONADOS?", "MANTENIMIENTO DE Posiciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPosicionesBancarias();
				
						this.actualizarParametrosGeneralPosicionesBancarias();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.posicionesbancariasReturnGeneral=posicionesbancariasLogic.procesarAccionPosicionesBancariassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.posicionesbancariasLogic.getPosicionesBancariass(),this.posicionesbancariasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPosicionesBancariasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPosicionesBancarias();
					
					PosicionesBancariasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPosicionesBancariasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPosicionesBancarias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxTiposAccionesFormularioPosicionesBancarias.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPosicionesBancarias(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPosicionesBancariasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPosicionesBancarias();
			
			if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
			PosicionesBancarias posicionesbancarias=new PosicionesBancarias();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPosicionesBancarias(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPosicionesBancarias.getSelectedItem();
			
			
			
			
			posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
			//this.sTipoAccion;
			
			if(posicionesbancariassSeleccionados.size()==1) {
				for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassSeleccionados) {
					posicionesbancarias=posicionesbancariasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPosicionesBancarias();
			
      		//this.finishProcessPosicionesBancarias(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPosicionesBancariasReturnGeneral() throws Exception {
		if(this.posicionesbancariasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.posicionesbancariasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.posicionesbancariasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.posicionesbancariasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.posicionesbancariasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.posicionesbancariasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPosicionesBancarias(false);
		}
		
		if(this.posicionesbancariasReturnGeneral.getConRetornoLista() || this.posicionesbancariasReturnGeneral.getConRetornoObjeto()) {
			if(this.posicionesbancariasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.posicionesbancariasLogic.setPosicionesBancariass(this.posicionesbancariasReturnGeneral.getPosicionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPosicionesBancarias(false);
		}
	}
	
	public void actualizarParametrosGeneralPosicionesBancarias() throws Exception {
		
		
	}
	
	public ArrayList<PosicionesBancarias> getPosicionesBancariassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPosicionesBancarias) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PosicionesBancarias posicionesbancariasAux:posicionesbancariasLogic.getPosicionesBancariass()) {
					if(posicionesbancariasAux.getIsSelected()) {
						posicionesbancariassSeleccionados.add(posicionesbancariasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PosicionesBancarias posicionesbancariasAux:this.posicionesbancariass) {
					if(posicionesbancariasAux.getIsSelected()) {
						posicionesbancariassSeleccionados.add(posicionesbancariasAux);				
					}
				}
			}
			
			if(posicionesbancariassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						posicionesbancariassSeleccionados.addAll(this.posicionesbancariasLogic.getPosicionesBancariass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						posicionesbancariassSeleccionados.addAll(this.posicionesbancariass);				
					}
				}
			}
		} else {
			posicionesbancariassSeleccionados.add(this.posicionesbancarias);
		}
		
		return posicionesbancariassSeleccionados;
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
	
	public void generarReportePosicionesBancariassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPosicionesBancariassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPosicionesBancariassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPosicionesBancariassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPosicionesBancariassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Posiciones Bancarias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPosicionesBancariassSeleccionados() throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados);
		
	}	
	
	public void generarReporteNormalPosicionesBancariassSeleccionados() throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPosicionesBancariassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPosicionesBancariassSeleccionados() throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPosicionesBancarias();
		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPosicionesBancarias();
		
		
		//this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados ,posicionesbancariasImplementable,posicionesbancariasImplementableHome);
	}
	
	public void mostrarImportacionPosicionesBancariass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPosicionesBancarias();
		
		this.abrirFrameImportacionPosicionesBancarias();		
		
			
		//this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados ,posicionesbancariasImplementable,posicionesbancariasImplementableHome);
	}
	
	public void importarPosicionesBancariass() throws Exception {		
	
	}
	
	public void exportarPosicionesBancariassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPosicionesBancariassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPosicionesBancariassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPosicionesBancariassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Posiciones Bancarias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPosicionesBancariassSeleccionados() throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPosicionesBancarias(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPosicionesBancarias(posicionesbancariasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//posicionesbancariasAux.setsDetalleGeneralEntityReporte(posicionesbancariasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPosicionesBancarias(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPosicionesBancarias(PosicionesBancarias posicionesbancarias,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=posicionesbancarias.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getorden_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getorden_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.gettipo_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getcodigo_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getnombre_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=posicionesbancarias.getbeneficiario();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPosicionesBancariassSeleccionados() throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PosicionesBancariass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPosicionesBancarias(row);				
				iRow++;
			}				
			
			for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPosicionesBancarias(posicionesbancariasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPosicionesBancariassSeleccionados() throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();		
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"posicionesbancarias.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("posicionesbancariass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("posicionesbancarias");
			//elementRoot.appendChild(element);
		
			for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassSeleccionados) {
				element = document.createElement("posicionesbancarias");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPosicionesBancarias(posicionesbancariasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Posiciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPosicionesBancarias(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPosicionesBancarias(PosicionesBancarias posicionesbancarias,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getorden_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getorden_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.gettipo_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getcodigo_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getnombre_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(posicionesbancarias.getbeneficiario());				
	}
	
	public void setFilaDatosExportarXmlPosicionesBancarias(PosicionesBancarias posicionesbancarias,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PosicionesBancariasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(posicionesbancarias.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PosicionesBancariasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(posicionesbancarias.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PosicionesBancariasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(posicionesbancarias.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(PosicionesBancariasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(posicionesbancarias.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(PosicionesBancariasConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(posicionesbancarias.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementfecha_desde = document.createElement(PosicionesBancariasConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(posicionesbancarias.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(PosicionesBancariasConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(posicionesbancarias.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementorden_desde = document.createElement(PosicionesBancariasConstantesFunciones.ORDENDESDE);
		elementorden_desde.appendChild(document.createTextNode(posicionesbancarias.getorden_desde().toString().trim()));
		element.appendChild(elementorden_desde);

		Element elementorden_hasta = document.createElement(PosicionesBancariasConstantesFunciones.ORDENHASTA);
		elementorden_hasta.appendChild(document.createTextNode(posicionesbancarias.getorden_hasta().toString().trim()));
		element.appendChild(elementorden_hasta);

		Element elementtipo_documento = document.createElement(PosicionesBancariasConstantesFunciones.TIPODOCUMENTO);
		elementtipo_documento.appendChild(document.createTextNode(posicionesbancarias.gettipo_documento().trim()));
		element.appendChild(elementtipo_documento);

		Element elementdetalle = document.createElement(PosicionesBancariasConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(posicionesbancarias.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementcodigo_cuenta = document.createElement(PosicionesBancariasConstantesFunciones.CODIGOCUENTA);
		elementcodigo_cuenta.appendChild(document.createTextNode(posicionesbancarias.getcodigo_cuenta().trim()));
		element.appendChild(elementcodigo_cuenta);

		Element elementnombre_cuenta = document.createElement(PosicionesBancariasConstantesFunciones.NOMBRECUENTA);
		elementnombre_cuenta.appendChild(document.createTextNode(posicionesbancarias.getnombre_cuenta().trim()));
		element.appendChild(elementnombre_cuenta);

		Element elementnumero_mayor = document.createElement(PosicionesBancariasConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(posicionesbancarias.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementdebito_local = document.createElement(PosicionesBancariasConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(posicionesbancarias.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(PosicionesBancariasConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(posicionesbancarias.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementtipo_movimiento = document.createElement(PosicionesBancariasConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(posicionesbancarias.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementfecha_emision = document.createElement(PosicionesBancariasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(posicionesbancarias.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha = document.createElement(PosicionesBancariasConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(posicionesbancarias.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementbeneficiario = document.createElement(PosicionesBancariasConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(posicionesbancarias.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);
	}
	
	public void generarReporteGroupGenericoPosicionesBancariassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados=new ArrayList<PosicionesBancarias>();
		
		posicionesbancariassSeleccionados=this.getPosicionesBancariassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPosicionesBancarias(posicionesbancariassSeleccionados);
		
		this.generarReportePosicionesBancariass("Todos",posicionesbancariassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPosicionesBancarias(ArrayList<PosicionesBancarias> posicionesbancariassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PosicionesBancarias posicionesbancariasAux:posicionesbancariassSeleccionados) {
				posicionesbancariasAux.setsDetalleGeneralEntityReporte(posicionesbancariasAux.toString());
			
				if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(posicionesbancariasAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(posicionesbancariasAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getorden_desde().toString());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getorden_hasta().toString());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.gettipo_documento());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getcodigo_cuenta());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getnombre_cuenta());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(posicionesbancariasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(posicionesbancariasAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					posicionesbancariasAux.setsDescripcionGeneralEntityReporte1(posicionesbancariasAux.getbeneficiario());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PosicionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPosicionesBancarias(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPosicionesBancarias=true;
				this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=true;
				this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=true;
			}
			
			this.isVisibilidadCeldaModificarPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
			this.isVisibilidadCeldaModificarPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=true;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
			this.isVisibilidadCeldaModificarPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=true;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=true;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
			this.isVisibilidadCeldaModificarPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=true;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=true;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=true;
			this.isVisibilidadCeldaModificarPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
			this.isVisibilidadCeldaModificarPosicionesBancarias=true;
			this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
			this.isVisibilidadCeldaCancelarPosicionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPosicionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=true;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=true;
		} else {
			this.actualizarEstadoPanelsPosicionesBancarias(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPosicionesBancarias=false;
			//this.isVisibilidadCeldaVerFormPosicionesBancarias=false;
			this.isVisibilidadCeldaDuplicarPosicionesBancarias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!posicionesbancariasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
		} else {
			this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(!posicionesbancariasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;												
			}
			
			this.jButtonCerrarPosicionesBancarias.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
		}
		
		if(!this.permiteMantenimiento(this.posicionesbancarias)) {
			this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
			this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPosicionesBancarias=false;
		this.isVisibilidadCeldaNuevoRelacionesPosicionesBancarias=false;
		this.isVisibilidadCeldaGuardarCambiosPosicionesBancarias=false;
		//this.isVisibilidadCeldaModificarPosicionesBancarias=true;
		this.isVisibilidadCeldaActualizarPosicionesBancarias=false;
		this.isVisibilidadCeldaEliminarPosicionesBancarias=false;
		//this.isVisibilidadCeldaCancelarPosicionesBancarias=true;			
		this.isVisibilidadCeldaGuardarPosicionesBancarias=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPosicionesBancarias() {
	}
	
	public void actualizarEstadoPanelsPosicionesBancarias(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPosicionesBancarias!=null) {
				this.jScrollPanelDatosEdicionPosicionesBancarias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPosicionesBancarias!=null) {
				this.jScrollPanelDatosPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionPosicionesBancarias!=null) {
				this.jPanelPaginacionPosicionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
					this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPosicionesBancarias!=null) {
				this.jTabbedPaneBusquedasPosicionesBancarias.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPosicionesBancarias!=null) {
				this.jPanelParametrosReportesPosicionesBancarias.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPosicionesBancarias=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPosicionesBancarias) {this.jTabbedPaneBusquedasPosicionesBancarias.remove(jPanelBusquedaPosicionesBancariasPosicionesBancarias);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPosicionesBancarias=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPosicionesBancarias) {this.jTabbedPaneBusquedasPosicionesBancarias.remove(jPanelBusquedaPosicionesBancariasPosicionesBancarias);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaPosicionesBancarias=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaPosicionesBancarias) {this.jTabbedPaneBusquedasPosicionesBancarias.remove(jPanelBusquedaPosicionesBancariasPosicionesBancarias);}
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
			
			this.inicializarActualizarBindingTablaPosicionesBancarias(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPosicionesBancarias() {
		this.updateBorderResaltarBusquedasFormularioPosicionesBancarias();
		this.updateVisibilidadBusquedasFormularioPosicionesBancarias();
		this.updateHabilitarBusquedasFormularioPosicionesBancarias();
	}
	
	public void updateBorderResaltarBusquedasFormularioPosicionesBancarias() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPosicionesBancarias.getComponents().length>0) {
	

		if(this.posicionesbancariasConstantesFunciones.resaltarBusquedaPosicionesBancariasPosicionesBancarias!=null) {
			index= this.jTabbedPaneBusquedasPosicionesBancarias.indexOfComponent(this.jPanelBusquedaPosicionesBancariasPosicionesBancarias);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPosicionesBancarias.getComponent(index);
				jPanel.setBorder(this.posicionesbancariasConstantesFunciones.resaltarBusquedaPosicionesBancariasPosicionesBancarias);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPosicionesBancarias() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPosicionesBancarias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPosicionesBancarias.indexOfComponent(this.jPanelBusquedaPosicionesBancariasPosicionesBancarias);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPosicionesBancarias.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.posicionesbancariasConstantesFunciones.mostrarBusquedaPosicionesBancariasPosicionesBancarias);
			if(!this.posicionesbancariasConstantesFunciones.mostrarBusquedaPosicionesBancariasPosicionesBancarias && index>-1) {
				this.jTabbedPaneBusquedasPosicionesBancarias.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPosicionesBancarias() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPosicionesBancarias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPosicionesBancarias.indexOfComponent(this.jPanelBusquedaPosicionesBancariasPosicionesBancarias);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPosicionesBancarias.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.posicionesbancariasConstantesFunciones.activarBusquedaPosicionesBancariasPosicionesBancarias);
				this.jTabbedPaneBusquedasPosicionesBancarias.setEnabledAt(index,this.posicionesbancariasConstantesFunciones.activarBusquedaPosicionesBancariasPosicionesBancarias);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPosicionesBancarias(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPosicionesBancarias")) {
			index= this.jTabbedPaneBusquedasPosicionesBancarias.indexOfComponent(this.jPanelBusquedaPosicionesBancariasPosicionesBancarias);

			this.jTabbedPaneBusquedasPosicionesBancarias.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPosicionesBancarias.getComponent(index);

			this.posicionesbancariasConstantesFunciones.setResaltarBusquedaPosicionesBancariasPosicionesBancarias(resaltar);

			jPanel.setBorder(this.posicionesbancariasConstantesFunciones.resaltarBusquedaPosicionesBancariasPosicionesBancarias);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPosicionesBancarias.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPosicionesBancarias() throws Exception {

		if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPosicionesBancarias();
		this.updateVisibilidadResaltarControlesFormularioPosicionesBancarias();
		this.updateHabilitarResaltarControlesFormularioPosicionesBancarias();
		
	}
	
	public void updateBorderResaltarControlesFormularioPosicionesBancarias() throws Exception {
		if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.posicionesbancariasConstantesFunciones.resaltaridPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltaridPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarid_empresaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarid_empresaPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarid_ejercicioPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarid_ejercicioPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarid_tipo_movimientoPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarid_tipo_movimientoPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarfecha_desdePosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_desdePosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarfecha_desdePosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarfecha_hastaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_hastaPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarfecha_hastaPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarorden_desdePosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_desdePosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarorden_desdePosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarorden_hastaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_hastaPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarorden_hastaPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltartipo_documentoPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltartipo_documentoPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltardetallePosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltardetallePosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarcodigo_cuentaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarcodigo_cuentaPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarnombre_cuentaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarnombre_cuentaPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarnumero_mayorPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarnumero_mayorPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltardebito_localPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltardebito_localPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarcredito_localPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarcredito_localPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltartipo_movimientoPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltartipo_movimientoPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarfecha_emisionPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarfecha_emisionPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarfechaPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarfechaPosicionesBancarias);}
		if(this.posicionesbancariasConstantesFunciones.resaltarbeneficiarioPosicionesBancarias!=null && this.jInternalFrameDetalleFormPosicionesBancarias!=null) {this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setBorder(this.posicionesbancariasConstantesFunciones.resaltarbeneficiarioPosicionesBancarias);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPosicionesBancarias() throws Exception {		
		if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
	
		//this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostraridPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelidPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostraridPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarid_empresaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelid_empresaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarid_empresaPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarid_ejercicioPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelid_ejercicioPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarid_ejercicioPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarid_tipo_movimientoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelid_tipo_movimientoPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarid_tipo_movimientoPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_desdePosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfecha_desdePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelfecha_desdePosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfecha_desdePosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_hastaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfecha_hastaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelfecha_hastaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfecha_hastaPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_desdePosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarorden_desdePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelorden_desdePosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarorden_desdePosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_hastaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarorden_hastaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelorden_hastaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarorden_hastaPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrartipo_documentoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPaneltipo_documentoPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrartipo_documentoPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrardetallePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPaneldetallePosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrardetallePosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarcodigo_cuentaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelcodigo_cuentaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarcodigo_cuentaPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarnombre_cuentaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelnombre_cuentaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarnombre_cuentaPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarnumero_mayorPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelnumero_mayorPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarnumero_mayorPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrardebito_localPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPaneldebito_localPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrardebito_localPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarcredito_localPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelcredito_localPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarcredito_localPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrartipo_movimientoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPaneltipo_movimientoPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrartipo_movimientoPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfecha_emisionPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelfecha_emisionPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfecha_emisionPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfechaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelfechaPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarfechaPosicionesBancarias);
		//this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarbeneficiarioPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jPanelbeneficiarioPosicionesBancarias.setVisible(this.posicionesbancariasConstantesFunciones.mostrarbeneficiarioPosicionesBancarias);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPosicionesBancarias() throws Exception {
		if(this.jInternalFrameDetalleFormPosicionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPosicionesBancarias!=null) {
	
		this.jInternalFrameDetalleFormPosicionesBancarias.jLabelidPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activaridPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_empresaPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarid_empresaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_ejercicioPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarid_ejercicioPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jComboBoxid_tipo_movimientoPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarid_tipo_movimientoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_desdePosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarfecha_desdePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_hastaPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarfecha_hastaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_desdePosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarorden_desdePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldorden_hastaPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarorden_hastaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_documentoPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activartipo_documentoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreadetallePosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activardetallePosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcodigo_cuentaPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarcodigo_cuentaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanombre_cuentaPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarnombre_cuentaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreanumero_mayorPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarnumero_mayorPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFielddebito_localPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activardebito_localPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextFieldcredito_localPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarcredito_localPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreatipo_movimientoPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activartipo_movimientoPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfecha_emisionPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarfecha_emisionPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jDateChooserfechaPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarfechaPosicionesBancarias);
		this.jInternalFrameDetalleFormPosicionesBancarias.jTextAreabeneficiarioPosicionesBancarias.setEnabled(this.posicionesbancariasConstantesFunciones.activarbeneficiarioPosicionesBancarias);
		}
	}
	
		
}