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

import com.bydan.erp.inventario.util.NivelLineaConstantesFunciones;
import com.bydan.erp.inventario.util.NivelLineaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.NivelLineaParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.NivelLineaBean;
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
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class NivelLineaBeanSwingJInternalFrame extends NivelLineaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NivelLineaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NivelLinea> nivellineaValidator = new ClassValidator<NivelLinea>(NivelLinea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NivelLinea nivellinea;	
	public NivelLinea nivellineaAux;
	public NivelLinea nivellineaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NivelLinea nivellineaTotales;
	public Long idNivelLineaActual;
	public Long iIdNuevoNivelLinea=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosLinea=false;

	public Boolean getIsTienePermisosLinea() {
		return isTienePermisosLinea;
	}

	public void setIsTienePermisosLinea(Boolean isTienePermisosLinea) {
		this.isTienePermisosLinea= isTienePermisosLinea;
	}


	public Boolean isTienePermisosComisionConfig=false;

	public Boolean getIsTienePermisosComisionConfig() {
		return isTienePermisosComisionConfig;
	}

	public void setIsTienePermisosComisionConfig(Boolean isTienePermisosComisionConfig) {
		this.isTienePermisosComisionConfig= isTienePermisosComisionConfig;
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
	
	public Boolean isPermisoTodoNivelLinea;
	public Boolean isPermisoNuevoNivelLinea;
	public Boolean isPermisoActualizarNivelLinea;
	public Boolean isPermisoActualizarOriginalNivelLinea;
	public Boolean isPermisoEliminarNivelLinea;
	public Boolean isPermisoGuardarCambiosNivelLinea;
	public Boolean isPermisoConsultaNivelLinea;
	public Boolean isPermisoBusquedaNivelLinea;
	public Boolean isPermisoReporteNivelLinea;
	public Boolean isPermisoPaginacionMedioNivelLinea;
	public Boolean isPermisoPaginacionAltoNivelLinea;
	public Boolean isPermisoPaginacionTodoNivelLinea;
	public Boolean isPermisoCopiarNivelLinea;
	public Boolean isPermisoVerFormNivelLinea;
	public Boolean isPermisoDuplicarNivelLinea;
	public Boolean isPermisoOrdenNivelLinea;
	
	
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
	
	public NivelLineaParameterReturnGeneral nivellineaReturnGeneral;
	public NivelLineaParameterReturnGeneral nivellineaParameterGeneral;
	
	

	public LineaLogic lineaLogic=null;

	public LineaLogic getLineaLogic() {
		return lineaLogic;
	}

	public void setLineaLogic(LineaLogic lineaLogic) {
		this.lineaLogic = lineaLogic;
	}


	public ComisionConfigLogic comisionconfigLogic=null;

	public ComisionConfigLogic getComisionConfigLogic() {
		return comisionconfigLogic;
	}

	public void setComisionConfigLogic(ComisionConfigLogic comisionconfigLogic) {
		this.comisionconfigLogic = comisionconfigLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNivelLinea=false;
	public Boolean esParaAccionDesdeFormularioNivelLinea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NivelLineaSessionBeanAdditional nivellineaSessionBeanAdditional=null;
	
	public NivelLineaSessionBeanAdditional getNivelLineaSessionBeanAdditional() {
		return this.nivellineaSessionBeanAdditional;
	}
	
	public void setNivelLineaSessionBeanAdditional(NivelLineaSessionBeanAdditional nivellineaSessionBeanAdditional) {
		try {
			this.nivellineaSessionBeanAdditional=nivellineaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NivelLineaBeanSwingJInternalFrameAdditional nivellineaBeanSwingJInternalFrameAdditional=null;
	//public class NivelLineaBeanSwingJInternalFrame
	
	public NivelLineaBeanSwingJInternalFrameAdditional getNivelLineaBeanSwingJInternalFrameAdditional() {
		return this.nivellineaBeanSwingJInternalFrameAdditional;
	}
	
	public void setNivelLineaBeanSwingJInternalFrameAdditional(NivelLineaBeanSwingJInternalFrameAdditional nivellineaBeanSwingJInternalFrameAdditional) {
		try {
			this.nivellineaBeanSwingJInternalFrameAdditional=nivellineaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NivelLineaLogic nivellineaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NivelLinea nivellineaBean;
	public NivelLineaConstantesFunciones nivellineaConstantesFunciones;
	//public NivelLineaParameterReturnGeneral nivellineaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<NivelLinea> nivellineas;	
	//public List<NivelLinea> nivellineasEliminados;
	//public List<NivelLinea> nivellineasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNivelLinea=false;
	public Boolean isVisibilidadCeldaDuplicarNivelLinea=true;
	public Boolean isVisibilidadCeldaCopiarNivelLinea=true;
	public Boolean isVisibilidadCeldaVerFormNivelLinea=true;
	public Boolean isVisibilidadCeldaOrdenNivelLinea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
	public Boolean isVisibilidadCeldaModificarNivelLinea=false;
	public Boolean isVisibilidadCeldaActualizarNivelLinea=false;
	public Boolean isVisibilidadCeldaEliminarNivelLinea=false;
	public Boolean isVisibilidadCeldaCancelarNivelLinea=false;
	public Boolean isVisibilidadCeldaGuardarNivelLinea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNivelLinea=false;	
	
	
	
	public Long getiIdNuevoNivelLinea() {
		return this.iIdNuevoNivelLinea;
	}

	public void setiIdNuevoNivelLinea(Long iIdNuevoNivelLinea) {
		this.iIdNuevoNivelLinea = iIdNuevoNivelLinea;
	}
	
	public Long getidNivelLineaActual() {
		return this.idNivelLineaActual;
	}

	public void setidNivelLineaActual(Long idNivelLineaActual) {
		this.idNivelLineaActual = idNivelLineaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NivelLinea getnivellinea() {
		return this.nivellinea;
	}

	public void setnivellinea(NivelLinea nivellinea) {
		this.nivellinea = nivellinea;
	}
	
	public NivelLinea getnivellineaAux() {
		return this.nivellineaAux;
	}

	public void setnivellineaAux(NivelLinea nivellineaAux) {
		this.nivellineaAux = nivellineaAux;
	}				
	
	public NivelLinea getnivellineaAnterior() {
		return this.nivellineaAnterior;
	}

	public void setnivellineaAnterior(NivelLinea nivellineaAnterior) {
		this.nivellineaAnterior = nivellineaAnterior;
	}	
	
	public NivelLinea getnivellineaTotales() {
		return this.nivellineaTotales;
	}

	public void setnivellineaTotales(NivelLinea nivellineaTotales) {
		this.nivellineaTotales = nivellineaTotales;
	}	
	
	public NivelLinea getnivellineaBean() {
		return this.nivellineaBean;
	}

	public void setnivellineaBean(NivelLinea nivellineaBean) {
		this.nivellineaBean = nivellineaBean;
	}	
	
	public NivelLineaParameterReturnGeneral getnivellineaReturnGeneral() {
		return this.nivellineaReturnGeneral;
	}

	public void setnivellineaReturnGeneral(NivelLineaParameterReturnGeneral nivellineaReturnGeneral) {
		this.nivellineaReturnGeneral = nivellineaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NivelLineaLogic getNivelLineaLogic()	{		
		return nivellineaLogic;
	}

	public void setNivelLineaLogic(NivelLineaLogic nivellineaLogic) {
		this.nivellineaLogic = nivellineaLogic;
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
	
	public Boolean getIsEsNuevoNivelLinea() {
		return isEsNuevoNivelLinea;
	}

	public void setIsEsNuevoNivelLinea(Boolean isEsNuevoNivelLinea) {
		this.isEsNuevoNivelLinea = isEsNuevoNivelLinea;
	}

	public Boolean getEsParaAccionDesdeFormularioNivelLinea() {
		return esParaAccionDesdeFormularioNivelLinea;
	}
	
	public void setEsParaAccionDesdeFormularioNivelLinea(Boolean esParaAccionDesdeFormularioNivelLinea) {
		this.esParaAccionDesdeFormularioNivelLinea = esParaAccionDesdeFormularioNivelLinea;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesNivelLinea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NivelLineaConstantesFunciones.refrescarForeignKeysDescripcionesNivelLinea(this.nivellineaLogic.getNivelLineas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NivelLineaConstantesFunciones.refrescarForeignKeysDescripcionesNivelLinea(this.nivellineas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//nivellineaLogic.setNivelLineas(this.nivellineas);
			nivellineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NivelLineaParameterReturnGeneral getNivelLineaParameterGeneral() {
		return this.nivellineaParameterGeneral;
	}
	
	public void setNivelLineaParameterGeneral(NivelLineaParameterReturnGeneral nivellineaParameterGeneral) {
		this.nivellineaParameterGeneral = nivellineaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNivelLinea() {
		return isPermisoTodoNivelLinea;
	}

	public void setIsPermisoTodoNivelLinea(Boolean isPermisoTodoNivelLinea) {
		this.isPermisoTodoNivelLinea = isPermisoTodoNivelLinea;
	}

	public Boolean getIsPermisoNuevoNivelLinea() {
		return isPermisoNuevoNivelLinea;
	}

	public void setIsPermisoNuevoNivelLinea(Boolean isPermisoNuevoNivelLinea) {
		this.isPermisoNuevoNivelLinea = isPermisoNuevoNivelLinea;
	}

	public Boolean getIsPermisoActualizarNivelLinea() {
		return isPermisoActualizarNivelLinea;
	}

	public void setIsPermisoActualizarNivelLinea(Boolean isPermisoActualizarNivelLinea) {
		this.isPermisoActualizarNivelLinea = isPermisoActualizarNivelLinea;
	}

	public Boolean getIsPermisoEliminarNivelLinea() {
		return isPermisoEliminarNivelLinea;
	}

	public void setIsPermisoEliminarNivelLinea(Boolean isPermisoEliminarNivelLinea) {
		this.isPermisoEliminarNivelLinea = isPermisoEliminarNivelLinea;
	}

	public Boolean getIsPermisoGuardarCambiosNivelLinea() {
		return isPermisoGuardarCambiosNivelLinea;
	}

	public void setIsPermisoGuardarCambiosNivelLinea(Boolean isPermisoGuardarCambiosNivelLinea) {
		this.isPermisoGuardarCambiosNivelLinea = isPermisoGuardarCambiosNivelLinea;
	}
	
	public Boolean getIsPermisoConsultaNivelLinea() {
		return isPermisoConsultaNivelLinea;
	}

	public void setIsPermisoConsultaNivelLinea(Boolean isPermisoConsultaNivelLinea) {
		this.isPermisoConsultaNivelLinea = isPermisoConsultaNivelLinea;
	}

	public Boolean getIsPermisoBusquedaNivelLinea() {
		return isPermisoBusquedaNivelLinea;
	}

	public void setIsPermisoBusquedaNivelLinea(Boolean isPermisoBusquedaNivelLinea) {
		this.isPermisoBusquedaNivelLinea = isPermisoBusquedaNivelLinea;
	}

	public Boolean getIsPermisoReporteNivelLinea() {
		return isPermisoReporteNivelLinea;
	}

	public void setIsPermisoReporteNivelLinea(Boolean isPermisoReporteNivelLinea) {
		this.isPermisoReporteNivelLinea = isPermisoReporteNivelLinea;
	}
	
	public Boolean getIsPermisoPaginacionMedioNivelLinea() {
		return isPermisoPaginacionMedioNivelLinea;
	}

	public void setIsPermisoPaginacionMedioNivelLinea(Boolean isPermisoPaginacionMedioNivelLinea) {
		this.isPermisoPaginacionMedioNivelLinea = isPermisoPaginacionMedioNivelLinea;
	}
	
	public Boolean getIsPermisoPaginacionTodoNivelLinea() {
		return isPermisoPaginacionTodoNivelLinea;
	}

	public void setIsPermisoPaginacionTodoNivelLinea(Boolean isPermisoPaginacionTodoNivelLinea) {
		this.isPermisoPaginacionTodoNivelLinea = isPermisoPaginacionTodoNivelLinea;
	}
	
	public Boolean getIsPermisoPaginacionAltoNivelLinea() {
		return isPermisoPaginacionAltoNivelLinea;
	}

	public void setIsPermisoPaginacionAltoNivelLinea(Boolean isPermisoPaginacionAltoNivelLinea) {
		this.isPermisoPaginacionAltoNivelLinea = isPermisoPaginacionAltoNivelLinea;
	}
	
	public Boolean getIsPermisoCopiarNivelLinea() {
		return isPermisoCopiarNivelLinea;
	}

	public void setIsPermisoCopiarNivelLinea(Boolean isPermisoCopiarNivelLinea) {
		this.isPermisoCopiarNivelLinea = isPermisoCopiarNivelLinea;
	}
	
	public Boolean getIsPermisoVerFormNivelLinea() {
		return isPermisoVerFormNivelLinea;
	}

	public void setIsPermisoVerFormNivelLinea(Boolean isPermisoVerFormNivelLinea) {
		this.isPermisoVerFormNivelLinea = isPermisoVerFormNivelLinea;
	}
	
	public Boolean getIsPermisoDuplicarNivelLinea() {
		return isPermisoDuplicarNivelLinea;
	}

	public void setIsPermisoDuplicarNivelLinea(Boolean isPermisoDuplicarNivelLinea) {
		this.isPermisoDuplicarNivelLinea = isPermisoDuplicarNivelLinea;
	}
	
	public Boolean getIsPermisoOrdenNivelLinea() {
		return isPermisoOrdenNivelLinea;
	}

	public void setIsPermisoOrdenNivelLinea(Boolean isPermisoOrdenNivelLinea) {
		this.isPermisoOrdenNivelLinea = isPermisoOrdenNivelLinea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNivelLinea() {
		return isVisibilidadCeldaNuevoNivelLinea;
	}

	public void setIsVisibilidadCeldaNuevoNivelLinea(Boolean isVisibilidadCeldaNuevoNivelLinea) {
		this.isVisibilidadCeldaNuevoNivelLinea = isVisibilidadCeldaNuevoNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNivelLinea() {
		return isVisibilidadCeldaDuplicarNivelLinea;
	}

	public void setIsVisibilidadCeldaDuplicarNivelLinea(Boolean isVisibilidadCeldaDuplicarNivelLinea) {
		this.isVisibilidadCeldaDuplicarNivelLinea = isVisibilidadCeldaDuplicarNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNivelLinea() {
		return isVisibilidadCeldaCopiarNivelLinea;
	}

	public void setIsVisibilidadCeldaCopiarNivelLinea(Boolean isVisibilidadCeldaCopiarNivelLinea) {
		this.isVisibilidadCeldaCopiarNivelLinea = isVisibilidadCeldaCopiarNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNivelLinea() {
		return isVisibilidadCeldaVerFormNivelLinea;
	}

	public void setIsVisibilidadCeldaVerFormNivelLinea(Boolean isVisibilidadCeldaVerFormNivelLinea) {
		this.isVisibilidadCeldaVerFormNivelLinea = isVisibilidadCeldaVerFormNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNivelLinea() {
		return isVisibilidadCeldaOrdenNivelLinea;
	}

	public void setIsVisibilidadCeldaOrdenNivelLinea(Boolean isVisibilidadCeldaOrdenNivelLinea) {
		this.isVisibilidadCeldaOrdenNivelLinea = isVisibilidadCeldaOrdenNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNivelLinea() {
		return isVisibilidadCeldaNuevoRelacionesNivelLinea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNivelLinea(Boolean isVisibilidadCeldaNuevoRelacionesNivelLinea) {
		this.isVisibilidadCeldaNuevoRelacionesNivelLinea = isVisibilidadCeldaNuevoRelacionesNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNivelLinea() {
		return isVisibilidadCeldaModificarNivelLinea;
	}

	public void setIsVisibilidadCeldaModificarNivelLinea(Boolean isVisibilidadCeldaModificarNivelLinea) {
		this.isVisibilidadCeldaModificarNivelLinea = isVisibilidadCeldaModificarNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNivelLinea() {
		return isVisibilidadCeldaActualizarNivelLinea;
	}

	public void setIsVisibilidadCeldaActualizarNivelLinea(Boolean isVisibilidadCeldaActualizarNivelLinea) {
		this.isVisibilidadCeldaActualizarNivelLinea = isVisibilidadCeldaActualizarNivelLinea;
	}

	public Boolean getIsVisibilidadCeldaEliminarNivelLinea() {
		return isVisibilidadCeldaEliminarNivelLinea;
	}

	public void setIsVisibilidadCeldaEliminarNivelLinea(Boolean isVisibilidadCeldaEliminarNivelLinea) {
		this.isVisibilidadCeldaEliminarNivelLinea = isVisibilidadCeldaEliminarNivelLinea;
	}

	public Boolean getIsVisibilidadCeldaCancelarNivelLinea() {
		return isVisibilidadCeldaCancelarNivelLinea;
	}

	public void setIsVisibilidadCeldaCancelarNivelLinea(Boolean isVisibilidadCeldaCancelarNivelLinea) {
		this.isVisibilidadCeldaCancelarNivelLinea = isVisibilidadCeldaCancelarNivelLinea;
	}

	public Boolean getIsVisibilidadCeldaGuardarNivelLinea() {
		return isVisibilidadCeldaGuardarNivelLinea;
	}

	public void setIsVisibilidadCeldaGuardarNivelLinea(Boolean isVisibilidadCeldaGuardarNivelLinea) {
		this.isVisibilidadCeldaGuardarNivelLinea = isVisibilidadCeldaGuardarNivelLinea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNivelLinea() {
		return isVisibilidadCeldaGuardarCambiosNivelLinea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNivelLinea(Boolean isVisibilidadCeldaGuardarCambiosNivelLinea) {
		this.isVisibilidadCeldaGuardarCambiosNivelLinea = isVisibilidadCeldaGuardarCambiosNivelLinea;
	}
		
	public NivelLineaSessionBean getnivellineaSessionBean() {
		return this.nivellineaSessionBean;
	}
	
	public void setnivellineaSessionBean(NivelLineaSessionBean nivellineaSessionBean) {
		this.nivellineaSessionBean=nivellineaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNivelLinea(NivelLinea nivellinea)throws Exception {
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
	
	public void bugActualizarReferenciaActual(NivelLinea nivellinea,NivelLinea nivellineaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNivelLinea(nivellinea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		nivellineaAux.setId(nivellinea.getId());
		nivellineaAux.setVersionRow(nivellinea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNivelLinea();
		
			int intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = nivellineaValidator.getInvalidValues(this.nivellinea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			nivellineaLogic.setDatosCliente(datosCliente);
			nivellineaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				nivellineaAux=new  NivelLinea();
				
				nivellineaAux.setIsNew(true);
				nivellineaAux.setIsChanged(true);
				
				nivellineaAux.setNivelLineaOriginal(this.nivellinea);
				
				nivellineaAux.setId(this.nivellinea.getId());	
				nivellineaAux.setVersionRow(this.nivellinea.getVersionRow());	
				nivellineaAux.setnombre(this.nivellinea.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivellineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(nivellineaAux,nivellineaLogic.getNivelLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivellineaAux,nivellineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivellineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivellineaLogic.saveNivelLineas();//WithConnection
						//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivellinea,nivellineaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas().addAll(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs().addAll(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas.addAll(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs.addAll(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivellineaLogic.saveNivelLineaRelaciones(nivellineaAux,this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas(),this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());//WithConnection
								//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivellinea,nivellineaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(new ArrayList<Linea>());
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas= new ArrayList<Linea>();
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs= new ArrayList<ComisionConfig>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();}
							nivellineaAux.setLineas(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());

							if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();}
							nivellineaAux.setComisionConfigs(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivellineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivellineaAux,nivellineaLogic.getNivelLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivellineaAux,nivellineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivellinea,nivellineaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				nivellineaAux=new  NivelLinea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.nivellineaSessionBean.getEsGuardarRelacionado() 
					|| (this.nivellineaSessionBean.getEsGuardarRelacionado() && this.nivellinea.getId()>=0)) {
						
					nivellineaAux.setIsNew(false);
				}
				
				nivellineaAux.setIsDeleted(false);
			
				nivellineaAux.setId(this.nivellinea.getId());	
				nivellineaAux.setVersionRow(this.nivellinea.getVersionRow());	
				nivellineaAux.setnombre(this.nivellinea.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivellineaAux,nivellineaLogic.getNivelLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivellineaAux,nivellineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivellineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivellineaLogic.saveNivelLineas();//WithConnection
						//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivellinea,nivellineaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas().addAll(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs().addAll(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas.addAll(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs.addAll(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivellineaLogic.saveNivelLineaRelaciones(nivellineaAux,this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas(),this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());//WithConnection
								//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivellinea,nivellineaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(new ArrayList<Linea>());
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas= new ArrayList<Linea>();
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs= new ArrayList<ComisionConfig>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();}
							nivellineaAux.setLineas(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());

							if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();}
							nivellineaAux.setComisionConfigs(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivellineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivellineaAux,nivellineaLogic.getNivelLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivellineaAux,nivellineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivellinea,nivellineaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				nivellineaAux=new  NivelLinea();
				
				nivellineaAux.setIsNew(false);
				nivellineaAux.setIsChanged(false);
				
				nivellineaAux.setIsDeleted(true);
				
				nivellineaAux.setId(this.nivellinea.getId());	
				nivellineaAux.setVersionRow(this.nivellinea.getVersionRow());	
				nivellineaAux.setnombre(this.nivellinea.getnombre());	
				
				if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.nivellineaAux.getId()>=0) {	
						this.nivellineasEliminados.add(nivellineaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(nivellineaAux,nivellineaLogic.getNivelLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivellineaAux,nivellineas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivellineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivellineaLogic.saveNivelLineas();//WithConnection
						//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas().addAll(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs().addAll(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas.addAll(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs.addAll(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivellineaLogic.saveNivelLineaRelaciones(nivellineaAux,this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas(),this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());//WithConnection
								//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(new ArrayList<Linea>());
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas= new ArrayList<Linea>();
							this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs= new ArrayList<ComisionConfig>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();}
							nivellineaAux.setLineas(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());

							if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();}
							nivellineaAux.setComisionConfigs(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.nivellineaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(nivellineaAux,nivellineaLogic.getNivelLineas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(nivellineaAux,nivellineas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.getNivelLineas().addAll(this.nivellineasEliminados);
					
					nivellineaLogic.saveNivelLineas();//WithConnection
					//nivellineaLogic.getSetVersionRowNivelLineas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.nivellineasEliminados= new ArrayList<NivelLinea>();		
			}
			
			if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Nivel Linea GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.nivellinea=nivellineaAux;
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
      		//this.finishProcessNivelLinea();
      	}
		
	}	
	
	public void actualizarRelaciones(NivelLinea nivellineaLocal) throws Exception {
		
		if(this.nivellineaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				nivellineaLocal.setLineas(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());
				nivellineaLocal.setComisionConfigs(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
			
			} else {
			
				nivellineaLocal.setLineas(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineas);
				nivellineaLocal.setComisionConfigs(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigs);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NivelLinea nivellineaLocal) throws Exception {	
		if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarNivelLineaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = nivellineaValidator.getInvalidValues(this.nivellinea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NivelLinea nivellinea,List<NivelLinea> nivellineas) throws Exception {
		try	{		
			NivelLineaConstantesFunciones.actualizarLista(nivellinea,nivellineas,this.nivellineaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NivelLinea nivellinea,List<NivelLinea> nivellineas) throws Exception {
		try	{			
			NivelLineaConstantesFunciones.actualizarSelectedLista(nivellinea,nivellineas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NivelLinea> nivellineasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				nivellineasLocal=this.nivellineaLogic.getNivelLineas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				nivellineasLocal=this.nivellineas;
			}
			//ARCHITECTURE
		
			for(NivelLinea nivellineaLocal:nivellineasLocal) {
				if(this.permiteMantenimiento(nivellineaLocal) && nivellineaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NivelLineaConstantesFunciones.getNivelLineaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NivelLineaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelLinea.jLabelnombreNivelLinea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelLinea.jLabelnombreNivelLinea,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Linea")) {
			if(this.nivellinea==null) {
				this.nivellinea= new NivelLinea();
			}

			if(this.nivellineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNivelLinea
				this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);

				this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.getlinea().setNivelLinea(this.nivellinea);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionConfig")) {
			if(this.nivellinea==null) {
				this.nivellinea= new NivelLinea();
			}

			if(this.nivellineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNivelLinea
				this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);

				this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.getcomisionconfig().setNivelLinea(this.nivellinea);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoNivelLinea--;	
		
		
		this.nivellineaAux=new NivelLinea();
		
		this.nivellineaAux.setId(this.iIdNuevoNivelLinea);
		this.nivellineaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivellineaLogic.getNivelLineas().add(this.nivellineaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.nivellineas.add(this.nivellineaAux);
		}
		//ARCHITECTURE
		
		this.nivellinea=this.nivellineaAux;
		
		if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNivelLinea(this.nivellinea);
			this.setVariablesObjetoActualToFormularioForeignKeyNivelLinea(this.nivellinea);
		}
				
		//this.setDefaultControlesNivelLinea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNivelLinea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNivelLinea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelLinea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelLinea(this.nivellineaBean,this.nivellinea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NivelLineaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
			classes=NivelLineaConstantesFunciones.getClassesRelationshipsOfNivelLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.nivellineaReturnGeneral=nivellineaLogic.procesarEventosNivelLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivellineaLogic.getNivelLineas(),this.nivellinea,this.nivellineaParameterGeneral,this.isEsNuevoNivelLinea,classes);//this.nivellineaLogic.getNivelLinea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNivelLinea(this.nivellineaReturnGeneral,this.nivellineaBean,false);
		
		if(this.nivellineaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNivelLinea(this.nivellineaReturnGeneral.getNivelLinea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNivelLinea(this.nivellineaReturnGeneral.getNivelLinea());
		}
		
		if(this.nivellineaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNivelLinea(this.nivellineaReturnGeneral.getNivelLinea(),classes);//this.nivellineaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNivelLinea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNivelLinea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelLineaBeanSwingJInternalFrameAdditional.RecargarFormNivelLinea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNivelLinea(false);
						
			if(nivellineaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.getEsGuardarRelacionado() && LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getEsGuardarRelacionado() && ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionConfigActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelLinea();
			}
			
			this.actualizarVisualTableDatosNivelLinea();
			
			this.jTableDatosNivelLinea.setRowSelectionInterval(this.getIndiceNuevoNivelLinea(), this.getIndiceNuevoNivelLinea());
			
			this.seleccionarFilaTablaNivelLineaActual();
						
			this.actualizarEstadoCeldasBotonesNivelLinea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNivelLinea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setEnabled(isHabilitar && this.nivellineaConstantesFunciones.activarnombreNivelLinea);	
		
	};
	
	public void setDefaultControlesNivelLinea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNivelLinea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.nivellineaSessionBean.setConGuardarRelaciones(true);			
			this.nivellineaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.nivellineaSessionBean.setConGuardarRelaciones(false);			
			this.nivellineaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoNivelLinea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
				if(nivellineaAux.getId().equals(this.iIdNuevoNivelLinea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelLinea nivellineaAux:this.nivellineas) {
				if(nivellineaAux.getId().equals(this.iIdNuevoNivelLinea)) {
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
	
	public int getIndiceActualNivelLinea(NivelLinea nivellinea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
				if(nivellineaAux.getId().equals(nivellinea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelLinea nivellineaAux:this.nivellineas) {
				if(nivellineaAux.getId().equals(nivellinea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNivelLinea(NivelLinea nivellineaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
				if(nivellineaAux.getNivelLineaOriginal().getId().equals(nivellineaOriginal.getId())) {
					existe=true;
					nivellineaOriginal.setId(nivellineaAux.getId());
					nivellineaOriginal.setVersionRow(nivellineaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelLinea nivellineaAux:this.nivellineas) {
				if(nivellineaAux.getNivelLineaOriginal().getId().equals(nivellineaOriginal.getId())) {
					existe=true;
					nivellineaOriginal.setId(nivellineaAux.getId());
					nivellineaOriginal.setVersionRow(nivellineaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNivelLinea(Boolean esParaCancelar) throws Exception {
		nivellineasAux=new ArrayList<NivelLinea>();
		nivellineaAux=new NivelLinea();
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
					if(nivellineaAux.getId()<0) {
						nivellineasAux.add(nivellineaAux);
					}		
				}
				this.iIdNuevoNivelLinea=0L;
				this.nivellineaLogic.getNivelLineas().removeAll(nivellineasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelLinea nivellineaAux:this.nivellineas) {
					if(nivellineaAux.getId()<0) {
						nivellineasAux.add(nivellineaAux);
					}		
				}
				this.iIdNuevoNivelLinea=0L;
				this.nivellineas.removeAll(nivellineasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNivelLinea 
					&& this.nivellineaLogic.getNivelLineas().size()>0
					) {
					nivellineaAux=this.nivellineaLogic.getNivelLineas().get(this.nivellineaLogic.getNivelLineas().size() - 1);
				
					if(nivellineaAux.getId()<0) {
						this.nivellineaLogic.getNivelLineas().remove(nivellineaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNivelLinea && this.nivellineas.size()>0) {
					nivellineaAux=this.nivellineas.get(this.nivellineas.size() - 1);
				
					if(nivellineaAux.getId()<0) {
						this.nivellineas.remove(nivellineaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNivelLinea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(nivellinea.getId()<0) {
				this.nivellineaLogic.getNivelLineas().remove(this.nivellinea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(nivellinea.getId()<0) {
				this.nivellineas.remove(this.nivellinea);
			}
		}			
	}
	
	public void setEstadosInicialesNivelLinea(List<NivelLinea> nivellineasAux) throws Exception {
		NivelLineaConstantesFunciones.setEstadosInicialesNivelLinea(nivellineasAux);
	}
	
	public void setEstadosInicialesNivelLinea(NivelLinea nivellineaAux) throws Exception {
		NivelLineaConstantesFunciones.setEstadosInicialesNivelLinea(nivellineaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNivelLineaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNivelLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNivelLineaActual()) {
				if(!this.isEsNuevoNivelLinea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNivelLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNivelLinea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNivelLineaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Nivel Linea ?", "MANTENIMIENTO DE Nivel Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNivelLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NivelLinea nivellinea) throws Exception {
		NivelLineaConstantesFunciones.seleccionarAsignar(this.nivellinea,nivellinea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNivelLinea=this.isPermisoActualizarOriginalNivelLinea;
			
			
			this.seleccionarAsignar(nivellinea);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelLineaConstantesFunciones.quitarEspaciosNivelLinea(this.nivellinea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNivelLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.nivellineaSessionBean.setsFuncionBusquedaRapida(this.nivellineaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNivelLinea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNivelLinea(esParaCancelar);				
				this.cancelarNuevoNivelLinea(esParaCancelar);								
			}
			
			this.nivellinea=new NivelLinea();
			
			this.inicializarNivelLinea();
			
			this.actualizarEstadoCeldasBotonesNivelLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNivelLinea() throws Exception {
		try {
			NivelLineaConstantesFunciones.inicializarNivelLinea(this.nivellinea);
			
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
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.nivellineaLogic.getNivelLineas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNivelLineas(String sAccionBusqueda,List<NivelLinea> nivellineasParaReportes) throws Exception {
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
					sPathReporteFinal="NivelLinea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NivelLineaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NivelLineaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NivelLinea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Nivel Lineas");		
		parameters.put("busquedapor", NivelLineaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Linea.class));
			classes.add(new Classe(ComisionConfig.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					NivelLineaLogic nivellineaLogicAuxiliar=new NivelLineaLogic();
					nivellineaLogicAuxiliar.setDatosCliente(nivellineaLogic.getDatosCliente());				
					nivellineaLogicAuxiliar.setNivelLineas(nivellineasParaReportes);
					
					nivellineaLogicAuxiliar.cargarRelacionesLoteForeignKeyNivelLineaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					nivellineasParaReportes=nivellineaLogicAuxiliar.getNivelLineas();
					
					//nivellineaLogic.getNewConnexionToDeep();
					
					//for (NivelLinea nivellinea:nivellineasParaReportes) {
					//	nivellineaLogic.deepLoad(nivellinea, false, DeepLoadType.INCLUDE, classes);
					//}						
					//nivellineaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//nivellineaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileLinea = AuxiliarReportes.class.getResourceAsStream("LineaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_linea", reportFileLinea);

			InputStream reportFileComisionConfig = AuxiliarReportes.class.getResourceAsStream("ComisionConfigDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionconfig", reportFileComisionConfig);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNivelLinea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NivelLineaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NivelLineaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNivelLinea=new JRBeanArrayDataSource(NivelLineaJInternalFrame.TraerNivelLineaBeans(nivellineasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNivelLinea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NivelLineaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NivelLineaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NivelLineaBean.TraerNivelLineaBeans(nivellineasParaReportes).toArray()));
							
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
				this.generarExcelReporteNivelLineas(sAccionBusqueda,sTipoArchivoReporte,nivellineasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNivelLineas(sAccionBusqueda,sTipoArchivoReporte,nivellineasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNivelLineaActionPerformed(null);
					//this.generarExcelReporteNivelLineas(sAccionBusqueda,sTipoArchivoReporte,nivellineasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNivelLineas(sAccionBusqueda,sTipoArchivoReporte,nivellineasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNivelLineas(sAccionBusqueda,sTipoArchivoReporte,nivellineasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNivelLineas(sAccionBusqueda,sTipoArchivoReporte,nivellineasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNivelLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelLinea> nivellineasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelLineas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelLinea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NivelLinea nivellinea : nivellineasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NivelLineaConstantesFunciones.generarExcelReporteDataNivelLinea("NORMAL",row,workbook,nivellinea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNivelLinea(String sTipo,Row row,Workbook workbook) {
		
		NivelLineaConstantesFunciones.generarExcelReporteHeaderNivelLinea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNivelLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelLinea> nivellineasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NivelLinea nivellinea : nivellineasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NivelLineaConstantesFunciones.getNivelLineaDescripcion(nivellinea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelLineaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelLineaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivellinea.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNivelLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelLinea> nivellineasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NivelLinea> nivellineasRespaldo=null;
		
		classes=NivelLineaConstantesFunciones.getClassesRelationshipsOfNivelLinea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.nivellineaLogic.setDatosCliente(this.datosCliente);
		this.nivellineaLogic.setDatosDeep(this.datosDeep);
		this.nivellineaLogic.setIsConDeep(true);
		
		nivellineasRespaldo=this.nivellineaLogic.getNivelLineas();
		
		this.nivellineaLogic.setNivelLineas(nivellineasParaReportes);	
		this.nivellineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		nivellineasParaReportes=this.nivellineaLogic.getNivelLineas();
		this.nivellineaLogic.setNivelLineas(nivellineasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelLinea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NivelLinea nivellinea : nivellineasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNivelLinea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NivelLineaConstantesFunciones.generarExcelReporteDataNivelLinea("NORMAL",row,workbook,nivellinea,cellStyleDataAux);
		
			
			


				//Linea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LineaConstantesFunciones.SCLASSWEBTITULO))) {

				if(nivellinea.getLineas()!=null && nivellinea.getLineas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LineaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LineaConstantesFunciones.generarExcelReporteHeaderLinea("RELACIONADO",row,workbook);
				}

				if(nivellinea.getLineas()!=null) {
					i2=0;
					for(Linea linea : nivellinea.getLineas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LineaConstantesFunciones.generarExcelReporteDataLinea("RELACIONADO",row,workbook,linea,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionConfig
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionConfigConstantesFunciones.SCLASSWEBTITULO))) {

				if(nivellinea.getComisionConfigs()!=null && nivellinea.getComisionConfigs().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionConfigConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionConfigConstantesFunciones.generarExcelReporteHeaderComisionConfig("RELACIONADO",row,workbook);
				}

				if(nivellinea.getComisionConfigs()!=null) {
					i2=0;
					for(ComisionConfig comisionconfig : nivellinea.getComisionConfigs()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionConfigConstantesFunciones.generarExcelReporteDataComisionConfig("RELACIONADO",row,workbook,comisionconfig,cellStyleDataAuxHijo);
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
		cell.setCellValue(NivelLineaConstantesFunciones.getNivelLineaDescripcion(nivellinea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelLinea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNivelLinea() throws Exception {		
		this.startProcessNivelLinea(true);
	}
	
	public void startProcessNivelLinea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesNivelLinea, this.jScrollPanelDatosNivelLinea,this.jPanelPaginacionNivelLinea, this.jScrollPanelDatosEdicionNivelLinea, this.jPanelAccionesNivelLinea,this.jPanelAccionesFormularioNivelLinea,this.jmenuBarNivelLinea,this.jmenuBarDetalleNivelLinea,this.jTtoolBarNivelLinea,this.jTtoolBarDetalleNivelLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelLinea=null; 
		
		final JPanel jPanelParametrosReportesNivelLinea=this.jPanelParametrosReportesNivelLinea;
		//final JScrollPane jScrollPanelDatosNivelLinea=this.jScrollPanelDatosNivelLinea;
		final JTable jTableDatosNivelLinea=this.jTableDatosNivelLinea;		
		final JPanel jPanelPaginacionNivelLinea=this.jPanelPaginacionNivelLinea;
		//final JScrollPane jScrollPanelDatosEdicionNivelLinea=this.jScrollPanelDatosEdicionNivelLinea;
		final JPanel jPanelAccionesNivelLinea=this.jPanelAccionesNivelLinea;
		
		JPanel jPanelCamposAuxiliarNivelLinea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNivelLinea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			jPanelCamposAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jPanelCamposNivelLinea;
			jPanelAccionesFormularioAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jPanelAccionesFormularioNivelLinea;
		}
		
		final JPanel jPanelCamposNivelLinea=jPanelCamposAuxiliarNivelLinea;
		final JPanel jPanelAccionesFormularioNivelLinea=jPanelAccionesFormularioAuxiliarNivelLinea;
		
		
		final JMenuBar jmenuBarNivelLinea=this.jmenuBarNivelLinea;
		final JToolBar jTtoolBarNivelLinea=this.jTtoolBarNivelLinea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNivelLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelLinea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			jmenuBarDetalleAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jmenuBarDetalleNivelLinea;
			jTtoolBarDetalleAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jTtoolBarDetalleNivelLinea;
		}
		
		final JMenuBar jmenuBarDetalleNivelLinea=jmenuBarDetalleAuxiliarNivelLinea;
		final JToolBar jTtoolBarDetalleNivelLinea=jTtoolBarDetalleAuxiliarNivelLinea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelLinea;
			processRunnable.jTableDatos=jTableDatosNivelLinea;
			processRunnable.jPanelCampos=jPanelCamposNivelLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelLinea;
			processRunnable.jPanelAcciones=jPanelAccionesNivelLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelLinea;
			
			
			processRunnable.jmenuBar=jmenuBarNivelLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelLinea;
			processRunnable.jTtoolBar=jTtoolBarNivelLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNivelLinea ,jPanelParametrosReportesNivelLinea,jTableDatosNivelLinea, /*jScrollPanelDatosNivelLinea,*/jPanelCamposNivelLinea,jPanelPaginacionNivelLinea, /*jScrollPanelDatosEdicionNivelLinea,*/ jPanelAccionesNivelLinea,jPanelAccionesFormularioNivelLinea,jmenuBarNivelLinea,jmenuBarDetalleNivelLinea,jTtoolBarNivelLinea,jTtoolBarDetalleNivelLinea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesNivelLinea, jScrollPanelDatosNivelLinea,jPanelPaginacionNivelLinea, jScrollPanelDatosEdicionNivelLinea, jPanelAccionesNivelLinea,jPanelAccionesFormularioNivelLinea,jmenuBarNivelLinea,jmenuBarDetalleNivelLinea,jTtoolBarNivelLinea,jTtoolBarDetalleNivelLinea);
						
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
	
	public void finishProcessNivelLinea() {// throws Exception 
		this.finishProcessNivelLinea(true);
	}
	
	public void finishProcessNivelLinea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesNivelLinea, this.jScrollPanelDatosNivelLinea,this.jPanelPaginacionNivelLinea, this.jScrollPanelDatosEdicionNivelLinea, this.jPanelAccionesNivelLinea,this.jPanelAccionesFormularioNivelLinea,this.jmenuBarNivelLinea,this.jmenuBarDetalleNivelLinea,this.jTtoolBarNivelLinea,this.jTtoolBarDetalleNivelLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelLinea=null; 
		
		final JPanel jPanelParametrosReportesNivelLinea=this.jPanelParametrosReportesNivelLinea;
		//final JScrollPane jScrollPanelDatosNivelLinea=this.jScrollPanelDatosNivelLinea;
		final JTable jTableDatosNivelLinea=this.jTableDatosNivelLinea;		
		final JPanel jPanelPaginacionNivelLinea=this.jPanelPaginacionNivelLinea;
		//final JScrollPane jScrollPanelDatosEdicionNivelLinea=this.jScrollPanelDatosEdicionNivelLinea;
		final JPanel jPanelAccionesNivelLinea=this.jPanelAccionesNivelLinea;
		
		JPanel jPanelCamposAuxiliarNivelLinea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNivelLinea=new JPanel();
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			jPanelCamposAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jPanelCamposNivelLinea;
			jPanelAccionesFormularioAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jPanelAccionesFormularioNivelLinea;
		}
		
		final JPanel jPanelCamposNivelLinea=jPanelCamposAuxiliarNivelLinea;
		final JPanel jPanelAccionesFormularioNivelLinea=jPanelAccionesFormularioAuxiliarNivelLinea;
		
		
		final JMenuBar jmenuBarNivelLinea=this.jmenuBarNivelLinea;		
		final JToolBar jTtoolBarNivelLinea=this.jTtoolBarNivelLinea;
				
		JMenuBar jmenuBarDetalleAuxiliarNivelLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelLinea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			jmenuBarDetalleAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jmenuBarDetalleNivelLinea;
			jTtoolBarDetalleAuxiliarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jTtoolBarDetalleNivelLinea;		
		}
		
		final JMenuBar jmenuBarDetalleNivelLinea=jmenuBarDetalleAuxiliarNivelLinea;
		final JToolBar jTtoolBarDetalleNivelLinea=jTtoolBarDetalleAuxiliarNivelLinea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelLinea;
			processRunnable.jTableDatos=jTableDatosNivelLinea;
			processRunnable.jPanelCampos=jPanelCamposNivelLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelLinea;
			processRunnable.jPanelAcciones=jPanelAccionesNivelLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelLinea;
			
			
			processRunnable.jmenuBar=jmenuBarNivelLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelLinea;
			processRunnable.jTtoolBar=jTtoolBarNivelLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNivelLinea ,jPanelParametrosReportesNivelLinea, jTableDatosNivelLinea,/*jScrollPanelDatosNivelLinea,*/jPanelCamposNivelLinea,jPanelPaginacionNivelLinea, /*jScrollPanelDatosEdicionNivelLinea,*/ jPanelAccionesNivelLinea,jPanelAccionesFormularioNivelLinea,jmenuBarNivelLinea,jmenuBarDetalleNivelLinea,jTtoolBarNivelLinea,jTtoolBarDetalleNivelLinea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNivelLinea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNivelLinea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNivelLinea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNivelLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNivelLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNivelLinea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNivelLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNivelLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNivelLinea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.nivellineaConstantesFunciones.getsFinalQueryNivelLinea();
		String  finalQueryPaginacionTodos=this.nivellineaConstantesFunciones.getsFinalQueryNivelLinea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NivelLineaConstantesFunciones.getArrayColumnasGlobalesNoNivelLinea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NivelLineaConstantesFunciones.getArrayColumnasGlobalesNivelLinea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NivelLineaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.nivellineasEliminados= new ArrayList<NivelLinea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNivelLinea();
		
				///*NivelLineaSessionBean*/this.nivellineaSessionBean=new NivelLineaSessionBean();
			
			if(this.nivellineaSessionBean==null) {
				this.nivellineaSessionBean=new NivelLineaSessionBean();
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
					this.iNumeroPaginacion=NivelLineaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NivelLineaConstantesFunciones.getClassesForeignKeysOfNivelLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/nivellinea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			nivellineasAux= new ArrayList<NivelLinea>();
			
				
			nivellineaLogic.setDatosCliente(this.datosCliente);
			nivellineaLogic.setDatosDeep(this.datosDeep);
			nivellineaLogic.setIsConDeep(true);
			
			
			nivellineaLogic.getNivelLineaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					nivellineaLogic.getTodosNivelLineas(finalQueryGlobal,pagination);
					
					//nivellineaLogic.getTodosNivelLineasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(nivellineaLogic.getNivelLineas()==null|| nivellineaLogic.getNivelLineas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivellineasAux= new ArrayList<NivelLinea>();
							nivellineasAux.addAll(nivellineaLogic.getNivelLineas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivellineasAux= new ArrayList<NivelLinea>();
							nivellineasAux.addAll(nivellineas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivellineaLogic.getTodosNivelLineas(finalQueryGlobal+"",this.pagination);												
							
							//nivellineaLogic.getTodosNivelLineasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNivelLineas("Todos",nivellineaLogic.getNivelLineas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivellineaLogic.setNivelLineas(new ArrayList<NivelLinea>());					
							nivellineaLogic.getNivelLineas().addAll(nivellineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivellineas=new ArrayList<NivelLinea>();
							nivellineas.addAll(nivellineasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNivelLinea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNivelLinea=this.idActual;
				
				} else if(this.idNivelLineaActual!=null && this.idNivelLineaActual!=0L) {
					idNivelLinea=idNivelLineaActual;
				}
				
					
				this.sDetalleReporte=NivelLineaConstantesFunciones.getDetalleIndicePorId(idNivelLinea);
				
				this.nivellineas=new ArrayList<NivelLinea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					nivellineaLogic.getEntity(idNivelLinea);
					
					//nivellineaLogic.getEntityWithConnection(idNivelLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivellineaLogic.setNivelLineas(new ArrayList<NivelLinea>());
					nivellineaLogic.getNivelLineas().add(nivellineaLogic.getNivelLinea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivellineas=new ArrayList<NivelLinea>();
					this.nivellineas.add(nivellinea);
				}
				
				if(nivellineaLogic.getNivelLinea()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNivelLinea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNivelLinea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivellineaLogic.getNivelLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivellineas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivellineaLogic.getNivelLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivellineas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NivelLinea nivellinea) {
		Boolean permite=true;
		
		if(this.nivellinea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NivelLineaConstantesFunciones.getOrderByListaNivelLinea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NivelLineaConstantesFunciones.getOrderByListaNivelLinea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelLinea nivellinea:nivellineaLogic.getNivelLineas()) {
				if(nivellinea.getsType().equals(Constantes2.S_TOTALES)) {
					nivellineaTotales=nivellinea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelLinea nivellinea:this.nivellineas) {
				if(nivellinea.getsType().equals(Constantes2.S_TOTALES)) {
					nivellineaTotales=nivellinea;
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
			this.nivellineaAux=new NivelLinea();
			this.nivellineaAux.setsType(Constantes2.S_TOTALES);
			this.nivellineaAux.setIsNew(false);
			this.nivellineaAux.setIsChanged(false);
			this.nivellineaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NivelLineaConstantesFunciones.TotalizarValoresFilaNivelLinea(this.nivellineaLogic.getNivelLineas(),this.nivellineaAux);
				
				this.nivellineaLogic.getNivelLineas().add(this.nivellineaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NivelLineaConstantesFunciones.TotalizarValoresFilaNivelLinea(this.nivellineas,this.nivellineaAux);
				
				this.nivellineas.add(this.nivellineaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		nivellineaTotales=new NivelLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivellineaLogic.getNivelLineas().remove(nivellineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivellineas.remove(nivellineaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		nivellineaTotales=new NivelLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelLinea nivellinea:nivellineaLogic.getNivelLineas()) {
				if(nivellinea.getsType().equals(Constantes2.S_TOTALES)) {
					nivellineaTotales=nivellinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelLineaConstantesFunciones.TotalizarValoresFilaNivelLinea(this.nivellineaLogic.getNivelLineas(),nivellineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelLinea nivellinea:this.nivellineas) {
				if(nivellinea.getsType().equals(Constantes2.S_TOTALES)) {
					nivellineaTotales=nivellinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelLineaConstantesFunciones.TotalizarValoresFilaNivelLinea(this.nivellineas,nivellineaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNivelLineaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getNivelLineaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivellineaLogic.getNivelLineaPorNombre(nombre);
				
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
	
	public void inicializarPermisosNivelLinea() {
		this.isPermisoTodoNivelLinea=false;
		this.isPermisoNuevoNivelLinea=false;
		this.isPermisoActualizarNivelLinea=false;
		this.isPermisoActualizarOriginalNivelLinea=false;
		this.isPermisoEliminarNivelLinea=false;
		this.isPermisoGuardarCambiosNivelLinea=false;
		this.isPermisoConsultaNivelLinea=false;
		this.isPermisoBusquedaNivelLinea=false;
		this.isPermisoReporteNivelLinea=false;		
		this.isPermisoOrdenNivelLinea=false;		
		this.isPermisoPaginacionMedioNivelLinea=false;		
		this.isPermisoPaginacionAltoNivelLinea=false;
		this.isPermisoPaginacionTodoNivelLinea=false;
		this.isPermisoCopiarNivelLinea=false;		
		this.isPermisoVerFormNivelLinea=false;		
		this.isPermisoDuplicarNivelLinea=false;		
		this.isPermisoOrdenNivelLinea=false;		
	}
	
	public void setPermisosUsuarioNivelLinea(Boolean isPermiso) {
		this.isPermisoTodoNivelLinea=isPermiso;
		this.isPermisoNuevoNivelLinea=isPermiso;
		this.isPermisoActualizarNivelLinea=isPermiso;
		this.isPermisoActualizarOriginalNivelLinea=isPermiso;
		this.isPermisoEliminarNivelLinea=isPermiso;
		this.isPermisoGuardarCambiosNivelLinea=isPermiso;
		this.isPermisoConsultaNivelLinea=isPermiso;
		this.isPermisoBusquedaNivelLinea=isPermiso;
		this.isPermisoReporteNivelLinea=isPermiso;
		this.isPermisoOrdenNivelLinea=isPermiso;		
		this.isPermisoPaginacionMedioNivelLinea=isPermiso;		
		this.isPermisoPaginacionAltoNivelLinea=isPermiso;		
		this.isPermisoPaginacionTodoNivelLinea=isPermiso;		
		this.isPermisoCopiarNivelLinea=isPermiso;		
		this.isPermisoVerFormNivelLinea=isPermiso;		
		this.isPermisoDuplicarNivelLinea=isPermiso;
		this.isPermisoOrdenNivelLinea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNivelLinea(Boolean isPermiso) {
		//this.isPermisoTodoNivelLinea=isPermiso;
		this.isPermisoNuevoNivelLinea=isPermiso;
		this.isPermisoActualizarNivelLinea=isPermiso;
		this.isPermisoActualizarOriginalNivelLinea=isPermiso;
		this.isPermisoEliminarNivelLinea=isPermiso;
		this.isPermisoGuardarCambiosNivelLinea=isPermiso;
		//this.isPermisoConsultaNivelLinea=isPermiso;
		//this.isPermisoBusquedaNivelLinea=isPermiso;
		//this.isPermisoReporteNivelLinea=isPermiso;
		//this.isPermisoOrdenNivelLinea=isPermiso;		
		//this.isPermisoPaginacionMedioNivelLinea=isPermiso;		
		//this.isPermisoPaginacionAltoNivelLinea=isPermiso;		
		//this.isPermisoPaginacionTodoNivelLinea=isPermiso;		
		//this.isPermisoCopiarNivelLinea=isPermiso;		
		//this.isPermisoDuplicarNivelLinea=isPermiso;
		//this.isPermisoOrdenNivelLinea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNivelLineaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(LineaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionConfigConstantesFunciones.SNOMBREOPCION);
		
		if(NivelLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosLinea=false;
		this.isTienePermisosLinea=this.verificarGetPermisosUsuarioOpcionNivelLineaClaseRelacionada(this.opcionsRelacionadas,LineaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionConfig=false;
		this.isTienePermisosComisionConfig=this.verificarGetPermisosUsuarioOpcionNivelLineaClaseRelacionada(this.opcionsRelacionadas,ComisionConfigConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebNivelLinea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNivelLineaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosLinea=conPermiso;
		this.isTienePermisosComisionConfig=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioNivelLineaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNivelLineaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNivelLineaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosLinea && this.jInternalFrameDetalleFormNivelLinea!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.remove(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionConfig && this.jInternalFrameDetalleFormNivelLinea!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.remove(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioNivelLinea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NivelLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NivelLineaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNivelLinea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNivelLinea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNivelLinea=this.isPermisoActualizarNivelLinea;
			this.isPermisoEliminarNivelLinea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNivelLinea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNivelLinea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNivelLinea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNivelLinea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNivelLinea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNivelLinea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNivelLinea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNivelLinea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNivelLinea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNivelLinea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNivelLinea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNivelLinea.setToolTipText(this.jTableDatosNivelLinea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNivelLinea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNivelLinea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NivelLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NivelLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNivelLinea() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosLinea && this.nivellineaConstantesFunciones.mostrarLineaNivelLinea && !NivelLineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Linea");
			reporte.setsDescripcion("Linea");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionConfig && this.nivellineaConstantesFunciones.mostrarComisionConfigNivelLinea && !NivelLineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Config");
			reporte.setsDescripcion("Comision Config");
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
	
		
	public void inicializarCombosForeignKeyNivelLineaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNivelLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NivelLineaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNivelLineaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyNivelLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNivelLinea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyNivelLinea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNivelLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNivelLinea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelLinea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNivelLinea(NivelLinea nivellinea)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNivelLinea(NivelLinea nivellinea,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNivelLinea()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNivelLinea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNivelLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNivelLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNivelLinea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNivelLinea()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNivelLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNivelLinea()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public NivelLineaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NivelLineaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NivelLineaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.nivellineaSessionBean=new NivelLineaSessionBean(); 
		this.nivellineaConstantesFunciones=new NivelLineaConstantesFunciones(); 
		this.nivellineaBean=new NivelLinea();//(this.nivellineaConstantesFunciones); 		
		this.nivellineaReturnGeneral=new NivelLineaParameterReturnGeneral(); 
		
		this.nivellineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivellineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NivelLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NivelLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NivelLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNivelLinea(true);
			
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
			
			this.nivellineaConstantesFunciones=new NivelLineaConstantesFunciones(); 
			this.nivellineaBean=new NivelLinea();//this.nivellineaConstantesFunciones); 			
			this.nivellineaReturnGeneral=new NivelLineaParameterReturnGeneral(); 
		
			NivelLineaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Linea Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.nivellinea=new NivelLinea();
			this.nivellineas = new ArrayList<NivelLinea>();
			this.nivellineasAux = new ArrayList<NivelLinea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic=new NivelLineaLogic();
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			//this.nivellineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.nivellineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNivelLinea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelLinea);	
					}
					
					if(this.jInternalFrameImportacionNivelLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelLinea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNivelLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNivelLinea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNivelLinea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelLinea);
				this.jInternalFrameDetalleFormNivelLinea.setVisible(false);
				this.jInternalFrameDetalleFormNivelLinea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelLinea);
					this.jInternalFrameReporteDinamicoNivelLinea.setVisible(false);
					this.jInternalFrameReporteDinamicoNivelLinea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNivelLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNivelLinea);
					this.jInternalFrameImportacionNivelLinea.setVisible(false);
					this.jInternalFrameImportacionNivelLinea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNivelLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNivelLinea);
					this.jInternalFrameOrderByNivelLinea.setVisible(false);
					this.jInternalFrameOrderByNivelLinea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNivelLineaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NivelLineaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.nivellineaReturnGeneral=new NivelLineaParameterReturnGeneral();
			
			this.nivellineaParameterGeneral=new NivelLineaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.nivellineaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NivelLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(LineaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionConfigConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivellineaSessionBean.getEsGuardarRelacionado(),this.nivellineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivellineaSessionBean.getEsGuardarRelacionado(),this.nivellineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaDuplicarNivelLinea=true;
			this.isVisibilidadCeldaCopiarNivelLinea=true;
			this.isVisibilidadCeldaVerFormNivelLinea=true;
			this.isVisibilidadCeldaOrdenNivelLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
			this.isVisibilidadCeldaModificarNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=false;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=false;
			this.isVisibilidadCeldaGuardarNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNivelLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNivelLinea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNivelLinea(false);
			
			this.setPermisosUsuarioNivelLinea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivellineaSessionBean.getEsGuardarRelacionado() 
				|| (this.nivellineaSessionBean.getEsGuardarRelacionado() && this.nivellineaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNivelLineaClasesRelacionadas();
			}
			
			if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNivelLineaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NivelLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNivelLinea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNivelLinea();
			}
			
			if(!this.isPermisoBusquedaNivelLinea) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNivelLinea,this.isPermisoPaginacionMedioNivelLinea,this.isPermisoPaginacionTodoNivelLinea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NivelLineaConstantesFunciones.getTiposSeleccionarNivelLinea());
				
				this.tiposColumnasSelect=NivelLineaConstantesFunciones.getTiposSeleccionarNivelLinea(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectNivelLinea();				
				//this.tiposRelacionesSelect=NivelLineaConstantesFunciones.getTiposRelacionesNivelLinea(true);
				
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
			//if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNivelLinea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioNivelLinea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioNivelLinea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelLinea() ;
			
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
			
			
			this.lineaLogic=new LineaLogic();
			this.comisionconfigLogic=new ComisionConfigLogic(); 
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
				nivellineaImplementable= (NivelLineaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				nivellineaImplementableHome= (NivelLineaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.nivellineas= new ArrayList<NivelLinea>();
			this.nivellineasEliminados= new ArrayList<NivelLinea>();
						
			this.isEsNuevoNivelLinea=false;
			this.esParaAccionDesdeFormularioNivelLinea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNivelLinea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNivelLinea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NivelLineaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NivelLineaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNivelLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNivelLinea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNivelLinea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNivelLinea();
			}
			
			NivelLineaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNivelLinea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NivelLinea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNivelLinea() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(LineaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LineaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNivelLinea")) {
				iIndex=this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();	
				
				

				if(sTitle.equals("Comision Configes")) {
					if(!ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNivelLinea();

						this.cargarParteTabPanelRelacionadaComisionConfig(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Lineas")) {
					if(!LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNivelLinea();

						this.cargarParteTabPanelRelacionadaLinea(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNivelLinea();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaComisionConfig(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNivelLinea.cargarSessionConBeanSwingJInternalFrameComisionConfig(false,true,iIndex);
		this.jButtonComisionConfigActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionConfig();

		//this.jTabbedPaneRelacionesNivelLinea.updateUI();
		//this.jTabbedPaneRelacionesNivelLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNivelLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaLinea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNivelLinea.cargarSessionConBeanSwingJInternalFrameLinea(false,true,iIndex);
		this.jButtonLineaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLinea();

		//this.jTabbedPaneRelacionesNivelLinea.updateUI();
		//this.jTabbedPaneRelacionesNivelLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNivelLinea.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Linea")) {
				int row=this.jTableDatosNivelLinea.getSelectedRow();
				jButtonLineaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionConfig")) {
				int row=this.jTableDatosNivelLinea.getSelectedRow();
				jButtonComisionConfigActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Linea")) {

					if(this.isTienePermisosLinea && this.nivellineaConstantesFunciones.mostrarLineaNivelLinea && !NivelLineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Lineas"+"("+LineaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Lineas");

						if(nivellineaConstantesFunciones.resaltarLineaNivelLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivellineaConstantesFunciones.resaltarLineaNivelLinea);
						}

						jmenuItem.setEnabled(this.nivellineaConstantesFunciones.activarLineaNivelLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Linea"));

						

						this.jInternalFrameDetalleFormNivelLinea.jmenuDetalleNivelLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Config")) {

					if(this.isTienePermisosComisionConfig && this.nivellineaConstantesFunciones.mostrarComisionConfigNivelLinea && !NivelLineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Configes"+"("+ComisionConfigConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Configes");

						if(nivellineaConstantesFunciones.resaltarComisionConfigNivelLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivellineaConstantesFunciones.resaltarComisionConfigNivelLinea);
						}

						jmenuItem.setEnabled(this.nivellineaConstantesFunciones.activarComisionConfigNivelLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionConfig"));

						

						this.jInternalFrameDetalleFormNivelLinea.jmenuDetalleNivelLinea.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyNivelLinea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNivelLinea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNivelLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNivelLineaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNivelLinea();
		
		this.cargarCombosFrameForeignKeyNivelLinea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNivelLinea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNivelLinea();
		}
	}
	
	
	
	public void jButtonNuevoNivelLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			
			if(jTableDatosNivelLinea.getRowCount()>=1) {
				jTableDatosNivelLinea.removeRowSelectionInterval(0, jTableDatosNivelLinea.getRowCount()-1);						
			}
			
			this.isEsNuevoNivelLinea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNivelLinea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNivelLinea(true);			
			//this.nivellinea=new NivelLinea();
			//this.nivellinea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelLinea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelLinea() ;
			
			if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelLinea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.nivellinea);	
			this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);				
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NivelLinea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNivelLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNivelLinea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNivelLinea.getSelectedRows().length;			
			}
			
			nivellineasSeleccionados=this.getNivelLineasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNivelLinea--;			
				//NivelLinea nivellineaAux= new NivelLinea();			
				//nivellineaAux.setId(this.iIdNuevoNivelLinea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NivelLinea nivellineaOrigen=new NivelLinea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NivelLinea nivellineaOrigen : nivellineasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							nivellineaOrigen =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivellineaOrigen =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNivelLinea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.nivellinea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNivelLinea(nivellineaOrigen,this.nivellinea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivellineaLogic.getNivelLineas().add(this.nivellineaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivellineas.add(this.nivellineaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNivelLinea(false);
				
				this.jTableDatosNivelLinea.setRowSelectionInterval(this.getIndiceNuevoNivelLinea(), this.getIndiceNuevoNivelLinea());
				
				int iLastRow =  this.jTableDatosNivelLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelLinea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();									
		
			NivelLinea nivellineaOrigen=new NivelLinea();
			NivelLinea nivellineaDestino=new NivelLinea();
				
			nivellineasSeleccionados=this.getNivelLineasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNivelLinea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || nivellineasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNivelLinea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivellineaOrigen =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivellineaOrigen =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivellineaDestino =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivellineaDestino =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				nivellineaOrigen =nivellineasSeleccionados.get(0);
				nivellineaDestino =nivellineasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNivelLinea(nivellineaOrigen,nivellineaDestino,true,false);
				
				nivellineaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivellineaDestino,nivellineaLogic.getNivelLineas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivellineaDestino,nivellineas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNivelLinea(false);
				
				//this.jTableDatosNivelLinea.setRowSelectionInterval(this.getIndiceNuevoNivelLinea(), this.getIndiceNuevoNivelLinea());
				
				int iLastRow =  this.jTableDatosNivelLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelLinea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNivelLinea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNivelLinea.isVisible();
			
			
			this.jPanelParametrosReportesNivelLinea.setVisible(!isVisible);
			this.jPanelPaginacionNivelLinea.setVisible(!isVisible);
			this.jPanelAccionesNivelLinea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNivelLinea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNivelLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNivelLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNivelLinea();
			
			this.abrirFrameOrderByNivelLinea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNivelLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNivelLinea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelLinea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNivelLinea.isMaximum()) {
					this.jInternalFrameDetalleFormNivelLinea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNivelLinea.setSize(this.jInternalFrameDetalleFormNivelLinea.iWidthFormulario,this.jInternalFrameDetalleFormNivelLinea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNivelLinea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNivelLinea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNivelLinea.isMaximum()) {
						this.jInternalFrameDetalleFormNivelLinea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNivelLinea.jContentPaneDetalleNivelLinea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNivelLinea.jContentPaneDetalleNivelLinea.getWidth(),NivelLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNivelLinea.jContentPaneDetalleNivelLinea.getWidth(),NivelLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNivelLinea.jContentPaneDetalleNivelLinea.getWidth(),NivelLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionConfig();
					}

					if(LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLinea();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNivelLinea.setVisible(true);
	        this.jInternalFrameDetalleFormNivelLinea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNivelLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNivelLinea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNivelLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelLinea,false,this);
				} else {
					this.jInternalFrameOrderByNivelLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelLinea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNivelLinea);
				this.jInternalFrameOrderByNivelLinea.setVisible(false);
				this.jInternalFrameOrderByNivelLinea.setSelected(false);
				
				this.jInternalFrameOrderByNivelLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelLinea"));
				
				this.inicializarActualizarBindingTablaOrderByNivelLinea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNivelLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNivelLinea==null) {
				
				this.jInternalFrameImportacionNivelLinea=new ImportacionJInternalFrame(NivelLineaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelLinea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNivelLinea);
				this.jInternalFrameImportacionNivelLinea.setVisible(false);
				this.jInternalFrameImportacionNivelLinea.setSelected(false);


				this.jInternalFrameImportacionNivelLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelLinea"));
				this.jInternalFrameImportacionNivelLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelLinea"));
				this.jInternalFrameImportacionNivelLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelLinea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNivelLinea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNivelLinea==null) {
				this.jInternalFrameReporteDinamicoNivelLinea=new ReporteDinamicoJInternalFrame(NivelLineaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelLinea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelLinea);
				this.jInternalFrameReporteDinamicoNivelLinea.setVisible(false);
				this.jInternalFrameReporteDinamicoNivelLinea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNivelLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelLinea"));
				this.jInternalFrameReporteDinamicoNivelLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelLinea"));
				this.jInternalFrameReporteDinamicoNivelLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelLinea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelLinea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaComisionConfig() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNivelLinea.jContentPaneDetalleNivelLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaLinea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNivelLinea.jContentPaneDetalleNivelLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleNivelLinea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelLinea);
			
	       	this.jInternalFrameDetalleFormNivelLinea.setVisible(false);
	        this.jInternalFrameDetalleFormNivelLinea.setSelected(false);
			
			//this.jInternalFrameDetalleFormNivelLinea.dispose();
			//this.jInternalFrameDetalleFormNivelLinea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNivelLinea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNivelLinea.setVisible(true);
	        this.jInternalFrameReporteDinamicoNivelLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNivelLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNivelLinea.setVisible(true);
	        this.jInternalFrameImportacionNivelLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNivelLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNivelLinea.setVisible(true);
	        this.jInternalFrameOrderByNivelLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNivelLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNivelLinea.setVisible(false);
	        this.jInternalFrameOrderByNivelLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNivelLinea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNivelLinea.setVisible(false);
	        this.jInternalFrameReporteDinamicoNivelLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNivelLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNivelLinea.setVisible(false);
	        this.jInternalFrameImportacionNivelLinea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNivelLinea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNivelLinea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNivelLinea(true);
			//this.isEsNuevoNivelLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNivelLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelLinea(false) ;
			
			if(nivellineaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.getEsGuardarRelacionado() && LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getEsGuardarRelacionado() && ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionConfigActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelLinea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNivelLineaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNivelLinea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNivelLinea(true);
			//this.isEsNuevoNivelLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.nivellinea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNivelLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNivelLinea(false) ;
			
			if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelLinea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNivelLinea(false);
			
			//if(!this.isEsNuevoNivelLinea) {								
				int intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
				
			}
			
			if(this.permiteMantenimiento(this.nivellinea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNivelLinea=true;
					this.inicializarActualizarBindingTablaNivelLinea(false);
					this.isEsNuevoNivelLinea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNivelLinea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNivelLinea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelLinea(false);
				
				this.habilitarDeshabilitarControlesNivelLinea(false);
			
												
				
				if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNivelLinea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNivelLineaActionPerformed(evt,nivellineaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNivelLinea(this.nivellinea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNivelLinea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,nivellineaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.nivellinea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNivelLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				this.nivellinea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				this.nivellinea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.nivellinea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NivelLineaModel) this.jTableDatosNivelLinea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNivelLinea=true;
				this.inicializarActualizarBindingTablaNivelLinea(false);
				this.isEsNuevoNivelLinea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelLinea(false);
				
				this.habilitarDeshabilitarControlesNivelLinea(false);
				
				
				
				if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNivelLinea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNivelLineaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNivelLinea.getRowCount()>=1) {
				jTableDatosNivelLinea.removeRowSelectionInterval(0, jTableDatosNivelLinea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNivelLinea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNivelLinea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelLinea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelLinea(false) ;
			
			this.isEsNuevoNivelLinea=false;
			
			if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNivelLinea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNivelLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNivelLinea(false);
				
				//SI ES MANUAL
				if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNivelLinea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNivelLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNivelLinea--;			
			//NivelLinea nivellineaAux= new NivelLinea();			
			//nivellineaAux.setId(this.iIdNuevoNivelLinea);
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNivelLinea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
			
			this.nivellinea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.nivellineaLogic.getNivelLineas().add(this.nivellineaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.nivellineas.add(this.nivellineaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNivelLinea(false);
			
			this.jTableDatosNivelLinea.setRowSelectionInterval(this.getIndiceNuevoNivelLinea(), this.getIndiceNuevoNivelLinea());
			
			int iLastRow =  this.jTableDatosNivelLinea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNivelLinea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNivelLinea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNivelLinea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNivelLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNivelLinea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelLinea(false);
			
			//SI ES MANUAL
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelLinea();
			}
			
			//this.abrirFrameTreeNivelLinea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNivelLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Nivel LineaS ?", "MANTENIMIENTO DE Nivel Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNivelLinea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNivelLinea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.nivellineaReturnGeneral=nivellineaLogic.procesarImportacionNivelLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.nivellineaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNivelLineaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNivelLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNivelLinea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNivelLinea.setFileImportacion(this.jInternalFrameImportacionNivelLinea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNivelLinea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNivelLinea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNivelLinea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNivelLinea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNivelLineaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		

		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NivelLineaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NivelLineaBaseDesign.jrxml";
			
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
			
			this.generarReporteNivelLineas("Todos",nivellineasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelLineaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoNivelLinea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NivelLineaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NivelLineaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelLineaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoNivelLineaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NivelLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NivelLineaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelLineaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(NivelLinea nivellinea:nivellineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivellinea.getnombre());
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
			//	this.getFilaCabeceraExportarExcelNivelLinea(row);				
			//	iRow++;
			//}				
			
			//for(NivelLinea nivellineaAux:nivellineasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNivelLinea(nivellineaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
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
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelLinea(false);
			
			//SI ES MANUAL
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelLinea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNivelLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelLinea(false);
			
			//SI ES MANUAL
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelLinea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNivelLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelLinea(false);
			
			//SI ES MANUAL
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelLinea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivellineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNivelLinea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNivelLinea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNivelLinea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNivelLinea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNivelLinea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNivelLinea.setMinimumSize(dimensionMinimum);
		this.jTableDatosNivelLinea.setMaximumSize(dimensionMaximum);
		this.jTableDatosNivelLinea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNivelLinea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNivelLinea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNivelLinea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNivelLinea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNivelLinea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNivelLinea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelLinea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNivelLinea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NivelLineaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNivelLinea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNivelLinea();
		
		this.inicializarActualizarBindingBotonesManualNivelLinea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNivelLinea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelLinea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNivelLinea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNivelLinea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNivelLinea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNivelLinea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNivelLinea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNivelLinea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNivelLinea.jCheckBoxPostAccionNuevoNivelLinea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNivelLinea.jCheckBoxPostAccionSinCerrarNivelLinea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNivelLinea.jCheckBoxPostAccionSinMensajeNivelLinea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNivelLinea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNivelLinea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNivelLinea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNivelLinea!=null) {
				this.jInternalFrameDetalleFormNivelLinea.jCheckBoxPostAccionNuevoNivelLinea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNivelLinea.jCheckBoxPostAccionSinCerrarNivelLinea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNivelLinea.jCheckBoxPostAccionSinMensajeNivelLinea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNivelLinea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNivelLinea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNivelLinea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNivelLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNivelLinea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNivelLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNivelLinea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNivelLinea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNivelLinea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNivelLinea(Boolean esInicializar) throws Exception {
		try	{	
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNivelLinea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNivelLinea() throws Exception {
		try	{
			if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelLinea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelLinea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelLinea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNivelLinea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNivelLinea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNivelLinea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNivelLinea.addItem(reporte);
			}
			
			
			if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNivelLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNivelLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNivelLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNivelLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNivelLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNivelLinea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNivelLinea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelLinea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelLinea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
				this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
				this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelLinea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
				
				if(this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelLinea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNivelLinea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelLinea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelLinea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNivelLinea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNivelLinea(Boolean esInicializar) throws Exception {				
		if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNivelLinea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNivelLinea() throws Exception {
		this.inicializarActualizarBindingTablaNivelLinea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNivelLinea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NivelLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NivelLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNivelLineaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelLineaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NivelLineaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NivelLineaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNivelLinea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=nivellineaLogic.getNivelLineas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=nivellineas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNivelLinea.setModel(new NivelLineaModel(this.nivellineaLogic.getNivelLineas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNivelLinea.setModel(new NivelLineaModel(this.nivellineas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNivelLinea!=null && this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNivelLinea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNivelLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelLinea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NivelLineaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NivelLineaConstantesFunciones.SCLASSWEBTITULO,nivellineaConstantesFunciones.resaltarSeleccionarNivelLinea,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NivelLineaConstantesFunciones.SCLASSWEBTITULO,nivellineaConstantesFunciones.resaltarSeleccionarNivelLinea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNivelLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelLinea,NivelLineaConstantesFunciones.LABEL_ID));

		if(this.nivellineaConstantesFunciones.mostraridNivelLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelLineaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivellineaConstantesFunciones.resaltaridNivelLinea,this.nivellineaConstantesFunciones.activaridNivelLinea,this,true,"idNivelLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivellineaConstantesFunciones.resaltaridNivelLinea,this.nivellineaConstantesFunciones.activaridNivelLinea,this,true,"idNivelLinea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelLinea,NivelLineaConstantesFunciones.LABEL_NOMBRE));

		if(this.nivellineaConstantesFunciones.mostrarnombreNivelLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelLineaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.nivellineaConstantesFunciones.resaltarnombreNivelLinea,this.nivellineaConstantesFunciones.activarnombreNivelLinea,this,true,"nombreNivelLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivellineaConstantesFunciones.resaltarnombreNivelLinea,this.nivellineaConstantesFunciones.activarnombreNivelLinea,this,true,"nombreNivelLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NivelLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosLinea && this.nivellineaConstantesFunciones.mostrarLineaNivelLinea && !NivelLineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Lineas");
				tableColumn.setHeaderValue("Lineas");
				tableColumn.setCellRenderer(new LineaTableCell(nivellineaConstantesFunciones.resaltarLineaNivelLinea,this,this.nivellineaConstantesFunciones.activarLineaNivelLinea));
				tableColumn.setCellEditor(new LineaTableCell(nivellineaConstantesFunciones.resaltarLineaNivelLinea,this,this.nivellineaConstantesFunciones.activarLineaNivelLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNivelLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionConfig && this.nivellineaConstantesFunciones.mostrarComisionConfigNivelLinea && !NivelLineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Configes");
				tableColumn.setHeaderValue("Comision Configes");
				tableColumn.setCellRenderer(new ComisionConfigTableCell(nivellineaConstantesFunciones.resaltarComisionConfigNivelLinea,this,this.nivellineaConstantesFunciones.activarComisionConfigNivelLinea));
				tableColumn.setCellEditor(new ComisionConfigTableCell(nivellineaConstantesFunciones.resaltarComisionConfigNivelLinea,this,this.nivellineaConstantesFunciones.activarComisionConfigNivelLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNivelLinea.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivellineaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivellineaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelLinea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivellineaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivellineaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelLinea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNivelLinea && this.isPermisoGuardarCambiosNivelLinea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.nivellineaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.nivellineaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNivelLinea.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.nivellineaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosNivelLinea.addColumn(tableColumn);
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
			
			this.jTableDatosNivelLinea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelLinea && this.isPermisoGuardarCambiosNivelLinea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.nivellineaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelLinea && this.isPermisoGuardarCambiosNivelLinea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNivelLinea.moveColumn(this.jTableDatosNivelLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNivelLinea.moveColumn(this.jTableDatosNivelLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.nivellineaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosNivelLinea.moveColumn(this.jTableDatosNivelLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNivelLinea.moveColumn(this.jTableDatosNivelLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNivelLinea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNivelLinea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNivelLinea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNivelLinea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNivelLinea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNivelLinea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNivelLinea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNivelLinea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=nivellineaLogic.getNivelLineas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=nivellineas.size()-1;
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
		//this.jTableDatosNivelLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNivelLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNivelLinea();
			
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
				
				//this.isEsNuevoNivelLinea=false;
					
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
				if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNivelLinea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelLinea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.nivellinea.getsType().equals("DUPLICADO")
				   || this.nivellinea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNivelLinea=true;
				
				} else {
					this.isEsNuevoNivelLinea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
					if(this.nivellinea.getId()>=0 && !this.nivellinea.getIsNew()) {						
						this.isEsNuevoNivelLinea=false;
						
					} else {
						this.isEsNuevoNivelLinea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNivelLinea(esRelaciones);						
				
				this.seleccionarNivelLinea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.nivellinea.getId()<0) {
					this.isEsNuevoNivelLinea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNivelLinea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNivelLinea(evt,rowIndex);
				}	
				
				if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NivelLinea: " + this.dDif); 
					}
				}								
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNivelLinea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.nivellinea)) {
					if(this.nivellinea.getId()>0) {
						this.nivellinea.setIsDeleted(true);
						
						this.nivellineasEliminados.add(this.nivellinea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivellineaLogic.getNivelLineas().remove(this.nivellinea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivellineas.remove(this.nivellinea);				
					}
					
					
					((NivelLineaModel) this.jTableDatosNivelLinea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelLinea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNivelLinea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNivelLinea) {
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelLinea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNivelLinea(this.nivellinea);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNivelLinea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNivelLinea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelLinea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelLinea(NivelLinea nivellinea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNivelLinea(nivellinea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelLinea(NivelLinea nivellinea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNivelLinea(nivellinea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNivelLinea(nivellinea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNivelLinea(nivellinea);
	}
	
	public void setVariablesObjetoActualToFormularioNivelLinea(NivelLinea nivellinea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setText(nivellinea.getId().toString());
			this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setText(nivellinea.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NivelLinea nivellineaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,nivellineaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NivelLinea nivellineaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				nivellineaLocal=this.nivellinea;
			} else {
				nivellineaLocal=this.nivellineaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(nivellineaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNivelLinea(nivellineaLocal,true);
					
					if(nivellineaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(nivellineaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(nivellineaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNivelLinea(NivelLinea nivellinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelLinea(nivellinea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(nivellinea);
	}
	
	public void setVariablesFormularioToObjetoActualNivelLinea(NivelLinea nivellinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelLinea(nivellinea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNivelLinea(NivelLinea nivellinea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.getText()==null || this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.getText()=="" || this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.getText()=="Id") {
				this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setText("0");
			}

			if(conColumnasBase) {nivellinea.setId(Long.parseLong(this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelLineaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelLinea.jLabelIdNivelLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivellinea.setnombre(this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelLineaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelLinea.jLabelnombreNivelLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelLinea(NivelLinea nivellineaBean,NivelLinea nivellinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNivelLinea(NivelLinea nivellineaOrigen,NivelLinea nivellinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivellineaOrigen.getId()!=null && !nivellineaOrigen.getId().equals(0L))) {nivellinea.setId(nivellineaOrigen.getId());}}
			if(conDefault || (!conDefault && nivellineaOrigen.getnombre()!=null && !nivellineaOrigen.getnombre().equals(""))) {nivellinea.setnombre(nivellineaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelLinea(NivelLinea nivellinea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setText(nivellinea.getId().toString());
			this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setText(nivellinea.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelLinea(NivelLineaBean nivellineaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setText(nivellineaBean.getId().toString());
			this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setText(nivellineaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNivelLinea(NivelLineaParameterReturnGeneral nivellineaReturnGeneral,NivelLineaBean nivellineaBean,Boolean conDefault) throws Exception { 
		try {
			NivelLinea nivellineaLocal=new NivelLinea();
			
			nivellineaLocal=nivellineaReturnGeneral.getNivelLinea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivellineaLocal.getId()!=null && !nivellineaLocal.getId().equals(0L))) {nivellineaBean.setId(nivellineaLocal.getId());}}
			if(conDefault || (!conDefault && nivellineaLocal.getnombre()!=null && !nivellineaLocal.getnombre().equals(""))) {nivellineaBean.setnombre(nivellineaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNivelLineaGenerico(Long idNivelLineaSeleccionado,JComboBox jComboBoxNivelLinea,List<NivelLinea> nivellineasLocal)throws Exception {
		try {
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasLocal) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}

			jComboBoxNivelLinea.setSelectedItem(nivellineaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNivelLineaGenerico(JComboBox jComboBoxNivelLinea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNivelLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNivelLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelLinea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNivelLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelLinea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNivelLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNivelLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNivelLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Linea")) {
			jButtonLineaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionConfig")) {
			jButtonComisionConfigActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivellinea=(NivelLinea) nivellineaLogic.getNivelLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivellinea =(NivelLinea) nivellineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NivelLinea nivellineaRow=new NivelLinea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivellineaRow=(NivelLinea) nivellineaLogic.getNivelLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivellineaRow=(NivelLinea) nivellineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonLineaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NivelLinea nivellinea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNivelLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivellinea = (NivelLinea)this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.nivellinea = (NivelLinea)this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(nivellinea!=null) {
						this.nivellinea = nivellinea;
					} else {
						this.nivellinea = new NivelLinea();
					}
				}

				if(this.isTienePermisosLinea && this.permiteMantenimiento(this.nivellinea)) {
					LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup=new LineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						lineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup;
					} else {
						lineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame;
					}

					List<NivelLinea> nivellineas=new ArrayList<NivelLinea>();
					nivellineas.add(this.nivellinea);
					if(!esRelacionado) {
						//lineaBeanSwingJInternalFrame.lineaSessionBean.setConGuardarRelaciones(false);
						//lineaBeanSwingJInternalFrame.lineaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					lineaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNivelLinea.cargarLineaBeanSwingJInternalFrame(nivellineas,this.nivellinea,lineaBeanSwingJInternalFrame,/*conInicializar,*/lineaBeanSwingJInternalFrame.lineaSessionBean.getConGuardarRelaciones(),lineaBeanSwingJInternalFrame.lineaSessionBean.getEsGuardarRelacionado());
					lineaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						lineaBeanSwingJInternalFrame.actualizarEstadoPanelsLinea("no_relacionado");

						lineaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LineaConstantesFunciones.ITAMANIOFILATABLA + (LineaConstantesFunciones.ITAMANIOFILATABLA/2));

						lineaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNivelLinea=(TitledBorder)this.jScrollPanelDatosNivelLinea.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderNivelLinea.getTitle() + " -> Linea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}

						lineaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

						lineaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.nivellineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Linea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionConfigActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NivelLinea nivellinea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNivelLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivellinea = (NivelLinea)this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.nivellinea = (NivelLinea)this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(nivellinea!=null) {
						this.nivellinea = nivellinea;
					} else {
						this.nivellinea = new NivelLinea();
					}
				}

				if(this.isTienePermisosComisionConfig && this.permiteMantenimiento(this.nivellinea)) {
					ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup=new ComisionConfigBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionconfigBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup;
					} else {
						comisionconfigBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame;
					}

					List<NivelLinea> nivellineas=new ArrayList<NivelLinea>();
					nivellineas.add(this.nivellinea);
					if(!esRelacionado) {
						//comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setConGuardarRelaciones(false);
						//comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionconfigBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNivelLinea.cargarComisionConfigBeanSwingJInternalFrame(nivellineas,this.nivellinea,comisionconfigBeanSwingJInternalFrame,/*conInicializar,*/comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getConGuardarRelaciones(),comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getEsGuardarRelacionado());
					comisionconfigBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionconfigBeanSwingJInternalFrame.actualizarEstadoPanelsComisionConfig("no_relacionado");

						comisionconfigBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionConfigConstantesFunciones.ITAMANIOFILATABLA + (ComisionConfigConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionconfigBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNivelLinea=(TitledBorder)this.jScrollPanelDatosNivelLinea.getBorder();
						TitledBorder titledBorderComisionConfig=(TitledBorder)comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

						titledBorderComisionConfig.setTitle(titledBorderNivelLinea.getTitle() + " -> Comision Config");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionconfigBeanSwingJInternalFrame);
						}

						comisionconfigBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionconfigBeanSwingJInternalFrame);

						comisionconfigBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.nivellineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Config",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNivelLinea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNivelLinea.setVisible((this.isVisibilidadCeldaNuevoNivelLinea && this.isPermisoNuevoNivelLinea));			
			this.jButtonDuplicarNivelLinea.setVisible((this.isVisibilidadCeldaDuplicarNivelLinea && this.isPermisoDuplicarNivelLinea));			
			this.jButtonCopiarNivelLinea.setVisible((this.isVisibilidadCeldaCopiarNivelLinea && this.isPermisoCopiarNivelLinea));
			this.jButtonVerFormNivelLinea.setVisible((this.isVisibilidadCeldaVerFormNivelLinea && this.isPermisoVerFormNivelLinea));
			
			this.jButtonAbrirOrderByNivelLinea.setVisible((this.isVisibilidadCeldaOrdenNivelLinea && this.isPermisoOrdenNivelLinea));			
			
			this.jButtonNuevoRelacionesNivelLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelLinea && this.isPermisoNuevoNivelLinea));			
			this.jButtonNuevoGuardarCambiosNivelLinea.setVisible((this.isVisibilidadCeldaNuevoNivelLinea && this.isPermisoNuevoNivelLinea && this.isPermisoGuardarCambiosNivelLinea));
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonModificarNivelLinea.setVisible((this.isVisibilidadCeldaModificarNivelLinea && this.isPermisoActualizarNivelLinea));	
			this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarNivelLinea.setVisible((this.isVisibilidadCeldaActualizarNivelLinea && this.isPermisoActualizarNivelLinea));	
			this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarNivelLinea.setVisible((this.isVisibilidadCeldaEliminarNivelLinea && this.isPermisoEliminarNivelLinea));
			this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarNivelLinea.setVisible(this.isVisibilidadCeldaCancelarNivelLinea);							
			this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.setVisible((this.isVisibilidadCeldaGuardarNivelLinea && this.isPermisoGuardarCambiosNivelLinea));			
			
			}
						
			this.jButtonGuardarCambiosTablaNivelLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelLinea && this.isPermisoGuardarCambiosNivelLinea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNivelLinea.setVisible((this.isVisibilidadCeldaNuevoNivelLinea && this.isPermisoNuevoNivelLinea));						
			this.jButtonDuplicarToolBarNivelLinea.setVisible((this.isVisibilidadCeldaDuplicarNivelLinea && this.isPermisoDuplicarNivelLinea));						
			this.jButtonCopiarToolBarNivelLinea.setVisible((this.isVisibilidadCeldaCopiarNivelLinea && this.isPermisoCopiarNivelLinea));			
			this.jButtonVerFormToolBarNivelLinea.setVisible((this.isVisibilidadCeldaVerFormNivelLinea && this.isPermisoVerFormNivelLinea));			
			this.jButtonAbrirOrderByToolBarNivelLinea.setVisible((this.isVisibilidadCeldaOrdenNivelLinea && this.isPermisoOrdenNivelLinea));
			this.jButtonNuevoRelacionesToolBarNivelLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelLinea && this.isPermisoNuevoNivelLinea));			
			this.jButtonNuevoGuardarCambiosToolBarNivelLinea.setVisible((this.isVisibilidadCeldaNuevoNivelLinea && this.isPermisoNuevoNivelLinea && this.isPermisoGuardarCambiosNivelLinea));			
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonModificarToolBarNivelLinea.setVisible((this.isVisibilidadCeldaModificarNivelLinea && this.isPermisoActualizarNivelLinea));	
			this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarToolBarNivelLinea.setVisible((this.isVisibilidadCeldaActualizarNivelLinea  && this.isPermisoActualizarNivelLinea));	
			this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarToolBarNivelLinea.setVisible((this.isVisibilidadCeldaEliminarNivelLinea && this.isPermisoEliminarNivelLinea));
			this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarToolBarNivelLinea.setVisible(this.isVisibilidadCeldaCancelarNivelLinea);				
			this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosToolBarNivelLinea.setVisible((this.isVisibilidadCeldaGuardarNivelLinea && this.isPermisoGuardarCambiosNivelLinea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNivelLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelLinea && this.isPermisoGuardarCambiosNivelLinea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNivelLinea.setVisible((this.isVisibilidadCeldaNuevoNivelLinea && this.isPermisoNuevoNivelLinea));			
			this.jMenuItemDuplicarNivelLinea.setVisible((this.isVisibilidadCeldaDuplicarNivelLinea && this.isPermisoDuplicarNivelLinea));			
			this.jMenuItemCopiarNivelLinea.setVisible((this.isVisibilidadCeldaCopiarNivelLinea && this.isPermisoCopiarNivelLinea));			
			this.jMenuItemVerFormNivelLinea.setVisible((this.isVisibilidadCeldaVerFormNivelLinea && this.isPermisoVerFormNivelLinea));			
			this.jMenuItemAbrirOrderByNivelLinea.setVisible((this.isVisibilidadCeldaOrdenNivelLinea && this.isPermisoOrdenNivelLinea));			
			//this.jMenuItemMostrarOcultarNivelLinea.setVisible((this.isVisibilidadCeldaOrdenNivelLinea && this.isPermisoOrdenNivelLinea));
			this.jMenuItemDetalleAbrirOrderByNivelLinea.setVisible((this.isVisibilidadCeldaOrdenNivelLinea && this.isPermisoOrdenNivelLinea));			
			//this.jMenuItemDetalleMostrarOcultarNivelLinea.setVisible((this.isVisibilidadCeldaOrdenNivelLinea && this.isPermisoOrdenNivelLinea));			
			this.jMenuItemNuevoRelacionesNivelLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelLinea && this.isPermisoNuevoNivelLinea));			
			this.jMenuItemNuevoGuardarCambiosNivelLinea.setVisible((this.isVisibilidadCeldaNuevoNivelLinea && this.isPermisoNuevoNivelLinea && this.isPermisoGuardarCambiosNivelLinea));									
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemModificarNivelLinea.setVisible((this.isVisibilidadCeldaModificarNivelLinea && this.isPermisoActualizarNivelLinea));	
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemActualizarNivelLinea.setVisible((this.isVisibilidadCeldaActualizarNivelLinea && this.isPermisoActualizarNivelLinea));	
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemEliminarNivelLinea.setVisible((this.isVisibilidadCeldaEliminarNivelLinea && this.isPermisoEliminarNivelLinea));
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemCancelarNivelLinea.setVisible(this.isVisibilidadCeldaCancelarNivelLinea);				
			}
			
			this.jMenuItemGuardarCambiosNivelLinea.setVisible((this.isVisibilidadCeldaGuardarNivelLinea && this.isPermisoGuardarCambiosNivelLinea));						
			this.jMenuItemGuardarCambiosTablaNivelLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelLinea && this.isPermisoGuardarCambiosNivelLinea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNivelLinea=this.jButtonNuevoNivelLinea.isVisible();
			this.isVisibilidadCeldaDuplicarNivelLinea=this.jButtonDuplicarNivelLinea.isVisible();
			this.isVisibilidadCeldaCopiarNivelLinea=this.jButtonCopiarNivelLinea.isVisible();
			this.isVisibilidadCeldaVerFormNivelLinea=this.jButtonVerFormNivelLinea.isVisible();
			
			this.isVisibilidadCeldaOrdenNivelLinea=this.jButtonAbrirOrderByNivelLinea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=this.jButtonNuevoRelacionesNivelLinea.isVisible();
			this.isVisibilidadCeldaModificarNivelLinea=this.jButtonModificarNivelLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.isVisibilidadCeldaActualizarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarNivelLinea.isVisible();
			this.isVisibilidadCeldaEliminarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarNivelLinea.isVisible();
			this.isVisibilidadCeldaCancelarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarNivelLinea.isVisible();
			this.isVisibilidadCeldaGuardarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=this.jButtonGuardarCambiosTablaNivelLinea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNivelLinea=this.jButtonNuevoToolBarNivelLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=this.jButtonNuevoRelacionesToolBarNivelLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.isVisibilidadCeldaModificarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonModificarToolBarNivelLinea.isVisible();
			this.isVisibilidadCeldaActualizarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarToolBarNivelLinea.isVisible();
			this.isVisibilidadCeldaEliminarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarToolBarNivelLinea.isVisible();
			this.isVisibilidadCeldaCancelarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarToolBarNivelLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelLinea=this.jButtonGuardarCambiosToolBarNivelLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=this.jButtonGuardarCambiosTablaToolBarNivelLinea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNivelLinea=this.jMenuItemNuevoNivelLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=this.jMenuItemNuevoRelacionesNivelLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.isVisibilidadCeldaModificarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jMenuItemModificarNivelLinea.isVisible();
			this.isVisibilidadCeldaActualizarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jMenuItemActualizarNivelLinea.isVisible();
			this.isVisibilidadCeldaEliminarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jMenuItemEliminarNivelLinea.isVisible();
			this.isVisibilidadCeldaCancelarNivelLinea=this.jInternalFrameDetalleFormNivelLinea.jMenuItemCancelarNivelLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelLinea=this.jMenuItemGuardarCambiosNivelLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=this.jMenuItemGuardarCambiosTablaNivelLinea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNivelLinea(Boolean esInicializar) {
		if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
				//if(this.nivellineaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNivelLinea();
			}
			
			this.inicializarActualizarBindingBotonesManualNivelLinea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNivelLinea() {
		this.jButtonNuevoNivelLinea.setVisible(this.isPermisoNuevoNivelLinea);			
		this.jButtonDuplicarNivelLinea.setVisible(this.isPermisoDuplicarNivelLinea);			
		this.jButtonCopiarNivelLinea.setVisible(this.isPermisoCopiarNivelLinea);			
		this.jButtonVerFormNivelLinea.setVisible(this.isPermisoVerFormNivelLinea);			
		
		this.jButtonAbrirOrderByNivelLinea.setVisible(this.isPermisoOrdenNivelLinea);					
		
		this.jButtonNuevoRelacionesNivelLinea.setVisible(this.isPermisoNuevoNivelLinea);			
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonModificarNivelLinea.setVisible(this.isPermisoActualizarNivelLinea);	
			this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarNivelLinea.setVisible(this.isPermisoActualizarNivelLinea);	
			this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarNivelLinea.setVisible(this.isPermisoEliminarNivelLinea);
			this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarNivelLinea.setVisible(this.isVisibilidadCeldaCancelarNivelLinea);						
			this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.setVisible(this.isPermisoGuardarCambiosNivelLinea);							
		}
		
		this.jButtonGuardarCambiosTablaNivelLinea.setVisible(this.isPermisoActualizarNivelLinea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelLinea() {
		this.jInternalFrameDetalleFormNivelLinea.jButtonModificarNivelLinea.setVisible(this.isPermisoActualizarNivelLinea);	
		this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarNivelLinea.setVisible(this.isPermisoActualizarNivelLinea);	
		this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarNivelLinea.setVisible(this.isPermisoEliminarNivelLinea);
		this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarNivelLinea.setVisible(this.isVisibilidadCeldaCancelarNivelLinea);							
		this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.setVisible((this.isVisibilidadCeldaGuardarNivelLinea && this.isPermisoGuardarCambiosNivelLinea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNivelLinea() {
		if(NivelLineaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNivelLinea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNivelLinea() {
	}
	
	public void jTableDatosNivelLineaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNivelLinea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNivelLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelLinea(this.getnivellinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivellinea==null) {
						this.nivellinea = new NivelLinea();
					}

					this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
				}

				if(this.nivellinea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.nivellinea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreNivelLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelLinea(this.getnivellinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivellinea==null) {
						this.nivellinea = new NivelLinea();
					}

					this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);
				}

				if(this.nivellinea.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.nivellinea.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameNivelLinea() {
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
		

		if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
			this.jInternalFrameDetalleFormNivelLinea.setVisible(false);	    			
			this.jInternalFrameDetalleFormNivelLinea.dispose();
			this.jInternalFrameDetalleFormNivelLinea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
			this.jInternalFrameReporteDinamicoNivelLinea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNivelLinea.dispose();
			this.jInternalFrameReporteDinamicoNivelLinea=null;
		}
		
		if(this.jInternalFrameImportacionNivelLinea!=null) {
			this.jInternalFrameImportacionNivelLinea.setVisible(false);	    			
			this.jInternalFrameImportacionNivelLinea.dispose();
			this.jInternalFrameImportacionNivelLinea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNivelLinea();
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			
			if(sTipo.equals("NuevoNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNivelLinea")) {
				jButtonDuplicarNivelLineaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNivelLinea")) {
				jButtonCopiarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormNivelLinea")) {
				jButtonVerFormNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNivelLinea")) {
				jButtonDuplicarNivelLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNivelLinea")) {
				jButtonDuplicarNivelLineaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNivelLinea")) {
				jButtonModificarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNivelLinea")) {
				jButtonModificarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNivelLinea")) {
				jButtonModificarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNivelLinea")) {
				jButtonActualizarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNivelLinea")) {
				jButtonActualizarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNivelLinea")) {
				jButtonActualizarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarNivelLinea")) {
				jButtonEliminarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNivelLinea")) {
				jButtonEliminarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNivelLinea")) {
				jButtonEliminarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarNivelLinea")) {
				jButtonCancelarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNivelLinea")) {
				jButtonCancelarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNivelLinea")) {
				jButtonCancelarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarNivelLinea")) {
				jButtonCerrarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNivelLinea")) {
				jButtonCerrarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNivelLinea")) {
				jButtonCerrarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNivelLinea")) {
				jButtonMostrarOcultarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNivelLinea")) {
				jButtonCancelarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNivelLinea")) {
				jButtonCopiarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNivelLinea")) {
				jButtonVerFormNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNivelLinea")) {
				jButtonCopiarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNivelLinea")) {
				jButtonVerFormNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNivelLinea")) {
				jButtonRecargarInformacionNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNivelLinea")) {
				jButtonRecargarInformacionNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNivelLinea")) {
				jButtonRecargarInformacionNivelLineaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNivelLinea")) {
				jButtonAnterioresNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNivelLinea")) {
				jButtonAnterioresNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNivelLinea")) {
				jButtonAnterioresNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNivelLinea")) {
				jButtonSiguientesNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNivelLinea")) {
				jButtonSiguientesNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNivelLinea")) {
				jButtonSiguientesNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNivelLinea") || sTipo.equals("MenuItemDetalleAbrirOrderByNivelLinea")) {
				jButtonAbrirOrderByNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNivelLinea") || sTipo.equals("MenuItemDetalleMostrarOcultarNivelLinea")) {
				jButtonMostrarOcultarNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNivelLinea")) {
				jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNivelLinea")) {
				jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNivelLinea")) {
				jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNivelLinea")) {
				jButtonCerrarReporteDinamicoNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNivelLinea")) {
				jButtonGenerarReporteDinamicoNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNivelLinea")) {
				
				jButtonGenerarExcelReporteDinamicoNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNivelLinea")) {
				jButtonCerrarImportacionNivelLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNivelLinea")) {
				
				jButtonGenerarImportacionNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNivelLinea")) {
				
				jButtonAbrirImportacionNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNivelLinea")) {
				jComboBoxTiposAccionesNivelLineaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNivelLinea")) {
				jComboBoxTiposRelacionesNivelLineaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNivelLinea")) {
				jComboBoxTiposAccionesNivelLineaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNivelLinea")) {
				
				jComboBoxTiposSeleccionarNivelLineaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNivelLinea")) {
				jTextFieldValorCampoGeneralNivelLineaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNivelLinea")) {
				jButtonAbrirOrderByNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNivelLinea")) {
				jButtonAbrirOrderByNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNivelLinea")) {
				jButtonCerrarOrderByNivelLineaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelLineaBusqueda")) {
				this.jButtonidNivelLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNivelLineaBusqueda")) {
				this.jButtonnombreNivelLineaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNivelLinea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NivelLinea nivellineaLocal=null;
			
			if(!this.getEsControlTabla()) {
				nivellineaLocal=this.nivellinea;
			} else {
				nivellineaLocal=this.nivellineaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
							
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
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
			
			


			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
								
						
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
								
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
							
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
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
			
			


			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
								
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNivelLinea")) {
					jCheckBoxSeleccionarTodosNivelLineaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNivelLinea")) {
					jCheckBoxSeleccionadosNivelLineaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNivelLinea")) {
					
				}
				
				


				
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
												
				
				


				
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
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
			
			


			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivellinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivellinea);
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
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
				
				


				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelLinea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivellineaAnterior =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNivelLinea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNivelLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNivelLinea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.nivellinea =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.nivellinea =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.nivellinea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNivelLinea")) {
				
				}
				
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNivelLinea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNivelLinea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNivelLinea")) {
			
			}
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNivelLinea();
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			if(sTipo.equals("NuevoNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNivelLinea")) {
				jButtonDuplicarNivelLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNivelLinea")) {
				jButtonCopiarNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNivelLinea")) {
				jButtonVerFormNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNivelLinea")) {
				jButtonNuevoNivelLineaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNivelLinea")) {
				jButtonModificarNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNivelLinea")) {
				jButtonActualizarNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNivelLinea")) {
				jButtonEliminarNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNivelLinea")) {
				jButtonCancelarNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNivelLinea")) {
				jButtonCerrarNivelLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNivelLinea")) {
				jButtonGuardarCambiosNivelLineaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNivelLinea")) {
				jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNivelLinea")) {
				jButtonAbrirOrderByNivelLineaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNivelLinea")) {
				jButtonRecargarInformacionNivelLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNivelLinea")) {
				jButtonAnterioresNivelLineaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNivelLinea")) {
				jButtonSiguientesNivelLineaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelLineaBusqueda")) {
				this.jButtonidNivelLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNivelLineaBusqueda")) {
				this.jButtonnombreNivelLineaBusquedaActionPerformed(evt);
			}
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNivelLinea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNivelLinea")) {
				closingInternalFrameNivelLinea();
				
			} else if(sTipo.equals("jButtonCancelarNivelLinea")) {
				JInternalFrameBase jInternalFrameDetalleFormNivelLinea = (JInternalFrameBase)evt.getSource();
	            	
	            NivelLineaBeanSwingJInternalFrame jInternalFrameParent=(NivelLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelLinea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNivelLineaActionPerformed(null);
			}
			
			NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivellinea,new Object(),this.nivellineaParameterGeneral,this.nivellineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNivelLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNivelLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNivelLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.nivellinea)) {
			if(!esControlTabla) {
				if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);			
				}
				
				if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNivelLinea(this.nivellinea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivellineaReturnGeneral=nivellineaLogic.procesarEventosNivelLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivellineaLogic.getNivelLineas(),this.nivellinea,this.nivellineaParameterGeneral,this.isEsNuevoNivelLinea,classes);//this.nivellineaLogic.getNivelLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNivelLinea(this.nivellineaReturnGeneral,this.nivellineaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNivelLinea(classes,this.nivellineaReturnGeneral,this.nivellineaBean,false);
					}
						
					if(this.nivellineaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNivelLinea(this.nivellineaReturnGeneral.getNivelLinea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNivelLinea(this.nivellineaReturnGeneral.getNivelLinea());	
					}
						
					if(this.nivellineaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNivelLinea(this.nivellineaReturnGeneral.getNivelLinea(),classes);//this.nivellineaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNivelLinea(this.nivellinea,classes);//this.nivellineaBean);									
				}
			
				if(NivelLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNivelLinea(this.nivellinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelLinea(this.nivellinea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.nivellineaAnterior!=null) {
						this.nivellinea=this.nivellineaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivellineaReturnGeneral=nivellineaLogic.procesarEventosNivelLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivellineaLogic.getNivelLineas(),this.nivellinea,this.nivellineaParameterGeneral,this.isEsNuevoNivelLinea,classes);//this.nivellineaLogic.getNivelLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivellineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivellineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.nivellineaReturnGeneral.getNivelLinea(),nivellineaLogic.getNivelLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.nivellineaReturnGeneral.getNivelLinea(),this.nivellineas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNivelLinea.repaint();
				
				//((AbstractTableModel) this.jTableDatosNivelLinea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNivelLinea();
			}
		}
	}
	
	public void actualizarVisualTableDatosNivelLinea() throws Exception {
		
		NivelLineaModel nivellineaModel=(NivelLineaModel)this.jTableDatosNivelLinea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivellineaModel.nivellineas=this.nivellineaLogic.getNivelLineas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			nivellineaModel.nivellineas=this.nivellineas;
		}
		
		
		((NivelLineaModel) this.jTableDatosNivelLinea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNivelLinea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnivellineaAnterior(),this.nivellineaLogic.getNivelLineas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnivellineaAnterior(),this.nivellineas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNivelLinea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNivelLinea(NivelLinea nivellinea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Linea.class)) {
					this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(nivellinea.getLineas());
					this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionConfig.class)) {
					this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(nivellinea.getComisionConfigs());
					this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
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
										
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivellinea,new Object(),generalEntityParameterGeneral,this.nivellineaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.nivellineaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NivelLineaConstantesFunciones.getClassesRelationshipsOfNivelLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NivelLineaConstantesFunciones.getClassesRelationshipsFromStringsOfNivelLinea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNivelLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NivelLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivellinea,new Object(),generalEntityParameterGeneral,this.nivellineaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNivelLinea(NivelLineaBean nivellineaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Linea.class)) {
					this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(nivellinea.getLineas());
					this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionConfig.class)) {
					this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(nivellinea.getComisionConfigs());
					this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNivelLinea(ArrayList<Classe> classes,NivelLineaReturnGeneral nivellineaReturnGeneral,NivelLineaBean nivellineaBean,Boolean conDefault) throws Exception {
		
			this.nivellineaBean.setLineas(nivellineaReturnGeneral.getNivelLinea().getLineas());
			this.nivellineaBean.setComisionConfigs(nivellineaReturnGeneral.getNivelLinea().getComisionConfigs());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNivelLinea(NivelLinea nivellinea,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Linea.class)) {
					nivellinea.setLineas(this.jInternalFrameDetalleFormNivelLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionConfig.class)) {
					nivellinea.setComisionConfigs(this.jInternalFrameDetalleFormNivelLinea.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
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
		if(!paraTabla && !this.permiteMantenimiento(this.nivellinea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNivelLinea = new NivelLineaDetalleFormJInternalFrame(jDesktopPane,this.nivellineaSessionBean.getConGuardarRelaciones(),this.nivellineaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelLinea);
		this.jInternalFrameDetalleFormNivelLinea.setVisible(false);
		this.jInternalFrameDetalleFormNivelLinea.setSelected(false);						
		
		this.jInternalFrameDetalleFormNivelLinea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNivelLinea.nivellineaLogic=this.nivellineaLogic;
		
		this.cargarCombosFrameForeignKeyNivelLinea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelLinea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelLinea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNivelLinea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNivelLinea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNivelLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelLinea"));
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonModificarNivelLinea.addActionListener(new ButtonActionListener(this,"ModificarNivelLinea"));

		
		this.jInternalFrameDetalleFormNivelLinea.jButtonModificarToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelLinea"));
					
		this.jInternalFrameDetalleFormNivelLinea.jMenuItemModificarNivelLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelLinea"));		
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarNivelLinea.addActionListener (new ButtonActionListener(this,"ActualizarNivelLinea"));
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelLinea"));
						
		this.jInternalFrameDetalleFormNivelLinea.jMenuItemActualizarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelLinea"));		
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarNivelLinea.addActionListener (new ButtonActionListener(this,"EliminarNivelLinea"));
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelLinea"));
								
		this.jInternalFrameDetalleFormNivelLinea.jMenuItemEliminarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelLinea"));		
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarNivelLinea.addActionListener (new ButtonActionListener(this,"CancelarNivelLinea"));
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelLinea"));
					
		this.jInternalFrameDetalleFormNivelLinea.jMenuItemCancelarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelLinea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jMenuItemDetalleCerrarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelLinea"));		
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelLinea"));
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelLinea"));
		
		
		
		this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelLinea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelLinea.jButtonidNivelLineaBusqueda.addActionListener(new ButtonActionListener(this,"idNivelLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelLinea.jButtonnombreNivelLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombreNivelLineaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelLinea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNivelLinea"));
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelLinea"));
		}
		
		this.jTableDatosNivelLinea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNivelLinea"));
		
		this.jTableDatosNivelLinea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNivelLinea"));
		
		this.jButtonNuevoNivelLinea.addActionListener(new ButtonActionListener(this,"NuevoNivelLinea"));
		
		this.jButtonDuplicarNivelLinea.addActionListener(new ButtonActionListener(this,"DuplicarNivelLinea"));
		
		this.jButtonCopiarNivelLinea.addActionListener(new ButtonActionListener(this,"CopiarNivelLinea"));
		
		this.jButtonVerFormNivelLinea.addActionListener(new ButtonActionListener(this,"VerFormNivelLinea"));
		
		
		this.jButtonNuevoToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"NuevoToolBarNivelLinea"));
			
		this.jButtonDuplicarToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNivelLinea"));
			
		this.jMenuItemNuevoNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNivelLinea"));
			
		this.jMenuItemDuplicarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNivelLinea"));		
		
		
		this.jButtonNuevoRelacionesNivelLinea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNivelLinea"));
		
		
		this.jButtonNuevoRelacionesToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNivelLinea"));
			
		this.jMenuItemNuevoRelacionesNivelLinea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNivelLinea"));		
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonModificarNivelLinea.addActionListener(new ButtonActionListener(this,"ModificarNivelLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonModificarToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelLinea"));
			
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemModificarNivelLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarNivelLinea.addActionListener (new ButtonActionListener(this,"ActualizarNivelLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonActualizarToolBarNivelLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelLinea"));
				
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemActualizarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarNivelLinea.addActionListener (new ButtonActionListener(this,"EliminarNivelLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonEliminarToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelLinea"));
						
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemEliminarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarNivelLinea.addActionListener (new ButtonActionListener(this,"CancelarNivelLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonCancelarToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelLinea"));
			
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemCancelarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelLinea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNivelLinea"));		
		
		
		this.jButtonCerrarNivelLinea.addActionListener (new ButtonActionListener(this,"CerrarNivelLinea"));
		
		
		this.jButtonCerrarToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"CerrarToolBarNivelLinea"));
			
		this.jMenuItemCerrarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNivelLinea"));
			
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jMenuItemDetalleCerrarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosNivelLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelLinea"));
		}
		
		this.jButtonCopiarToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"CopiarToolBarNivelLinea"));
			
		this.jButtonVerFormToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"VerFormToolBarNivelLinea"));
		
		this.jMenuItemGuardarCambiosNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNivelLinea"));
			
		this.jMenuItemCopiarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNivelLinea"));		
		
		this.jMenuItemVerFormNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNivelLinea"));		
		
		
		this.jButtonGuardarCambiosTablaNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelLinea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNivelLinea"));
			
		this.jMenuItemGuardarCambiosTablaNivelLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelLinea"));		
		
		
		
		this.jButtonRecargarInformacionNivelLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionNivelLinea"));
					
		this.jButtonRecargarInformacionToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNivelLinea"));
		
		this.jMenuItemRecargarInformacionNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNivelLinea"));		
		
		
		
		this.jButtonAnterioresNivelLinea.addActionListener (new ButtonActionListener(this,"AnterioresNivelLinea"));
		
		
		this.jButtonAnterioresToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNivelLinea"));
		
		this.jMenuItemAnterioresNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNivelLinea"));		
		
		
		this.jButtonSiguientesNivelLinea.addActionListener (new ButtonActionListener(this,"SiguientesNivelLinea"));
		
		
		this.jButtonSiguientesToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNivelLinea"));
			
		this.jMenuItemSiguientesNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNivelLinea"));
			
		this.jMenuItemAbrirOrderByNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNivelLinea"));
			
		this.jMenuItemMostrarOcultarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNivelLinea"));
			
		this.jMenuItemDetalleAbrirOrderByNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNivelLinea"));
			
		this.jMenuItemDetalleMostarOcultarNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNivelLinea"));		
		
		
		this.jButtonNuevoGuardarCambiosNivelLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNivelLinea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNivelLinea"));
			
		this.jMenuItemNuevoGuardarCambiosNivelLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNivelLinea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNivelLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNivelLinea"));

		this.jCheckBoxSeleccionadosNivelLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNivelLinea"));
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelLinea"));
		}
		
		
		this.jComboBoxTiposRelacionesNivelLinea.addActionListener (new ButtonActionListener(this,"TiposRelacionesNivelLinea"));
			
		this.jComboBoxTiposAccionesNivelLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesNivelLinea"));
					
		this.jComboBoxTiposSeleccionarNivelLinea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNivelLinea"));
			
		this.jTextFieldValorCampoGeneralNivelLinea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNivelLinea"));		
		
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelLinea.jButtonidNivelLineaBusqueda.addActionListener(new ButtonActionListener(this,"idNivelLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelLinea.jButtonnombreNivelLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombreNivelLineaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNivelLinea!=null) {
				this.jInternalFrameReporteDinamicoNivelLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelLinea"));
				this.jInternalFrameReporteDinamicoNivelLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelLinea"));
				this.jInternalFrameReporteDinamicoNivelLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelLinea"));
			}
			
			//this.jButtonCerrarReporteDinamicoNivelLinea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelLinea"));				
			//this.jButtonGenerarReporteDinamicoNivelLinea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelLinea"));
			//this.jButtonGenerarExcelReporteDinamicoNivelLinea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelLinea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNivelLinea!=null) {
				this.jInternalFrameImportacionNivelLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelLinea"));
				this.jInternalFrameImportacionNivelLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelLinea"));
				this.jInternalFrameImportacionNivelLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelLinea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNivelLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByNivelLinea"));
			
			this.jButtonAbrirOrderByToolBarNivelLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNivelLinea"));			
			
			if(this.jInternalFrameOrderByNivelLinea!=null) {
				this.jInternalFrameOrderByNivelLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelLinea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNivelLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelLinea.jTabbedPaneRelacionesNivelLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelLinea"));
		
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
            		closingInternalFrameNivelLinea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNivelLinea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNivelLinea = (JInternalFrameBase)event.getSource();
	            	
	            NivelLineaBeanSwingJInternalFrame jInternalFrameParent=(NivelLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelLinea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNivelLineaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNivelLinea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNivelLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNivelLinea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNivelLinea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNivelLinea";
		inputMap = this.jButtonNuevoNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelLineaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNivelLinea";
		inputMap = this.jButtonNuevoRelacionesNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelLineaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNivelLinea";
		inputMap = this.jButtonModificarNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNivelLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNivelLinea";
		inputMap = this.jButtonActualizarNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNivelLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNivelLinea";
		inputMap = this.jButtonEliminarNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNivelLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNivelLinea";
		inputMap = this.jButtonCancelarNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNivelLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNivelLinea";
		inputMap = this.jButtonCerrarNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNivelLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNivelLinea";
		inputMap = this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNivelLinea.jButtonGuardarCambiosNivelLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNivelLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNivelLinea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNivelLineaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNivelLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNivelLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNivelLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNivelLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNivelLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNivelLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelLinea.jButtonidNivelLineaBusqueda.addActionListener(new ButtonActionListener(this,"idNivelLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelLinea.jButtonnombreNivelLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombreNivelLineaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNivelLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNivelLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNivelLineaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNivelLinea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNivelLinea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
					nivellineaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelLinea nivellineaAux:nivellineas) {
					nivellineaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNivelLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
						nivellineaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelLinea nivellineaAux:nivellineas) {
						nivellineaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelLinea nivellineaAux:nivellineas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNivelLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNivelLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNivelLinea.getSelectedRows();
			
			NivelLinea nivellineaLocal=new NivelLinea();
			
			//this.seleccionarTodosNivelLinea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivellineaLocal =(NivelLinea) this.nivellineaLogic.getNivelLineas().toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					nivellineaLocal =(NivelLinea) this.nivellineas.toArray()[this.jTableDatosNivelLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				nivellineaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
						nivellineaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelLinea nivellineaAux:nivellineas) {
						nivellineaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNivelLinea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNivelLineaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNivelLineaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNivelLineaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNivelLinea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNivelLinea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelLinea nivellineaAux:this.nivellineaLogic.getNivelLineas()) {
				
						if(sTipoSeleccionar.equals(NivelLineaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							nivellineaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelLinea nivellineaAux:nivellineas) {
					
						if(sTipoSeleccionar.equals(NivelLineaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							nivellineaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNivelLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNivelLineaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNivelLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNivelLinea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNivelLinea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNivelLinea) {				
					conSplash=true;//false;										
					
					//this.startProcessNivelLinea(conSplash);
				
					this.generarReporteNivelLineasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNivelLineasSeleccionados();
				//this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelLineasSeleccionados(false);
				//this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelLineasSeleccionados(true);
				//this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelLinea();
				
				this.exportarNivelLineasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNivelLineas();
				//this.importarNivelLineas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelLinea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNivelLineasSeleccionados();
				//this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Nivel Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNivelLinea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNivelLinea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNivelLinea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
				}	
			} 			
			else if(NivelLineaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNivelLinea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNivelLinea(conSplash);
					
						//this.actualizarParametrosGeneralNivelLinea();
						
						this.generarReporteProcesoAccionNivelLineasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NivelLineaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Nivel LineaS SELECCIONADOS?", "MANTENIMIENTO DE Nivel Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNivelLinea();
				
						this.actualizarParametrosGeneralNivelLinea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.nivellineaReturnGeneral=nivellineaLogic.procesarAccionNivelLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.nivellineaLogic.getNivelLineas(),this.nivellineaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNivelLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNivelLinea();
					
					NivelLineaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNivelLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelLinea.jComboBoxTiposAccionesFormularioNivelLinea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNivelLinea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNivelLineaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNivelLinea();
			
			if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
			NivelLinea nivellinea=new NivelLinea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNivelLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNivelLinea.getSelectedItem();
			
			
			
			
			nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
			//this.sTipoAccion;
			
			if(nivellineasSeleccionados.size()==1) {
				for(NivelLinea nivellineaAux:nivellineasSeleccionados) {
					nivellinea=nivellineaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Linea")) {
					jButtonLineaActionPerformed(null,rowIndex,true,false,nivellinea);
				}
				else if(this.sTipoRelacion.equals("Comision Config")) {
					jButtonComisionConfigActionPerformed(null,rowIndex,true,false,nivellinea);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNivelLinea();
			
      		//this.finishProcessNivelLinea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNivelLineaReturnGeneral() throws Exception {
		if(this.nivellineaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.nivellineaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.nivellineaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.nivellineaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.nivellineaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.nivellineaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNivelLinea(false);
		}
		
		if(this.nivellineaReturnGeneral.getConRetornoLista() || this.nivellineaReturnGeneral.getConRetornoObjeto()) {
			if(this.nivellineaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivellineaLogic.setNivelLineas(this.nivellineaReturnGeneral.getNivelLineas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.nivellineaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivellineaLogic.setNivelLinea(this.nivellineaReturnGeneral.getNivelLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNivelLinea(false);
		}
	}
	
	public void actualizarParametrosGeneralNivelLinea() throws Exception {
		
		
	}
	
	public ArrayList<NivelLinea> getNivelLineasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNivelLinea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NivelLinea nivellineaAux:nivellineaLogic.getNivelLineas()) {
					if(nivellineaAux.getIsSelected()) {
						nivellineasSeleccionados.add(nivellineaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelLinea nivellineaAux:this.nivellineas) {
					if(nivellineaAux.getIsSelected()) {
						nivellineasSeleccionados.add(nivellineaAux);				
					}
				}
			}
			
			if(nivellineasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						nivellineasSeleccionados.addAll(this.nivellineaLogic.getNivelLineas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						nivellineasSeleccionados.addAll(this.nivellineas);				
					}
				}
			}
		} else {
			nivellineasSeleccionados.add(this.nivellinea);
		}
		
		return nivellineasSeleccionados;
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
	
	public void generarReporteNivelLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNivelLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNivelLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelLineasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelLineasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesNivelLineasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Nivel Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNivelLineasSeleccionados() throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNivelLineas("Todos",nivellineasSeleccionados);
		
	}	
	
	public void generarReporteNormalNivelLineasSeleccionados() throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNivelLineas("Todos",nivellineasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNivelLineasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNivelLineas("Todos",nivellineasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNivelLineasSeleccionados() throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNivelLinea();
		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNivelLinea();
		
		
		//this.generarReporteNivelLineas("Todos",nivellineasSeleccionados ,nivellineaImplementable,nivellineaImplementableHome);
	}
	
	public void mostrarImportacionNivelLineas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNivelLinea();
		
		this.abrirFrameImportacionNivelLinea();		
		
			
		//this.generarReporteNivelLineas("Todos",nivellineasSeleccionados ,nivellineaImplementable,nivellineaImplementableHome);
	}
	
	public void importarNivelLineas() throws Exception {		
	
	}
	
	public void exportarNivelLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNivelLineasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNivelLineasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNivelLineasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Nivel Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNivelLineasSeleccionados() throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNivelLinea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NivelLinea nivellineaAux:nivellineasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNivelLinea(nivellineaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//nivellineaAux.setsDetalleGeneralEntityReporte(nivellineaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNivelLinea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NivelLineaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelLineaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelLineaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNivelLinea(NivelLinea nivellinea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=nivellinea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=nivellinea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivellinea.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNivelLineasSeleccionados() throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NivelLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNivelLinea(row);				
				iRow++;
			}				
			
			for(NivelLinea nivellineaAux:nivellineasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNivelLinea(nivellineaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNivelLineasSeleccionados() throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();		
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivellinea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("nivellineas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("nivellinea");
			//elementRoot.appendChild(element);
		
			for(NivelLinea nivellineaAux:nivellineasSeleccionados) {
				element = document.createElement("nivellinea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNivelLinea(nivellineaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNivelLinea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NivelLineaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NivelLineaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NivelLineaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNivelLinea(NivelLinea nivellinea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(nivellinea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(nivellinea.getnombre());				
	}
	
	public void setFilaDatosExportarXmlNivelLinea(NivelLinea nivellinea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NivelLineaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(nivellinea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NivelLineaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(nivellinea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(NivelLineaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(nivellinea.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoNivelLineasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NivelLinea> nivellineasSeleccionados=new ArrayList<NivelLinea>();
		
		nivellineasSeleccionados=this.getNivelLineasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNivelLinea(nivellineasSeleccionados);
		
		this.generarReporteNivelLineas("Todos",nivellineasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNivelLinea(ArrayList<NivelLinea> nivellineasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NivelLinea nivellineaAux:nivellineasSeleccionados) {
				nivellineaAux.setsDetalleGeneralEntityReporte(nivellineaAux.toString());
			
				if(sTipoSeleccionar.equals(NivelLineaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					nivellineaAux.setsDescripcionGeneralEntityReporte1(nivellineaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNivelLinea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNivelLinea=true;
				this.isVisibilidadCeldaNuevoRelacionesNivelLinea=true;
				this.isVisibilidadCeldaGuardarCambiosNivelLinea=true;
			}
			
			this.isVisibilidadCeldaModificarNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=false;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
			this.isVisibilidadCeldaModificarNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=true;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
			this.isVisibilidadCeldaModificarNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=true;
			this.isVisibilidadCeldaEliminarNivelLinea=true;
			this.isVisibilidadCeldaCancelarNivelLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
			this.isVisibilidadCeldaModificarNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=true;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNivelLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=true;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=true;
			this.isVisibilidadCeldaModificarNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=false;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
			this.isVisibilidadCeldaActualizarNivelLinea=false;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
			this.isVisibilidadCeldaModificarNivelLinea=true;
			this.isVisibilidadCeldaActualizarNivelLinea=false;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
			this.isVisibilidadCeldaCancelarNivelLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelLinea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NivelLineaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNivelLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=true;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=true;
		} else {
			this.actualizarEstadoPanelsNivelLinea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNivelLinea=false;
			//this.isVisibilidadCeldaVerFormNivelLinea=false;
			this.isVisibilidadCeldaDuplicarNivelLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!nivellineaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
		} else {
			this.isVisibilidadCeldaNuevoNivelLinea=false;
			this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(nivellineaSessionBean.getEsGuardarRelacionado()) {
			if(!nivellineaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;												
			}
			
			this.jButtonCerrarNivelLinea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNivelLinea=false;
		}
		
		if(!this.permiteMantenimiento(this.nivellinea)) {
			this.isVisibilidadCeldaActualizarNivelLinea=false;
			this.isVisibilidadCeldaEliminarNivelLinea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNivelLinea() {
		this.isVisibilidadCeldaNuevoNivelLinea=false;
		this.isVisibilidadCeldaGuardarCambiosNivelLinea=false;
	}
	
	public void actualizarEstadoPanelsNivelLinea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNivelLinea!=null) {
				this.jScrollPanelDatosEdicionNivelLinea.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosNivelLinea!=null) {
				this.jScrollPanelDatosNivelLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelLinea!=null) {
				this.jPanelPaginacionNivelLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelLinea!=null) {
				this.jPanelParametrosReportesNivelLinea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.nivellineaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionNivelLineaParaLineas() throws Exception {
		Boolean isPaginaPopupLinea=false;

		try {

			if(this.nivellineaSessionBean==null) {
				this.nivellineaSessionBean=new NivelLineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean==null) {
				this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean=new LineaSessionBean();
			}

			this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.setsPathNavegacionActual(nivellineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LineaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLinea=this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLinea(true);
			this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLinea(NivelLineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.setisBusquedaDesdeForeignKeySesionNivelLinea(true);
			this.jInternalFrameDetalleFormNivelLinea.lineaSessionBean.setlidNivelLineaActual(this.idNivelLineaActual);

			nivellineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNivelLinea(true);
			nivellineaSessionBean.setlIdNivelLineaActualForeignKey(this.idNivelLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNivelLineaParaComisionConfiges() throws Exception {
		Boolean isPaginaPopupComisionConfig=false;

		try {

			if(this.nivellineaSessionBean==null) {
				this.nivellineaSessionBean=new NivelLineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean==null) {
				this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.setsPathNavegacionActual(nivellineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionConfig=this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionConfig(true);
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig(NivelLineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionNivelLinea(true);
			this.jInternalFrameDetalleFormNivelLinea.comisionconfigSessionBean.setlidNivelLineaActual(this.idNivelLineaActual);

			nivellineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNivelLinea(true);
			nivellineaSessionBean.setlIdNivelLineaActualForeignKey(this.idNivelLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NivelLineaSessionBean nivellineaSessionBean=new NivelLineaSessionBean();
		
		if(this.nivellineaSessionBean==null) {
			this.nivellineaSessionBean=new NivelLineaSessionBean();
		}
		
		this.nivellineaSessionBean.setsUltimaBusquedaNivelLinea(this.getsAccionBusqueda());
		this.nivellineaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.nivellineaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NivelLineaSessionBean nivellineaSessionBean=new NivelLineaSessionBean();
		
		if(this.nivellineaSessionBean==null) {
			this.nivellineaSessionBean=new NivelLineaSessionBean();
		}
		
		if(this.nivellineaSessionBean.getsUltimaBusquedaNivelLinea()!=null&&!this.nivellineaSessionBean.getsUltimaBusquedaNivelLinea().equals("")) {
			this.setsAccionBusqueda(nivellineaSessionBean.getsUltimaBusquedaNivelLinea());
			this.setiNumeroPaginacion(nivellineaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(nivellineaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.nivellineaSessionBean.setsUltimaBusquedaNivelLinea("");
		this.nivellineaSessionBean.setiNumeroPaginacion(NivelLineaConstantesFunciones.INUMEROPAGINACION);
		this.nivellineaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNivelLinea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNivelLinea() {
		this.updateBorderResaltarBusquedasFormularioNivelLinea();
		this.updateVisibilidadBusquedasFormularioNivelLinea();
		this.updateHabilitarBusquedasFormularioNivelLinea();
	}
	
	public void updateBorderResaltarBusquedasFormularioNivelLinea() {					
	}
	
	public void updateVisibilidadBusquedasFormularioNivelLinea() {
	}
	
	public void updateHabilitarBusquedasFormularioNivelLinea() {
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
	
	public void updateControlesFormularioNivelLinea() throws Exception {

		if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNivelLinea();
		this.updateVisibilidadResaltarControlesFormularioNivelLinea();
		this.updateHabilitarResaltarControlesFormularioNivelLinea();
		
	}
	
	public void updateBorderResaltarControlesFormularioNivelLinea() throws Exception {
		if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.nivellineaConstantesFunciones.resaltaridNivelLinea!=null && this.jInternalFrameDetalleFormNivelLinea!=null) {this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setBorder(this.nivellineaConstantesFunciones.resaltaridNivelLinea);}
		if(this.nivellineaConstantesFunciones.resaltarnombreNivelLinea!=null && this.jInternalFrameDetalleFormNivelLinea!=null) {this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setBorder(this.nivellineaConstantesFunciones.resaltarnombreNivelLinea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNivelLinea() throws Exception {		
		if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
	
		//this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setVisible(this.nivellineaConstantesFunciones.mostraridNivelLinea);
		this.jInternalFrameDetalleFormNivelLinea.jPanelidNivelLinea.setVisible(this.nivellineaConstantesFunciones.mostraridNivelLinea);
		//this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setVisible(this.nivellineaConstantesFunciones.mostrarnombreNivelLinea);
		this.jInternalFrameDetalleFormNivelLinea.jPanelnombreNivelLinea.setVisible(this.nivellineaConstantesFunciones.mostrarnombreNivelLinea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNivelLinea() throws Exception {
		if(this.jInternalFrameDetalleFormNivelLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelLinea!=null) {
	
		this.jInternalFrameDetalleFormNivelLinea.jTextFieldidNivelLinea.setEnabled(this.nivellineaConstantesFunciones.activaridNivelLinea);
		this.jInternalFrameDetalleFormNivelLinea.jTextAreanombreNivelLinea.setEnabled(this.nivellineaConstantesFunciones.activarnombreNivelLinea);
		}
	}
	
		
}