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

import com.bydan.erp.contabilidad.util.TipoCambioConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoCambioParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoCambioParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoCambioBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.sris.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCambioBeanSwingJInternalFrame extends TipoCambioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCambioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCambio> tipocambioValidator = new ClassValidator<TipoCambio>(TipoCambio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCambio tipocambio;	
	public TipoCambio tipocambioAux;
	public TipoCambio tipocambioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCambio tipocambioTotales;
	public Long idTipoCambioActual;
	public Long iIdNuevoTipoCambio=0L;
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

	public String sFinalQueryComboMoneda="";

	public List<Moneda> monedasForeignKey;

	public List<Moneda> getmonedasForeignKey() {
		return monedasForeignKey;
	}

	public void setmonedasForeignKey(List<Moneda> monedasForeignKey) {
		this.monedasForeignKey = monedasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Moneda monedaForeignKey;

	public Moneda getmonedaForeignKey() {
		return monedaForeignKey;
	}

	public void setmonedaForeignKey(Moneda monedaForeignKey) {
		this.monedaForeignKey = monedaForeignKey;
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
	
	public Boolean isPermisoTodoTipoCambio;
	public Boolean isPermisoNuevoTipoCambio;
	public Boolean isPermisoActualizarTipoCambio;
	public Boolean isPermisoActualizarOriginalTipoCambio;
	public Boolean isPermisoEliminarTipoCambio;
	public Boolean isPermisoGuardarCambiosTipoCambio;
	public Boolean isPermisoConsultaTipoCambio;
	public Boolean isPermisoBusquedaTipoCambio;
	public Boolean isPermisoReporteTipoCambio;
	public Boolean isPermisoPaginacionMedioTipoCambio;
	public Boolean isPermisoPaginacionAltoTipoCambio;
	public Boolean isPermisoPaginacionTodoTipoCambio;
	public Boolean isPermisoCopiarTipoCambio;
	public Boolean isPermisoVerFormTipoCambio;
	public Boolean isPermisoDuplicarTipoCambio;
	public Boolean isPermisoOrdenTipoCambio;
	
	
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
	
	public TipoCambioParameterReturnGeneral tipocambioReturnGeneral;
	public TipoCambioParameterReturnGeneral tipocambioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCambio=false;
	public Boolean esParaAccionDesdeFormularioTipoCambio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCambioSessionBeanAdditional tipocambioSessionBeanAdditional=null;
	
	public TipoCambioSessionBeanAdditional getTipoCambioSessionBeanAdditional() {
		return this.tipocambioSessionBeanAdditional;
	}
	
	public void setTipoCambioSessionBeanAdditional(TipoCambioSessionBeanAdditional tipocambioSessionBeanAdditional) {
		try {
			this.tipocambioSessionBeanAdditional=tipocambioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCambioBeanSwingJInternalFrameAdditional tipocambioBeanSwingJInternalFrameAdditional=null;
	//public class TipoCambioBeanSwingJInternalFrame
	
	public TipoCambioBeanSwingJInternalFrameAdditional getTipoCambioBeanSwingJInternalFrameAdditional() {
		return this.tipocambioBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCambioBeanSwingJInternalFrameAdditional(TipoCambioBeanSwingJInternalFrameAdditional tipocambioBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocambioBeanSwingJInternalFrameAdditional=tipocambioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCambioLogic tipocambioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCambio tipocambioBean;
	public TipoCambioConstantesFunciones tipocambioConstantesFunciones;
	//public TipoCambioParameterReturnGeneral tipocambioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public MonedaLogic monedaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCambio> tipocambios;	
	//public List<TipoCambio> tipocambiosEliminados;
	//public List<TipoCambio> tipocambiosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCambio=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCambio=true;
	public Boolean isVisibilidadCeldaCopiarTipoCambio=true;
	public Boolean isVisibilidadCeldaVerFormTipoCambio=true;
	public Boolean isVisibilidadCeldaOrdenTipoCambio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
	public Boolean isVisibilidadCeldaModificarTipoCambio=false;
	public Boolean isVisibilidadCeldaActualizarTipoCambio=false;
	public Boolean isVisibilidadCeldaEliminarTipoCambio=false;
	public Boolean isVisibilidadCeldaCancelarTipoCambio=false;
	public Boolean isVisibilidadCeldaGuardarTipoCambio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCambio=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMoneda=false;
	
	public Long getiIdNuevoTipoCambio() {
		return this.iIdNuevoTipoCambio;
	}

	public void setiIdNuevoTipoCambio(Long iIdNuevoTipoCambio) {
		this.iIdNuevoTipoCambio = iIdNuevoTipoCambio;
	}
	
	public Long getidTipoCambioActual() {
		return this.idTipoCambioActual;
	}

	public void setidTipoCambioActual(Long idTipoCambioActual) {
		this.idTipoCambioActual = idTipoCambioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCambio gettipocambio() {
		return this.tipocambio;
	}

	public void settipocambio(TipoCambio tipocambio) {
		this.tipocambio = tipocambio;
	}
	
	public TipoCambio gettipocambioAux() {
		return this.tipocambioAux;
	}

	public void settipocambioAux(TipoCambio tipocambioAux) {
		this.tipocambioAux = tipocambioAux;
	}				
	
	public TipoCambio gettipocambioAnterior() {
		return this.tipocambioAnterior;
	}

	public void settipocambioAnterior(TipoCambio tipocambioAnterior) {
		this.tipocambioAnterior = tipocambioAnterior;
	}	
	
	public TipoCambio gettipocambioTotales() {
		return this.tipocambioTotales;
	}

	public void settipocambioTotales(TipoCambio tipocambioTotales) {
		this.tipocambioTotales = tipocambioTotales;
	}	
	
	public TipoCambio gettipocambioBean() {
		return this.tipocambioBean;
	}

	public void settipocambioBean(TipoCambio tipocambioBean) {
		this.tipocambioBean = tipocambioBean;
	}	
	
	public TipoCambioParameterReturnGeneral gettipocambioReturnGeneral() {
		return this.tipocambioReturnGeneral;
	}

	public void settipocambioReturnGeneral(TipoCambioParameterReturnGeneral tipocambioReturnGeneral) {
		this.tipocambioReturnGeneral = tipocambioReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_monedaFK_IdMoneda=-1L;

	public Long getid_monedaFK_IdMoneda() {
		return this.id_monedaFK_IdMoneda;
	}

	public void setid_monedaFK_IdMoneda(Long id_monedaFK_IdMoneda) {
		this.id_monedaFK_IdMoneda = id_monedaFK_IdMoneda;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCambioLogic getTipoCambioLogic()	{		
		return tipocambioLogic;
	}

	public void setTipoCambioLogic(TipoCambioLogic tipocambioLogic) {
		this.tipocambioLogic = tipocambioLogic;
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
	
	public Boolean getIsEsNuevoTipoCambio() {
		return isEsNuevoTipoCambio;
	}

	public void setIsEsNuevoTipoCambio(Boolean isEsNuevoTipoCambio) {
		this.isEsNuevoTipoCambio = isEsNuevoTipoCambio;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCambio() {
		return esParaAccionDesdeFormularioTipoCambio;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCambio(Boolean esParaAccionDesdeFormularioTipoCambio) {
		this.esParaAccionDesdeFormularioTipoCambio = esParaAccionDesdeFormularioTipoCambio;
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

			if(this.tipocambioSessionBean==null) {
				this.tipocambioSessionBean=new TipoCambioSessionBean();
			}

			if(!this.tipocambioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocambioSessionBean.getlidEmpresaActual());
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

	public void cargarCombosMonedasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.monedasForeignKey=new ArrayList<Moneda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MonedaLogic monedaLogic=new MonedaLogic();

			//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

			if(this.tipocambioSessionBean==null) {
				this.tipocambioSessionBean=new TipoCambioSessionBean();
			}

			if(!this.tipocambioSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

					monedaLogic.getTodosMonedasWithConnection(sFinalQuery,new Pagination());

					this.monedasForeignKey=monedaLogic.getMonedas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMoneda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getEntityWithConnection(tipocambioSessionBean.getlidMonedaActual());
					this.monedasForeignKey.add(monedaLogic.getMoneda());
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

					if(this.tipocambio!=null) {
						this.tipocambio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCambio!=null) {
						this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCambio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCambio!=null) {
						if(this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCambioGenerico)throws Exception
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
				jComboBoxid_empresaTipoCambioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCambioGenerico!=null && jComboBoxid_empresaTipoCambioGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCambioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMonedaForeignKey(Long idMonedaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(monedaTemp!=null) {

					if(this.tipocambio!=null) {
						this.tipocambio.setMoneda(monedaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCambio!=null) {
						this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setSelectedItem(monedaTemp);
					}
				} else {
					//jComboBoxid_monedaTipoCambio.setSelectedItem(monedaTemp);
					if(this.jInternalFrameDetalleFormTipoCambio!=null) {
						if(this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setSelectedIndex(0);
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

	public String getActualMonedaForeignKeyDescripcion(Long idMonedaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}


			sDescripcion=MonedaConstantesFunciones.getMonedaDescripcion(monedaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMonedaForeignKeyGenerico(Long idMonedaSeleccionado,JComboBox jComboBoxid_monedaTipoCambioGenerico)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(monedaTemp!=null) {
				jComboBoxid_monedaTipoCambioGenerico.setSelectedItem(monedaTemp);
			} else {
				if(jComboBoxid_monedaTipoCambioGenerico!=null && jComboBoxid_monedaTipoCambioGenerico.getItemCount()>0) {
					jComboBoxid_monedaTipoCambioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCambio tipocambio,JComboBox jComboBoxid_empresaTipoCambioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCambioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCambioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocambio.setid_empresa(empresaAux.getId());
				tipocambio.setempresa_descripcion(TipoCambioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocambio.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMonedaForeignKey(TipoCambio tipocambio,JComboBox jComboBoxid_monedaTipoCambioGenerico)throws Exception
	{
		try
		{
			Moneda  monedaAux=new Moneda();

			if(jComboBoxid_monedaTipoCambioGenerico==null) {
				monedaAux=(Moneda)this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.getSelectedItem();
			} else {
				monedaAux=(Moneda)jComboBoxid_monedaTipoCambioGenerico.getSelectedItem();
			}

			if(monedaAux!=null && monedaAux.getId()!=null) {
				tipocambio.setid_moneda(monedaAux.getId());
				tipocambio.setmoneda_descripcion(TipoCambioConstantesFunciones.getMonedaDescripcion(monedaAux));
				tipocambio.setMoneda(monedaAux);			}
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

					if(!TipoCambioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCambio!=null) { 
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCambio!=null) { 
					}

					if(!TipoCambioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMonedasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMoneda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoCambioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCambio!=null) { 
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.removeAllItems();

							for(Moneda moneda:this.monedasForeignKey) {
								this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.addItem(moneda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCambio!=null) { 
					}

					if(!TipoCambioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCambio!=null) {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCambio!=null) {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMonedaForeignKey(Moneda moneda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoCambio!=null) {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setSelectedItem(moneda);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCambio!=null) {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCambio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCambioConstantesFunciones.refrescarForeignKeysDescripcionesTipoCambio(this.tipocambioLogic.getTipoCambios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCambioConstantesFunciones.refrescarForeignKeysDescripcionesTipoCambio(this.tipocambios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Moneda.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocambioLogic.setTipoCambios(this.tipocambios);
			tipocambioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCambioParameterReturnGeneral getTipoCambioParameterGeneral() {
		return this.tipocambioParameterGeneral;
	}
	
	public void setTipoCambioParameterGeneral(TipoCambioParameterReturnGeneral tipocambioParameterGeneral) {
		this.tipocambioParameterGeneral = tipocambioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCambio() {
		return isPermisoTodoTipoCambio;
	}

	public void setIsPermisoTodoTipoCambio(Boolean isPermisoTodoTipoCambio) {
		this.isPermisoTodoTipoCambio = isPermisoTodoTipoCambio;
	}

	public Boolean getIsPermisoNuevoTipoCambio() {
		return isPermisoNuevoTipoCambio;
	}

	public void setIsPermisoNuevoTipoCambio(Boolean isPermisoNuevoTipoCambio) {
		this.isPermisoNuevoTipoCambio = isPermisoNuevoTipoCambio;
	}

	public Boolean getIsPermisoActualizarTipoCambio() {
		return isPermisoActualizarTipoCambio;
	}

	public void setIsPermisoActualizarTipoCambio(Boolean isPermisoActualizarTipoCambio) {
		this.isPermisoActualizarTipoCambio = isPermisoActualizarTipoCambio;
	}

	public Boolean getIsPermisoEliminarTipoCambio() {
		return isPermisoEliminarTipoCambio;
	}

	public void setIsPermisoEliminarTipoCambio(Boolean isPermisoEliminarTipoCambio) {
		this.isPermisoEliminarTipoCambio = isPermisoEliminarTipoCambio;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCambio() {
		return isPermisoGuardarCambiosTipoCambio;
	}

	public void setIsPermisoGuardarCambiosTipoCambio(Boolean isPermisoGuardarCambiosTipoCambio) {
		this.isPermisoGuardarCambiosTipoCambio = isPermisoGuardarCambiosTipoCambio;
	}
	
	public Boolean getIsPermisoConsultaTipoCambio() {
		return isPermisoConsultaTipoCambio;
	}

	public void setIsPermisoConsultaTipoCambio(Boolean isPermisoConsultaTipoCambio) {
		this.isPermisoConsultaTipoCambio = isPermisoConsultaTipoCambio;
	}

	public Boolean getIsPermisoBusquedaTipoCambio() {
		return isPermisoBusquedaTipoCambio;
	}

	public void setIsPermisoBusquedaTipoCambio(Boolean isPermisoBusquedaTipoCambio) {
		this.isPermisoBusquedaTipoCambio = isPermisoBusquedaTipoCambio;
	}

	public Boolean getIsPermisoReporteTipoCambio() {
		return isPermisoReporteTipoCambio;
	}

	public void setIsPermisoReporteTipoCambio(Boolean isPermisoReporteTipoCambio) {
		this.isPermisoReporteTipoCambio = isPermisoReporteTipoCambio;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCambio() {
		return isPermisoPaginacionMedioTipoCambio;
	}

	public void setIsPermisoPaginacionMedioTipoCambio(Boolean isPermisoPaginacionMedioTipoCambio) {
		this.isPermisoPaginacionMedioTipoCambio = isPermisoPaginacionMedioTipoCambio;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCambio() {
		return isPermisoPaginacionTodoTipoCambio;
	}

	public void setIsPermisoPaginacionTodoTipoCambio(Boolean isPermisoPaginacionTodoTipoCambio) {
		this.isPermisoPaginacionTodoTipoCambio = isPermisoPaginacionTodoTipoCambio;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCambio() {
		return isPermisoPaginacionAltoTipoCambio;
	}

	public void setIsPermisoPaginacionAltoTipoCambio(Boolean isPermisoPaginacionAltoTipoCambio) {
		this.isPermisoPaginacionAltoTipoCambio = isPermisoPaginacionAltoTipoCambio;
	}
	
	public Boolean getIsPermisoCopiarTipoCambio() {
		return isPermisoCopiarTipoCambio;
	}

	public void setIsPermisoCopiarTipoCambio(Boolean isPermisoCopiarTipoCambio) {
		this.isPermisoCopiarTipoCambio = isPermisoCopiarTipoCambio;
	}
	
	public Boolean getIsPermisoVerFormTipoCambio() {
		return isPermisoVerFormTipoCambio;
	}

	public void setIsPermisoVerFormTipoCambio(Boolean isPermisoVerFormTipoCambio) {
		this.isPermisoVerFormTipoCambio = isPermisoVerFormTipoCambio;
	}
	
	public Boolean getIsPermisoDuplicarTipoCambio() {
		return isPermisoDuplicarTipoCambio;
	}

	public void setIsPermisoDuplicarTipoCambio(Boolean isPermisoDuplicarTipoCambio) {
		this.isPermisoDuplicarTipoCambio = isPermisoDuplicarTipoCambio;
	}
	
	public Boolean getIsPermisoOrdenTipoCambio() {
		return isPermisoOrdenTipoCambio;
	}

	public void setIsPermisoOrdenTipoCambio(Boolean isPermisoOrdenTipoCambio) {
		this.isPermisoOrdenTipoCambio = isPermisoOrdenTipoCambio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCambio() {
		return isVisibilidadCeldaNuevoTipoCambio;
	}

	public void setIsVisibilidadCeldaNuevoTipoCambio(Boolean isVisibilidadCeldaNuevoTipoCambio) {
		this.isVisibilidadCeldaNuevoTipoCambio = isVisibilidadCeldaNuevoTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCambio() {
		return isVisibilidadCeldaDuplicarTipoCambio;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCambio(Boolean isVisibilidadCeldaDuplicarTipoCambio) {
		this.isVisibilidadCeldaDuplicarTipoCambio = isVisibilidadCeldaDuplicarTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCambio() {
		return isVisibilidadCeldaCopiarTipoCambio;
	}

	public void setIsVisibilidadCeldaCopiarTipoCambio(Boolean isVisibilidadCeldaCopiarTipoCambio) {
		this.isVisibilidadCeldaCopiarTipoCambio = isVisibilidadCeldaCopiarTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCambio() {
		return isVisibilidadCeldaVerFormTipoCambio;
	}

	public void setIsVisibilidadCeldaVerFormTipoCambio(Boolean isVisibilidadCeldaVerFormTipoCambio) {
		this.isVisibilidadCeldaVerFormTipoCambio = isVisibilidadCeldaVerFormTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCambio() {
		return isVisibilidadCeldaOrdenTipoCambio;
	}

	public void setIsVisibilidadCeldaOrdenTipoCambio(Boolean isVisibilidadCeldaOrdenTipoCambio) {
		this.isVisibilidadCeldaOrdenTipoCambio = isVisibilidadCeldaOrdenTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCambio() {
		return isVisibilidadCeldaNuevoRelacionesTipoCambio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCambio(Boolean isVisibilidadCeldaNuevoRelacionesTipoCambio) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCambio = isVisibilidadCeldaNuevoRelacionesTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCambio() {
		return isVisibilidadCeldaModificarTipoCambio;
	}

	public void setIsVisibilidadCeldaModificarTipoCambio(Boolean isVisibilidadCeldaModificarTipoCambio) {
		this.isVisibilidadCeldaModificarTipoCambio = isVisibilidadCeldaModificarTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCambio() {
		return isVisibilidadCeldaActualizarTipoCambio;
	}

	public void setIsVisibilidadCeldaActualizarTipoCambio(Boolean isVisibilidadCeldaActualizarTipoCambio) {
		this.isVisibilidadCeldaActualizarTipoCambio = isVisibilidadCeldaActualizarTipoCambio;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCambio() {
		return isVisibilidadCeldaEliminarTipoCambio;
	}

	public void setIsVisibilidadCeldaEliminarTipoCambio(Boolean isVisibilidadCeldaEliminarTipoCambio) {
		this.isVisibilidadCeldaEliminarTipoCambio = isVisibilidadCeldaEliminarTipoCambio;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCambio() {
		return isVisibilidadCeldaCancelarTipoCambio;
	}

	public void setIsVisibilidadCeldaCancelarTipoCambio(Boolean isVisibilidadCeldaCancelarTipoCambio) {
		this.isVisibilidadCeldaCancelarTipoCambio = isVisibilidadCeldaCancelarTipoCambio;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCambio() {
		return isVisibilidadCeldaGuardarTipoCambio;
	}

	public void setIsVisibilidadCeldaGuardarTipoCambio(Boolean isVisibilidadCeldaGuardarTipoCambio) {
		this.isVisibilidadCeldaGuardarTipoCambio = isVisibilidadCeldaGuardarTipoCambio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCambio() {
		return isVisibilidadCeldaGuardarCambiosTipoCambio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCambio(Boolean isVisibilidadCeldaGuardarCambiosTipoCambio) {
		this.isVisibilidadCeldaGuardarCambiosTipoCambio = isVisibilidadCeldaGuardarCambiosTipoCambio;
	}
		
	public TipoCambioSessionBean gettipocambioSessionBean() {
		return this.tipocambioSessionBean;
	}
	
	public void settipocambioSessionBean(TipoCambioSessionBean tipocambioSessionBean) {
		this.tipocambioSessionBean=tipocambioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMoneda() {
		return this.isVisibilidadFK_IdMoneda;
	}

	public void setisVisibilidadFK_IdMoneda(Boolean isVisibilidadFK_IdMoneda) {
		this.isVisibilidadFK_IdMoneda=isVisibilidadFK_IdMoneda;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCambio(TipoCambio tipocambio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocambio,null);
				this.setActualParaGuardarMonedaForeignKey(tipocambio,null);
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
	
	public void bugActualizarReferenciaActual(TipoCambio tipocambio,TipoCambio tipocambioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCambio(tipocambio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocambioAux.setId(tipocambio.getId());
		tipocambioAux.setVersionRow(tipocambio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCambio();
		
			int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocambioValidator.getInvalidValues(this.tipocambio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocambioLogic.setDatosCliente(datosCliente);
			tipocambioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocambioAux=new  TipoCambio();
				
				tipocambioAux.setIsNew(true);
				tipocambioAux.setIsChanged(true);
				
				tipocambioAux.setTipoCambioOriginal(this.tipocambio);
				
				tipocambioAux.setId(this.tipocambio.getId());	
				tipocambioAux.setVersionRow(this.tipocambio.getVersionRow());	
				tipocambioAux.setid_empresa(this.tipocambio.getid_empresa());	
				tipocambioAux.setid_moneda(this.tipocambio.getid_moneda());	
				tipocambioAux.setvalor_compra(this.tipocambio.getvalor_compra());	
				tipocambioAux.setvalor_venta(this.tipocambio.getvalor_venta());	
				tipocambioAux.setfecha(this.tipocambio.getfecha());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocambioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocambioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocambioAux,tipocambioLogic.getTipoCambios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocambioAux,tipocambios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocambioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocambioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioLogic.saveTipoCambios();//WithConnection
						//tipocambioLogic.getSetVersionRowTipoCambios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocambio,tipocambioAux);
					
					this.refrescarForeignKeysDescripcionesTipoCambio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocambioAux=new  TipoCambio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocambioSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocambioSessionBean.getEsGuardarRelacionado() && this.tipocambio.getId()>=0)) {
						
					tipocambioAux.setIsNew(false);
				}
				
				tipocambioAux.setIsDeleted(false);
			
				tipocambioAux.setId(this.tipocambio.getId());	
				tipocambioAux.setVersionRow(this.tipocambio.getVersionRow());	
				tipocambioAux.setid_empresa(this.tipocambio.getid_empresa());	
				tipocambioAux.setid_moneda(this.tipocambio.getid_moneda());	
				tipocambioAux.setvalor_compra(this.tipocambio.getvalor_compra());	
				tipocambioAux.setvalor_venta(this.tipocambio.getvalor_venta());	
				tipocambioAux.setfecha(this.tipocambio.getfecha());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocambioAux,tipocambioLogic.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocambioAux,tipocambios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocambioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocambioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioLogic.saveTipoCambios();//WithConnection
						//tipocambioLogic.getSetVersionRowTipoCambios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocambio,tipocambioAux);
					
					this.refrescarForeignKeysDescripcionesTipoCambio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocambioAux=new  TipoCambio();
				
				tipocambioAux.setIsNew(false);
				tipocambioAux.setIsChanged(false);
				
				tipocambioAux.setIsDeleted(true);
				
				tipocambioAux.setId(this.tipocambio.getId());	
				tipocambioAux.setVersionRow(this.tipocambio.getVersionRow());	
				tipocambioAux.setid_empresa(this.tipocambio.getid_empresa());	
				tipocambioAux.setid_moneda(this.tipocambio.getid_moneda());	
				tipocambioAux.setvalor_compra(this.tipocambio.getvalor_compra());	
				tipocambioAux.setvalor_venta(this.tipocambio.getvalor_venta());	
				tipocambioAux.setfecha(this.tipocambio.getfecha());	
				
				if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocambioAux.getId()>=0) {	
						this.tipocambiosEliminados.add(tipocambioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocambioAux,tipocambioLogic.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocambioAux,tipocambios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocambioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocambioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioLogic.saveTipoCambios();//WithConnection
						//tipocambioLogic.getSetVersionRowTipoCambios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getTipoCambios().addAll(this.tipocambiosEliminados);
					
					tipocambioLogic.saveTipoCambios();//WithConnection
					//tipocambioLogic.getSetVersionRowTipoCambios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCambio();
				
				this.tipocambiosEliminados= new ArrayList<TipoCambio>();		
			}
			
			if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cambio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocambio=tipocambioAux;
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
      		//this.finishProcessTipoCambio();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCambio tipocambioLocal) throws Exception {
		
		if(this.tipocambioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCambio tipocambioLocal) throws Exception {	
		if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocambioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MonedaDetalleFormJInternalFrame.class)) {
				MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrameLocal=(MonedaBeanSwingJInternalFrame) ((MonedaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				monedaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMoneda(monedaBeanSwingJInternalFrameLocal.getmoneda(),true);
				monedaBeanSwingJInternalFrameLocal.actualizarLista(monedaBeanSwingJInternalFrameLocal.moneda,this.monedasForeignKey);

				monedaBeanSwingJInternalFrameLocal.actualizarRelaciones(monedaBeanSwingJInternalFrameLocal.moneda);

				tipocambioLocal.setMoneda(monedaBeanSwingJInternalFrameLocal.moneda);

				this.addItemDefectoCombosForeignKeyMoneda();
				this.cargarCombosFrameMonedasForeignKey("Formulario");
				this.setActualMonedaForeignKey(monedaBeanSwingJInternalFrameLocal.moneda.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCambioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocambioValidator.getInvalidValues(this.tipocambio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCambio tipocambio,List<TipoCambio> tipocambios) throws Exception {
		try	{		
			TipoCambioConstantesFunciones.actualizarLista(tipocambio,tipocambios,this.tipocambioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCambio tipocambio,List<TipoCambio> tipocambios) throws Exception {
		try	{			
			TipoCambioConstantesFunciones.actualizarSelectedLista(tipocambio,tipocambios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCambio> tipocambiosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocambiosLocal=this.tipocambioLogic.getTipoCambios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocambiosLocal=this.tipocambios;
			}
			//ARCHITECTURE
		
			for(TipoCambio tipocambioLocal:tipocambiosLocal) {
				if(this.permiteMantenimiento(tipocambioLocal) && tipocambioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCambioConstantesFunciones.getTipoCambioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCambioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelid_empresaTipoCambio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCambioConstantesFunciones.IDMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelid_monedaTipoCambio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCambioConstantesFunciones.VALORCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelvalor_compraTipoCambio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCambioConstantesFunciones.VALORVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelvalor_ventaTipoCambio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCambioConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelfechaTipoCambio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCambio.jLabelid_empresaTipoCambio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCambio.jLabelid_monedaTipoCambio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCambio.jLabelvalor_compraTipoCambio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCambio.jLabelvalor_ventaTipoCambio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCambio.jLabelfechaTipoCambio,"");
		
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
		this.iIdNuevoTipoCambio--;	
		
		
		this.tipocambioAux=new TipoCambio();
		
		this.tipocambioAux.setId(this.iIdNuevoTipoCambio);
		this.tipocambioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocambioLogic.getTipoCambios().add(this.tipocambioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocambios.add(this.tipocambioAux);
		}
		//ARCHITECTURE
		
		this.tipocambio=this.tipocambioAux;
		
		if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCambio(this.tipocambio);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCambio(this.tipocambio);
		}
				
		//this.setDefaultControlesTipoCambio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCambio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCambio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCambio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCambio(this.tipocambioBean,this.tipocambio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCambioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
			classes=TipoCambioConstantesFunciones.getClassesRelationshipsOfTipoCambio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocambioReturnGeneral=tipocambioLogic.procesarEventosTipoCambiosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocambioLogic.getTipoCambios(),this.tipocambio,this.tipocambioParameterGeneral,this.isEsNuevoTipoCambio,classes);//this.tipocambioLogic.getTipoCambio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCambio(this.tipocambioReturnGeneral,this.tipocambioBean,false);
		
		if(this.tipocambioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCambio(this.tipocambioReturnGeneral.getTipoCambio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCambio(this.tipocambioReturnGeneral.getTipoCambio());
		}
		
		if(this.tipocambioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCambio(this.tipocambioReturnGeneral.getTipoCambio(),classes);//this.tipocambioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCambio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCambio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCambioBeanSwingJInternalFrameAdditional.RecargarFormTipoCambio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCambio(false);
						
			if(tipocambioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCambio();
			}
			
			this.actualizarVisualTableDatosTipoCambio();
			
			this.jTableDatosTipoCambio.setRowSelectionInterval(this.getIndiceNuevoTipoCambio(), this.getIndiceNuevoTipoCambio());
			
			this.seleccionarFilaTablaTipoCambioActual();
						
			this.actualizarEstadoCeldasBotonesTipoCambio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCambio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setEnabled(isHabilitar && this.tipocambioConstantesFunciones.activarvalor_compraTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setEnabled(isHabilitar && this.tipocambioConstantesFunciones.activarvalor_ventaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setEnabled(isHabilitar && this.tipocambioConstantesFunciones.activarfechaTipoCambio);	
		//
		this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setEnabled(isHabilitar && this.tipocambioConstantesFunciones.activarid_empresaTipoCambio);//
		this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setEnabled(isHabilitar && this.tipocambioConstantesFunciones.activarid_monedaTipoCambio);
	};
	
	public void setDefaultControlesTipoCambio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCambio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocambioSessionBean.setConGuardarRelaciones(true);			
			this.tipocambioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.setVisible(true);
			
					
		} else {
			//this.tipocambioSessionBean.setConGuardarRelaciones(false);			
			this.tipocambioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCambio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
				if(tipocambioAux.getId().equals(this.iIdNuevoTipoCambio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCambio tipocambioAux:this.tipocambios) {
				if(tipocambioAux.getId().equals(this.iIdNuevoTipoCambio)) {
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
	
	public int getIndiceActualTipoCambio(TipoCambio tipocambio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
				if(tipocambioAux.getId().equals(tipocambio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCambio tipocambioAux:this.tipocambios) {
				if(tipocambioAux.getId().equals(tipocambio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCambio(TipoCambio tipocambioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
				if(tipocambioAux.getTipoCambioOriginal().getId().equals(tipocambioOriginal.getId())) {
					existe=true;
					tipocambioOriginal.setId(tipocambioAux.getId());
					tipocambioOriginal.setVersionRow(tipocambioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCambio tipocambioAux:this.tipocambios) {
				if(tipocambioAux.getTipoCambioOriginal().getId().equals(tipocambioOriginal.getId())) {
					existe=true;
					tipocambioOriginal.setId(tipocambioAux.getId());
					tipocambioOriginal.setVersionRow(tipocambioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCambio(Boolean esParaCancelar) throws Exception {
		tipocambiosAux=new ArrayList<TipoCambio>();
		tipocambioAux=new TipoCambio();
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
					if(tipocambioAux.getId()<0) {
						tipocambiosAux.add(tipocambioAux);
					}		
				}
				this.iIdNuevoTipoCambio=0L;
				this.tipocambioLogic.getTipoCambios().removeAll(tipocambiosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCambio tipocambioAux:this.tipocambios) {
					if(tipocambioAux.getId()<0) {
						tipocambiosAux.add(tipocambioAux);
					}		
				}
				this.iIdNuevoTipoCambio=0L;
				this.tipocambios.removeAll(tipocambiosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCambio 
					&& this.tipocambioLogic.getTipoCambios().size()>0
					) {
					tipocambioAux=this.tipocambioLogic.getTipoCambios().get(this.tipocambioLogic.getTipoCambios().size() - 1);
				
					if(tipocambioAux.getId()<0) {
						this.tipocambioLogic.getTipoCambios().remove(tipocambioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCambio && this.tipocambios.size()>0) {
					tipocambioAux=this.tipocambios.get(this.tipocambios.size() - 1);
				
					if(tipocambioAux.getId()<0) {
						this.tipocambios.remove(tipocambioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCambio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocambio.getId()<0) {
				this.tipocambioLogic.getTipoCambios().remove(this.tipocambio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocambio.getId()<0) {
				this.tipocambios.remove(this.tipocambio);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCambio(List<TipoCambio> tipocambiosAux) throws Exception {
		TipoCambioConstantesFunciones.setEstadosInicialesTipoCambio(tipocambiosAux);
	}
	
	public void setEstadosInicialesTipoCambio(TipoCambio tipocambioAux) throws Exception {
		TipoCambioConstantesFunciones.setEstadosInicialesTipoCambio(tipocambioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCambioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCambio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCambioActual()) {
				if(!this.isEsNuevoTipoCambio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCambio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCambio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCambioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cambio ?", "MANTENIMIENTO DE Tipo Cambio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCambio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCambio tipocambio) throws Exception {
		TipoCambioConstantesFunciones.seleccionarAsignar(this.tipocambio,tipocambio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCambio=this.isPermisoActualizarOriginalTipoCambio;
			
			
			this.seleccionarAsignar(tipocambio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCambioConstantesFunciones.quitarEspaciosTipoCambio(this.tipocambio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCambio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocambioSessionBean.setsFuncionBusquedaRapida(this.tipocambioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCambio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCambio(esParaCancelar);				
				this.cancelarNuevoTipoCambio(esParaCancelar);								
			}
			
			this.tipocambio=new TipoCambio();
			
			this.inicializarTipoCambio();
			
			this.actualizarEstadoCeldasBotonesTipoCambio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCambio() throws Exception {
		try {
			TipoCambioConstantesFunciones.inicializarTipoCambio(this.tipocambio);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocambioLogic.getTipoCambios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCambios(String sAccionBusqueda,List<TipoCambio> tipocambiosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCambio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCambioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCambioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCambio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cambios");		
		parameters.put("busquedapor", TipoCambioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCambio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCambioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCambioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCambio=new JRBeanArrayDataSource(TipoCambioJInternalFrame.TraerTipoCambioBeans(tipocambiosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCambio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCambioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCambioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCambioBean.TraerTipoCambioBeans(tipocambiosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCambios(sAccionBusqueda,sTipoArchivoReporte,tipocambiosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCambios(sAccionBusqueda,sTipoArchivoReporte,tipocambiosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCambioActionPerformed(null);
					//this.generarExcelReporteTipoCambios(sAccionBusqueda,sTipoArchivoReporte,tipocambiosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCambios(sAccionBusqueda,sTipoArchivoReporte,tipocambiosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCambios(sAccionBusqueda,sTipoArchivoReporte,tipocambiosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCambios(sAccionBusqueda,sTipoArchivoReporte,tipocambiosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCambios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCambio> tipocambiosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCambios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCambio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCambio tipocambio : tipocambiosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCambioConstantesFunciones.generarExcelReporteDataTipoCambio("NORMAL",row,workbook,tipocambio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCambio(String sTipo,Row row,Workbook workbook) {
		
		TipoCambioConstantesFunciones.generarExcelReporteHeaderTipoCambio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCambios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCambio> tipocambiosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCambios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCambio tipocambio : tipocambiosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCambioConstantesFunciones.getTipoCambioDescripcion(tipocambio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCambioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCambioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocambio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCambioConstantesFunciones.LABEL_IDMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCambioConstantesFunciones.LABEL_IDMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocambio.getmoneda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocambio.getvalor_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCambioConstantesFunciones.LABEL_VALORVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VALORVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocambio.getvalor_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCambioConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCambioConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocambio.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCambios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCambio> tipocambiosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCambio> tipocambiosRespaldo=null;
		
		classes=TipoCambioConstantesFunciones.getClassesRelationshipsOfTipoCambio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocambioLogic.setDatosCliente(this.datosCliente);
		this.tipocambioLogic.setDatosDeep(this.datosDeep);
		this.tipocambioLogic.setIsConDeep(true);
		
		tipocambiosRespaldo=this.tipocambioLogic.getTipoCambios();
		
		this.tipocambioLogic.setTipoCambios(tipocambiosParaReportes);	
		this.tipocambioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocambiosParaReportes=this.tipocambioLogic.getTipoCambios();
		this.tipocambioLogic.setTipoCambios(tipocambiosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCambios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCambio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCambio tipocambio : tipocambiosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCambio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCambioConstantesFunciones.generarExcelReporteDataTipoCambio("NORMAL",row,workbook,tipocambio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCambioConstantesFunciones.getTipoCambioDescripcion(tipocambio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCambio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCambio() throws Exception {		
		this.startProcessTipoCambio(true);
	}
	
	public void startProcessTipoCambio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCambio ,this.jPanelParametrosReportesTipoCambio, this.jScrollPanelDatosTipoCambio,this.jPanelPaginacionTipoCambio, this.jScrollPanelDatosEdicionTipoCambio, this.jPanelAccionesTipoCambio,this.jPanelAccionesFormularioTipoCambio,this.jmenuBarTipoCambio,this.jmenuBarDetalleTipoCambio,this.jTtoolBarTipoCambio,this.jTtoolBarDetalleTipoCambio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCambio=this.jTabbedPaneBusquedasTipoCambio; 
		
		final JPanel jPanelParametrosReportesTipoCambio=this.jPanelParametrosReportesTipoCambio;
		//final JScrollPane jScrollPanelDatosTipoCambio=this.jScrollPanelDatosTipoCambio;
		final JTable jTableDatosTipoCambio=this.jTableDatosTipoCambio;		
		final JPanel jPanelPaginacionTipoCambio=this.jPanelPaginacionTipoCambio;
		//final JScrollPane jScrollPanelDatosEdicionTipoCambio=this.jScrollPanelDatosEdicionTipoCambio;
		final JPanel jPanelAccionesTipoCambio=this.jPanelAccionesTipoCambio;
		
		JPanel jPanelCamposAuxiliarTipoCambio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCambio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			jPanelCamposAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jPanelCamposTipoCambio;
			jPanelAccionesFormularioAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jPanelAccionesFormularioTipoCambio;
		}
		
		final JPanel jPanelCamposTipoCambio=jPanelCamposAuxiliarTipoCambio;
		final JPanel jPanelAccionesFormularioTipoCambio=jPanelAccionesFormularioAuxiliarTipoCambio;
		
		
		final JMenuBar jmenuBarTipoCambio=this.jmenuBarTipoCambio;
		final JToolBar jTtoolBarTipoCambio=this.jTtoolBarTipoCambio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCambio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCambio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			jmenuBarDetalleAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jmenuBarDetalleTipoCambio;
			jTtoolBarDetalleAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jTtoolBarDetalleTipoCambio;
		}
		
		final JMenuBar jmenuBarDetalleTipoCambio=jmenuBarDetalleAuxiliarTipoCambio;
		final JToolBar jTtoolBarDetalleTipoCambio=jTtoolBarDetalleAuxiliarTipoCambio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCambio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCambio;
			processRunnable.jTableDatos=jTableDatosTipoCambio;
			processRunnable.jPanelCampos=jPanelCamposTipoCambio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCambio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCambio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCambio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCambio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCambio;
			processRunnable.jTtoolBar=jTtoolBarTipoCambio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCambio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCambio ,jPanelParametrosReportesTipoCambio,jTableDatosTipoCambio, /*jScrollPanelDatosTipoCambio,*/jPanelCamposTipoCambio,jPanelPaginacionTipoCambio, /*jScrollPanelDatosEdicionTipoCambio,*/ jPanelAccionesTipoCambio,jPanelAccionesFormularioTipoCambio,jmenuBarTipoCambio,jmenuBarDetalleTipoCambio,jTtoolBarTipoCambio,jTtoolBarDetalleTipoCambio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCambio ,jPanelParametrosReportesTipoCambio, jScrollPanelDatosTipoCambio,jPanelPaginacionTipoCambio, jScrollPanelDatosEdicionTipoCambio, jPanelAccionesTipoCambio,jPanelAccionesFormularioTipoCambio,jmenuBarTipoCambio,jmenuBarDetalleTipoCambio,jTtoolBarTipoCambio,jTtoolBarDetalleTipoCambio);
						
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
	
	public void finishProcessTipoCambio() {// throws Exception 
		this.finishProcessTipoCambio(true);
	}
	
	public void finishProcessTipoCambio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCambio ,this.jPanelParametrosReportesTipoCambio, this.jScrollPanelDatosTipoCambio,this.jPanelPaginacionTipoCambio, this.jScrollPanelDatosEdicionTipoCambio, this.jPanelAccionesTipoCambio,this.jPanelAccionesFormularioTipoCambio,this.jmenuBarTipoCambio,this.jmenuBarDetalleTipoCambio,this.jTtoolBarTipoCambio,this.jTtoolBarDetalleTipoCambio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCambio=this.jTabbedPaneBusquedasTipoCambio; 
		
		final JPanel jPanelParametrosReportesTipoCambio=this.jPanelParametrosReportesTipoCambio;
		//final JScrollPane jScrollPanelDatosTipoCambio=this.jScrollPanelDatosTipoCambio;
		final JTable jTableDatosTipoCambio=this.jTableDatosTipoCambio;		
		final JPanel jPanelPaginacionTipoCambio=this.jPanelPaginacionTipoCambio;
		//final JScrollPane jScrollPanelDatosEdicionTipoCambio=this.jScrollPanelDatosEdicionTipoCambio;
		final JPanel jPanelAccionesTipoCambio=this.jPanelAccionesTipoCambio;
		
		JPanel jPanelCamposAuxiliarTipoCambio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCambio=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			jPanelCamposAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jPanelCamposTipoCambio;
			jPanelAccionesFormularioAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jPanelAccionesFormularioTipoCambio;
		}
		
		final JPanel jPanelCamposTipoCambio=jPanelCamposAuxiliarTipoCambio;
		final JPanel jPanelAccionesFormularioTipoCambio=jPanelAccionesFormularioAuxiliarTipoCambio;
		
		
		final JMenuBar jmenuBarTipoCambio=this.jmenuBarTipoCambio;		
		final JToolBar jTtoolBarTipoCambio=this.jTtoolBarTipoCambio;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCambio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCambio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			jmenuBarDetalleAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jmenuBarDetalleTipoCambio;
			jTtoolBarDetalleAuxiliarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jTtoolBarDetalleTipoCambio;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCambio=jmenuBarDetalleAuxiliarTipoCambio;
		final JToolBar jTtoolBarDetalleTipoCambio=jTtoolBarDetalleAuxiliarTipoCambio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCambio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCambio;
			processRunnable.jTableDatos=jTableDatosTipoCambio;
			processRunnable.jPanelCampos=jPanelCamposTipoCambio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCambio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCambio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCambio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCambio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCambio;
			processRunnable.jTtoolBar=jTtoolBarTipoCambio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCambio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCambio ,jPanelParametrosReportesTipoCambio, jTableDatosTipoCambio,/*jScrollPanelDatosTipoCambio,*/jPanelCamposTipoCambio,jPanelPaginacionTipoCambio, /*jScrollPanelDatosEdicionTipoCambio,*/ jPanelAccionesTipoCambio,jPanelAccionesFormularioTipoCambio,jmenuBarTipoCambio,jmenuBarDetalleTipoCambio,jTtoolBarTipoCambio,jTtoolBarDetalleTipoCambio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCambio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCambio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCambio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCambio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCambio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCambio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCambio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCambio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCambio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocambioConstantesFunciones.getsFinalQueryTipoCambio();
		String  finalQueryPaginacionTodos=this.tipocambioConstantesFunciones.getsFinalQueryTipoCambio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCambioConstantesFunciones.getArrayColumnasGlobalesNoTipoCambio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCambioConstantesFunciones.getArrayColumnasGlobalesTipoCambio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCambioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocambiosEliminados= new ArrayList<TipoCambio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCambio();
		
				///*TipoCambioSessionBean*/this.tipocambioSessionBean=new TipoCambioSessionBean();
			
			if(this.tipocambioSessionBean==null) {
				this.tipocambioSessionBean=new TipoCambioSessionBean();
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
					this.iNumeroPaginacion=TipoCambioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCambioConstantesFunciones.getClassesForeignKeysOfTipoCambio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocambio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocambiosAux= new ArrayList<TipoCambio>();
			
				
			tipocambioLogic.setDatosCliente(this.datosCliente);
			tipocambioLogic.setDatosDeep(this.datosDeep);
			tipocambioLogic.setIsConDeep(true);
			
			
			tipocambioLogic.getTipoCambioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocambioLogic.getTodosTipoCambios(finalQueryGlobal,pagination);
					
					//tipocambioLogic.getTodosTipoCambiosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocambioLogic.getTipoCambios()==null|| tipocambioLogic.getTipoCambios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocambiosAux= new ArrayList<TipoCambio>();
							tipocambiosAux.addAll(tipocambioLogic.getTipoCambios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambiosAux= new ArrayList<TipoCambio>();
							tipocambiosAux.addAll(tipocambios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocambioLogic.getTodosTipoCambios(finalQueryGlobal+"",this.pagination);												
							
							//tipocambioLogic.getTodosTipoCambiosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCambios("Todos",tipocambioLogic.getTipoCambios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocambioLogic.setTipoCambios(new ArrayList<TipoCambio>());					
							tipocambioLogic.getTipoCambios().addAll(tipocambiosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambios=new ArrayList<TipoCambio>();
							tipocambios.addAll(tipocambiosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCambio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCambio=this.idActual;
				
				} else if(this.idTipoCambioActual!=null && this.idTipoCambioActual!=0L) {
					idTipoCambio=idTipoCambioActual;
				}
				
					
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndicePorId(idTipoCambio);
				
				this.tipocambios=new ArrayList<TipoCambio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocambioLogic.getEntity(idTipoCambio);
					
					//tipocambioLogic.getEntityWithConnection(idTipoCambio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocambioLogic.setTipoCambios(new ArrayList<TipoCambio>());
					tipocambioLogic.getTipoCambios().add(tipocambioLogic.getTipoCambio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocambios=new ArrayList<TipoCambio>();
					this.tipocambios.add(tipocambio);
				}
				
				if(tipocambioLogic.getTipoCambio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocambioLogic.getTipoCambiosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocambioLogic.getTipoCambios()==null||tipocambioLogic.getTipoCambios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocambios==null|| tipocambios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambiosAux=new ArrayList<TipoCambio>();
						tipocambiosAux.addAll(tipocambioLogic.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambiosAux=new ArrayList<TipoCambio>();
							tipocambiosAux.addAll(tipocambios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocambioLogic.getTipoCambiosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCambios("FK_IdEmpresa",tipocambioLogic.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCambios("FK_IdEmpresa",tipocambios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioLogic.setTipoCambios(new ArrayList<TipoCambio>());
						tipocambioLogic.getTipoCambios().addAll(tipocambiosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambios=new ArrayList<TipoCambio>();
							tipocambios.addAll(tipocambiosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMoneda")) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocambioLogic.getTipoCambiosFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocambioLogic.getTipoCambios()==null||tipocambioLogic.getTipoCambios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocambios==null|| tipocambios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambiosAux=new ArrayList<TipoCambio>();
						tipocambiosAux.addAll(tipocambioLogic.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambiosAux=new ArrayList<TipoCambio>();
							tipocambiosAux.addAll(tipocambios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocambioLogic.getTipoCambiosFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCambioConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCambios("FK_IdMoneda",tipocambioLogic.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCambios("FK_IdMoneda",tipocambios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioLogic.setTipoCambios(new ArrayList<TipoCambio>());
						tipocambioLogic.getTipoCambios().addAll(tipocambiosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambios=new ArrayList<TipoCambio>();
							tipocambios.addAll(tipocambiosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCambio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCambio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocambioLogic.getTipoCambios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocambios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocambioLogic.getTipoCambios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocambios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCambio tipocambio) {
		Boolean permite=true;
		
		if(this.tipocambio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCambioConstantesFunciones.getOrderByListaTipoCambio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCambioConstantesFunciones.getOrderByListaTipoCambio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCambio tipocambio:tipocambioLogic.getTipoCambios()) {
				if(tipocambio.getsType().equals(Constantes2.S_TOTALES)) {
					tipocambioTotales=tipocambio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCambio tipocambio:this.tipocambios) {
				if(tipocambio.getsType().equals(Constantes2.S_TOTALES)) {
					tipocambioTotales=tipocambio;
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
			this.tipocambioAux=new TipoCambio();
			this.tipocambioAux.setsType(Constantes2.S_TOTALES);
			this.tipocambioAux.setIsNew(false);
			this.tipocambioAux.setIsChanged(false);
			this.tipocambioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCambioConstantesFunciones.TotalizarValoresFilaTipoCambio(this.tipocambioLogic.getTipoCambios(),this.tipocambioAux);
				
				this.tipocambioLogic.getTipoCambios().add(this.tipocambioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCambioConstantesFunciones.TotalizarValoresFilaTipoCambio(this.tipocambios,this.tipocambioAux);
				
				this.tipocambios.add(this.tipocambioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocambioTotales=new TipoCambio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocambioLogic.getTipoCambios().remove(tipocambioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocambios.remove(tipocambioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocambioTotales=new TipoCambio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCambio tipocambio:tipocambioLogic.getTipoCambios()) {
				if(tipocambio.getsType().equals(Constantes2.S_TOTALES)) {
					tipocambioTotales=tipocambio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCambioConstantesFunciones.TotalizarValoresFilaTipoCambio(this.tipocambioLogic.getTipoCambios(),tipocambioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCambio tipocambio:this.tipocambios) {
				if(tipocambio.getsType().equals(Constantes2.S_TOTALES)) {
					tipocambioTotales=tipocambio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCambioConstantesFunciones.TotalizarValoresFilaTipoCambio(this.tipocambios,tipocambioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCambiosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCambiosFK_IdMoneda()throws Exception {
		try {
			sAccionBusqueda="FK_IdMoneda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCambiosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocambioLogic.getTipoCambiosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCambiosFK_IdMoneda(String sFinalQuery,Long id_moneda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocambioLogic.getTipoCambiosFK_IdMoneda(sFinalQuery,this.pagination,id_moneda);
				
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
	
	public void inicializarPermisosTipoCambio() {
		this.isPermisoTodoTipoCambio=false;
		this.isPermisoNuevoTipoCambio=false;
		this.isPermisoActualizarTipoCambio=false;
		this.isPermisoActualizarOriginalTipoCambio=false;
		this.isPermisoEliminarTipoCambio=false;
		this.isPermisoGuardarCambiosTipoCambio=false;
		this.isPermisoConsultaTipoCambio=false;
		this.isPermisoBusquedaTipoCambio=false;
		this.isPermisoReporteTipoCambio=false;		
		this.isPermisoOrdenTipoCambio=false;		
		this.isPermisoPaginacionMedioTipoCambio=false;		
		this.isPermisoPaginacionAltoTipoCambio=false;
		this.isPermisoPaginacionTodoTipoCambio=false;
		this.isPermisoCopiarTipoCambio=false;		
		this.isPermisoVerFormTipoCambio=false;		
		this.isPermisoDuplicarTipoCambio=false;		
		this.isPermisoOrdenTipoCambio=false;		
	}
	
	public void setPermisosUsuarioTipoCambio(Boolean isPermiso) {
		this.isPermisoTodoTipoCambio=isPermiso;
		this.isPermisoNuevoTipoCambio=isPermiso;
		this.isPermisoActualizarTipoCambio=isPermiso;
		this.isPermisoActualizarOriginalTipoCambio=isPermiso;
		this.isPermisoEliminarTipoCambio=isPermiso;
		this.isPermisoGuardarCambiosTipoCambio=isPermiso;
		this.isPermisoConsultaTipoCambio=isPermiso;
		this.isPermisoBusquedaTipoCambio=isPermiso;
		this.isPermisoReporteTipoCambio=isPermiso;
		this.isPermisoOrdenTipoCambio=isPermiso;		
		this.isPermisoPaginacionMedioTipoCambio=isPermiso;		
		this.isPermisoPaginacionAltoTipoCambio=isPermiso;		
		this.isPermisoPaginacionTodoTipoCambio=isPermiso;		
		this.isPermisoCopiarTipoCambio=isPermiso;		
		this.isPermisoVerFormTipoCambio=isPermiso;		
		this.isPermisoDuplicarTipoCambio=isPermiso;
		this.isPermisoOrdenTipoCambio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCambio(Boolean isPermiso) {
		//this.isPermisoTodoTipoCambio=isPermiso;
		this.isPermisoNuevoTipoCambio=isPermiso;
		this.isPermisoActualizarTipoCambio=isPermiso;
		this.isPermisoActualizarOriginalTipoCambio=isPermiso;
		this.isPermisoEliminarTipoCambio=isPermiso;
		this.isPermisoGuardarCambiosTipoCambio=isPermiso;
		//this.isPermisoConsultaTipoCambio=isPermiso;
		//this.isPermisoBusquedaTipoCambio=isPermiso;
		//this.isPermisoReporteTipoCambio=isPermiso;
		//this.isPermisoOrdenTipoCambio=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCambio=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCambio=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCambio=isPermiso;		
		//this.isPermisoCopiarTipoCambio=isPermiso;		
		//this.isPermisoDuplicarTipoCambio=isPermiso;
		//this.isPermisoOrdenTipoCambio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCambioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCambioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCambio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCambioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCambioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCambioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCambioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCambio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCambioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCambioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCambio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCambio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCambio=this.isPermisoActualizarTipoCambio;
			this.isPermisoEliminarTipoCambio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCambio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCambio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCambio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCambio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCambio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCambio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCambio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCambio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCambio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCambio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCambio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCambio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCambio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCambio.setToolTipText(this.jTableDatosTipoCambio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCambio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCambio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCambioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCambioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCambio() throws Exception {
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
	public void inicializarCombosForeignKeyTipoCambioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.monedasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCambioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCambioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCambioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyMonedaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MonedaConstantesFunciones.SFINALQUERY;

				this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoCambioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCambioParameterReturnGeneral tipocambioReturnGeneral=new TipoCambioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocambioConstantesFunciones.cargarid_empresaTipoCambio)
					 || (this.esRecargarFks && this.tipocambioConstantesFunciones.cargarid_empresaTipoCambio)) {

					if(!this.tipocambioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocambioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalMoneda="";

				if(((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0) && this.tipocambioConstantesFunciones.cargarid_monedaTipoCambio)
					 || (this.esRecargarFks && this.tipocambioConstantesFunciones.cargarid_monedaTipoCambio)) {

					if(!this.tipocambioSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMoneda=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

						finalQueryGlobalMoneda=Funciones.GetFinalQueryAppend(finalQueryGlobalMoneda, "");
						finalQueryGlobalMoneda+=MonedaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMoneda=" WHERE " + ConstantesSql.ID + "="+tipocambioSessionBean.getlidMonedaActual();
					}
				} else {
					finalQueryGlobalMoneda="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocambioReturnGeneral=tipocambioLogic.cargarCombosLoteForeignKeyTipoCambio(finalQueryGlobalEmpresa,finalQueryGlobalMoneda);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocambioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalMoneda.equals("NONE")) {
				this.monedasForeignKey=tipocambioReturnGeneral.getmonedasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCambio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyMoneda();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocambioSessionBean==null) {
				this.tipocambioSessionBean=new TipoCambioSessionBean();
			}

			if(!this.tipocambioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyMoneda()throws Exception {
		try {

			if(!this.tipocambioSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				Moneda moneda=new Moneda();
				MonedaConstantesFunciones.setMonedaDescripcion(moneda,Constantes.SMENSAJE_ESCOJA_OPCION);
				moneda.setId(null);

				if(!MonedaConstantesFunciones.ExisteEnLista(this.monedasForeignKey,moneda,true)) {

					this.monedasForeignKey.add(0,moneda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoCambio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCambio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCambio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualMonedaForeignKey(this.parametroGeneralUsuario.getid_moneda(),false,"Formulario");
			
			
				this.tipocambio.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCambio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCambio(TipoCambio tipocambio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCambio(TipoCambio tipocambio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCambio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCambio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCambio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCambio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCambio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCambio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameMonedasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCambio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMonedasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCambio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TipoCambioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCambioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCambioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocambioSessionBean=new TipoCambioSessionBean(); 
		this.tipocambioConstantesFunciones=new TipoCambioConstantesFunciones(); 
		this.tipocambioBean=new TipoCambio();//(this.tipocambioConstantesFunciones); 		
		this.tipocambioReturnGeneral=new TipoCambioParameterReturnGeneral(); 
		
		this.tipocambioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocambioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCambioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCambioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCambioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCambio(true);
			
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
			
			this.tipocambioConstantesFunciones=new TipoCambioConstantesFunciones(); 
			this.tipocambioBean=new TipoCambio();//this.tipocambioConstantesFunciones); 			
			this.tipocambioReturnGeneral=new TipoCambioParameterReturnGeneral(); 
		
			TipoCambioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cambio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tipocambio=new TipoCambio();
			this.tipocambios = new ArrayList<TipoCambio>();
			this.tipocambiosAux = new ArrayList<TipoCambio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic=new TipoCambioLogic();
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocambioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocambioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCambio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCambio);	
					}
					
					if(this.jInternalFrameImportacionTipoCambio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCambio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCambio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCambio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCambio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCambio);
				this.jInternalFrameDetalleFormTipoCambio.setVisible(false);
				this.jInternalFrameDetalleFormTipoCambio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCambio);
					this.jInternalFrameReporteDinamicoTipoCambio.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCambio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCambio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCambio);
					this.jInternalFrameImportacionTipoCambio.setVisible(false);
					this.jInternalFrameImportacionTipoCambio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCambio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCambio);
					this.jInternalFrameOrderByTipoCambio.setVisible(false);
					this.jInternalFrameOrderByTipoCambio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCambioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCambioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocambioReturnGeneral=new TipoCambioParameterReturnGeneral();
			
			this.tipocambioParameterGeneral=new TipoCambioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocambioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCambioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCambioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocambioSessionBean.getEsGuardarRelacionado(),this.tipocambioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCambioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocambioSessionBean.getEsGuardarRelacionado(),this.tipocambioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaDuplicarTipoCambio=true;
			this.isVisibilidadCeldaCopiarTipoCambio=true;
			this.isVisibilidadCeldaVerFormTipoCambio=true;
			this.isVisibilidadCeldaOrdenTipoCambio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
			this.isVisibilidadCeldaModificarTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=false;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=false;
			this.isVisibilidadCeldaGuardarTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMoneda=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCambio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCambio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCambio(false);
			
			this.setPermisosUsuarioTipoCambio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocambioSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocambioSessionBean.getEsGuardarRelacionado() && this.tipocambioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCambioClasesRelacionadas();
			}
			
			if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCambioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCambioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCambio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCambio();
			}
			
			if(!this.isPermisoBusquedaTipoCambio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCambio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCambio,this.isPermisoPaginacionMedioTipoCambio,this.isPermisoPaginacionTodoTipoCambio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCambioConstantesFunciones.getTiposSeleccionarTipoCambio());
				
				this.tiposColumnasSelect=TipoCambioConstantesFunciones.getTiposSeleccionarTipoCambio(true);
				
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
			//if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCambio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTipoCambio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTipoCambio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCambio() ;
			
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
			this.monedaLogic=new MonedaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipocambioImplementable= (TipoCambioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCambioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocambioImplementableHome= (TipoCambioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCambioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocambios= new ArrayList<TipoCambio>();
			this.tipocambiosEliminados= new ArrayList<TipoCambio>();
						
			this.isEsNuevoTipoCambio=false;
			this.esParaAccionDesdeFormularioTipoCambio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.monedasForeignKey=new ArrayList<Moneda>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCambio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCambio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCambioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCambioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCambio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCambio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCambio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCambio();
			}
			
			TipoCambioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCambio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCambio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCambio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCambio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCambio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCambio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCambio")) {
				iIndex=this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCambio();	
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
	
	public void cargarCombosForeignKeyTipoCambio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCambio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCambio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCambioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCambio();
		
		this.cargarCombosFrameForeignKeyTipoCambio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCambio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCambio();
		}
	}
	
	
	
	public void jButtonNuevoTipoCambioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			
			if(jTableDatosTipoCambio.getRowCount()>=1) {
				jTableDatosTipoCambio.removeRowSelectionInterval(0, jTableDatosTipoCambio.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCambio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCambio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCambio(true);			
			//this.tipocambio=new TipoCambio();
			//this.tipocambio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCambio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCambio() ;
			
			if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCambio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocambio);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);				
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCambio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCambioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCambio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCambio.getSelectedRows().length;			
			}
			
			tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCambio--;			
				//TipoCambio tipocambioAux= new TipoCambio();			
				//tipocambioAux.setId(this.iIdNuevoTipoCambio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCambio tipocambioOrigen=new TipoCambio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCambio tipocambioOrigen : tipocambiosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocambioOrigen =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocambioOrigen =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCambio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocambio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCambio(tipocambioOrigen,this.tipocambio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocambioLogic.getTipoCambios().add(this.tipocambioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocambios.add(this.tipocambioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCambio(false);
				
				this.jTableDatosTipoCambio.setRowSelectionInterval(this.getIndiceNuevoTipoCambio(), this.getIndiceNuevoTipoCambio());
				
				int iLastRow =  this.jTableDatosTipoCambio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCambio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCambio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCambio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();									
		
			TipoCambio tipocambioOrigen=new TipoCambio();
			TipoCambio tipocambioDestino=new TipoCambio();
				
			tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCambio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocambiosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCambio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioOrigen =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocambioOrigen =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocambioDestino =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocambioDestino =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocambioOrigen =tipocambiosSeleccionados.get(0);
				tipocambioDestino =tipocambiosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCambio(tipocambioOrigen,tipocambioDestino,true,false);
				
				tipocambioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocambioDestino,tipocambioLogic.getTipoCambios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocambioDestino,tipocambios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCambio(false);
				
				//this.jTableDatosTipoCambio.setRowSelectionInterval(this.getIndiceNuevoTipoCambio(), this.getIndiceNuevoTipoCambio());
				
				int iLastRow =  this.jTableDatosTipoCambio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCambio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCambio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCambio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCambio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCambio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCambio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCambio.setVisible(!isVisible);
			this.jPanelPaginacionTipoCambio.setVisible(!isVisible);
			this.jPanelAccionesTipoCambio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCambio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCambio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCambio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCambio();
			
			this.abrirFrameOrderByTipoCambio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCambio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCambio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCambio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCambio.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCambio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCambio.setSize(this.jInternalFrameDetalleFormTipoCambio.iWidthFormulario,this.jInternalFrameDetalleFormTipoCambio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCambio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCambio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCambio.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCambio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCambio.jContentPaneDetalleTipoCambio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCambio.jContentPaneDetalleTipoCambio.getWidth(),TipoCambioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCambio.jContentPaneDetalleTipoCambio.getWidth(),TipoCambioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCambio.jContentPaneDetalleTipoCambio.getWidth(),TipoCambioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCambio.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCambio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCambio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCambio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCambio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCambio,false,this);
				} else {
					this.jInternalFrameOrderByTipoCambio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCambio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCambio);
				this.jInternalFrameOrderByTipoCambio.setVisible(false);
				this.jInternalFrameOrderByTipoCambio.setSelected(false);
				
				this.jInternalFrameOrderByTipoCambio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCambio"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCambio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCambio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCambio==null) {
				
				this.jInternalFrameImportacionTipoCambio=new ImportacionJInternalFrame(TipoCambioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCambio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCambio);
				this.jInternalFrameImportacionTipoCambio.setVisible(false);
				this.jInternalFrameImportacionTipoCambio.setSelected(false);


				this.jInternalFrameImportacionTipoCambio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCambio"));
				this.jInternalFrameImportacionTipoCambio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCambio"));
				this.jInternalFrameImportacionTipoCambio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCambio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCambio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCambio==null) {
				this.jInternalFrameReporteDinamicoTipoCambio=new ReporteDinamicoJInternalFrame(TipoCambioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCambio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCambio);
				this.jInternalFrameReporteDinamicoTipoCambio.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCambio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCambio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCambio"));
				this.jInternalFrameReporteDinamicoTipoCambio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCambio"));
				this.jInternalFrameReporteDinamicoTipoCambio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCambio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCambio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoCambio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCambio);
			
	       	this.jInternalFrameDetalleFormTipoCambio.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCambio.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCambio.dispose();
			//this.jInternalFrameDetalleFormTipoCambio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCambio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCambio.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCambio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCambio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCambio.setVisible(true);
	        this.jInternalFrameImportacionTipoCambio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCambio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCambio.setVisible(true);
	        this.jInternalFrameOrderByTipoCambio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCambio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCambio.setVisible(false);
	        this.jInternalFrameOrderByTipoCambio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCambio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCambio.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCambio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCambio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCambio.setVisible(false);
	        this.jInternalFrameImportacionTipoCambio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCambio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCambio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCambio(true);
			//this.isEsNuevoTipoCambio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCambio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCambio(false) ;
			
			if(tipocambioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCambio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCambio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCambioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCambio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCambio(true);
			//this.isEsNuevoTipoCambio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocambio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCambio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCambio(false) ;
			
			if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCambio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCambio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCambio(false);
			
			//if(!this.isEsNuevoTipoCambio) {								
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				
			}
			
			if(this.permiteMantenimiento(this.tipocambio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCambio=true;
					this.inicializarActualizarBindingTablaTipoCambio(false);
					this.isEsNuevoTipoCambio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCambio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCambio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCambio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCambio(false);
				
				this.habilitarDeshabilitarControlesTipoCambio(false);
			
												
				
				if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCambio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCambioActionPerformed(evt,tipocambioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCambio(this.tipocambio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCambio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocambioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocambio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCambioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				this.tipocambio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				this.tipocambio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocambio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCambioModel) this.jTableDatosTipoCambio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCambio=true;
				this.inicializarActualizarBindingTablaTipoCambio(false);
				this.isEsNuevoTipoCambio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCambio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCambio(false);
				
				this.habilitarDeshabilitarControlesTipoCambio(false);
				
				
				
				if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCambio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCambioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCambio.getRowCount()>=1) {
				jTableDatosTipoCambio.removeRowSelectionInterval(0, jTableDatosTipoCambio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCambio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCambio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCambio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCambio(false) ;
			
			this.isEsNuevoTipoCambio=false;
			
			if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCambio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCambioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCambio(false);
				
				//SI ES MANUAL
				if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCambio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCambioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCambio--;			
			//TipoCambio tipocambioAux= new TipoCambio();			
			//tipocambioAux.setId(this.iIdNuevoTipoCambio);
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCambio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
			
			this.tipocambio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocambioLogic.getTipoCambios().add(this.tipocambioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocambios.add(this.tipocambioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCambio(false);
			
			this.jTableDatosTipoCambio.setRowSelectionInterval(this.getIndiceNuevoTipoCambio(), this.getIndiceNuevoTipoCambio());
			
			int iLastRow =  this.jTableDatosTipoCambio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCambio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCambio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCambio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCambioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCambio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCambio(false);
			
			//SI ES MANUAL
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCambio();
			}
			
			//this.abrirFrameTreeTipoCambio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCambioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CambioS ?", "MANTENIMIENTO DE Tipo Cambio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCambio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCambio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocambioReturnGeneral=tipocambioLogic.procesarImportacionTipoCambiosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocambioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCambioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCambioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCambio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCambio.setFileImportacion(this.jInternalFrameImportacionTipoCambio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCambio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCambio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCambio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCambio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCambioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		

		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCambioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCambioBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCambioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCambioConstantesFunciones.LABEL_IDMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Moneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Moneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Moneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Moneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCambioConstantesFunciones.LABEL_VALORCOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCambioConstantesFunciones.LABEL_VALORVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCambioConstantesFunciones.LABEL_FECHA:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCambio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCambioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCambioConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoria="id_moneda";
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORCOMPRA:
					sNombreCampoCategoria="valor_compra";
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORVENTA:
					sNombreCampoCategoria="valor_venta";
					break;

				case TipoCambioConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCambioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCambioConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoriaValor="id_moneda";
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORCOMPRA:
					sNombreCampoCategoriaValor="valor_compra";
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORVENTA:
					sNombreCampoCategoriaValor="valor_venta";
					break;

				case TipoCambioConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCambioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCambioConstantesFunciones.LABEL_IDMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_moneda");
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_compra");
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_venta");
					break;

				case TipoCambioConstantesFunciones.LABEL_FECHA:
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
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTipoCambioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCambios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCambioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCambioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCambio tipocambio:tipocambiosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocambio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCambioConstantesFunciones.LABEL_IDMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCambioConstantesFunciones.LABEL_IDMONEDA);
					iRow++;

					for(TipoCambio tipocambio:tipocambiosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocambio.getmoneda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA);
					iRow++;

					for(TipoCambio tipocambio:tipocambiosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocambio.getvalor_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCambioConstantesFunciones.LABEL_VALORVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VALORVENTA);
					iRow++;

					for(TipoCambio tipocambio:tipocambiosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocambio.getvalor_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCambioConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCambioConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(TipoCambio tipocambio:tipocambiosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocambio.getfecha());
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
			//	this.getFilaCabeceraExportarExcelTipoCambio(row);				
			//	iRow++;
			//}				
			
			//for(TipoCambio tipocambioAux:tipocambiosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCambio(tipocambioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCambio(false);
			
			//SI ES MANUAL
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCambio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCambioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCambio(false);
			
			//SI ES MANUAL
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCambio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCambioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCambio(false);
			
			//SI ES MANUAL
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCambio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCambio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCambio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCambio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCambio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCambio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCambio.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCambio.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCambio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCambio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCambio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCambio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCambio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCambio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCambio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCambio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCambio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCambioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCambio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCambio();
		
		this.inicializarActualizarBindingBotonesManualTipoCambio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCambio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCambio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCambio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCambio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCambio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCambio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCambio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCambio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCambio.jCheckBoxPostAccionNuevoTipoCambio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCambio.jCheckBoxPostAccionSinCerrarTipoCambio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCambio.jCheckBoxPostAccionSinMensajeTipoCambio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCambio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCambio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCambio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCambio!=null) {
				this.jInternalFrameDetalleFormTipoCambio.jCheckBoxPostAccionNuevoTipoCambio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCambio.jCheckBoxPostAccionSinCerrarTipoCambio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCambio.jCheckBoxPostAccionSinMensajeTipoCambio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCambio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCambio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCambio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCambio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCambio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCambio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCambio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCambio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCambio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCambio(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCambio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCambio() throws Exception {
		try	{
			if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCambio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCambio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCambio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCambio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCambio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCambio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCambio.addItem(reporte);
			}
			
			
			if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCambio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCambio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCambio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCambio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCambio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCambio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCambio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCambio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCambio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
				this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
				this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCambio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCambio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoCambioConstantesFunciones.getTiposSeleccionarTipoCambio(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoCambioConstantesFunciones.getTiposSeleccionarTipoCambio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoCambioConstantesFunciones.getTiposSeleccionarTipoCambio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCambio.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoCambio.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCambio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCambio(Boolean esInicializar) throws Exception {				
		if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCambio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCambio() throws Exception {
		this.inicializarActualizarBindingTablaTipoCambio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCambio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCambioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCambio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocambioLogic.getTipoCambios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocambios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCambio.setModel(new TipoCambioModel(this.tipocambioLogic.getTipoCambios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCambio.setModel(new TipoCambioModel(this.tipocambios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCambio!=null && this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCambio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCambioConstantesFunciones.SCLASSWEBTITULO,tipocambioConstantesFunciones.resaltarSeleccionarTipoCambio,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCambioConstantesFunciones.SCLASSWEBTITULO,tipocambioConstantesFunciones.resaltarSeleccionarTipoCambio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,TipoCambioConstantesFunciones.LABEL_ID));

		if(this.tipocambioConstantesFunciones.mostraridTipoCambio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCambioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocambioConstantesFunciones.resaltaridTipoCambio,this.tipocambioConstantesFunciones.activaridTipoCambio,iSizeTabla,this,true,"idTipoCambio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocambioConstantesFunciones.resaltaridTipoCambio,this.tipocambioConstantesFunciones.activaridTipoCambio,this,true,"idTipoCambio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,TipoCambioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocambioConstantesFunciones.mostrarid_empresaTipoCambio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCambioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocambioConstantesFunciones.resaltarid_empresaTipoCambio,this,this.tipocambioConstantesFunciones.activarid_empresaTipoCambio,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocambioConstantesFunciones.resaltarid_empresaTipoCambio,this,this.tipocambioConstantesFunciones.activarid_empresaTipoCambio,false,"id_empresaTipoCambio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,TipoCambioConstantesFunciones.LABEL_IDMONEDA));

		if(this.tipocambioConstantesFunciones.mostrarid_monedaTipoCambio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCambioConstantesFunciones.LABEL_IDMONEDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MonedaTableCell(this.monedasForeignKey,this.tipocambioConstantesFunciones.resaltarid_monedaTipoCambio,this,this.tipocambioConstantesFunciones.activarid_monedaTipoCambio,iSizeTabla));
			tableColumn.setCellEditor(new MonedaTableCell(this.monedasForeignKey,this.tipocambioConstantesFunciones.resaltarid_monedaTipoCambio,this,this.tipocambioConstantesFunciones.activarid_monedaTipoCambio,false,"id_monedaTipoCambio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,TipoCambioConstantesFunciones.LABEL_VALORCOMPRA));

		if(this.tipocambioConstantesFunciones.mostrarvalor_compraTipoCambio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCambioConstantesFunciones.LABEL_VALORCOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocambioConstantesFunciones.resaltarvalor_compraTipoCambio,this.tipocambioConstantesFunciones.activarvalor_compraTipoCambio,iSizeTabla,this,true,"valor_compraTipoCambio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocambioConstantesFunciones.resaltarvalor_compraTipoCambio,this.tipocambioConstantesFunciones.activarvalor_compraTipoCambio,this,true,"valor_compraTipoCambio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,TipoCambioConstantesFunciones.LABEL_VALORVENTA));

		if(this.tipocambioConstantesFunciones.mostrarvalor_ventaTipoCambio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCambioConstantesFunciones.LABEL_VALORVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocambioConstantesFunciones.resaltarvalor_ventaTipoCambio,this.tipocambioConstantesFunciones.activarvalor_ventaTipoCambio,iSizeTabla,this,true,"valor_ventaTipoCambio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocambioConstantesFunciones.resaltarvalor_ventaTipoCambio,this.tipocambioConstantesFunciones.activarvalor_ventaTipoCambio,this,true,"valor_ventaTipoCambio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,TipoCambioConstantesFunciones.LABEL_FECHA));

		if(this.tipocambioConstantesFunciones.mostrarfechaTipoCambio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCambioConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tipocambioConstantesFunciones.resaltarfechaTipoCambio,this.tipocambioConstantesFunciones.activarfechaTipoCambio,iSizeTabla,this,true,"fechaTipoCambio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tipocambioConstantesFunciones.resaltarfechaTipoCambio,this.tipocambioConstantesFunciones.activarfechaTipoCambio,this,true,"fechaTipoCambio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TipoCambioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocambioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocambioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCambio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocambioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocambioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCambio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCambio && this.isPermisoGuardarCambiosTipoCambio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocambioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocambioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCambio.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCambio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCambio && this.isPermisoGuardarCambiosTipoCambio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCambio && this.isPermisoGuardarCambiosTipoCambio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCambio.moveColumn(this.jTableDatosTipoCambio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCambio.moveColumn(this.jTableDatosTipoCambio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCambio.moveColumn(this.jTableDatosTipoCambio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCambio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCambio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCambio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCambio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCambio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCambio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCambio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCambio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocambioLogic.getTipoCambios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocambios.size()-1;
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
		//this.jTableDatosTipoCambio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCambio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCambio();
			
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
				
				//this.isEsNuevoTipoCambio=false;
					
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
				if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCambio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCambio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCambio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocambio.getsType().equals("DUPLICADO")
				   || this.tipocambio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCambio=true;
				
				} else {
					this.isEsNuevoTipoCambio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocambio.getId()>=0 && !this.tipocambio.getIsNew()) {						
						this.isEsNuevoTipoCambio=false;
						
					} else {
						this.isEsNuevoTipoCambio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCambio(esRelaciones);						
				
				this.seleccionarTipoCambio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocambio.getId()<0) {
					this.isEsNuevoTipoCambio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCambio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCambio(evt,rowIndex);
				}	
				
				if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCambio: " + this.dDif); 
					}
				}								
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCambio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocambio)) {
					if(this.tipocambio.getId()>0) {
						this.tipocambio.setIsDeleted(true);
						
						this.tipocambiosEliminados.add(this.tipocambio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocambioLogic.getTipoCambios().remove(this.tipocambio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocambios.remove(this.tipocambio);				
					}
					
					
					((TipoCambioModel) this.jTableDatosTipoCambio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCambio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCambio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCambio) {
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCambio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCambio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCambio(this.tipocambio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocambioConstantesFunciones.cargarid_empresaTipoCambio || this.tipocambioConstantesFunciones.event_dependid_empresaTipoCambio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocambio.getid_empresa());
									//this.inicializarActualizarBindingTipoCambio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocambio.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocambio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocambio.getid_empresa(),false,"Formulario");

					//Moneda
					if(!this.tipocambioConstantesFunciones.cargarid_monedaTipoCambio || this.tipocambioConstantesFunciones.event_dependid_monedaTipoCambio) {
						//this.cargarCombosMonedasForeignKeyLista(" where id="+this.tipocambio.getid_moneda());
									//this.inicializarActualizarBindingTipoCambio(false,false);
						this.monedasForeignKey=new ArrayList<Moneda>();

						if(tipocambio.getMoneda()!=null) {
							this.monedasForeignKey.add(tipocambio.getMoneda());
						}

						this.addItemDefectoCombosForeignKeyMoneda();
						this.cargarCombosFrameMonedasForeignKey("Todos");
					}
					this.setActualMonedaForeignKey(this.tipocambio.getid_moneda(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCambio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCambio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCambio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCambio(TipoCambio tipocambio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCambio(tipocambio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCambio(TipoCambio tipocambio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCambio(tipocambio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCambio(tipocambio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCambio(tipocambio);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCambio(TipoCambio tipocambio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setText(tipocambio.getId().toString());
			this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setText(tipocambio.getvalor_compra().toString());
			this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setText(tipocambio.getvalor_venta().toString());
			this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setDate(tipocambio.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCambio tipocambioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocambioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCambio tipocambioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocambioLocal=this.tipocambio;
			} else {
				tipocambioLocal=this.tipocambioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocambioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCambio(tipocambioLocal,true);
					
					if(tipocambioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocambioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocambioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCambio(TipoCambio tipocambio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCambio(tipocambio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(tipocambio);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCambio(TipoCambio tipocambio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCambio(tipocambio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCambio(TipoCambio tipocambio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.getText()==null || this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.getText()=="" || this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setText("0");
			}

			if(conColumnasBase) {tipocambio.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCambioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelIdTipoCambio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocambio.setvalor_compra(Double.parseDouble(this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCambioConstantesFunciones.LABEL_VALORCOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelvalor_compraTipoCambio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocambio.setvalor_venta(Double.parseDouble(this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCambioConstantesFunciones.LABEL_VALORVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelvalor_ventaTipoCambio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocambio.setfecha(this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCambioConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCambio.jLabelfechaTipoCambio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCambio(TipoCambio tipocambioBean,TipoCambio tipocambio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCambio(TipoCambio tipocambioOrigen,TipoCambio tipocambio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocambioOrigen.getId()!=null && !tipocambioOrigen.getId().equals(0L))) {tipocambio.setId(tipocambioOrigen.getId());}}
			if(conDefault || (!conDefault && tipocambioOrigen.getvalor_compra()!=null && !tipocambioOrigen.getvalor_compra().equals(0.0))) {tipocambio.setvalor_compra(tipocambioOrigen.getvalor_compra());}
			if(conDefault || (!conDefault && tipocambioOrigen.getvalor_venta()!=null && !tipocambioOrigen.getvalor_venta().equals(0.0))) {tipocambio.setvalor_venta(tipocambioOrigen.getvalor_venta());}
			if(conDefault || (!conDefault && tipocambioOrigen.getfecha()!=null && !tipocambioOrigen.getfecha().equals(new Date()))) {tipocambio.setfecha(tipocambioOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCambio(TipoCambio tipocambio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setText(tipocambio.getId().toString());
			this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setText(tipocambio.getvalor_compra().toString());
			this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setText(tipocambio.getvalor_venta().toString());
			this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setDate(tipocambio.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCambio(TipoCambioBean tipocambioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setText(tipocambioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setText(tipocambioBean.getvalor_compra().toString());
			this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setText(tipocambioBean.getvalor_venta().toString());
			this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setDate(tipocambioBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCambio(TipoCambioParameterReturnGeneral tipocambioReturnGeneral,TipoCambioBean tipocambioBean,Boolean conDefault) throws Exception { 
		try {
			TipoCambio tipocambioLocal=new TipoCambio();
			
			tipocambioLocal=tipocambioReturnGeneral.getTipoCambio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocambioLocal.getId()!=null && !tipocambioLocal.getId().equals(0L))) {tipocambioBean.setId(tipocambioLocal.getId());}}
			if(conDefault || (!conDefault && tipocambioLocal.getvalor_compra()!=null && !tipocambioLocal.getvalor_compra().equals(0.0))) {tipocambioBean.setvalor_compra(tipocambioLocal.getvalor_compra());}
			if(conDefault || (!conDefault && tipocambioLocal.getvalor_venta()!=null && !tipocambioLocal.getvalor_venta().equals(0.0))) {tipocambioBean.setvalor_venta(tipocambioLocal.getvalor_venta());}
			if(conDefault || (!conDefault && tipocambioLocal.getfecha()!=null && !tipocambioLocal.getfecha().equals(new Date()))) {tipocambioBean.setfecha(tipocambioLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCambioGenerico(Long idTipoCambioSeleccionado,JComboBox jComboBoxTipoCambio,List<TipoCambio> tipocambiosLocal)throws Exception {
		try {
			TipoCambio  tipocambioTemp=null;

			for(TipoCambio tipocambioAux:tipocambiosLocal) {
				if(tipocambioAux.getId()!=null && tipocambioAux.getId().equals(idTipoCambioSeleccionado)) {
					tipocambioTemp=tipocambioAux;
					break;
				}
			}

			jComboBoxTipoCambio.setSelectedItem(tipocambioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCambioGenerico(JComboBox jComboBoxTipoCambio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCambio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCambio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCambio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCambio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocambio=(TipoCambio) tipocambioLogic.getTipoCambios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocambio =(TipoCambio) tipocambios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocambio.getIsNew() && !tipocambio.getIsChanged() && !tipocambio.getIsDeleted()) {
				sDescripcion=tipocambio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocambio.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Moneda")) {
			//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
			if(!tipocambio.getIsNew() && !tipocambio.getIsChanged() && !tipocambio.getIsDeleted()) {
				sDescripcion=tipocambio.getmoneda_descripcion();
			} else {
				//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocambio.getmoneda_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCambio tipocambioRow=new TipoCambio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocambioRow=(TipoCambio) tipocambioLogic.getTipoCambios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocambioRow=(TipoCambio) tipocambios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCambio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCambio.setVisible((this.isVisibilidadCeldaNuevoTipoCambio && this.isPermisoNuevoTipoCambio));			
			this.jButtonDuplicarTipoCambio.setVisible((this.isVisibilidadCeldaDuplicarTipoCambio && this.isPermisoDuplicarTipoCambio));			
			this.jButtonCopiarTipoCambio.setVisible((this.isVisibilidadCeldaCopiarTipoCambio && this.isPermisoCopiarTipoCambio));
			this.jButtonVerFormTipoCambio.setVisible((this.isVisibilidadCeldaVerFormTipoCambio && this.isPermisoVerFormTipoCambio));
			
			this.jButtonAbrirOrderByTipoCambio.setVisible((this.isVisibilidadCeldaOrdenTipoCambio && this.isPermisoOrdenTipoCambio));			
			
			this.jButtonNuevoRelacionesTipoCambio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCambio && this.isPermisoNuevoTipoCambio));			
			this.jButtonNuevoGuardarCambiosTipoCambio.setVisible((this.isVisibilidadCeldaNuevoTipoCambio && this.isPermisoNuevoTipoCambio && this.isPermisoGuardarCambiosTipoCambio));
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonModificarTipoCambio.setVisible((this.isVisibilidadCeldaModificarTipoCambio && this.isPermisoActualizarTipoCambio));	
			this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarTipoCambio.setVisible((this.isVisibilidadCeldaActualizarTipoCambio && this.isPermisoActualizarTipoCambio));	
			this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarTipoCambio.setVisible((this.isVisibilidadCeldaEliminarTipoCambio && this.isPermisoEliminarTipoCambio));
			this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarTipoCambio.setVisible(this.isVisibilidadCeldaCancelarTipoCambio);							
			this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.setVisible((this.isVisibilidadCeldaGuardarTipoCambio && this.isPermisoGuardarCambiosTipoCambio));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCambio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCambio && this.isPermisoGuardarCambiosTipoCambio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCambio.setVisible((this.isVisibilidadCeldaNuevoTipoCambio && this.isPermisoNuevoTipoCambio));						
			this.jButtonDuplicarToolBarTipoCambio.setVisible((this.isVisibilidadCeldaDuplicarTipoCambio && this.isPermisoDuplicarTipoCambio));						
			this.jButtonCopiarToolBarTipoCambio.setVisible((this.isVisibilidadCeldaCopiarTipoCambio && this.isPermisoCopiarTipoCambio));			
			this.jButtonVerFormToolBarTipoCambio.setVisible((this.isVisibilidadCeldaVerFormTipoCambio && this.isPermisoVerFormTipoCambio));			
			this.jButtonAbrirOrderByToolBarTipoCambio.setVisible((this.isVisibilidadCeldaOrdenTipoCambio && this.isPermisoOrdenTipoCambio));
			this.jButtonNuevoRelacionesToolBarTipoCambio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCambio && this.isPermisoNuevoTipoCambio));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCambio.setVisible((this.isVisibilidadCeldaNuevoTipoCambio && this.isPermisoNuevoTipoCambio && this.isPermisoGuardarCambiosTipoCambio));			
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonModificarToolBarTipoCambio.setVisible((this.isVisibilidadCeldaModificarTipoCambio && this.isPermisoActualizarTipoCambio));	
			this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarToolBarTipoCambio.setVisible((this.isVisibilidadCeldaActualizarTipoCambio  && this.isPermisoActualizarTipoCambio));	
			this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarToolBarTipoCambio.setVisible((this.isVisibilidadCeldaEliminarTipoCambio && this.isPermisoEliminarTipoCambio));
			this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarToolBarTipoCambio.setVisible(this.isVisibilidadCeldaCancelarTipoCambio);				
			this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosToolBarTipoCambio.setVisible((this.isVisibilidadCeldaGuardarTipoCambio && this.isPermisoGuardarCambiosTipoCambio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCambio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCambio && this.isPermisoGuardarCambiosTipoCambio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCambio.setVisible((this.isVisibilidadCeldaNuevoTipoCambio && this.isPermisoNuevoTipoCambio));			
			this.jMenuItemDuplicarTipoCambio.setVisible((this.isVisibilidadCeldaDuplicarTipoCambio && this.isPermisoDuplicarTipoCambio));			
			this.jMenuItemCopiarTipoCambio.setVisible((this.isVisibilidadCeldaCopiarTipoCambio && this.isPermisoCopiarTipoCambio));			
			this.jMenuItemVerFormTipoCambio.setVisible((this.isVisibilidadCeldaVerFormTipoCambio && this.isPermisoVerFormTipoCambio));			
			this.jMenuItemAbrirOrderByTipoCambio.setVisible((this.isVisibilidadCeldaOrdenTipoCambio && this.isPermisoOrdenTipoCambio));			
			//this.jMenuItemMostrarOcultarTipoCambio.setVisible((this.isVisibilidadCeldaOrdenTipoCambio && this.isPermisoOrdenTipoCambio));
			this.jMenuItemDetalleAbrirOrderByTipoCambio.setVisible((this.isVisibilidadCeldaOrdenTipoCambio && this.isPermisoOrdenTipoCambio));			
			//this.jMenuItemDetalleMostrarOcultarTipoCambio.setVisible((this.isVisibilidadCeldaOrdenTipoCambio && this.isPermisoOrdenTipoCambio));			
			this.jMenuItemNuevoRelacionesTipoCambio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCambio && this.isPermisoNuevoTipoCambio));			
			this.jMenuItemNuevoGuardarCambiosTipoCambio.setVisible((this.isVisibilidadCeldaNuevoTipoCambio && this.isPermisoNuevoTipoCambio && this.isPermisoGuardarCambiosTipoCambio));									
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemModificarTipoCambio.setVisible((this.isVisibilidadCeldaModificarTipoCambio && this.isPermisoActualizarTipoCambio));	
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemActualizarTipoCambio.setVisible((this.isVisibilidadCeldaActualizarTipoCambio && this.isPermisoActualizarTipoCambio));	
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemEliminarTipoCambio.setVisible((this.isVisibilidadCeldaEliminarTipoCambio && this.isPermisoEliminarTipoCambio));
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemCancelarTipoCambio.setVisible(this.isVisibilidadCeldaCancelarTipoCambio);				
			}
			
			this.jMenuItemGuardarCambiosTipoCambio.setVisible((this.isVisibilidadCeldaGuardarTipoCambio && this.isPermisoGuardarCambiosTipoCambio));						
			this.jMenuItemGuardarCambiosTablaTipoCambio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCambio && this.isPermisoGuardarCambiosTipoCambio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCambio=this.jButtonNuevoTipoCambio.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCambio=this.jButtonDuplicarTipoCambio.isVisible();
			this.isVisibilidadCeldaCopiarTipoCambio=this.jButtonCopiarTipoCambio.isVisible();
			this.isVisibilidadCeldaVerFormTipoCambio=this.jButtonVerFormTipoCambio.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCambio=this.jButtonAbrirOrderByTipoCambio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=this.jButtonNuevoRelacionesTipoCambio.isVisible();
			this.isVisibilidadCeldaModificarTipoCambio=this.jButtonModificarTipoCambio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.isVisibilidadCeldaActualizarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarTipoCambio.isVisible();
			this.isVisibilidadCeldaEliminarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarTipoCambio.isVisible();
			this.isVisibilidadCeldaCancelarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarTipoCambio.isVisible();
			this.isVisibilidadCeldaGuardarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=this.jButtonGuardarCambiosTablaTipoCambio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCambio=this.jButtonNuevoToolBarTipoCambio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=this.jButtonNuevoRelacionesToolBarTipoCambio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.isVisibilidadCeldaModificarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonModificarToolBarTipoCambio.isVisible();
			this.isVisibilidadCeldaActualizarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarToolBarTipoCambio.isVisible();
			this.isVisibilidadCeldaEliminarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarToolBarTipoCambio.isVisible();
			this.isVisibilidadCeldaCancelarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarToolBarTipoCambio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCambio=this.jButtonGuardarCambiosToolBarTipoCambio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=this.jButtonGuardarCambiosTablaToolBarTipoCambio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCambio=this.jMenuItemNuevoTipoCambio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=this.jMenuItemNuevoRelacionesTipoCambio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.isVisibilidadCeldaModificarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jMenuItemModificarTipoCambio.isVisible();
			this.isVisibilidadCeldaActualizarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jMenuItemActualizarTipoCambio.isVisible();
			this.isVisibilidadCeldaEliminarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jMenuItemEliminarTipoCambio.isVisible();
			this.isVisibilidadCeldaCancelarTipoCambio=this.jInternalFrameDetalleFormTipoCambio.jMenuItemCancelarTipoCambio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCambio=this.jMenuItemGuardarCambiosTipoCambio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=this.jMenuItemGuardarCambiosTablaTipoCambio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCambio(Boolean esInicializar) {
		if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocambioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCambio();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCambio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCambio() {
		this.jButtonNuevoTipoCambio.setVisible(this.isPermisoNuevoTipoCambio);			
		this.jButtonDuplicarTipoCambio.setVisible(this.isPermisoDuplicarTipoCambio);			
		this.jButtonCopiarTipoCambio.setVisible(this.isPermisoCopiarTipoCambio);			
		this.jButtonVerFormTipoCambio.setVisible(this.isPermisoVerFormTipoCambio);			
		
		this.jButtonAbrirOrderByTipoCambio.setVisible(this.isPermisoOrdenTipoCambio);					
		
		this.jButtonNuevoRelacionesTipoCambio.setVisible(this.isPermisoNuevoTipoCambio);			
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonModificarTipoCambio.setVisible(this.isPermisoActualizarTipoCambio);	
			this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarTipoCambio.setVisible(this.isPermisoActualizarTipoCambio);	
			this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarTipoCambio.setVisible(this.isPermisoEliminarTipoCambio);
			this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarTipoCambio.setVisible(this.isVisibilidadCeldaCancelarTipoCambio);						
			this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.setVisible(this.isPermisoGuardarCambiosTipoCambio);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCambio.setVisible(this.isPermisoActualizarTipoCambio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCambio() {
		this.jInternalFrameDetalleFormTipoCambio.jButtonModificarTipoCambio.setVisible(this.isPermisoActualizarTipoCambio);	
		this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarTipoCambio.setVisible(this.isPermisoActualizarTipoCambio);	
		this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarTipoCambio.setVisible(this.isPermisoEliminarTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarTipoCambio.setVisible(this.isVisibilidadCeldaCancelarTipoCambio);							
		this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.setVisible((this.isVisibilidadCeldaGuardarTipoCambio && this.isPermisoGuardarCambiosTipoCambio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCambio() {
		if(TipoCambioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCambio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCambio() {
	}
	
	public void jTableDatosTipoCambioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCambio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCambioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocambio==null) {
						this.tipocambio = new TipoCambio();
					}

					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				}

				if(this.tipocambio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocambio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCambio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCambioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCambio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCambio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCambio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocambioLogic.getConnexion());

				if(this.tipocambio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocambio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCambio=(TitledBorder)this.jScrollPanelDatosTipoCambio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCambio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCambioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocambio==null) {
						this.tipocambio = new TipoCambio();
					}

					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				}

				if(this.tipocambio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocambio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCambio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_monedaTipoCambioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomoneda=true;

			idTienePermisomoneda=this.tienePermisosUsuarioEnPaginaWebTipoCambio(MonedaConstantesFunciones.CLASSNAME);

			if(idTienePermisomoneda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCambio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCambio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);

				this.monedaBeanSwingJInternalFrame=new MonedaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.monedaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.monedaBeanSwingJInternalFrame.getMonedaLogic().setConnexion(this.tipocambioLogic.getConnexion());

				if(this.tipocambio.getid_moneda()!=null) {
					this.monedaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.monedaBeanSwingJInternalFrame.setIdActual(this.tipocambio.getid_moneda());
					this.monedaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.inicializarActualizarBindingTablaMoneda();
				}

				JInternalFrameBase jinternalFrame =this.monedaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCambio=(TitledBorder)this.jScrollPanelDatosTipoCambio.getBorder();
				TitledBorder titledBordermoneda=(TitledBorder)this.monedaBeanSwingJInternalFrame.jScrollPanelDatosMoneda.getBorder();

				titledBordermoneda.setTitle(titledBorderTipoCambio.getTitle() + " -> Moneda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_monedaTipoCambioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocambio==null) {
						this.tipocambio = new TipoCambio();
					}

					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				}

				if(this.tipocambio.getid_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_moneda = "+this.tipocambio.getid_moneda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCambio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_compraTipoCambioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocambio==null) {
						this.tipocambio = new TipoCambio();
					}

					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				}

				if(this.tipocambio.getvalor_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_compra = "+this.tipocambio.getvalor_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCambio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_ventaTipoCambioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocambio==null) {
						this.tipocambio = new TipoCambio();
					}

					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				}

				if(this.tipocambio.getvalor_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_venta = "+this.tipocambio.getvalor_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCambio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaTipoCambioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.gettipocambio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocambio==null) {
						this.tipocambio = new TipoCambio();
					}

					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);
				}

				if(this.tipocambio.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.tipocambio.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCambio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoCambioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCambio(false,false);

			this.getTipoCambiosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCambio(false);

			//if(TipoCambioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCambio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMonedaTipoCambioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCambio(false,false);

			this.getTipoCambiosFK_IdMoneda();

			this.inicializarActualizarBindingTipoCambio(false);

			//if(TipoCambioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCambio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocambioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCambio() {
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
			this.jInternalFrameDetalleFormTipoCambio.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCambio.dispose();
			this.jInternalFrameDetalleFormTipoCambio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
			this.jInternalFrameReporteDinamicoTipoCambio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCambio.dispose();
			this.jInternalFrameReporteDinamicoTipoCambio=null;
		}
		
		if(this.jInternalFrameImportacionTipoCambio!=null) {
			this.jInternalFrameImportacionTipoCambio.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCambio.dispose();
			this.jInternalFrameImportacionTipoCambio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCambio();
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCambio")) {
				jButtonDuplicarTipoCambioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCambio")) {
				jButtonCopiarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCambio")) {
				jButtonVerFormTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCambio")) {
				jButtonDuplicarTipoCambioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCambio")) {
				jButtonDuplicarTipoCambioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCambio")) {
				jButtonModificarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCambio")) {
				jButtonModificarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCambio")) {
				jButtonModificarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCambio")) {
				jButtonActualizarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCambio")) {
				jButtonActualizarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCambio")) {
				jButtonActualizarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCambio")) {
				jButtonEliminarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCambio")) {
				jButtonEliminarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCambio")) {
				jButtonEliminarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCambio")) {
				jButtonCancelarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCambio")) {
				jButtonCancelarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCambio")) {
				jButtonCancelarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCambio")) {
				jButtonCerrarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCambio")) {
				jButtonCerrarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCambio")) {
				jButtonCerrarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCambio")) {
				jButtonMostrarOcultarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCambio")) {
				jButtonCancelarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCambio")) {
				jButtonCopiarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCambio")) {
				jButtonVerFormTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCambio")) {
				jButtonCopiarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCambio")) {
				jButtonVerFormTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCambio")) {
				jButtonRecargarInformacionTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCambio")) {
				jButtonRecargarInformacionTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCambio")) {
				jButtonRecargarInformacionTipoCambioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCambio")) {
				jButtonAnterioresTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCambio")) {
				jButtonAnterioresTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCambio")) {
				jButtonAnterioresTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCambio")) {
				jButtonSiguientesTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCambio")) {
				jButtonSiguientesTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCambio")) {
				jButtonSiguientesTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCambio") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCambio")) {
				jButtonAbrirOrderByTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCambio") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCambio")) {
				jButtonMostrarOcultarTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCambio")) {
				jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCambio")) {
				jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCambio")) {
				jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCambio")) {
				jButtonCerrarReporteDinamicoTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCambio")) {
				jButtonGenerarReporteDinamicoTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCambio")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCambio")) {
				jButtonCerrarImportacionTipoCambioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCambio")) {
				
				jButtonGenerarImportacionTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCambio")) {
				
				jButtonAbrirImportacionTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCambio")) {
				jComboBoxTiposAccionesTipoCambioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCambio")) {
				jComboBoxTiposRelacionesTipoCambioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCambio")) {
				jComboBoxTiposAccionesTipoCambioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCambio")) {
				
				jComboBoxTiposSeleccionarTipoCambioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCambio")) {
				jTextFieldValorCampoGeneralTipoCambioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCambio")) {
				jButtonAbrirOrderByTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCambio")) {
				jButtonAbrirOrderByTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCambio")) {
				jButtonCerrarOrderByTipoCambioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCambioBusqueda")) {
				this.jButtonidTipoCambioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCambioUpdate")) {
				this.jButtonid_empresaTipoCambioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCambioBusqueda")) {
				this.jButtonid_empresaTipoCambioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaTipoCambioUpdate")) {
				this.jButtonid_monedaTipoCambioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaTipoCambioBusqueda")) {
				this.jButtonid_monedaTipoCambioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_compraTipoCambioBusqueda")) {
				this.jButtonvalor_compraTipoCambioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ventaTipoCambioBusqueda")) {
				this.jButtonvalor_ventaTipoCambioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaTipoCambioBusqueda")) {
				this.jButtonfechaTipoCambioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCambio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCambio tipocambioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocambioLocal=this.tipocambio;
			} else {
				tipocambioLocal=this.tipocambioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
							
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
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
			
			


			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
								
						
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
								
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
							
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
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
			
			


			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
								
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCambio")) {
					jCheckBoxSeleccionarTodosTipoCambioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCambio")) {
					jCheckBoxSeleccionadosTipoCambioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCambio")) {
					
				}
				
				


				
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
												
				
				


				
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
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
			
			


			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCambioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocambio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocambio);
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
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
				
				


				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCambio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCambio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCambioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocambioAnterior =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCambio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCambioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCambio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocambio =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocambio =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocambio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCambio")) {
				
				}
				
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCambio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCambio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCambio")) {
			
			}
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCambio();
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCambio")) {
				jButtonDuplicarTipoCambioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCambio")) {
				jButtonCopiarTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCambio")) {
				jButtonVerFormTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCambio")) {
				jButtonNuevoTipoCambioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCambio")) {
				jButtonModificarTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCambio")) {
				jButtonActualizarTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCambio")) {
				jButtonEliminarTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCambio")) {
				jButtonCancelarTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCambio")) {
				jButtonCerrarTipoCambioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCambio")) {
				jButtonGuardarCambiosTipoCambioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCambio")) {
				jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCambio")) {
				jButtonAbrirOrderByTipoCambioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCambio")) {
				jButtonRecargarInformacionTipoCambioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCambio")) {
				jButtonAnterioresTipoCambioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCambio")) {
				jButtonSiguientesTipoCambioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCambioBusqueda")) {
				this.jButtonidTipoCambioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCambioUpdate")) {
				this.jButtonid_empresaTipoCambioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCambioBusqueda")) {
				this.jButtonid_empresaTipoCambioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaTipoCambioUpdate")) {
				this.jButtonid_monedaTipoCambioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaTipoCambioBusqueda")) {
				this.jButtonid_monedaTipoCambioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_compraTipoCambioBusqueda")) {
				this.jButtonvalor_compraTipoCambioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ventaTipoCambioBusqueda")) {
				this.jButtonvalor_ventaTipoCambioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaTipoCambioBusqueda")) {
				this.jButtonfechaTipoCambioBusquedaActionPerformed(evt);
			}
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCambio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCambio")) {
				closingInternalFrameTipoCambio();
				
			} else if(sTipo.equals("jButtonCancelarTipoCambio")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCambio = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCambioBeanSwingJInternalFrame jInternalFrameParent=(TipoCambioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCambio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCambioActionPerformed(null);
			}
			
			TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocambio,new Object(),this.tipocambioParameterGeneral,this.tipocambioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCambio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCambio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCambio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocambio)) {
			if(!esControlTabla) {
				if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);			
				}
				
				if(this.tipocambioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCambio(this.tipocambio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocambioReturnGeneral=tipocambioLogic.procesarEventosTipoCambiosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocambioLogic.getTipoCambios(),this.tipocambio,this.tipocambioParameterGeneral,this.isEsNuevoTipoCambio,classes);//this.tipocambioLogic.getTipoCambio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCambio(this.tipocambioReturnGeneral,this.tipocambioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocambioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCambio(classes,this.tipocambioReturnGeneral,this.tipocambioBean,false);
					}
						
					if(this.tipocambioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCambio(this.tipocambioReturnGeneral.getTipoCambio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCambio(this.tipocambioReturnGeneral.getTipoCambio());	
					}
						
					if(this.tipocambioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCambio(this.tipocambioReturnGeneral.getTipoCambio(),classes);//this.tipocambioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCambio(this.tipocambio,classes);//this.tipocambioBean);									
				}
			
				if(TipoCambioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCambio(this.tipocambio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCambio(this.tipocambio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocambioAnterior!=null) {
						this.tipocambio=this.tipocambioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocambioReturnGeneral=tipocambioLogic.procesarEventosTipoCambiosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocambioLogic.getTipoCambios(),this.tipocambio,this.tipocambioParameterGeneral,this.isEsNuevoTipoCambio,classes);//this.tipocambioLogic.getTipoCambio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocambioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocambioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocambioReturnGeneral.getTipoCambio(),tipocambioLogic.getTipoCambios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocambioReturnGeneral.getTipoCambio(),this.tipocambios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCambio.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCambio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCambio();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCambio() throws Exception {
		
		TipoCambioModel tipocambioModel=(TipoCambioModel)this.jTableDatosTipoCambio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocambioModel.tipocambios=this.tipocambioLogic.getTipoCambios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocambioModel.tipocambios=this.tipocambios;
		}
		
		
		((TipoCambioModel) this.jTableDatosTipoCambio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCambio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocambioAnterior(),this.tipocambioLogic.getTipoCambios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocambioAnterior(),this.tipocambios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCambio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCambio(TipoCambio tipocambio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
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
										
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocambio,new Object(),generalEntityParameterGeneral,this.tipocambioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCambioConstantesFunciones.getClassesRelationshipsOfTipoCambio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCambioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCambio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCambio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCambioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocambio,new Object(),generalEntityParameterGeneral,this.tipocambioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCambio(TipoCambioBean tipocambioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCambio(ArrayList<Classe> classes,TipoCambioReturnGeneral tipocambioReturnGeneral,TipoCambioBean tipocambioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCambio(TipoCambio tipocambio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocambio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCambio = new TipoCambioDetalleFormJInternalFrame(jDesktopPane,this.tipocambioSessionBean.getConGuardarRelaciones(),this.tipocambioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.setVisible(false);
		this.jInternalFrameDetalleFormTipoCambio.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCambio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCambio.tipocambioLogic=this.tipocambioLogic;
		
		this.cargarCombosFrameForeignKeyTipoCambio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCambio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCambio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCambio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCambio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCambio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCambio"));
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonModificarTipoCambio.addActionListener(new ButtonActionListener(this,"ModificarTipoCambio"));

		
		this.jInternalFrameDetalleFormTipoCambio.jButtonModificarToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCambio"));
					
		this.jInternalFrameDetalleFormTipoCambio.jMenuItemModificarTipoCambio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCambio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarTipoCambio.addActionListener (new ButtonActionListener(this,"ActualizarTipoCambio"));
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCambio"));
						
		this.jInternalFrameDetalleFormTipoCambio.jMenuItemActualizarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCambio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarTipoCambio.addActionListener (new ButtonActionListener(this,"EliminarTipoCambio"));
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCambio"));
								
		this.jInternalFrameDetalleFormTipoCambio.jMenuItemEliminarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCambio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarTipoCambio.addActionListener (new ButtonActionListener(this,"CancelarTipoCambio"));
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCambio"));
					
		this.jInternalFrameDetalleFormTipoCambio.jMenuItemCancelarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCambio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jMenuItemDetalleCerrarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCambio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCambio"));
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCambio"));
		
		
		
		this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCambio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonidTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCambioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_empresaTipoCambioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCambioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_empresaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCambioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_monedaTipoCambioUpdate.addActionListener(new ButtonActionListener(this,"id_monedaTipoCambioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_monedaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonvalor_compraTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"valor_compraTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonvalor_ventaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"valor_ventaTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonfechaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"fechaTipoCambioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCambio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCambio"));
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCambio"));
		}
		
		this.jTableDatosTipoCambio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCambio"));
		
		this.jTableDatosTipoCambio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCambio"));
		
		this.jButtonNuevoTipoCambio.addActionListener(new ButtonActionListener(this,"NuevoTipoCambio"));
		
		this.jButtonDuplicarTipoCambio.addActionListener(new ButtonActionListener(this,"DuplicarTipoCambio"));
		
		this.jButtonCopiarTipoCambio.addActionListener(new ButtonActionListener(this,"CopiarTipoCambio"));
		
		this.jButtonVerFormTipoCambio.addActionListener(new ButtonActionListener(this,"VerFormTipoCambio"));
		
		
		this.jButtonNuevoToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCambio"));
			
		this.jButtonDuplicarToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCambio"));
			
		this.jMenuItemNuevoTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCambio"));
			
		this.jMenuItemDuplicarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCambio"));		
		
		
		this.jButtonNuevoRelacionesTipoCambio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCambio"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCambio"));
			
		this.jMenuItemNuevoRelacionesTipoCambio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCambio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonModificarTipoCambio.addActionListener(new ButtonActionListener(this,"ModificarTipoCambio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonModificarToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCambio"));
			
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemModificarTipoCambio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCambio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarTipoCambio.addActionListener (new ButtonActionListener(this,"ActualizarTipoCambio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonActualizarToolBarTipoCambio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCambio"));
				
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemActualizarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCambio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarTipoCambio.addActionListener (new ButtonActionListener(this,"EliminarTipoCambio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonEliminarToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCambio"));
						
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemEliminarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCambio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarTipoCambio.addActionListener (new ButtonActionListener(this,"CancelarTipoCambio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonCancelarToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCambio"));
			
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemCancelarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCambio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCambio"));		
		
		
		this.jButtonCerrarTipoCambio.addActionListener (new ButtonActionListener(this,"CerrarTipoCambio"));
		
		
		this.jButtonCerrarToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCambio"));
			
		this.jMenuItemCerrarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCambio"));
			
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jMenuItemDetalleCerrarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCambio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCambio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCambio"));
		}
		
		this.jButtonCopiarToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCambio"));
			
		this.jButtonVerFormToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCambio"));
		
		this.jMenuItemGuardarCambiosTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCambio"));
			
		this.jMenuItemCopiarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCambio"));		
		
		this.jMenuItemVerFormTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCambio"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCambio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCambio"));
			
		this.jMenuItemGuardarCambiosTablaTipoCambio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCambio"));		
		
		
		
		this.jButtonRecargarInformacionTipoCambio.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCambio"));
					
		this.jButtonRecargarInformacionToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCambio"));
		
		this.jMenuItemRecargarInformacionTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCambio"));		
		
		
		
		this.jButtonAnterioresTipoCambio.addActionListener (new ButtonActionListener(this,"AnterioresTipoCambio"));
		
		
		this.jButtonAnterioresToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCambio"));
		
		this.jMenuItemAnterioresTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCambio"));		
		
		
		this.jButtonSiguientesTipoCambio.addActionListener (new ButtonActionListener(this,"SiguientesTipoCambio"));
		
		
		this.jButtonSiguientesToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCambio"));
			
		this.jMenuItemSiguientesTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCambio"));
			
		this.jMenuItemAbrirOrderByTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCambio"));
			
		this.jMenuItemMostrarOcultarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCambio"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCambio"));
			
		this.jMenuItemDetalleMostarOcultarTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCambio"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCambio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCambio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCambio"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCambio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCambio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCambio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCambio"));

		this.jCheckBoxSeleccionadosTipoCambio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCambio"));
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCambio"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCambio.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCambio"));
			
		this.jComboBoxTiposAccionesTipoCambio.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCambio"));
					
		this.jComboBoxTiposSeleccionarTipoCambio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCambio"));
			
		this.jTextFieldValorCampoGeneralTipoCambio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCambio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonidTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCambioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_empresaTipoCambioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCambioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_empresaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCambioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_monedaTipoCambioUpdate.addActionListener(new ButtonActionListener(this,"id_monedaTipoCambioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_monedaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonvalor_compraTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"valor_compraTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonvalor_ventaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"valor_ventaTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonfechaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"fechaTipoCambioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCambio!=null) {
				this.jInternalFrameReporteDinamicoTipoCambio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCambio"));
				this.jInternalFrameReporteDinamicoTipoCambio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCambio"));
				this.jInternalFrameReporteDinamicoTipoCambio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCambio"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCambio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCambio"));				
			//this.jButtonGenerarReporteDinamicoTipoCambio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCambio"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCambio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCambio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCambio!=null) {
				this.jInternalFrameImportacionTipoCambio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCambio"));
				this.jInternalFrameImportacionTipoCambio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCambio"));
				this.jInternalFrameImportacionTipoCambio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCambio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCambio.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCambio"));
			
			this.jButtonAbrirOrderByToolBarTipoCambio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCambio"));			
			
			if(this.jInternalFrameOrderByTipoCambio!=null) {
				this.jInternalFrameOrderByTipoCambio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCambio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCambio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCambio.jTabbedPaneRelacionesTipoCambio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCambio"));
		
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
            		closingInternalFrameTipoCambio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCambio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCambio = (JInternalFrameBase)event.getSource();
	            	
	            TipoCambioBeanSwingJInternalFrame jInternalFrameParent=(TipoCambioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCambio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCambioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCambio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCambioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCambio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCambio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCambioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCambioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCambioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCambio";
		inputMap = this.jButtonNuevoTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCambioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCambioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCambioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCambioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCambio";
		inputMap = this.jButtonNuevoRelacionesTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCambioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCambio";
		inputMap = this.jButtonModificarTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCambioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCambio";
		inputMap = this.jButtonActualizarTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCambioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCambio";
		inputMap = this.jButtonEliminarTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCambioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCambio";
		inputMap = this.jButtonCancelarTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCambioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCambio";
		inputMap = this.jButtonCerrarTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCambioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCambio";
		inputMap = this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCambio.jButtonGuardarCambiosTipoCambio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCambioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCambio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCambioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCambio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCambioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCambio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCambioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCambio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCambioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonidTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCambioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_empresaTipoCambioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCambioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_empresaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCambioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_monedaTipoCambioUpdate.addActionListener(new ButtonActionListener(this,"id_monedaTipoCambioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonid_monedaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonvalor_compraTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"valor_compraTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonvalor_ventaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"valor_ventaTipoCambioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCambio.jButtonfechaTipoCambioBusqueda.addActionListener(new ButtonActionListener(this,"fechaTipoCambioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCambio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCambioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCambioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCambio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCambio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
					tipocambioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCambio tipocambioAux:tipocambios) {
					tipocambioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCambioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCambio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
						tipocambioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCambio tipocambioAux:tipocambios) {
						tipocambioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCambio tipocambioAux:tipocambios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCambio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCambio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCambio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCambioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCambio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCambio.getSelectedRows();
			
			TipoCambio tipocambioLocal=new TipoCambio();
			
			//this.seleccionarTodosTipoCambio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocambioLocal =(TipoCambio) this.tipocambioLogic.getTipoCambios().toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocambioLocal =(TipoCambio) this.tipocambios.toArray()[this.jTableDatosTipoCambio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocambioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
						tipocambioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCambio tipocambioAux:tipocambios) {
						tipocambioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCambio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCambio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCambio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCambio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCambioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCambioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCambioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCambio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCambio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCambio tipocambioAux:this.tipocambioLogic.getTipoCambios()) {
				
						if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA)) {
							existe=true;
							tipocambioAux.setvalor_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_VALORVENTA)) {
							existe=true;
							tipocambioAux.setvalor_venta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							tipocambioAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCambio tipocambioAux:tipocambios) {
					
						if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA)) {
							existe=true;
							tipocambioAux.setvalor_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_VALORVENTA)) {
							existe=true;
							tipocambioAux.setvalor_venta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							tipocambioAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCambio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCambioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCambio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCambio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCambio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCambio) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCambio(conSplash);
				
					this.generarReporteTipoCambiosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCambiosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCambiosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCambiosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCambio();
				
				this.exportarTipoCambiosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCambios();
				//this.importarTipoCambios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCambio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCambiosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cambio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCambio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCambio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCambio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCambioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCambio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCambio(conSplash);
					
						//this.actualizarParametrosGeneralTipoCambio();
						
						this.generarReporteProcesoAccionTipoCambiosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCambioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo CambioS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Cambio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCambio();
				
						this.actualizarParametrosGeneralTipoCambio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocambioReturnGeneral=tipocambioLogic.procesarAccionTipoCambiosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocambioLogic.getTipoCambios(),this.tipocambioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCambioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCambio();
					
					TipoCambioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCambioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCambio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCambio.jComboBoxTiposAccionesFormularioTipoCambio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCambio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCambioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCambio();
			
			if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
			TipoCambio tipocambio=new TipoCambio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCambio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCambio.getSelectedItem();
			
			
			
			
			tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocambiosSeleccionados.size()==1) {
				for(TipoCambio tipocambioAux:tipocambiosSeleccionados) {
					tipocambio=tipocambioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCambio();
			
      		//this.finishProcessTipoCambio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCambioReturnGeneral() throws Exception {
		if(this.tipocambioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocambioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocambioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocambioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocambioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocambioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCambio(false);
		}
		
		if(this.tipocambioReturnGeneral.getConRetornoLista() || this.tipocambioReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocambioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocambioLogic.setTipoCambios(this.tipocambioReturnGeneral.getTipoCambios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocambioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocambioLogic.setTipoCambio(this.tipocambioReturnGeneral.getTipoCambio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCambio(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCambio() throws Exception {
		
		
	}
	
	public ArrayList<TipoCambio> getTipoCambiosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCambio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCambio tipocambioAux:tipocambioLogic.getTipoCambios()) {
					if(tipocambioAux.getIsSelected()) {
						tipocambiosSeleccionados.add(tipocambioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCambio tipocambioAux:this.tipocambios) {
					if(tipocambioAux.getIsSelected()) {
						tipocambiosSeleccionados.add(tipocambioAux);				
					}
				}
			}
			
			if(tipocambiosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocambiosSeleccionados.addAll(this.tipocambioLogic.getTipoCambios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocambiosSeleccionados.addAll(this.tipocambios);				
					}
				}
			}
		} else {
			tipocambiosSeleccionados.add(this.tipocambio);
		}
		
		return tipocambiosSeleccionados;
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
	
	public void generarReporteTipoCambiosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCambiosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCambiosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCambiosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCambiosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cambio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCambiosSeleccionados() throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCambiosSeleccionados() throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCambiosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCambiosSeleccionados() throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCambio();
		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCambio();
		
		
		//this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados ,tipocambioImplementable,tipocambioImplementableHome);
	}
	
	public void mostrarImportacionTipoCambios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCambio();
		
		this.abrirFrameImportacionTipoCambio();		
		
			
		//this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados ,tipocambioImplementable,tipocambioImplementableHome);
	}
	
	public void importarTipoCambios() throws Exception {		
	
	}
	
	public void exportarTipoCambiosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCambiosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCambiosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCambiosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cambio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCambiosSeleccionados() throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCambio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCambio tipocambioAux:tipocambiosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCambio(tipocambioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocambioAux.setsDetalleGeneralEntityReporte(tipocambioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCambio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_IDMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_VALORCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_VALORVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCambioConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCambio(TipoCambio tipocambio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocambio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocambio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocambio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocambio.getmoneda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocambio.getvalor_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocambio.getvalor_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocambio.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCambiosSeleccionados() throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCambios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCambio(row);				
				iRow++;
			}				
			
			for(TipoCambio tipocambioAux:tipocambiosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCambio(tipocambioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCambiosSeleccionados() throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();		
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocambio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocambios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocambio");
			//elementRoot.appendChild(element);
		
			for(TipoCambio tipocambioAux:tipocambiosSeleccionados) {
				element = document.createElement("tipocambio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCambio(tipocambioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cambio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCambio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_IDMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_VALORVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCambioConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCambio(TipoCambio tipocambio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocambio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocambio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocambio.getmoneda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocambio.getvalor_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocambio.getvalor_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocambio.getfecha());				
	}
	
	public void setFilaDatosExportarXmlTipoCambio(TipoCambio tipocambio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCambioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocambio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCambioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocambio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCambioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocambio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmoneda_descripcion = document.createElement(TipoCambioConstantesFunciones.IDMONEDA);
		elementmoneda_descripcion.appendChild(document.createTextNode(tipocambio.getmoneda_descripcion()));
		element.appendChild(elementmoneda_descripcion);

		Element elementvalor_compra = document.createElement(TipoCambioConstantesFunciones.VALORCOMPRA);
		elementvalor_compra.appendChild(document.createTextNode(tipocambio.getvalor_compra().toString().trim()));
		element.appendChild(elementvalor_compra);

		Element elementvalor_venta = document.createElement(TipoCambioConstantesFunciones.VALORVENTA);
		elementvalor_venta.appendChild(document.createTextNode(tipocambio.getvalor_venta().toString().trim()));
		element.appendChild(elementvalor_venta);

		Element elementfecha = document.createElement(TipoCambioConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(tipocambio.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoTipoCambiosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCambio> tipocambiosSeleccionados=new ArrayList<TipoCambio>();
		
		tipocambiosSeleccionados=this.getTipoCambiosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCambio(tipocambiosSeleccionados);
		
		this.generarReporteTipoCambios("Todos",tipocambiosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCambio(ArrayList<TipoCambio> tipocambiosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCambio tipocambioAux:tipocambiosSeleccionados) {
				tipocambioAux.setsDetalleGeneralEntityReporte(tipocambioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocambioAux.setsDescripcionGeneralEntityReporte1(tipocambioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_IDMONEDA)) {
					existe=true;
					tipocambioAux.setsDescripcionGeneralEntityReporte1(tipocambioAux.getmoneda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCambioConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					tipocambioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tipocambioAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCambioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCambio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCambio=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCambio=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCambio=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=false;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
			this.isVisibilidadCeldaModificarTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=true;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
			this.isVisibilidadCeldaModificarTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=true;
			this.isVisibilidadCeldaEliminarTipoCambio=true;
			this.isVisibilidadCeldaCancelarTipoCambio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
			this.isVisibilidadCeldaModificarTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=true;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCambio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=true;
			this.isVisibilidadCeldaModificarTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=false;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
			this.isVisibilidadCeldaActualizarTipoCambio=false;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
			this.isVisibilidadCeldaModificarTipoCambio=true;
			this.isVisibilidadCeldaActualizarTipoCambio=false;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
			this.isVisibilidadCeldaCancelarTipoCambio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCambio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCambioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCambio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=true;
		} else {
			this.actualizarEstadoPanelsTipoCambio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCambio=false;
			//this.isVisibilidadCeldaVerFormTipoCambio=false;
			this.isVisibilidadCeldaDuplicarTipoCambio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocambioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCambio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCambio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocambioSessionBean.getEsGuardarRelacionado()) {
			if(!tipocambioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;												
			}
			
			this.jButtonCerrarTipoCambio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCambio=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocambio)) {
			this.isVisibilidadCeldaActualizarTipoCambio=false;
			this.isVisibilidadCeldaEliminarTipoCambio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCambio() {
	}
	
	public void actualizarEstadoPanelsTipoCambio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCambio!=null) {
				this.jScrollPanelDatosEdicionTipoCambio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCambio!=null) {
				this.jScrollPanelDatosTipoCambio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCambio!=null) {
				this.jPanelPaginacionTipoCambio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCambio!=null) {
					this.jTabbedPaneBusquedasTipoCambio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCambio!=null) {
				this.jTabbedPaneBusquedasTipoCambio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCambio!=null) {
				this.jPanelParametrosReportesTipoCambio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaMoneda(Boolean isParaMoneda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMonedaNegation=!isParaMoneda;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCambioSessionBean tipocambioSessionBean=new TipoCambioSessionBean();
		
		if(this.tipocambioSessionBean==null) {
			this.tipocambioSessionBean=new TipoCambioSessionBean();
		}
		
		this.tipocambioSessionBean.setsUltimaBusquedaTipoCambio(this.getsAccionBusqueda());
		this.tipocambioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocambioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocambioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
			tipocambioSessionBean.setid_moneda(this.getid_monedaFK_IdMoneda());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCambioSessionBean tipocambioSessionBean=new TipoCambioSessionBean();
		
		if(this.tipocambioSessionBean==null) {
			this.tipocambioSessionBean=new TipoCambioSessionBean();
		}
		
		if(this.tipocambioSessionBean.getsUltimaBusquedaTipoCambio()!=null&&!this.tipocambioSessionBean.getsUltimaBusquedaTipoCambio().equals("")) {
			this.setsAccionBusqueda(tipocambioSessionBean.getsUltimaBusquedaTipoCambio());
			this.setiNumeroPaginacion(tipocambioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocambioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocambioSessionBean.getid_empresa());
				tipocambioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
				this.setid_monedaFK_IdMoneda(tipocambioSessionBean.getid_moneda());
				tipocambioSessionBean.setid_moneda(-1L);
			}
		}
		
		this.tipocambioSessionBean.setsUltimaBusquedaTipoCambio("");
		this.tipocambioSessionBean.setiNumeroPaginacion(TipoCambioConstantesFunciones.INUMEROPAGINACION);
		this.tipocambioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCambio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCambio() {
		this.updateBorderResaltarBusquedasFormularioTipoCambio();
		this.updateVisibilidadBusquedasFormularioTipoCambio();
		this.updateHabilitarBusquedasFormularioTipoCambio();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCambio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCambio.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCambio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCambio.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCambio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCambio.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCambio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoCambio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCambio() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCambio();
		this.updateVisibilidadResaltarControlesFormularioTipoCambio();
		this.updateHabilitarResaltarControlesFormularioTipoCambio();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCambio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocambioConstantesFunciones.resaltaridTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio!=null) {this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setBorder(this.tipocambioConstantesFunciones.resaltaridTipoCambio);}
		if(this.tipocambioConstantesFunciones.resaltarid_empresaTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio!=null) {this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setBorder(this.tipocambioConstantesFunciones.resaltarid_empresaTipoCambio);}
		if(this.tipocambioConstantesFunciones.resaltarid_monedaTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio!=null) {this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setBorder(this.tipocambioConstantesFunciones.resaltarid_monedaTipoCambio);}
		if(this.tipocambioConstantesFunciones.resaltarvalor_compraTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio!=null) {this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setBorder(this.tipocambioConstantesFunciones.resaltarvalor_compraTipoCambio);}
		if(this.tipocambioConstantesFunciones.resaltarvalor_ventaTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio!=null) {this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setBorder(this.tipocambioConstantesFunciones.resaltarvalor_ventaTipoCambio);}
		if(this.tipocambioConstantesFunciones.resaltarfechaTipoCambio!=null && this.jInternalFrameDetalleFormTipoCambio!=null) {this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setBorder(this.tipocambioConstantesFunciones.resaltarfechaTipoCambio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCambio() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
	
		//this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostraridTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jPanelidTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostraridTipoCambio);
		//this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarid_empresaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jPanelid_empresaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarid_empresaTipoCambio);
		//this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarid_monedaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jPanelid_monedaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarid_monedaTipoCambio);
		//this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarvalor_compraTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jPanelvalor_compraTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarvalor_compraTipoCambio);
		//this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarvalor_ventaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jPanelvalor_ventaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarvalor_ventaTipoCambio);
		//this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarfechaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jPanelfechaTipoCambio.setVisible(this.tipocambioConstantesFunciones.mostrarfechaTipoCambio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCambio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCambio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCambio!=null) {
	
		this.jInternalFrameDetalleFormTipoCambio.jLabelidTipoCambio.setEnabled(this.tipocambioConstantesFunciones.activaridTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_empresaTipoCambio.setEnabled(this.tipocambioConstantesFunciones.activarid_empresaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jComboBoxid_monedaTipoCambio.setEnabled(this.tipocambioConstantesFunciones.activarid_monedaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_compraTipoCambio.setEnabled(this.tipocambioConstantesFunciones.activarvalor_compraTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jTextFieldvalor_ventaTipoCambio.setEnabled(this.tipocambioConstantesFunciones.activarvalor_ventaTipoCambio);
		this.jInternalFrameDetalleFormTipoCambio.jDateChooserfechaTipoCambio.setEnabled(this.tipocambioConstantesFunciones.activarfechaTipoCambio);
		}
	}
	
		
}