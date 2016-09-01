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

import com.bydan.erp.nomina.util.TipoEstructuraConstantesFunciones;
import com.bydan.erp.nomina.util.TipoEstructuraParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoEstructuraParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoEstructuraBean;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoEstructuraBeanSwingJInternalFrame extends TipoEstructuraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEstructuraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEstructura> tipoestructuraValidator = new ClassValidator<TipoEstructura>(TipoEstructura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEstructura tipoestructura;	
	public TipoEstructura tipoestructuraAux;
	public TipoEstructura tipoestructuraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEstructura tipoestructuraTotales;
	public Long idTipoEstructuraActual;
	public Long iIdNuevoTipoEstructura=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoEstructura;
	public Boolean isPermisoNuevoTipoEstructura;
	public Boolean isPermisoActualizarTipoEstructura;
	public Boolean isPermisoActualizarOriginalTipoEstructura;
	public Boolean isPermisoEliminarTipoEstructura;
	public Boolean isPermisoGuardarCambiosTipoEstructura;
	public Boolean isPermisoConsultaTipoEstructura;
	public Boolean isPermisoBusquedaTipoEstructura;
	public Boolean isPermisoReporteTipoEstructura;
	public Boolean isPermisoPaginacionMedioTipoEstructura;
	public Boolean isPermisoPaginacionAltoTipoEstructura;
	public Boolean isPermisoPaginacionTodoTipoEstructura;
	public Boolean isPermisoCopiarTipoEstructura;
	public Boolean isPermisoVerFormTipoEstructura;
	public Boolean isPermisoDuplicarTipoEstructura;
	public Boolean isPermisoOrdenTipoEstructura;
	
	
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
	
	public TipoEstructuraParameterReturnGeneral tipoestructuraReturnGeneral;
	public TipoEstructuraParameterReturnGeneral tipoestructuraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEstructura=false;
	public Boolean esParaAccionDesdeFormularioTipoEstructura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEstructuraLogic tipoestructuraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEstructura tipoestructuraBean;
	public TipoEstructuraConstantesFunciones tipoestructuraConstantesFunciones;
	//public TipoEstructuraParameterReturnGeneral tipoestructuraReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoEstructura> tipoestructuras;	
	//public List<TipoEstructura> tipoestructurasEliminados;
	//public List<TipoEstructura> tipoestructurasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEstructura=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEstructura=true;
	public Boolean isVisibilidadCeldaCopiarTipoEstructura=true;
	public Boolean isVisibilidadCeldaVerFormTipoEstructura=true;
	public Boolean isVisibilidadCeldaOrdenTipoEstructura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
	public Boolean isVisibilidadCeldaModificarTipoEstructura=false;
	public Boolean isVisibilidadCeldaActualizarTipoEstructura=false;
	public Boolean isVisibilidadCeldaEliminarTipoEstructura=false;
	public Boolean isVisibilidadCeldaCancelarTipoEstructura=false;
	public Boolean isVisibilidadCeldaGuardarTipoEstructura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEstructura=false;	
	
	
	
	public Long getiIdNuevoTipoEstructura() {
		return this.iIdNuevoTipoEstructura;
	}

	public void setiIdNuevoTipoEstructura(Long iIdNuevoTipoEstructura) {
		this.iIdNuevoTipoEstructura = iIdNuevoTipoEstructura;
	}
	
	public Long getidTipoEstructuraActual() {
		return this.idTipoEstructuraActual;
	}

	public void setidTipoEstructuraActual(Long idTipoEstructuraActual) {
		this.idTipoEstructuraActual = idTipoEstructuraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEstructura gettipoestructura() {
		return this.tipoestructura;
	}

	public void settipoestructura(TipoEstructura tipoestructura) {
		this.tipoestructura = tipoestructura;
	}
	
	public TipoEstructura gettipoestructuraAux() {
		return this.tipoestructuraAux;
	}

	public void settipoestructuraAux(TipoEstructura tipoestructuraAux) {
		this.tipoestructuraAux = tipoestructuraAux;
	}				
	
	public TipoEstructura gettipoestructuraAnterior() {
		return this.tipoestructuraAnterior;
	}

	public void settipoestructuraAnterior(TipoEstructura tipoestructuraAnterior) {
		this.tipoestructuraAnterior = tipoestructuraAnterior;
	}	
	
	public TipoEstructura gettipoestructuraTotales() {
		return this.tipoestructuraTotales;
	}

	public void settipoestructuraTotales(TipoEstructura tipoestructuraTotales) {
		this.tipoestructuraTotales = tipoestructuraTotales;
	}	
	
	public TipoEstructura gettipoestructuraBean() {
		return this.tipoestructuraBean;
	}

	public void settipoestructuraBean(TipoEstructura tipoestructuraBean) {
		this.tipoestructuraBean = tipoestructuraBean;
	}	
	
	public TipoEstructuraParameterReturnGeneral gettipoestructuraReturnGeneral() {
		return this.tipoestructuraReturnGeneral;
	}

	public void settipoestructuraReturnGeneral(TipoEstructuraParameterReturnGeneral tipoestructuraReturnGeneral) {
		this.tipoestructuraReturnGeneral = tipoestructuraReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoEstructuraLogic getTipoEstructuraLogic()	{		
		return tipoestructuraLogic;
	}

	public void setTipoEstructuraLogic(TipoEstructuraLogic tipoestructuraLogic) {
		this.tipoestructuraLogic = tipoestructuraLogic;
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
	
	public Boolean getIsEsNuevoTipoEstructura() {
		return isEsNuevoTipoEstructura;
	}

	public void setIsEsNuevoTipoEstructura(Boolean isEsNuevoTipoEstructura) {
		this.isEsNuevoTipoEstructura = isEsNuevoTipoEstructura;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEstructura() {
		return esParaAccionDesdeFormularioTipoEstructura;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEstructura(Boolean esParaAccionDesdeFormularioTipoEstructura) {
		this.esParaAccionDesdeFormularioTipoEstructura = esParaAccionDesdeFormularioTipoEstructura;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoEstructura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesTipoEstructura(this.tipoestructuraLogic.getTipoEstructuras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesTipoEstructura(this.tipoestructuras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoestructuraLogic.setTipoEstructuras(this.tipoestructuras);
			tipoestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEstructuraParameterReturnGeneral getTipoEstructuraParameterGeneral() {
		return this.tipoestructuraParameterGeneral;
	}
	
	public void setTipoEstructuraParameterGeneral(TipoEstructuraParameterReturnGeneral tipoestructuraParameterGeneral) {
		this.tipoestructuraParameterGeneral = tipoestructuraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEstructura() {
		return isPermisoTodoTipoEstructura;
	}

	public void setIsPermisoTodoTipoEstructura(Boolean isPermisoTodoTipoEstructura) {
		this.isPermisoTodoTipoEstructura = isPermisoTodoTipoEstructura;
	}

	public Boolean getIsPermisoNuevoTipoEstructura() {
		return isPermisoNuevoTipoEstructura;
	}

	public void setIsPermisoNuevoTipoEstructura(Boolean isPermisoNuevoTipoEstructura) {
		this.isPermisoNuevoTipoEstructura = isPermisoNuevoTipoEstructura;
	}

	public Boolean getIsPermisoActualizarTipoEstructura() {
		return isPermisoActualizarTipoEstructura;
	}

	public void setIsPermisoActualizarTipoEstructura(Boolean isPermisoActualizarTipoEstructura) {
		this.isPermisoActualizarTipoEstructura = isPermisoActualizarTipoEstructura;
	}

	public Boolean getIsPermisoEliminarTipoEstructura() {
		return isPermisoEliminarTipoEstructura;
	}

	public void setIsPermisoEliminarTipoEstructura(Boolean isPermisoEliminarTipoEstructura) {
		this.isPermisoEliminarTipoEstructura = isPermisoEliminarTipoEstructura;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEstructura() {
		return isPermisoGuardarCambiosTipoEstructura;
	}

	public void setIsPermisoGuardarCambiosTipoEstructura(Boolean isPermisoGuardarCambiosTipoEstructura) {
		this.isPermisoGuardarCambiosTipoEstructura = isPermisoGuardarCambiosTipoEstructura;
	}
	
	public Boolean getIsPermisoConsultaTipoEstructura() {
		return isPermisoConsultaTipoEstructura;
	}

	public void setIsPermisoConsultaTipoEstructura(Boolean isPermisoConsultaTipoEstructura) {
		this.isPermisoConsultaTipoEstructura = isPermisoConsultaTipoEstructura;
	}

	public Boolean getIsPermisoBusquedaTipoEstructura() {
		return isPermisoBusquedaTipoEstructura;
	}

	public void setIsPermisoBusquedaTipoEstructura(Boolean isPermisoBusquedaTipoEstructura) {
		this.isPermisoBusquedaTipoEstructura = isPermisoBusquedaTipoEstructura;
	}

	public Boolean getIsPermisoReporteTipoEstructura() {
		return isPermisoReporteTipoEstructura;
	}

	public void setIsPermisoReporteTipoEstructura(Boolean isPermisoReporteTipoEstructura) {
		this.isPermisoReporteTipoEstructura = isPermisoReporteTipoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEstructura() {
		return isPermisoPaginacionMedioTipoEstructura;
	}

	public void setIsPermisoPaginacionMedioTipoEstructura(Boolean isPermisoPaginacionMedioTipoEstructura) {
		this.isPermisoPaginacionMedioTipoEstructura = isPermisoPaginacionMedioTipoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEstructura() {
		return isPermisoPaginacionTodoTipoEstructura;
	}

	public void setIsPermisoPaginacionTodoTipoEstructura(Boolean isPermisoPaginacionTodoTipoEstructura) {
		this.isPermisoPaginacionTodoTipoEstructura = isPermisoPaginacionTodoTipoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEstructura() {
		return isPermisoPaginacionAltoTipoEstructura;
	}

	public void setIsPermisoPaginacionAltoTipoEstructura(Boolean isPermisoPaginacionAltoTipoEstructura) {
		this.isPermisoPaginacionAltoTipoEstructura = isPermisoPaginacionAltoTipoEstructura;
	}
	
	public Boolean getIsPermisoCopiarTipoEstructura() {
		return isPermisoCopiarTipoEstructura;
	}

	public void setIsPermisoCopiarTipoEstructura(Boolean isPermisoCopiarTipoEstructura) {
		this.isPermisoCopiarTipoEstructura = isPermisoCopiarTipoEstructura;
	}
	
	public Boolean getIsPermisoVerFormTipoEstructura() {
		return isPermisoVerFormTipoEstructura;
	}

	public void setIsPermisoVerFormTipoEstructura(Boolean isPermisoVerFormTipoEstructura) {
		this.isPermisoVerFormTipoEstructura = isPermisoVerFormTipoEstructura;
	}
	
	public Boolean getIsPermisoDuplicarTipoEstructura() {
		return isPermisoDuplicarTipoEstructura;
	}

	public void setIsPermisoDuplicarTipoEstructura(Boolean isPermisoDuplicarTipoEstructura) {
		this.isPermisoDuplicarTipoEstructura = isPermisoDuplicarTipoEstructura;
	}
	
	public Boolean getIsPermisoOrdenTipoEstructura() {
		return isPermisoOrdenTipoEstructura;
	}

	public void setIsPermisoOrdenTipoEstructura(Boolean isPermisoOrdenTipoEstructura) {
		this.isPermisoOrdenTipoEstructura = isPermisoOrdenTipoEstructura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEstructura() {
		return isVisibilidadCeldaNuevoTipoEstructura;
	}

	public void setIsVisibilidadCeldaNuevoTipoEstructura(Boolean isVisibilidadCeldaNuevoTipoEstructura) {
		this.isVisibilidadCeldaNuevoTipoEstructura = isVisibilidadCeldaNuevoTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEstructura() {
		return isVisibilidadCeldaDuplicarTipoEstructura;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEstructura(Boolean isVisibilidadCeldaDuplicarTipoEstructura) {
		this.isVisibilidadCeldaDuplicarTipoEstructura = isVisibilidadCeldaDuplicarTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEstructura() {
		return isVisibilidadCeldaCopiarTipoEstructura;
	}

	public void setIsVisibilidadCeldaCopiarTipoEstructura(Boolean isVisibilidadCeldaCopiarTipoEstructura) {
		this.isVisibilidadCeldaCopiarTipoEstructura = isVisibilidadCeldaCopiarTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEstructura() {
		return isVisibilidadCeldaVerFormTipoEstructura;
	}

	public void setIsVisibilidadCeldaVerFormTipoEstructura(Boolean isVisibilidadCeldaVerFormTipoEstructura) {
		this.isVisibilidadCeldaVerFormTipoEstructura = isVisibilidadCeldaVerFormTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEstructura() {
		return isVisibilidadCeldaOrdenTipoEstructura;
	}

	public void setIsVisibilidadCeldaOrdenTipoEstructura(Boolean isVisibilidadCeldaOrdenTipoEstructura) {
		this.isVisibilidadCeldaOrdenTipoEstructura = isVisibilidadCeldaOrdenTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEstructura() {
		return isVisibilidadCeldaNuevoRelacionesTipoEstructura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEstructura(Boolean isVisibilidadCeldaNuevoRelacionesTipoEstructura) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEstructura = isVisibilidadCeldaNuevoRelacionesTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEstructura() {
		return isVisibilidadCeldaModificarTipoEstructura;
	}

	public void setIsVisibilidadCeldaModificarTipoEstructura(Boolean isVisibilidadCeldaModificarTipoEstructura) {
		this.isVisibilidadCeldaModificarTipoEstructura = isVisibilidadCeldaModificarTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEstructura() {
		return isVisibilidadCeldaActualizarTipoEstructura;
	}

	public void setIsVisibilidadCeldaActualizarTipoEstructura(Boolean isVisibilidadCeldaActualizarTipoEstructura) {
		this.isVisibilidadCeldaActualizarTipoEstructura = isVisibilidadCeldaActualizarTipoEstructura;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEstructura() {
		return isVisibilidadCeldaEliminarTipoEstructura;
	}

	public void setIsVisibilidadCeldaEliminarTipoEstructura(Boolean isVisibilidadCeldaEliminarTipoEstructura) {
		this.isVisibilidadCeldaEliminarTipoEstructura = isVisibilidadCeldaEliminarTipoEstructura;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEstructura() {
		return isVisibilidadCeldaCancelarTipoEstructura;
	}

	public void setIsVisibilidadCeldaCancelarTipoEstructura(Boolean isVisibilidadCeldaCancelarTipoEstructura) {
		this.isVisibilidadCeldaCancelarTipoEstructura = isVisibilidadCeldaCancelarTipoEstructura;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEstructura() {
		return isVisibilidadCeldaGuardarTipoEstructura;
	}

	public void setIsVisibilidadCeldaGuardarTipoEstructura(Boolean isVisibilidadCeldaGuardarTipoEstructura) {
		this.isVisibilidadCeldaGuardarTipoEstructura = isVisibilidadCeldaGuardarTipoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEstructura() {
		return isVisibilidadCeldaGuardarCambiosTipoEstructura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEstructura(Boolean isVisibilidadCeldaGuardarCambiosTipoEstructura) {
		this.isVisibilidadCeldaGuardarCambiosTipoEstructura = isVisibilidadCeldaGuardarCambiosTipoEstructura;
	}
		
	public TipoEstructuraSessionBean gettipoestructuraSessionBean() {
		return this.tipoestructuraSessionBean;
	}
	
	public void settipoestructuraSessionBean(TipoEstructuraSessionBean tipoestructuraSessionBean) {
		this.tipoestructuraSessionBean=tipoestructuraSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(TipoEstructura tipoestructura)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoEstructura tipoestructura,TipoEstructura tipoestructuraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEstructura(tipoestructura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoestructuraAux.setId(tipoestructura.getId());
		tipoestructuraAux.setVersionRow(tipoestructura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEstructura();
		
			int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoestructuraValidator.getInvalidValues(this.tipoestructura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoestructuraLogic.setDatosCliente(datosCliente);
			tipoestructuraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoestructuraAux=new  TipoEstructura();
				
				tipoestructuraAux.setIsNew(true);
				tipoestructuraAux.setIsChanged(true);
				
				tipoestructuraAux.setTipoEstructuraOriginal(this.tipoestructura);
				
				tipoestructuraAux.setId(this.tipoestructura.getId());	
				tipoestructuraAux.setVersionRow(this.tipoestructura.getVersionRow());	
				tipoestructuraAux.setcodigo(this.tipoestructura.getcodigo());	
				tipoestructuraAux.setnombre(this.tipoestructura.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoestructuraAux,tipoestructuraLogic.getTipoEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestructuraAux,tipoestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestructuraLogic.saveTipoEstructuras();//WithConnection
						//tipoestructuraLogic.getSetVersionRowTipoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoestructura,tipoestructuraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoestructuraAux=new  TipoEstructura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoestructuraSessionBean.getEsGuardarRelacionado() && this.tipoestructura.getId()>=0)) {
						
					tipoestructuraAux.setIsNew(false);
				}
				
				tipoestructuraAux.setIsDeleted(false);
			
				tipoestructuraAux.setId(this.tipoestructura.getId());	
				tipoestructuraAux.setVersionRow(this.tipoestructura.getVersionRow());	
				tipoestructuraAux.setcodigo(this.tipoestructura.getcodigo());	
				tipoestructuraAux.setnombre(this.tipoestructura.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoestructuraAux,tipoestructuraLogic.getTipoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestructuraAux,tipoestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestructuraLogic.saveTipoEstructuras();//WithConnection
						//tipoestructuraLogic.getSetVersionRowTipoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoestructura,tipoestructuraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoestructuraAux=new  TipoEstructura();
				
				tipoestructuraAux.setIsNew(false);
				tipoestructuraAux.setIsChanged(false);
				
				tipoestructuraAux.setIsDeleted(true);
				
				tipoestructuraAux.setId(this.tipoestructura.getId());	
				tipoestructuraAux.setVersionRow(this.tipoestructura.getVersionRow());	
				tipoestructuraAux.setcodigo(this.tipoestructura.getcodigo());	
				tipoestructuraAux.setnombre(this.tipoestructura.getnombre());	
				
				if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoestructuraAux.getId()>=0) {	
						this.tipoestructurasEliminados.add(tipoestructuraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoestructuraAux,tipoestructuraLogic.getTipoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestructuraAux,tipoestructuras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestructuraLogic.saveTipoEstructuras();//WithConnection
						//tipoestructuraLogic.getSetVersionRowTipoEstructuras();//WithConnection
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
					this.tipoestructuraLogic.getTipoEstructuras().addAll(this.tipoestructurasEliminados);
					
					tipoestructuraLogic.saveTipoEstructuras();//WithConnection
					//tipoestructuraLogic.getSetVersionRowTipoEstructuras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoestructurasEliminados= new ArrayList<TipoEstructura>();		
			}
			
			if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Estructura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoestructura=tipoestructuraAux;
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
      		//this.finishProcessTipoEstructura();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEstructura tipoestructuraLocal) throws Exception {
		
		if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEstructura tipoestructuraLocal) throws Exception {	
		if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoEstructuraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoestructuraValidator.getInvalidValues(this.tipoestructura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEstructura tipoestructura,List<TipoEstructura> tipoestructuras) throws Exception {
		try	{		
			TipoEstructuraConstantesFunciones.actualizarLista(tipoestructura,tipoestructuras,this.tipoestructuraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEstructura tipoestructura,List<TipoEstructura> tipoestructuras) throws Exception {
		try	{			
			TipoEstructuraConstantesFunciones.actualizarSelectedLista(tipoestructura,tipoestructuras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEstructura> tipoestructurasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoestructurasLocal=this.tipoestructuraLogic.getTipoEstructuras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoestructurasLocal=this.tipoestructuras;
			}
			//ARCHITECTURE
		
			for(TipoEstructura tipoestructuraLocal:tipoestructurasLocal) {
				if(this.permiteMantenimiento(tipoestructuraLocal) && tipoestructuraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEstructuraConstantesFunciones.getTipoEstructuraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEstructuraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstructura.jLabelcodigoTipoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEstructuraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstructura.jLabelnombreTipoEstructura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEstructura.jLabelcodigoTipoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEstructura.jLabelnombreTipoEstructura,"");
		
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
		this.iIdNuevoTipoEstructura--;	
		
		
		this.tipoestructuraAux=new TipoEstructura();
		
		this.tipoestructuraAux.setId(this.iIdNuevoTipoEstructura);
		this.tipoestructuraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoestructuraLogic.getTipoEstructuras().add(this.tipoestructuraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoestructuras.add(this.tipoestructuraAux);
		}
		//ARCHITECTURE
		
		this.tipoestructura=this.tipoestructuraAux;
		
		if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEstructura(this.tipoestructura);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEstructura(this.tipoestructura);
		}
				
		//this.setDefaultControlesTipoEstructura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEstructura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEstructura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstructura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEstructura(this.tipoestructuraBean,this.tipoestructura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEstructuraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
			classes=TipoEstructuraConstantesFunciones.getClassesRelationshipsOfTipoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoestructuraReturnGeneral=tipoestructuraLogic.procesarEventosTipoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestructuraLogic.getTipoEstructuras(),this.tipoestructura,this.tipoestructuraParameterGeneral,this.isEsNuevoTipoEstructura,classes);//this.tipoestructuraLogic.getTipoEstructura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEstructura(this.tipoestructuraReturnGeneral,this.tipoestructuraBean,false);
		
		if(this.tipoestructuraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura());
		}
		
		if(this.tipoestructuraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura(),classes);//this.tipoestructuraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEstructura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEstructura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEstructura(false);
						
			if(tipoestructuraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstructura();
			}
			
			this.actualizarVisualTableDatosTipoEstructura();
			
			this.jTableDatosTipoEstructura.setRowSelectionInterval(this.getIndiceNuevoTipoEstructura(), this.getIndiceNuevoTipoEstructura());
			
			this.seleccionarFilaTablaTipoEstructuraActual();
						
			this.actualizarEstadoCeldasBotonesTipoEstructura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEstructura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setEnabled(isHabilitar && this.tipoestructuraConstantesFunciones.activarcodigoTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setEnabled(isHabilitar && this.tipoestructuraConstantesFunciones.activarnombreTipoEstructura);	
		
	};
	
	public void setDefaultControlesTipoEstructura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEstructura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoestructuraSessionBean.setConGuardarRelaciones(true);			
			this.tipoestructuraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.setVisible(true);
			
					
		} else {
			//this.tipoestructuraSessionBean.setConGuardarRelaciones(false);			
			this.tipoestructuraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoEstructura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
				if(tipoestructuraAux.getId().equals(this.iIdNuevoTipoEstructura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstructura tipoestructuraAux:this.tipoestructuras) {
				if(tipoestructuraAux.getId().equals(this.iIdNuevoTipoEstructura)) {
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
	
	public int getIndiceActualTipoEstructura(TipoEstructura tipoestructura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
				if(tipoestructuraAux.getId().equals(tipoestructura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstructura tipoestructuraAux:this.tipoestructuras) {
				if(tipoestructuraAux.getId().equals(tipoestructura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEstructura(TipoEstructura tipoestructuraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
				if(tipoestructuraAux.getTipoEstructuraOriginal().getId().equals(tipoestructuraOriginal.getId())) {
					existe=true;
					tipoestructuraOriginal.setId(tipoestructuraAux.getId());
					tipoestructuraOriginal.setVersionRow(tipoestructuraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstructura tipoestructuraAux:this.tipoestructuras) {
				if(tipoestructuraAux.getTipoEstructuraOriginal().getId().equals(tipoestructuraOriginal.getId())) {
					existe=true;
					tipoestructuraOriginal.setId(tipoestructuraAux.getId());
					tipoestructuraOriginal.setVersionRow(tipoestructuraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEstructura(Boolean esParaCancelar) throws Exception {
		tipoestructurasAux=new ArrayList<TipoEstructura>();
		tipoestructuraAux=new TipoEstructura();
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
					if(tipoestructuraAux.getId()<0) {
						tipoestructurasAux.add(tipoestructuraAux);
					}		
				}
				this.iIdNuevoTipoEstructura=0L;
				this.tipoestructuraLogic.getTipoEstructuras().removeAll(tipoestructurasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstructura tipoestructuraAux:this.tipoestructuras) {
					if(tipoestructuraAux.getId()<0) {
						tipoestructurasAux.add(tipoestructuraAux);
					}		
				}
				this.iIdNuevoTipoEstructura=0L;
				this.tipoestructuras.removeAll(tipoestructurasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEstructura 
					&& this.tipoestructuraLogic.getTipoEstructuras().size()>0
					) {
					tipoestructuraAux=this.tipoestructuraLogic.getTipoEstructuras().get(this.tipoestructuraLogic.getTipoEstructuras().size() - 1);
				
					if(tipoestructuraAux.getId()<0) {
						this.tipoestructuraLogic.getTipoEstructuras().remove(tipoestructuraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEstructura && this.tipoestructuras.size()>0) {
					tipoestructuraAux=this.tipoestructuras.get(this.tipoestructuras.size() - 1);
				
					if(tipoestructuraAux.getId()<0) {
						this.tipoestructuras.remove(tipoestructuraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEstructura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoestructura.getId()<0) {
				this.tipoestructuraLogic.getTipoEstructuras().remove(this.tipoestructura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoestructura.getId()<0) {
				this.tipoestructuras.remove(this.tipoestructura);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEstructura(List<TipoEstructura> tipoestructurasAux) throws Exception {
		TipoEstructuraConstantesFunciones.setEstadosInicialesTipoEstructura(tipoestructurasAux);
	}
	
	public void setEstadosInicialesTipoEstructura(TipoEstructura tipoestructuraAux) throws Exception {
		TipoEstructuraConstantesFunciones.setEstadosInicialesTipoEstructura(tipoestructuraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEstructuraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEstructuraActual()) {
				if(!this.isEsNuevoTipoEstructura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEstructura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEstructuraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Estructura ?", "MANTENIMIENTO DE Tipo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEstructura tipoestructura) throws Exception {
		TipoEstructuraConstantesFunciones.seleccionarAsignar(this.tipoestructura,tipoestructura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEstructura=this.isPermisoActualizarOriginalTipoEstructura;
			
			
			this.seleccionarAsignar(tipoestructura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEstructuraConstantesFunciones.quitarEspaciosTipoEstructura(this.tipoestructura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoestructuraSessionBean.setsFuncionBusquedaRapida(this.tipoestructuraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEstructura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEstructura(esParaCancelar);				
				this.cancelarNuevoTipoEstructura(esParaCancelar);								
			}
			
			this.tipoestructura=new TipoEstructura();
			
			this.inicializarTipoEstructura();
			
			this.actualizarEstadoCeldasBotonesTipoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEstructura() throws Exception {
		try {
			TipoEstructuraConstantesFunciones.inicializarTipoEstructura(this.tipoestructura);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoestructuraLogic.getTipoEstructuras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEstructuras(String sAccionBusqueda,List<TipoEstructura> tipoestructurasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEstructura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEstructuraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEstructuraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEstructura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Estructuras");		
		parameters.put("busquedapor", TipoEstructuraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEstructura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEstructura=new JRBeanArrayDataSource(TipoEstructuraJInternalFrame.TraerTipoEstructuraBeans(tipoestructurasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEstructura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEstructuraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEstructuraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEstructuraBean.TraerTipoEstructuraBeans(tipoestructurasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEstructuras(sAccionBusqueda,sTipoArchivoReporte,tipoestructurasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEstructuras(sAccionBusqueda,sTipoArchivoReporte,tipoestructurasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEstructuraActionPerformed(null);
					//this.generarExcelReporteTipoEstructuras(sAccionBusqueda,sTipoArchivoReporte,tipoestructurasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEstructuras(sAccionBusqueda,sTipoArchivoReporte,tipoestructurasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEstructuras(sAccionBusqueda,sTipoArchivoReporte,tipoestructurasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEstructuras(sAccionBusqueda,sTipoArchivoReporte,tipoestructurasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstructura> tipoestructurasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstructuras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEstructura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEstructura tipoestructura : tipoestructurasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEstructuraConstantesFunciones.generarExcelReporteDataTipoEstructura("NORMAL",row,workbook,tipoestructura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEstructura(String sTipo,Row row,Workbook workbook) {
		
		TipoEstructuraConstantesFunciones.generarExcelReporteHeaderTipoEstructura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstructura> tipoestructurasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEstructura tipoestructura : tipoestructurasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEstructuraConstantesFunciones.getTipoEstructuraDescripcion(tipoestructura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEstructuraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoestructura.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEstructuraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoestructura.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstructura> tipoestructurasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEstructura> tipoestructurasRespaldo=null;
		
		classes=TipoEstructuraConstantesFunciones.getClassesRelationshipsOfTipoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoestructuraLogic.setDatosCliente(this.datosCliente);
		this.tipoestructuraLogic.setDatosDeep(this.datosDeep);
		this.tipoestructuraLogic.setIsConDeep(true);
		
		tipoestructurasRespaldo=this.tipoestructuraLogic.getTipoEstructuras();
		
		this.tipoestructuraLogic.setTipoEstructuras(tipoestructurasParaReportes);	
		this.tipoestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoestructurasParaReportes=this.tipoestructuraLogic.getTipoEstructuras();
		this.tipoestructuraLogic.setTipoEstructuras(tipoestructurasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEstructura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEstructura tipoestructura : tipoestructurasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEstructura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEstructuraConstantesFunciones.generarExcelReporteDataTipoEstructura("NORMAL",row,workbook,tipoestructura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoEstructuraConstantesFunciones.getTipoEstructuraDescripcion(tipoestructura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstructura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEstructura() throws Exception {		
		this.startProcessTipoEstructura(true);
	}
	
	public void startProcessTipoEstructura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoEstructura, this.jScrollPanelDatosTipoEstructura,this.jPanelPaginacionTipoEstructura, this.jScrollPanelDatosEdicionTipoEstructura, this.jPanelAccionesTipoEstructura,this.jPanelAccionesFormularioTipoEstructura,this.jmenuBarTipoEstructura,this.jmenuBarDetalleTipoEstructura,this.jTtoolBarTipoEstructura,this.jTtoolBarDetalleTipoEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEstructura=null; 
		
		final JPanel jPanelParametrosReportesTipoEstructura=this.jPanelParametrosReportesTipoEstructura;
		//final JScrollPane jScrollPanelDatosTipoEstructura=this.jScrollPanelDatosTipoEstructura;
		final JTable jTableDatosTipoEstructura=this.jTableDatosTipoEstructura;		
		final JPanel jPanelPaginacionTipoEstructura=this.jPanelPaginacionTipoEstructura;
		//final JScrollPane jScrollPanelDatosEdicionTipoEstructura=this.jScrollPanelDatosEdicionTipoEstructura;
		final JPanel jPanelAccionesTipoEstructura=this.jPanelAccionesTipoEstructura;
		
		JPanel jPanelCamposAuxiliarTipoEstructura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEstructura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			jPanelCamposAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jPanelCamposTipoEstructura;
			jPanelAccionesFormularioAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jPanelAccionesFormularioTipoEstructura;
		}
		
		final JPanel jPanelCamposTipoEstructura=jPanelCamposAuxiliarTipoEstructura;
		final JPanel jPanelAccionesFormularioTipoEstructura=jPanelAccionesFormularioAuxiliarTipoEstructura;
		
		
		final JMenuBar jmenuBarTipoEstructura=this.jmenuBarTipoEstructura;
		final JToolBar jTtoolBarTipoEstructura=this.jTtoolBarTipoEstructura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEstructura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			jmenuBarDetalleAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jmenuBarDetalleTipoEstructura;
			jTtoolBarDetalleAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jTtoolBarDetalleTipoEstructura;
		}
		
		final JMenuBar jmenuBarDetalleTipoEstructura=jmenuBarDetalleAuxiliarTipoEstructura;
		final JToolBar jTtoolBarDetalleTipoEstructura=jTtoolBarDetalleAuxiliarTipoEstructura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEstructura;
			processRunnable.jTableDatos=jTableDatosTipoEstructura;
			processRunnable.jPanelCampos=jPanelCamposTipoEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEstructura;
			processRunnable.jTtoolBar=jTtoolBarTipoEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEstructura ,jPanelParametrosReportesTipoEstructura,jTableDatosTipoEstructura, /*jScrollPanelDatosTipoEstructura,*/jPanelCamposTipoEstructura,jPanelPaginacionTipoEstructura, /*jScrollPanelDatosEdicionTipoEstructura,*/ jPanelAccionesTipoEstructura,jPanelAccionesFormularioTipoEstructura,jmenuBarTipoEstructura,jmenuBarDetalleTipoEstructura,jTtoolBarTipoEstructura,jTtoolBarDetalleTipoEstructura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoEstructura, jScrollPanelDatosTipoEstructura,jPanelPaginacionTipoEstructura, jScrollPanelDatosEdicionTipoEstructura, jPanelAccionesTipoEstructura,jPanelAccionesFormularioTipoEstructura,jmenuBarTipoEstructura,jmenuBarDetalleTipoEstructura,jTtoolBarTipoEstructura,jTtoolBarDetalleTipoEstructura);
						
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
	
	public void finishProcessTipoEstructura() {// throws Exception 
		this.finishProcessTipoEstructura(true);
	}
	
	public void finishProcessTipoEstructura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoEstructura, this.jScrollPanelDatosTipoEstructura,this.jPanelPaginacionTipoEstructura, this.jScrollPanelDatosEdicionTipoEstructura, this.jPanelAccionesTipoEstructura,this.jPanelAccionesFormularioTipoEstructura,this.jmenuBarTipoEstructura,this.jmenuBarDetalleTipoEstructura,this.jTtoolBarTipoEstructura,this.jTtoolBarDetalleTipoEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEstructura=null; 
		
		final JPanel jPanelParametrosReportesTipoEstructura=this.jPanelParametrosReportesTipoEstructura;
		//final JScrollPane jScrollPanelDatosTipoEstructura=this.jScrollPanelDatosTipoEstructura;
		final JTable jTableDatosTipoEstructura=this.jTableDatosTipoEstructura;		
		final JPanel jPanelPaginacionTipoEstructura=this.jPanelPaginacionTipoEstructura;
		//final JScrollPane jScrollPanelDatosEdicionTipoEstructura=this.jScrollPanelDatosEdicionTipoEstructura;
		final JPanel jPanelAccionesTipoEstructura=this.jPanelAccionesTipoEstructura;
		
		JPanel jPanelCamposAuxiliarTipoEstructura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEstructura=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			jPanelCamposAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jPanelCamposTipoEstructura;
			jPanelAccionesFormularioAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jPanelAccionesFormularioTipoEstructura;
		}
		
		final JPanel jPanelCamposTipoEstructura=jPanelCamposAuxiliarTipoEstructura;
		final JPanel jPanelAccionesFormularioTipoEstructura=jPanelAccionesFormularioAuxiliarTipoEstructura;
		
		
		final JMenuBar jmenuBarTipoEstructura=this.jmenuBarTipoEstructura;		
		final JToolBar jTtoolBarTipoEstructura=this.jTtoolBarTipoEstructura;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEstructura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			jmenuBarDetalleAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jmenuBarDetalleTipoEstructura;
			jTtoolBarDetalleAuxiliarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jTtoolBarDetalleTipoEstructura;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEstructura=jmenuBarDetalleAuxiliarTipoEstructura;
		final JToolBar jTtoolBarDetalleTipoEstructura=jTtoolBarDetalleAuxiliarTipoEstructura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEstructura;
			processRunnable.jTableDatos=jTableDatosTipoEstructura;
			processRunnable.jPanelCampos=jPanelCamposTipoEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEstructura;
			processRunnable.jTtoolBar=jTtoolBarTipoEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEstructura ,jPanelParametrosReportesTipoEstructura, jTableDatosTipoEstructura,/*jScrollPanelDatosTipoEstructura,*/jPanelCamposTipoEstructura,jPanelPaginacionTipoEstructura, /*jScrollPanelDatosEdicionTipoEstructura,*/ jPanelAccionesTipoEstructura,jPanelAccionesFormularioTipoEstructura,jmenuBarTipoEstructura,jmenuBarDetalleTipoEstructura,jTtoolBarTipoEstructura,jTtoolBarDetalleTipoEstructura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEstructura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEstructura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEstructura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEstructura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoestructuraConstantesFunciones.getsFinalQueryTipoEstructura();
		String  finalQueryPaginacionTodos=this.tipoestructuraConstantesFunciones.getsFinalQueryTipoEstructura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEstructuraConstantesFunciones.getArrayColumnasGlobalesNoTipoEstructura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEstructuraConstantesFunciones.getArrayColumnasGlobalesTipoEstructura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEstructuraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoestructurasEliminados= new ArrayList<TipoEstructura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEstructura();
		
				///*TipoEstructuraSessionBean*/this.tipoestructuraSessionBean=new TipoEstructuraSessionBean();
			
			if(this.tipoestructuraSessionBean==null) {
				this.tipoestructuraSessionBean=new TipoEstructuraSessionBean();
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
					this.iNumeroPaginacion=TipoEstructuraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEstructuraConstantesFunciones.getClassesForeignKeysOfTipoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoestructura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoestructurasAux= new ArrayList<TipoEstructura>();
			
				
			tipoestructuraLogic.setDatosCliente(this.datosCliente);
			tipoestructuraLogic.setDatosDeep(this.datosDeep);
			tipoestructuraLogic.setIsConDeep(true);
			
			
			tipoestructuraLogic.getTipoEstructuraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoestructuraLogic.getTodosTipoEstructuras(finalQueryGlobal,pagination);
					
					//tipoestructuraLogic.getTodosTipoEstructurasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoestructuraLogic.getTipoEstructuras()==null|| tipoestructuraLogic.getTipoEstructuras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestructurasAux= new ArrayList<TipoEstructura>();
							tipoestructurasAux.addAll(tipoestructuraLogic.getTipoEstructuras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestructurasAux= new ArrayList<TipoEstructura>();
							tipoestructurasAux.addAll(tipoestructuras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestructuraLogic.getTodosTipoEstructuras(finalQueryGlobal+"",this.pagination);												
							
							//tipoestructuraLogic.getTodosTipoEstructurasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEstructuras("Todos",tipoestructuraLogic.getTipoEstructuras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestructuraLogic.setTipoEstructuras(new ArrayList<TipoEstructura>());					
							tipoestructuraLogic.getTipoEstructuras().addAll(tipoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestructuras=new ArrayList<TipoEstructura>();
							tipoestructuras.addAll(tipoestructurasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEstructura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEstructura=this.idActual;
				
				} else if(this.idTipoEstructuraActual!=null && this.idTipoEstructuraActual!=0L) {
					idTipoEstructura=idTipoEstructuraActual;
				}
				
					
				this.sDetalleReporte=TipoEstructuraConstantesFunciones.getDetalleIndicePorId(idTipoEstructura);
				
				this.tipoestructuras=new ArrayList<TipoEstructura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoestructuraLogic.getEntity(idTipoEstructura);
					
					//tipoestructuraLogic.getEntityWithConnection(idTipoEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestructuraLogic.setTipoEstructuras(new ArrayList<TipoEstructura>());
					tipoestructuraLogic.getTipoEstructuras().add(tipoestructuraLogic.getTipoEstructura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestructuras=new ArrayList<TipoEstructura>();
					this.tipoestructuras.add(tipoestructura);
				}
				
				if(tipoestructuraLogic.getTipoEstructura()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEstructura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEstructura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoestructuraLogic.getTipoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestructuras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoestructuraLogic.getTipoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestructuras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEstructura tipoestructura) {
		Boolean permite=true;
		
		if(this.tipoestructura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEstructuraConstantesFunciones.getOrderByListaTipoEstructura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEstructuraConstantesFunciones.getOrderByListaTipoEstructura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstructura tipoestructura:tipoestructuraLogic.getTipoEstructuras()) {
				if(tipoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestructuraTotales=tipoestructura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstructura tipoestructura:this.tipoestructuras) {
				if(tipoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestructuraTotales=tipoestructura;
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
			this.tipoestructuraAux=new TipoEstructura();
			this.tipoestructuraAux.setsType(Constantes2.S_TOTALES);
			this.tipoestructuraAux.setIsNew(false);
			this.tipoestructuraAux.setIsChanged(false);
			this.tipoestructuraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEstructuraConstantesFunciones.TotalizarValoresFilaTipoEstructura(this.tipoestructuraLogic.getTipoEstructuras(),this.tipoestructuraAux);
				
				this.tipoestructuraLogic.getTipoEstructuras().add(this.tipoestructuraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEstructuraConstantesFunciones.TotalizarValoresFilaTipoEstructura(this.tipoestructuras,this.tipoestructuraAux);
				
				this.tipoestructuras.add(this.tipoestructuraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoestructuraTotales=new TipoEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoestructuraLogic.getTipoEstructuras().remove(tipoestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoestructuras.remove(tipoestructuraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoestructuraTotales=new TipoEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstructura tipoestructura:tipoestructuraLogic.getTipoEstructuras()) {
				if(tipoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestructuraTotales=tipoestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEstructuraConstantesFunciones.TotalizarValoresFilaTipoEstructura(this.tipoestructuraLogic.getTipoEstructuras(),tipoestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstructura tipoestructura:this.tipoestructuras) {
				if(tipoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestructuraTotales=tipoestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEstructuraConstantesFunciones.TotalizarValoresFilaTipoEstructura(this.tipoestructuras,tipoestructuraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoEstructura() {
		this.isPermisoTodoTipoEstructura=false;
		this.isPermisoNuevoTipoEstructura=false;
		this.isPermisoActualizarTipoEstructura=false;
		this.isPermisoActualizarOriginalTipoEstructura=false;
		this.isPermisoEliminarTipoEstructura=false;
		this.isPermisoGuardarCambiosTipoEstructura=false;
		this.isPermisoConsultaTipoEstructura=false;
		this.isPermisoBusquedaTipoEstructura=false;
		this.isPermisoReporteTipoEstructura=false;		
		this.isPermisoOrdenTipoEstructura=false;		
		this.isPermisoPaginacionMedioTipoEstructura=false;		
		this.isPermisoPaginacionAltoTipoEstructura=false;
		this.isPermisoPaginacionTodoTipoEstructura=false;
		this.isPermisoCopiarTipoEstructura=false;		
		this.isPermisoVerFormTipoEstructura=false;		
		this.isPermisoDuplicarTipoEstructura=false;		
		this.isPermisoOrdenTipoEstructura=false;		
	}
	
	public void setPermisosUsuarioTipoEstructura(Boolean isPermiso) {
		this.isPermisoTodoTipoEstructura=isPermiso;
		this.isPermisoNuevoTipoEstructura=isPermiso;
		this.isPermisoActualizarTipoEstructura=isPermiso;
		this.isPermisoActualizarOriginalTipoEstructura=isPermiso;
		this.isPermisoEliminarTipoEstructura=isPermiso;
		this.isPermisoGuardarCambiosTipoEstructura=isPermiso;
		this.isPermisoConsultaTipoEstructura=isPermiso;
		this.isPermisoBusquedaTipoEstructura=isPermiso;
		this.isPermisoReporteTipoEstructura=isPermiso;
		this.isPermisoOrdenTipoEstructura=isPermiso;		
		this.isPermisoPaginacionMedioTipoEstructura=isPermiso;		
		this.isPermisoPaginacionAltoTipoEstructura=isPermiso;		
		this.isPermisoPaginacionTodoTipoEstructura=isPermiso;		
		this.isPermisoCopiarTipoEstructura=isPermiso;		
		this.isPermisoVerFormTipoEstructura=isPermiso;		
		this.isPermisoDuplicarTipoEstructura=isPermiso;
		this.isPermisoOrdenTipoEstructura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEstructura(Boolean isPermiso) {
		//this.isPermisoTodoTipoEstructura=isPermiso;
		this.isPermisoNuevoTipoEstructura=isPermiso;
		this.isPermisoActualizarTipoEstructura=isPermiso;
		this.isPermisoActualizarOriginalTipoEstructura=isPermiso;
		this.isPermisoEliminarTipoEstructura=isPermiso;
		this.isPermisoGuardarCambiosTipoEstructura=isPermiso;
		//this.isPermisoConsultaTipoEstructura=isPermiso;
		//this.isPermisoBusquedaTipoEstructura=isPermiso;
		//this.isPermisoReporteTipoEstructura=isPermiso;
		//this.isPermisoOrdenTipoEstructura=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEstructura=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEstructura=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEstructura=isPermiso;		
		//this.isPermisoCopiarTipoEstructura=isPermiso;		
		//this.isPermisoDuplicarTipoEstructura=isPermiso;
		//this.isPermisoOrdenTipoEstructura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEstructuraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEstructura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEstructuraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEstructuraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEstructuraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEstructuraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoEstructura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEstructuraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEstructura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEstructura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEstructura=this.isPermisoActualizarTipoEstructura;
			this.isPermisoEliminarTipoEstructura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEstructura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEstructura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEstructura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEstructura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEstructura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEstructura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEstructura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEstructura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEstructura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEstructura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEstructura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEstructura.setToolTipText(this.jTableDatosTipoEstructura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEstructura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEstructura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEstructura() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoEstructuraListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEstructuraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEstructuraListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEstructura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoEstructura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEstructura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstructura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEstructura(TipoEstructura tipoestructura)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEstructura(TipoEstructura tipoestructura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEstructura()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstructura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEstructura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEstructura()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEstructura()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoEstructuraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEstructuraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEstructuraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoestructuraSessionBean=new TipoEstructuraSessionBean(); 
		this.tipoestructuraConstantesFunciones=new TipoEstructuraConstantesFunciones(); 
		this.tipoestructuraBean=new TipoEstructura();//(this.tipoestructuraConstantesFunciones); 		
		this.tipoestructuraReturnGeneral=new TipoEstructuraParameterReturnGeneral(); 
		
		this.tipoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEstructura(true);
			
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
			
			this.tipoestructuraConstantesFunciones=new TipoEstructuraConstantesFunciones(); 
			this.tipoestructuraBean=new TipoEstructura();//this.tipoestructuraConstantesFunciones); 			
			this.tipoestructuraReturnGeneral=new TipoEstructuraParameterReturnGeneral(); 
		
			TipoEstructuraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Estructura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoestructura=new TipoEstructura();
			this.tipoestructuras = new ArrayList<TipoEstructura>();
			this.tipoestructurasAux = new ArrayList<TipoEstructura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic=new TipoEstructuraLogic();
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEstructura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEstructura);	
					}
					
					if(this.jInternalFrameImportacionTipoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEstructura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEstructura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEstructura);
				this.jInternalFrameDetalleFormTipoEstructura.setVisible(false);
				this.jInternalFrameDetalleFormTipoEstructura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEstructura);
					this.jInternalFrameReporteDinamicoTipoEstructura.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEstructura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEstructura);
					this.jInternalFrameImportacionTipoEstructura.setVisible(false);
					this.jInternalFrameImportacionTipoEstructura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEstructura);
					this.jInternalFrameOrderByTipoEstructura.setVisible(false);
					this.jInternalFrameOrderByTipoEstructura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEstructuraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEstructuraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoestructuraReturnGeneral=new TipoEstructuraParameterReturnGeneral();
			
			this.tipoestructuraParameterGeneral=new TipoEstructuraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoestructuraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoestructuraSessionBean.getEsGuardarRelacionado(),this.tipoestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoestructuraSessionBean.getEsGuardarRelacionado(),this.tipoestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaDuplicarTipoEstructura=true;
			this.isVisibilidadCeldaCopiarTipoEstructura=true;
			this.isVisibilidadCeldaVerFormTipoEstructura=true;
			this.isVisibilidadCeldaOrdenTipoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
			this.isVisibilidadCeldaModificarTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=false;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=false;
			this.isVisibilidadCeldaGuardarTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEstructura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEstructura(false);
			
			this.setPermisosUsuarioTipoEstructura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoestructuraSessionBean.getEsGuardarRelacionado() && this.tipoestructuraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEstructuraClasesRelacionadas();
			}
			
			if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEstructuraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEstructura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEstructura();
			}
			
			if(!this.isPermisoBusquedaTipoEstructura) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEstructura,this.isPermisoPaginacionMedioTipoEstructura,this.isPermisoPaginacionTodoTipoEstructura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEstructuraConstantesFunciones.getTiposSeleccionarTipoEstructura());
				
				this.tiposColumnasSelect=TipoEstructuraConstantesFunciones.getTiposSeleccionarTipoEstructura(true);
				
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
			//if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEstructura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoEstructura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoEstructura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstructura() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoestructuraImplementable= (TipoEstructuraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoestructuraImplementableHome= (TipoEstructuraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoestructuras= new ArrayList<TipoEstructura>();
			this.tipoestructurasEliminados= new ArrayList<TipoEstructura>();
						
			this.isEsNuevoTipoEstructura=false;
			this.esParaAccionDesdeFormularioTipoEstructura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEstructura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEstructura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEstructuraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEstructura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEstructura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEstructura();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEstructura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEstructura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEstructura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEstructura")) {
				iIndex=this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEstructura();	
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
	
	public void cargarCombosForeignKeyTipoEstructura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEstructura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEstructuraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEstructura();
		
		this.cargarCombosFrameForeignKeyTipoEstructura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEstructura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEstructura();
		}
	}
	
	
	
	public void jButtonNuevoTipoEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			
			if(jTableDatosTipoEstructura.getRowCount()>=1) {
				jTableDatosTipoEstructura.removeRowSelectionInterval(0, jTableDatosTipoEstructura.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEstructura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEstructura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEstructura(true);			
			//this.tipoestructura=new TipoEstructura();
			//this.tipoestructura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstructura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstructura() ;
			
			if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstructura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoestructura);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);				
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEstructura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEstructura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEstructura.getSelectedRows().length;			
			}
			
			tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEstructura--;			
				//TipoEstructura tipoestructuraAux= new TipoEstructura();			
				//tipoestructuraAux.setId(this.iIdNuevoTipoEstructura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEstructura tipoestructuraOrigen=new TipoEstructura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEstructura tipoestructuraOrigen : tipoestructurasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoestructuraOrigen =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestructuraOrigen =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEstructura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoestructura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEstructura(tipoestructuraOrigen,this.tipoestructura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoestructuraLogic.getTipoEstructuras().add(this.tipoestructuraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoestructuras.add(this.tipoestructuraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEstructura(false);
				
				this.jTableDatosTipoEstructura.setRowSelectionInterval(this.getIndiceNuevoTipoEstructura(), this.getIndiceNuevoTipoEstructura());
				
				int iLastRow =  this.jTableDatosTipoEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstructura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();									
		
			TipoEstructura tipoestructuraOrigen=new TipoEstructura();
			TipoEstructura tipoestructuraDestino=new TipoEstructura();
				
			tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEstructura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoestructurasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEstructura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestructuraOrigen =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoestructuraOrigen =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestructuraDestino =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoestructuraDestino =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoestructuraOrigen =tipoestructurasSeleccionados.get(0);
				tipoestructuraDestino =tipoestructurasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEstructura(tipoestructuraOrigen,tipoestructuraDestino,true,false);
				
				tipoestructuraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoestructuraDestino,tipoestructuraLogic.getTipoEstructuras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestructuraDestino,tipoestructuras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEstructura(false);
				
				//this.jTableDatosTipoEstructura.setRowSelectionInterval(this.getIndiceNuevoTipoEstructura(), this.getIndiceNuevoTipoEstructura());
				
				int iLastRow =  this.jTableDatosTipoEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstructura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEstructura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEstructura.isVisible();
			
			
			this.jPanelParametrosReportesTipoEstructura.setVisible(!isVisible);
			this.jPanelPaginacionTipoEstructura.setVisible(!isVisible);
			this.jPanelAccionesTipoEstructura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEstructura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEstructura();
			
			this.abrirFrameOrderByTipoEstructura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEstructura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEstructura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEstructura.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEstructura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEstructura.setSize(this.jInternalFrameDetalleFormTipoEstructura.iWidthFormulario,this.jInternalFrameDetalleFormTipoEstructura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEstructura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEstructura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEstructura.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEstructura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEstructura.jContentPaneDetalleTipoEstructura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEstructura.jContentPaneDetalleTipoEstructura.getWidth(),TipoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEstructura.jContentPaneDetalleTipoEstructura.getWidth(),TipoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEstructura.jContentPaneDetalleTipoEstructura.getWidth(),TipoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEstructura.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEstructura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEstructura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstructura,false,this);
				} else {
					this.jInternalFrameOrderByTipoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstructura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEstructura);
				this.jInternalFrameOrderByTipoEstructura.setVisible(false);
				this.jInternalFrameOrderByTipoEstructura.setSelected(false);
				
				this.jInternalFrameOrderByTipoEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEstructura"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEstructura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEstructura==null) {
				
				this.jInternalFrameImportacionTipoEstructura=new ImportacionJInternalFrame(TipoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEstructura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEstructura);
				this.jInternalFrameImportacionTipoEstructura.setVisible(false);
				this.jInternalFrameImportacionTipoEstructura.setSelected(false);


				this.jInternalFrameImportacionTipoEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEstructura"));
				this.jInternalFrameImportacionTipoEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEstructura"));
				this.jInternalFrameImportacionTipoEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEstructura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEstructura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEstructura==null) {
				this.jInternalFrameReporteDinamicoTipoEstructura=new ReporteDinamicoJInternalFrame(TipoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEstructura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEstructura);
				this.jInternalFrameReporteDinamicoTipoEstructura.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEstructura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstructura"));
				this.jInternalFrameReporteDinamicoTipoEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstructura"));
				this.jInternalFrameReporteDinamicoTipoEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstructura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstructura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoEstructura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEstructura);
			
	       	this.jInternalFrameDetalleFormTipoEstructura.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEstructura.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEstructura.dispose();
			//this.jInternalFrameDetalleFormTipoEstructura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEstructura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEstructura.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEstructura.setVisible(true);
	        this.jInternalFrameImportacionTipoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEstructura.setVisible(true);
	        this.jInternalFrameOrderByTipoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEstructura.setVisible(false);
	        this.jInternalFrameOrderByTipoEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEstructura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEstructura.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEstructura.setVisible(false);
	        this.jInternalFrameImportacionTipoEstructura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEstructura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEstructura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEstructura(true);
			//this.isEsNuevoTipoEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstructura(false) ;
			
			if(tipoestructuraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstructura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEstructuraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEstructura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEstructura(true);
			//this.isEsNuevoTipoEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoestructura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEstructura(false) ;
			
			if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstructura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEstructura(false);
			
			//if(!this.isEsNuevoTipoEstructura) {								
				int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
				
			}
			
			if(this.permiteMantenimiento(this.tipoestructura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEstructura=true;
					this.inicializarActualizarBindingTablaTipoEstructura(false);
					this.isEsNuevoTipoEstructura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEstructura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEstructura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstructura(false);
				
				this.habilitarDeshabilitarControlesTipoEstructura(false);
			
												
				
				if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEstructura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEstructuraActionPerformed(evt,tipoestructuraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEstructura(this.tipoestructura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEstructura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoestructuraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoestructura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				this.tipoestructura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				this.tipoestructura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoestructura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEstructuraModel) this.jTableDatosTipoEstructura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEstructura=true;
				this.inicializarActualizarBindingTablaTipoEstructura(false);
				this.isEsNuevoTipoEstructura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstructura(false);
				
				this.habilitarDeshabilitarControlesTipoEstructura(false);
				
				
				
				if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEstructura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEstructura.getRowCount()>=1) {
				jTableDatosTipoEstructura.removeRowSelectionInterval(0, jTableDatosTipoEstructura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEstructura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEstructura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstructura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstructura(false) ;
			
			this.isEsNuevoTipoEstructura=false;
			
			if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEstructura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEstructura(false);
				
				//SI ES MANUAL
				if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEstructura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEstructura--;			
			//TipoEstructura tipoestructuraAux= new TipoEstructura();			
			//tipoestructuraAux.setId(this.iIdNuevoTipoEstructura);
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEstructura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
			
			this.tipoestructura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoestructuraLogic.getTipoEstructuras().add(this.tipoestructuraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoestructuras.add(this.tipoestructuraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEstructura(false);
			
			this.jTableDatosTipoEstructura.setRowSelectionInterval(this.getIndiceNuevoTipoEstructura(), this.getIndiceNuevoTipoEstructura());
			
			int iLastRow =  this.jTableDatosTipoEstructura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEstructura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEstructura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEstructura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEstructura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstructura(false);
			
			//SI ES MANUAL
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstructura();
			}
			
			//this.abrirFrameTreeTipoEstructura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo EstructuraS ?", "MANTENIMIENTO DE Tipo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEstructura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEstructura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoestructuraReturnGeneral=tipoestructuraLogic.procesarImportacionTipoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoestructuraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEstructuraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEstructura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEstructura.setFileImportacion(this.jInternalFrameImportacionTipoEstructura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEstructura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEstructura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEstructura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEstructura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		

		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEstructuraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEstructuraBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEstructuraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEstructuraConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoEstructura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEstructuraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoEstructuraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEstructuraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoEstructuraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEstructuraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoEstructuraConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEstructuraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoEstructura tipoestructura:tipoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoestructura.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEstructuraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEstructura tipoestructura:tipoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoestructura.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEstructura(row);				
			//	iRow++;
			//}				
			
			//for(TipoEstructura tipoestructuraAux:tipoestructurasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEstructura(tipoestructuraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstructura(false);
			
			//SI ES MANUAL
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstructura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstructura(false);
			
			//SI ES MANUAL
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEstructura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstructura(false);
			
			//SI ES MANUAL
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEstructura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEstructura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEstructura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEstructura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEstructura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEstructura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEstructura.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEstructura.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEstructura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEstructura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEstructura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEstructura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEstructura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEstructura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEstructura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstructura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEstructura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEstructura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEstructura();
		
		this.inicializarActualizarBindingBotonesManualTipoEstructura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEstructura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstructura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstructura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstructura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEstructura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEstructura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEstructura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEstructura.jCheckBoxPostAccionNuevoTipoEstructura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEstructura.jCheckBoxPostAccionSinCerrarTipoEstructura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEstructura.jCheckBoxPostAccionSinMensajeTipoEstructura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEstructura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEstructura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEstructura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
				this.jInternalFrameDetalleFormTipoEstructura.jCheckBoxPostAccionNuevoTipoEstructura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEstructura.jCheckBoxPostAccionSinCerrarTipoEstructura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEstructura.jCheckBoxPostAccionSinMensajeTipoEstructura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEstructura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEstructura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEstructura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEstructura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEstructura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEstructura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEstructura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEstructura(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstructura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstructura() throws Exception {
		try	{
			if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEstructura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEstructura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEstructura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEstructura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEstructura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEstructura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEstructura.addItem(reporte);
			}
			
			
			if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEstructura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEstructura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstructura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstructura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
				this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
				this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEstructura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEstructura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEstructura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEstructura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEstructura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEstructura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEstructura(Boolean esInicializar) throws Exception {				
		if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEstructura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEstructura() throws Exception {
		this.inicializarActualizarBindingTablaTipoEstructura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEstructura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEstructuraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructuraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEstructura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoestructuraLogic.getTipoEstructuras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoestructuras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEstructura.setModel(new TipoEstructuraModel(this.tipoestructuraLogic.getTipoEstructuras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEstructura.setModel(new TipoEstructuraModel(this.tipoestructuras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEstructura!=null && this.jInternalFrameOrderByTipoEstructura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEstructura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO,tipoestructuraConstantesFunciones.resaltarSeleccionarTipoEstructura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO,tipoestructuraConstantesFunciones.resaltarSeleccionarTipoEstructura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructura,TipoEstructuraConstantesFunciones.LABEL_ID));

		if(this.tipoestructuraConstantesFunciones.mostraridTipoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstructuraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoestructuraConstantesFunciones.resaltaridTipoEstructura,this.tipoestructuraConstantesFunciones.activaridTipoEstructura,this,true,"idTipoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestructuraConstantesFunciones.resaltaridTipoEstructura,this.tipoestructuraConstantesFunciones.activaridTipoEstructura,this,true,"idTipoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructura,TipoEstructuraConstantesFunciones.LABEL_CODIGO));

		if(this.tipoestructuraConstantesFunciones.mostrarcodigoTipoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstructuraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoestructuraConstantesFunciones.resaltarcodigoTipoEstructura,this.tipoestructuraConstantesFunciones.activarcodigoTipoEstructura,this,true,"codigoTipoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestructuraConstantesFunciones.resaltarcodigoTipoEstructura,this.tipoestructuraConstantesFunciones.activarcodigoTipoEstructura,this,true,"codigoTipoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructura,TipoEstructuraConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoestructuraConstantesFunciones.mostrarnombreTipoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstructuraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoestructuraConstantesFunciones.resaltarnombreTipoEstructura,this.tipoestructuraConstantesFunciones.activarnombreTipoEstructura,this,true,"nombreTipoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestructuraConstantesFunciones.resaltarnombreTipoEstructura,this.tipoestructuraConstantesFunciones.activarnombreTipoEstructura,this,true,"nombreTipoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoestructuraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoestructuraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEstructura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoestructuraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoestructuraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEstructura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoestructuraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoestructuraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEstructura.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEstructura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEstructura.moveColumn(this.jTableDatosTipoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEstructura.moveColumn(this.jTableDatosTipoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEstructura.moveColumn(this.jTableDatosTipoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEstructura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEstructura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEstructura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEstructura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEstructura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEstructura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEstructura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEstructura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoestructuraLogic.getTipoEstructuras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoestructuras.size()-1;
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
		//this.jTableDatosTipoEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEstructura();
			
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
				
				//this.isEsNuevoTipoEstructura=false;
					
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
				if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEstructura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEstructura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoestructura.getsType().equals("DUPLICADO")
				   || this.tipoestructura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEstructura=true;
				
				} else {
					this.isEsNuevoTipoEstructura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoestructura.getId()>=0 && !this.tipoestructura.getIsNew()) {						
						this.isEsNuevoTipoEstructura=false;
						
					} else {
						this.isEsNuevoTipoEstructura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEstructura(esRelaciones);						
				
				this.seleccionarTipoEstructura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoestructura.getId()<0) {
					this.isEsNuevoTipoEstructura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEstructura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEstructura(evt,rowIndex);
				}	
				
				if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEstructura: " + this.dDif); 
					}
				}								
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEstructura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoestructura)) {
					if(this.tipoestructura.getId()>0) {
						this.tipoestructura.setIsDeleted(true);
						
						this.tipoestructurasEliminados.add(this.tipoestructura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoestructuraLogic.getTipoEstructuras().remove(this.tipoestructura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoestructuras.remove(this.tipoestructura);				
					}
					
					
					((TipoEstructuraModel) this.jTableDatosTipoEstructura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstructura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEstructura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEstructura) {
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEstructura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEstructura(this.tipoestructura);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEstructura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEstructura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstructura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEstructura(TipoEstructura tipoestructura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEstructura(tipoestructura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEstructura(TipoEstructura tipoestructura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEstructura(tipoestructura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEstructura(tipoestructura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEstructura(tipoestructura);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEstructura(TipoEstructura tipoestructura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setText(tipoestructura.getId().toString());
			this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setText(tipoestructura.getcodigo());
			this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setText(tipoestructura.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEstructura tipoestructuraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoestructuraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEstructura tipoestructuraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoestructuraLocal=this.tipoestructura;
			} else {
				tipoestructuraLocal=this.tipoestructuraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoestructuraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEstructura(tipoestructuraLocal,true);
					
					if(tipoestructuraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoestructuraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoestructuraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEstructura(TipoEstructura tipoestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEstructura(tipoestructura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(tipoestructura);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEstructura(TipoEstructura tipoestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEstructura(tipoestructura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEstructura(TipoEstructura tipoestructura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.getText()==null || this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.getText()=="" || this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setText("0");
			}

			if(conColumnasBase) {tipoestructura.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstructuraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstructura.jLabelIdTipoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoestructura.setcodigo(this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstructuraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstructura.jLabelcodigoTipoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoestructura.setnombre(this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstructuraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstructura.jLabelnombreTipoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEstructura(TipoEstructura tipoestructuraBean,TipoEstructura tipoestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEstructura(TipoEstructura tipoestructuraOrigen,TipoEstructura tipoestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoestructuraOrigen.getId()!=null && !tipoestructuraOrigen.getId().equals(0L))) {tipoestructura.setId(tipoestructuraOrigen.getId());}}
			if(conDefault || (!conDefault && tipoestructuraOrigen.getcodigo()!=null && !tipoestructuraOrigen.getcodigo().equals(""))) {tipoestructura.setcodigo(tipoestructuraOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoestructuraOrigen.getnombre()!=null && !tipoestructuraOrigen.getnombre().equals(""))) {tipoestructura.setnombre(tipoestructuraOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEstructura(TipoEstructura tipoestructura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setText(tipoestructura.getId().toString());
			this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setText(tipoestructura.getcodigo());
			this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setText(tipoestructura.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEstructura(TipoEstructuraBean tipoestructuraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setText(tipoestructuraBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setText(tipoestructuraBean.getcodigo());
			this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setText(tipoestructuraBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEstructura(TipoEstructuraParameterReturnGeneral tipoestructuraReturnGeneral,TipoEstructuraBean tipoestructuraBean,Boolean conDefault) throws Exception { 
		try {
			TipoEstructura tipoestructuraLocal=new TipoEstructura();
			
			tipoestructuraLocal=tipoestructuraReturnGeneral.getTipoEstructura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoestructuraLocal.getId()!=null && !tipoestructuraLocal.getId().equals(0L))) {tipoestructuraBean.setId(tipoestructuraLocal.getId());}}
			if(conDefault || (!conDefault && tipoestructuraLocal.getcodigo()!=null && !tipoestructuraLocal.getcodigo().equals(""))) {tipoestructuraBean.setcodigo(tipoestructuraLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoestructuraLocal.getnombre()!=null && !tipoestructuraLocal.getnombre().equals(""))) {tipoestructuraBean.setnombre(tipoestructuraLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEstructuraGenerico(Long idTipoEstructuraSeleccionado,JComboBox jComboBoxTipoEstructura,List<TipoEstructura> tipoestructurasLocal)throws Exception {
		try {
			TipoEstructura  tipoestructuraTemp=null;

			for(TipoEstructura tipoestructuraAux:tipoestructurasLocal) {
				if(tipoestructuraAux.getId()!=null && tipoestructuraAux.getId().equals(idTipoEstructuraSeleccionado)) {
					tipoestructuraTemp=tipoestructuraAux;
					break;
				}
			}

			jComboBoxTipoEstructura.setSelectedItem(tipoestructuraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEstructuraGenerico(JComboBox jComboBoxTipoEstructura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEstructura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEstructura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestructura=(TipoEstructura) tipoestructuraLogic.getTipoEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoestructura =(TipoEstructura) tipoestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEstructura tipoestructuraRow=new TipoEstructura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestructuraRow=(TipoEstructura) tipoestructuraLogic.getTipoEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoestructuraRow=(TipoEstructura) tipoestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEstructura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoTipoEstructura && this.isPermisoNuevoTipoEstructura));			
			this.jButtonDuplicarTipoEstructura.setVisible((this.isVisibilidadCeldaDuplicarTipoEstructura && this.isPermisoDuplicarTipoEstructura));			
			this.jButtonCopiarTipoEstructura.setVisible((this.isVisibilidadCeldaCopiarTipoEstructura && this.isPermisoCopiarTipoEstructura));
			this.jButtonVerFormTipoEstructura.setVisible((this.isVisibilidadCeldaVerFormTipoEstructura && this.isPermisoVerFormTipoEstructura));
			
			this.jButtonAbrirOrderByTipoEstructura.setVisible((this.isVisibilidadCeldaOrdenTipoEstructura && this.isPermisoOrdenTipoEstructura));			
			
			this.jButtonNuevoRelacionesTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstructura && this.isPermisoNuevoTipoEstructura));			
			this.jButtonNuevoGuardarCambiosTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoTipoEstructura && this.isPermisoNuevoTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarTipoEstructura.setVisible((this.isVisibilidadCeldaModificarTipoEstructura && this.isPermisoActualizarTipoEstructura));	
			this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarTipoEstructura.setVisible((this.isVisibilidadCeldaActualizarTipoEstructura && this.isPermisoActualizarTipoEstructura));	
			this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarTipoEstructura.setVisible((this.isVisibilidadCeldaEliminarTipoEstructura && this.isPermisoEliminarTipoEstructura));
			this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarTipoEstructura.setVisible(this.isVisibilidadCeldaCancelarTipoEstructura);							
			this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoTipoEstructura && this.isPermisoNuevoTipoEstructura));						
			this.jButtonDuplicarToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaDuplicarTipoEstructura && this.isPermisoDuplicarTipoEstructura));						
			this.jButtonCopiarToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaCopiarTipoEstructura && this.isPermisoCopiarTipoEstructura));			
			this.jButtonVerFormToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaVerFormTipoEstructura && this.isPermisoVerFormTipoEstructura));			
			this.jButtonAbrirOrderByToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaOrdenTipoEstructura && this.isPermisoOrdenTipoEstructura));
			this.jButtonNuevoRelacionesToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstructura && this.isPermisoNuevoTipoEstructura));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoTipoEstructura && this.isPermisoNuevoTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));			
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaModificarTipoEstructura && this.isPermisoActualizarTipoEstructura));	
			this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaActualizarTipoEstructura  && this.isPermisoActualizarTipoEstructura));	
			this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaEliminarTipoEstructura && this.isPermisoEliminarTipoEstructura));
			this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarToolBarTipoEstructura.setVisible(this.isVisibilidadCeldaCancelarTipoEstructura);				
			this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoTipoEstructura && this.isPermisoNuevoTipoEstructura));			
			this.jMenuItemDuplicarTipoEstructura.setVisible((this.isVisibilidadCeldaDuplicarTipoEstructura && this.isPermisoDuplicarTipoEstructura));			
			this.jMenuItemCopiarTipoEstructura.setVisible((this.isVisibilidadCeldaCopiarTipoEstructura && this.isPermisoCopiarTipoEstructura));			
			this.jMenuItemVerFormTipoEstructura.setVisible((this.isVisibilidadCeldaVerFormTipoEstructura && this.isPermisoVerFormTipoEstructura));			
			this.jMenuItemAbrirOrderByTipoEstructura.setVisible((this.isVisibilidadCeldaOrdenTipoEstructura && this.isPermisoOrdenTipoEstructura));			
			//this.jMenuItemMostrarOcultarTipoEstructura.setVisible((this.isVisibilidadCeldaOrdenTipoEstructura && this.isPermisoOrdenTipoEstructura));
			this.jMenuItemDetalleAbrirOrderByTipoEstructura.setVisible((this.isVisibilidadCeldaOrdenTipoEstructura && this.isPermisoOrdenTipoEstructura));			
			//this.jMenuItemDetalleMostrarOcultarTipoEstructura.setVisible((this.isVisibilidadCeldaOrdenTipoEstructura && this.isPermisoOrdenTipoEstructura));			
			this.jMenuItemNuevoRelacionesTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstructura && this.isPermisoNuevoTipoEstructura));			
			this.jMenuItemNuevoGuardarCambiosTipoEstructura.setVisible((this.isVisibilidadCeldaNuevoTipoEstructura && this.isPermisoNuevoTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));									
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemModificarTipoEstructura.setVisible((this.isVisibilidadCeldaModificarTipoEstructura && this.isPermisoActualizarTipoEstructura));	
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemActualizarTipoEstructura.setVisible((this.isVisibilidadCeldaActualizarTipoEstructura && this.isPermisoActualizarTipoEstructura));	
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemEliminarTipoEstructura.setVisible((this.isVisibilidadCeldaEliminarTipoEstructura && this.isPermisoEliminarTipoEstructura));
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemCancelarTipoEstructura.setVisible(this.isVisibilidadCeldaCancelarTipoEstructura);				
			}
			
			this.jMenuItemGuardarCambiosTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));						
			this.jMenuItemGuardarCambiosTablaTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEstructura=this.jButtonNuevoTipoEstructura.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEstructura=this.jButtonDuplicarTipoEstructura.isVisible();
			this.isVisibilidadCeldaCopiarTipoEstructura=this.jButtonCopiarTipoEstructura.isVisible();
			this.isVisibilidadCeldaVerFormTipoEstructura=this.jButtonVerFormTipoEstructura.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEstructura=this.jButtonAbrirOrderByTipoEstructura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=this.jButtonNuevoRelacionesTipoEstructura.isVisible();
			this.isVisibilidadCeldaModificarTipoEstructura=this.jButtonModificarTipoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.isVisibilidadCeldaActualizarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarTipoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarTipoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarTipoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=this.jButtonGuardarCambiosTablaTipoEstructura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEstructura=this.jButtonNuevoToolBarTipoEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=this.jButtonNuevoRelacionesToolBarTipoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.isVisibilidadCeldaModificarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarToolBarTipoEstructura.isVisible();
			this.isVisibilidadCeldaActualizarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarToolBarTipoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarToolBarTipoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarToolBarTipoEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEstructura=this.jButtonGuardarCambiosToolBarTipoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=this.jButtonGuardarCambiosTablaToolBarTipoEstructura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEstructura=this.jMenuItemNuevoTipoEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=this.jMenuItemNuevoRelacionesTipoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.isVisibilidadCeldaModificarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jMenuItemModificarTipoEstructura.isVisible();
			this.isVisibilidadCeldaActualizarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jMenuItemActualizarTipoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jMenuItemEliminarTipoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstructura=this.jInternalFrameDetalleFormTipoEstructura.jMenuItemCancelarTipoEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEstructura=this.jMenuItemGuardarCambiosTipoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=this.jMenuItemGuardarCambiosTablaTipoEstructura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEstructura(Boolean esInicializar) {
		if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEstructura();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEstructura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEstructura() {
		this.jButtonNuevoTipoEstructura.setVisible(this.isPermisoNuevoTipoEstructura);			
		this.jButtonDuplicarTipoEstructura.setVisible(this.isPermisoDuplicarTipoEstructura);			
		this.jButtonCopiarTipoEstructura.setVisible(this.isPermisoCopiarTipoEstructura);			
		this.jButtonVerFormTipoEstructura.setVisible(this.isPermisoVerFormTipoEstructura);			
		
		this.jButtonAbrirOrderByTipoEstructura.setVisible(this.isPermisoOrdenTipoEstructura);					
		
		this.jButtonNuevoRelacionesTipoEstructura.setVisible(this.isPermisoNuevoTipoEstructura);			
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarTipoEstructura.setVisible(this.isPermisoActualizarTipoEstructura);	
			this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarTipoEstructura.setVisible(this.isPermisoActualizarTipoEstructura);	
			this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarTipoEstructura.setVisible(this.isPermisoEliminarTipoEstructura);
			this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarTipoEstructura.setVisible(this.isVisibilidadCeldaCancelarTipoEstructura);						
			this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.setVisible(this.isPermisoGuardarCambiosTipoEstructura);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEstructura.setVisible(this.isPermisoActualizarTipoEstructura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEstructura() {
		this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarTipoEstructura.setVisible(this.isPermisoActualizarTipoEstructura);	
		this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarTipoEstructura.setVisible(this.isPermisoActualizarTipoEstructura);	
		this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarTipoEstructura.setVisible(this.isPermisoEliminarTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarTipoEstructura.setVisible(this.isVisibilidadCeldaCancelarTipoEstructura);							
		this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.setVisible((this.isVisibilidadCeldaGuardarTipoEstructura && this.isPermisoGuardarCambiosTipoEstructura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEstructura() {
		if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEstructura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEstructura() {
	}
	
	public void jTableDatosTipoEstructuraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEstructura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstructura(this.gettipoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestructura==null) {
						this.tipoestructura = new TipoEstructura();
					}

					this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
				}

				if(this.tipoestructura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoestructura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstructura(this.gettipoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestructura==null) {
						this.tipoestructura = new TipoEstructura();
					}

					this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
				}

				if(this.tipoestructura.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoestructura.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstructura(this.gettipoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestructura==null) {
						this.tipoestructura = new TipoEstructura();
					}

					this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);
				}

				if(this.tipoestructura.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoestructura.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoEstructura() {
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
			this.jInternalFrameDetalleFormTipoEstructura.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEstructura.dispose();
			this.jInternalFrameDetalleFormTipoEstructura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
			this.jInternalFrameReporteDinamicoTipoEstructura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEstructura.dispose();
			this.jInternalFrameReporteDinamicoTipoEstructura=null;
		}
		
		if(this.jInternalFrameImportacionTipoEstructura!=null) {
			this.jInternalFrameImportacionTipoEstructura.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEstructura.dispose();
			this.jInternalFrameImportacionTipoEstructura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEstructura();
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEstructura")) {
				jButtonDuplicarTipoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEstructura")) {
				jButtonCopiarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEstructura")) {
				jButtonVerFormTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEstructura")) {
				jButtonDuplicarTipoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEstructura")) {
				jButtonDuplicarTipoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEstructura")) {
				jButtonModificarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEstructura")) {
				jButtonModificarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEstructura")) {
				jButtonModificarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEstructura")) {
				jButtonActualizarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEstructura")) {
				jButtonActualizarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEstructura")) {
				jButtonActualizarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEstructura")) {
				jButtonEliminarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEstructura")) {
				jButtonEliminarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEstructura")) {
				jButtonEliminarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEstructura")) {
				jButtonCancelarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEstructura")) {
				jButtonCancelarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEstructura")) {
				jButtonCancelarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEstructura")) {
				jButtonCerrarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEstructura")) {
				jButtonCerrarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEstructura")) {
				jButtonCerrarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEstructura")) {
				jButtonMostrarOcultarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEstructura")) {
				jButtonCancelarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEstructura")) {
				jButtonCopiarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEstructura")) {
				jButtonVerFormTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEstructura")) {
				jButtonCopiarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEstructura")) {
				jButtonVerFormTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEstructura")) {
				jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEstructura")) {
				jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEstructura")) {
				jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEstructura")) {
				jButtonAnterioresTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEstructura")) {
				jButtonAnterioresTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEstructura")) {
				jButtonAnterioresTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEstructura")) {
				jButtonSiguientesTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEstructura")) {
				jButtonSiguientesTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEstructura")) {
				jButtonSiguientesTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEstructura") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEstructura")) {
				jButtonAbrirOrderByTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEstructura") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEstructura")) {
				jButtonMostrarOcultarTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEstructura")) {
				jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEstructura")) {
				jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEstructura")) {
				jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEstructura")) {
				jButtonCerrarReporteDinamicoTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEstructura")) {
				jButtonGenerarReporteDinamicoTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEstructura")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEstructura")) {
				jButtonCerrarImportacionTipoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEstructura")) {
				
				jButtonGenerarImportacionTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEstructura")) {
				
				jButtonAbrirImportacionTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEstructura")) {
				jComboBoxTiposAccionesTipoEstructuraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEstructura")) {
				jComboBoxTiposRelacionesTipoEstructuraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEstructura")) {
				jComboBoxTiposAccionesTipoEstructuraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEstructura")) {
				
				jComboBoxTiposSeleccionarTipoEstructuraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEstructura")) {
				jTextFieldValorCampoGeneralTipoEstructuraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEstructura")) {
				jButtonAbrirOrderByTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEstructura")) {
				jButtonAbrirOrderByTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEstructura")) {
				jButtonCerrarOrderByTipoEstructuraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEstructuraBusqueda")) {
				this.jButtonidTipoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEstructuraBusqueda")) {
				this.jButtoncodigoTipoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEstructuraBusqueda")) {
				this.jButtonnombreTipoEstructuraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEstructura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEstructura tipoestructuraLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoestructuraLocal=this.tipoestructura;
			} else {
				tipoestructuraLocal=this.tipoestructuraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
							
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
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
			
			


			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
								
						
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
								
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
							
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
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
			
			


			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
								
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEstructura")) {
					jCheckBoxSeleccionarTodosTipoEstructuraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEstructura")) {
					jCheckBoxSeleccionadosTipoEstructuraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEstructura")) {
					
				}
				
				


				
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
												
				
				


				
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
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
			
			


			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestructura);
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
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
				
				


				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstructura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestructuraAnterior =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEstructura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEstructura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoestructura =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoestructura =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoestructura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEstructura")) {
				
				}
				
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEstructura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEstructura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEstructura")) {
			
			}
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEstructura();
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEstructura")) {
				jButtonDuplicarTipoEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEstructura")) {
				jButtonCopiarTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEstructura")) {
				jButtonVerFormTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEstructura")) {
				jButtonNuevoTipoEstructuraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEstructura")) {
				jButtonModificarTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEstructura")) {
				jButtonActualizarTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEstructura")) {
				jButtonEliminarTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEstructura")) {
				jButtonCancelarTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEstructura")) {
				jButtonCerrarTipoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEstructura")) {
				jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEstructura")) {
				jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEstructura")) {
				jButtonAbrirOrderByTipoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEstructura")) {
				jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEstructura")) {
				jButtonAnterioresTipoEstructuraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEstructura")) {
				jButtonSiguientesTipoEstructuraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEstructuraBusqueda")) {
				this.jButtonidTipoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEstructuraBusqueda")) {
				this.jButtoncodigoTipoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEstructuraBusqueda")) {
				this.jButtonnombreTipoEstructuraBusquedaActionPerformed(evt);
			}
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEstructura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEstructura")) {
				closingInternalFrameTipoEstructura();
				
			} else if(sTipo.equals("jButtonCancelarTipoEstructura")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEstructura = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEstructuraBeanSwingJInternalFrame jInternalFrameParent=(TipoEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEstructura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEstructuraActionPerformed(null);
			}
			
			TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoestructura,new Object(),this.tipoestructuraParameterGeneral,this.tipoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoestructura)) {
			if(!esControlTabla) {
				if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);			
				}
				
				if(this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEstructura(this.tipoestructura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoestructuraReturnGeneral=tipoestructuraLogic.procesarEventosTipoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestructuraLogic.getTipoEstructuras(),this.tipoestructura,this.tipoestructuraParameterGeneral,this.isEsNuevoTipoEstructura,classes);//this.tipoestructuraLogic.getTipoEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEstructura(this.tipoestructuraReturnGeneral,this.tipoestructuraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEstructura(classes,this.tipoestructuraReturnGeneral,this.tipoestructuraBean,false);
					}
						
					if(this.tipoestructuraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura());	
					}
						
					if(this.tipoestructuraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura(),classes);//this.tipoestructuraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEstructura(this.tipoestructura,classes);//this.tipoestructuraBean);									
				}
			
				if(TipoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEstructura(this.tipoestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstructura(this.tipoestructura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoestructuraAnterior!=null) {
						this.tipoestructura=this.tipoestructuraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoestructuraReturnGeneral=tipoestructuraLogic.procesarEventosTipoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestructuraLogic.getTipoEstructuras(),this.tipoestructura,this.tipoestructuraParameterGeneral,this.isEsNuevoTipoEstructura,classes);//this.tipoestructuraLogic.getTipoEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoestructuraReturnGeneral.getTipoEstructura(),tipoestructuraLogic.getTipoEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoestructuraReturnGeneral.getTipoEstructura(),this.tipoestructuras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEstructura.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEstructura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEstructura();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEstructura() throws Exception {
		
		TipoEstructuraModel tipoestructuraModel=(TipoEstructuraModel)this.jTableDatosTipoEstructura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestructuraModel.tipoestructuras=this.tipoestructuraLogic.getTipoEstructuras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoestructuraModel.tipoestructuras=this.tipoestructuras;
		}
		
		
		((TipoEstructuraModel) this.jTableDatosTipoEstructura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEstructura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoestructuraAnterior(),this.tipoestructuraLogic.getTipoEstructuras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoestructuraAnterior(),this.tipoestructuras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEstructura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEstructura(TipoEstructura tipoestructura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
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
										
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestructura,new Object(),generalEntityParameterGeneral,this.tipoestructuraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEstructuraConstantesFunciones.getClassesRelationshipsOfTipoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEstructuraConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEstructura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestructura,new Object(),generalEntityParameterGeneral,this.tipoestructuraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEstructura(TipoEstructuraBean tipoestructuraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEstructura(ArrayList<Classe> classes,TipoEstructuraReturnGeneral tipoestructuraReturnGeneral,TipoEstructuraBean tipoestructuraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEstructura(TipoEstructura tipoestructura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoestructura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEstructura = new TipoEstructuraDetalleFormJInternalFrame(jDesktopPane,this.tipoestructuraSessionBean.getConGuardarRelaciones(),this.tipoestructuraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.setVisible(false);
		this.jInternalFrameDetalleFormTipoEstructura.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEstructura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEstructura.tipoestructuraLogic=this.tipoestructuraLogic;
		
		this.cargarCombosFrameForeignKeyTipoEstructura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEstructura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEstructura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEstructura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEstructura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEstructura"));
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarTipoEstructura.addActionListener(new ButtonActionListener(this,"ModificarTipoEstructura"));

		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEstructura"));
					
		this.jInternalFrameDetalleFormTipoEstructura.jMenuItemModificarTipoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarTipoEstructura.addActionListener (new ButtonActionListener(this,"ActualizarTipoEstructura"));
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEstructura"));
						
		this.jInternalFrameDetalleFormTipoEstructura.jMenuItemActualizarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarTipoEstructura.addActionListener (new ButtonActionListener(this,"EliminarTipoEstructura"));
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEstructura"));
								
		this.jInternalFrameDetalleFormTipoEstructura.jMenuItemEliminarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarTipoEstructura.addActionListener (new ButtonActionListener(this,"CancelarTipoEstructura"));
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEstructura"));
					
		this.jInternalFrameDetalleFormTipoEstructura.jMenuItemCancelarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEstructura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jMenuItemDetalleCerrarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstructura"));
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstructura"));
		
		
		
		this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEstructura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtonidTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtoncodigoTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtonnombreTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstructuraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEstructura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEstructura"));
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEstructura"));
		}
		
		this.jTableDatosTipoEstructura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEstructura"));
		
		this.jTableDatosTipoEstructura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEstructura"));
		
		this.jButtonNuevoTipoEstructura.addActionListener(new ButtonActionListener(this,"NuevoTipoEstructura"));
		
		this.jButtonDuplicarTipoEstructura.addActionListener(new ButtonActionListener(this,"DuplicarTipoEstructura"));
		
		this.jButtonCopiarTipoEstructura.addActionListener(new ButtonActionListener(this,"CopiarTipoEstructura"));
		
		this.jButtonVerFormTipoEstructura.addActionListener(new ButtonActionListener(this,"VerFormTipoEstructura"));
		
		
		this.jButtonNuevoToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEstructura"));
			
		this.jButtonDuplicarToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEstructura"));
			
		this.jMenuItemNuevoTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEstructura"));
			
		this.jMenuItemDuplicarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEstructura"));		
		
		
		this.jButtonNuevoRelacionesTipoEstructura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEstructura"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEstructura"));
			
		this.jMenuItemNuevoRelacionesTipoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarTipoEstructura.addActionListener(new ButtonActionListener(this,"ModificarTipoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonModificarToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEstructura"));
			
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemModificarTipoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarTipoEstructura.addActionListener (new ButtonActionListener(this,"ActualizarTipoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonActualizarToolBarTipoEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEstructura"));
				
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemActualizarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarTipoEstructura.addActionListener (new ButtonActionListener(this,"EliminarTipoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonEliminarToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEstructura"));
						
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemEliminarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarTipoEstructura.addActionListener (new ButtonActionListener(this,"CancelarTipoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonCancelarToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEstructura"));
			
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemCancelarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEstructura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEstructura"));		
		
		
		this.jButtonCerrarTipoEstructura.addActionListener (new ButtonActionListener(this,"CerrarTipoEstructura"));
		
		
		this.jButtonCerrarToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEstructura"));
			
		this.jMenuItemCerrarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEstructura"));
			
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jMenuItemDetalleCerrarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstructura"));
		}
		
		this.jButtonCopiarToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEstructura"));
			
		this.jButtonVerFormToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEstructura"));
		
		this.jMenuItemGuardarCambiosTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEstructura"));
			
		this.jMenuItemCopiarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEstructura"));		
		
		this.jMenuItemVerFormTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEstructura"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEstructura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEstructura"));
			
		this.jMenuItemGuardarCambiosTablaTipoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEstructura"));		
		
		
		
		this.jButtonRecargarInformacionTipoEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEstructura"));
					
		this.jButtonRecargarInformacionToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEstructura"));
		
		this.jMenuItemRecargarInformacionTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEstructura"));		
		
		
		
		this.jButtonAnterioresTipoEstructura.addActionListener (new ButtonActionListener(this,"AnterioresTipoEstructura"));
		
		
		this.jButtonAnterioresToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEstructura"));
		
		this.jMenuItemAnterioresTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEstructura"));		
		
		
		this.jButtonSiguientesTipoEstructura.addActionListener (new ButtonActionListener(this,"SiguientesTipoEstructura"));
		
		
		this.jButtonSiguientesToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEstructura"));
			
		this.jMenuItemSiguientesTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEstructura"));
			
		this.jMenuItemAbrirOrderByTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEstructura"));
			
		this.jMenuItemMostrarOcultarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEstructura"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEstructura"));
			
		this.jMenuItemDetalleMostarOcultarTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEstructura"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEstructura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEstructura"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEstructura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEstructura"));

		this.jCheckBoxSeleccionadosTipoEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEstructura"));
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEstructura"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEstructura.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEstructura"));
			
		this.jComboBoxTiposAccionesTipoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEstructura"));
					
		this.jComboBoxTiposSeleccionarTipoEstructura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEstructura"));
			
		this.jTextFieldValorCampoGeneralTipoEstructura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtonidTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtoncodigoTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtonnombreTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstructuraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEstructura!=null) {
				this.jInternalFrameReporteDinamicoTipoEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstructura"));
				this.jInternalFrameReporteDinamicoTipoEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstructura"));
				this.jInternalFrameReporteDinamicoTipoEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstructura"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEstructura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstructura"));				
			//this.jButtonGenerarReporteDinamicoTipoEstructura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstructura"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEstructura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstructura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEstructura!=null) {
				this.jInternalFrameImportacionTipoEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEstructura"));
				this.jInternalFrameImportacionTipoEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEstructura"));
				this.jInternalFrameImportacionTipoEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEstructura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEstructura"));
			
			this.jButtonAbrirOrderByToolBarTipoEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEstructura"));			
			
			if(this.jInternalFrameOrderByTipoEstructura!=null) {
				this.jInternalFrameOrderByTipoEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEstructura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstructura.jTabbedPaneRelacionesTipoEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEstructura"));
		
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
            		closingInternalFrameTipoEstructura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEstructura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEstructura = (JInternalFrameBase)event.getSource();
	            	
	            TipoEstructuraBeanSwingJInternalFrame jInternalFrameParent=(TipoEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEstructura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEstructuraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEstructura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEstructura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEstructura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEstructura";
		inputMap = this.jButtonNuevoTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEstructuraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEstructura";
		inputMap = this.jButtonNuevoRelacionesTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEstructuraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEstructura";
		inputMap = this.jButtonModificarTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEstructura";
		inputMap = this.jButtonActualizarTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEstructura";
		inputMap = this.jButtonEliminarTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEstructura";
		inputMap = this.jButtonCancelarTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEstructura";
		inputMap = this.jButtonCerrarTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEstructura";
		inputMap = this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEstructura.jButtonGuardarCambiosTipoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEstructura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEstructuraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtonidTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtoncodigoTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstructura.jButtonnombreTipoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstructuraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEstructura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEstructura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
					tipoestructuraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstructura tipoestructuraAux:tipoestructuras) {
					tipoestructuraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
						tipoestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstructura tipoestructuraAux:tipoestructuras) {
						tipoestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstructura tipoestructuraAux:tipoestructuras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEstructura.getSelectedRows();
			
			TipoEstructura tipoestructuraLocal=new TipoEstructura();
			
			//this.seleccionarTodosTipoEstructura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestructuraLocal =(TipoEstructura) this.tipoestructuraLogic.getTipoEstructuras().toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoestructuraLocal =(TipoEstructura) this.tipoestructuras.toArray()[this.jTableDatosTipoEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoestructuraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
						tipoestructuraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstructura tipoestructuraAux:tipoestructuras) {
						tipoestructuraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEstructura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEstructuraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEstructuraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEstructura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEstructura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEstructura tipoestructuraAux:this.tipoestructuraLogic.getTipoEstructuras()) {
				
						if(sTipoSeleccionar.equals(TipoEstructuraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoestructuraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEstructuraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoestructuraAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstructura tipoestructuraAux:tipoestructuras) {
					
						if(sTipoSeleccionar.equals(TipoEstructuraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoestructuraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEstructuraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoestructuraAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEstructuraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEstructura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEstructura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEstructura) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEstructura(conSplash);
				
					this.generarReporteTipoEstructurasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEstructurasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEstructurasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEstructura();
				
				this.exportarTipoEstructurasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEstructuras();
				//this.importarTipoEstructuras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEstructura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEstructura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEstructura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEstructura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstructura.jComboBoxTiposAccionesFormularioTipoEstructura.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEstructura();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEstructura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEstructuraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEstructura();
			
			if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
			TipoEstructura tipoestructura=new TipoEstructura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEstructura.getSelectedItem();
			
			
			
			
			tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoestructurasSeleccionados.size()==1) {
				for(TipoEstructura tipoestructuraAux:tipoestructurasSeleccionados) {
					tipoestructura=tipoestructuraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEstructura();
			
      		//this.finishProcessTipoEstructura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEstructuraReturnGeneral() throws Exception {
		if(this.tipoestructuraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoestructuraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoestructuraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoestructuraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEstructura(false);
		}
		
		if(this.tipoestructuraReturnGeneral.getConRetornoLista() || this.tipoestructuraReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoestructuraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoestructuraLogic.setTipoEstructuras(this.tipoestructuraReturnGeneral.getTipoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoestructuraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoestructuraLogic.setTipoEstructura(this.tipoestructuraReturnGeneral.getTipoEstructura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEstructura(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEstructura() throws Exception {
		
		
	}
	
	public ArrayList<TipoEstructura> getTipoEstructurasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEstructura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEstructura tipoestructuraAux:tipoestructuraLogic.getTipoEstructuras()) {
					if(tipoestructuraAux.getIsSelected()) {
						tipoestructurasSeleccionados.add(tipoestructuraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstructura tipoestructuraAux:this.tipoestructuras) {
					if(tipoestructuraAux.getIsSelected()) {
						tipoestructurasSeleccionados.add(tipoestructuraAux);				
					}
				}
			}
			
			if(tipoestructurasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoestructurasSeleccionados.addAll(this.tipoestructuraLogic.getTipoEstructuras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoestructurasSeleccionados.addAll(this.tipoestructuras);				
					}
				}
			}
		} else {
			tipoestructurasSeleccionados.add(this.tipoestructura);
		}
		
		return tipoestructurasSeleccionados;
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
	
	public void generarReporteTipoEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEstructurasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEstructurasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEstructurasSeleccionados() throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEstructurasSeleccionados() throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEstructurasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEstructurasSeleccionados() throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEstructura();
		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEstructura();
		
		
		//this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados ,tipoestructuraImplementable,tipoestructuraImplementableHome);
	}
	
	public void mostrarImportacionTipoEstructuras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEstructura();
		
		this.abrirFrameImportacionTipoEstructura();		
		
			
		//this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados ,tipoestructuraImplementable,tipoestructuraImplementableHome);
	}
	
	public void importarTipoEstructuras() throws Exception {		
	
	}
	
	public void exportarTipoEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEstructurasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEstructurasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEstructurasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEstructurasSeleccionados() throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEstructura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEstructura tipoestructuraAux:tipoestructurasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEstructura(tipoestructuraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoestructuraAux.setsDetalleGeneralEntityReporte(tipoestructuraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEstructura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEstructuraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstructuraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstructuraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstructuraConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEstructura(TipoEstructura tipoestructura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoestructura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestructura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestructura.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestructura.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEstructurasSeleccionados() throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEstructura(row);				
				iRow++;
			}				
			
			for(TipoEstructura tipoestructuraAux:tipoestructurasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEstructura(tipoestructuraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEstructurasSeleccionados() throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();		
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestructura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoestructuras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoestructura");
			//elementRoot.appendChild(element);
		
			for(TipoEstructura tipoestructuraAux:tipoestructurasSeleccionados) {
				element = document.createElement("tipoestructura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEstructura(tipoestructuraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEstructura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstructuraConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEstructura(TipoEstructura tipoestructura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestructura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestructura.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestructura.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEstructura(TipoEstructura tipoestructura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEstructuraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoestructura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEstructuraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoestructura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoEstructuraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoestructura.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoEstructuraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoestructura.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEstructurasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEstructura> tipoestructurasSeleccionados=new ArrayList<TipoEstructura>();
		
		tipoestructurasSeleccionados=this.getTipoEstructurasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEstructura(tipoestructurasSeleccionados);
		
		this.generarReporteTipoEstructuras("Todos",tipoestructurasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEstructura(ArrayList<TipoEstructura> tipoestructurasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEstructura tipoestructuraAux:tipoestructurasSeleccionados) {
				tipoestructuraAux.setsDetalleGeneralEntityReporte(tipoestructuraAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEstructuraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoestructuraAux.setsDescripcionGeneralEntityReporte1(tipoestructuraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoEstructuraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoestructuraAux.setsDescripcionGeneralEntityReporte1(tipoestructuraAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEstructura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEstructura=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEstructura=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=false;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
			this.isVisibilidadCeldaModificarTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=true;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
			this.isVisibilidadCeldaModificarTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=true;
			this.isVisibilidadCeldaEliminarTipoEstructura=true;
			this.isVisibilidadCeldaCancelarTipoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
			this.isVisibilidadCeldaModificarTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=true;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=true;
			this.isVisibilidadCeldaModificarTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=false;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
			this.isVisibilidadCeldaActualizarTipoEstructura=false;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
			this.isVisibilidadCeldaModificarTipoEstructura=true;
			this.isVisibilidadCeldaActualizarTipoEstructura=false;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
			this.isVisibilidadCeldaCancelarTipoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstructura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=true;
		} else {
			this.actualizarEstadoPanelsTipoEstructura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEstructura=false;
			//this.isVisibilidadCeldaVerFormTipoEstructura=false;
			this.isVisibilidadCeldaDuplicarTipoEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoestructuraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!tipoestructuraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;												
			}
			
			this.jButtonCerrarTipoEstructura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEstructura=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoestructura)) {
			this.isVisibilidadCeldaActualizarTipoEstructura=false;
			this.isVisibilidadCeldaEliminarTipoEstructura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEstructura() {
	}
	
	public void actualizarEstadoPanelsTipoEstructura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEstructura!=null) {
				this.jScrollPanelDatosEdicionTipoEstructura.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoEstructura!=null) {
				this.jScrollPanelDatosTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstructura!=null) {
				this.jPanelPaginacionTipoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstructura!=null) {
				this.jPanelParametrosReportesTipoEstructura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEstructuraSessionBean tipoestructuraSessionBean=new TipoEstructuraSessionBean();
		
		if(this.tipoestructuraSessionBean==null) {
			this.tipoestructuraSessionBean=new TipoEstructuraSessionBean();
		}
		
		this.tipoestructuraSessionBean.setsUltimaBusquedaTipoEstructura(this.getsAccionBusqueda());
		this.tipoestructuraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoestructuraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEstructuraSessionBean tipoestructuraSessionBean=new TipoEstructuraSessionBean();
		
		if(this.tipoestructuraSessionBean==null) {
			this.tipoestructuraSessionBean=new TipoEstructuraSessionBean();
		}
		
		if(this.tipoestructuraSessionBean.getsUltimaBusquedaTipoEstructura()!=null&&!this.tipoestructuraSessionBean.getsUltimaBusquedaTipoEstructura().equals("")) {
			this.setsAccionBusqueda(tipoestructuraSessionBean.getsUltimaBusquedaTipoEstructura());
			this.setiNumeroPaginacion(tipoestructuraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoestructuraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoestructuraSessionBean.setsUltimaBusquedaTipoEstructura("");
		this.tipoestructuraSessionBean.setiNumeroPaginacion(TipoEstructuraConstantesFunciones.INUMEROPAGINACION);
		this.tipoestructuraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEstructura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEstructura() {
		this.updateBorderResaltarBusquedasFormularioTipoEstructura();
		this.updateVisibilidadBusquedasFormularioTipoEstructura();
		this.updateHabilitarBusquedasFormularioTipoEstructura();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEstructura() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEstructura() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoEstructura() {
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
	
	public void updateControlesFormularioTipoEstructura() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEstructura();
		this.updateVisibilidadResaltarControlesFormularioTipoEstructura();
		this.updateHabilitarResaltarControlesFormularioTipoEstructura();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoestructuraConstantesFunciones.resaltaridTipoEstructura!=null && this.jInternalFrameDetalleFormTipoEstructura!=null) {this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setBorder(this.tipoestructuraConstantesFunciones.resaltaridTipoEstructura);}
		if(this.tipoestructuraConstantesFunciones.resaltarcodigoTipoEstructura!=null && this.jInternalFrameDetalleFormTipoEstructura!=null) {this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setBorder(this.tipoestructuraConstantesFunciones.resaltarcodigoTipoEstructura);}
		if(this.tipoestructuraConstantesFunciones.resaltarnombreTipoEstructura!=null && this.jInternalFrameDetalleFormTipoEstructura!=null) {this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setBorder(this.tipoestructuraConstantesFunciones.resaltarnombreTipoEstructura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEstructura() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
	
		//this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setVisible(this.tipoestructuraConstantesFunciones.mostraridTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jPanelidTipoEstructura.setVisible(this.tipoestructuraConstantesFunciones.mostraridTipoEstructura);
		//this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setVisible(this.tipoestructuraConstantesFunciones.mostrarcodigoTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jPanelcodigoTipoEstructura.setVisible(this.tipoestructuraConstantesFunciones.mostrarcodigoTipoEstructura);
		//this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setVisible(this.tipoestructuraConstantesFunciones.mostrarnombreTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jPanelnombreTipoEstructura.setVisible(this.tipoestructuraConstantesFunciones.mostrarnombreTipoEstructura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEstructura!=null) {
	
		this.jInternalFrameDetalleFormTipoEstructura.jTextFieldidTipoEstructura.setEnabled(this.tipoestructuraConstantesFunciones.activaridTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jTextFieldcodigoTipoEstructura.setEnabled(this.tipoestructuraConstantesFunciones.activarcodigoTipoEstructura);
		this.jInternalFrameDetalleFormTipoEstructura.jTextAreanombreTipoEstructura.setEnabled(this.tipoestructuraConstantesFunciones.activarnombreTipoEstructura);
		}
	}
	
		
}