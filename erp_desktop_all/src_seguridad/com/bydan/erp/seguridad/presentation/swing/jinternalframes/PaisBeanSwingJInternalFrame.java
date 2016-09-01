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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.PaisConstantesFunciones;
import com.bydan.erp.seguridad.util.PaisParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PaisParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PaisBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

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

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PaisBeanSwingJInternalFrame extends PaisJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PaisBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Pais> paisValidator = new ClassValidator<Pais>(Pais.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Pais pais;	
	public Pais paisAux;
	public Pais paisAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Pais paisTotales;
	public Long idPaisActual;
	public Long iIdNuevoPais=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboContinente="";

	public List<Continente> continentesForeignKey;

	public List<Continente> getcontinentesForeignKey() {
		return continentesForeignKey;
	}

	public void setcontinentesForeignKey(List<Continente> continentesForeignKey) {
		this.continentesForeignKey = continentesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Continente continenteForeignKey;

	public Continente getcontinenteForeignKey() {
		return continenteForeignKey;
	}

	public void setcontinenteForeignKey(Continente continenteForeignKey) {
		this.continenteForeignKey = continenteForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCiudad=false;

	public Boolean getIsTienePermisosCiudad() {
		return isTienePermisosCiudad;
	}

	public void setIsTienePermisosCiudad(Boolean isTienePermisosCiudad) {
		this.isTienePermisosCiudad= isTienePermisosCiudad;
	}


	public Boolean isTienePermisosProvincia=false;

	public Boolean getIsTienePermisosProvincia() {
		return isTienePermisosProvincia;
	}

	public void setIsTienePermisosProvincia(Boolean isTienePermisosProvincia) {
		this.isTienePermisosProvincia= isTienePermisosProvincia;
	}


	public Boolean isTienePermisosRegion=false;

	public Boolean getIsTienePermisosRegion() {
		return isTienePermisosRegion;
	}

	public void setIsTienePermisosRegion(Boolean isTienePermisosRegion) {
		this.isTienePermisosRegion= isTienePermisosRegion;
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
	
	public Boolean isPermisoTodoPais;
	public Boolean isPermisoNuevoPais;
	public Boolean isPermisoActualizarPais;
	public Boolean isPermisoActualizarOriginalPais;
	public Boolean isPermisoEliminarPais;
	public Boolean isPermisoGuardarCambiosPais;
	public Boolean isPermisoConsultaPais;
	public Boolean isPermisoBusquedaPais;
	public Boolean isPermisoReportePais;
	public Boolean isPermisoPaginacionMedioPais;
	public Boolean isPermisoPaginacionAltoPais;
	public Boolean isPermisoPaginacionTodoPais;
	public Boolean isPermisoCopiarPais;
	public Boolean isPermisoVerFormPais;
	public Boolean isPermisoDuplicarPais;
	public Boolean isPermisoOrdenPais;
	
	
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
	
	public PaisParameterReturnGeneral paisReturnGeneral;
	public PaisParameterReturnGeneral paisParameterGeneral;
	
	

	public CiudadLogic ciudadLogic=null;

	public CiudadLogic getCiudadLogic() {
		return ciudadLogic;
	}

	public void setCiudadLogic(CiudadLogic ciudadLogic) {
		this.ciudadLogic = ciudadLogic;
	}


	public ProvinciaLogic provinciaLogic=null;

	public ProvinciaLogic getProvinciaLogic() {
		return provinciaLogic;
	}

	public void setProvinciaLogic(ProvinciaLogic provinciaLogic) {
		this.provinciaLogic = provinciaLogic;
	}


	public RegionLogic regionLogic=null;

	public RegionLogic getRegionLogic() {
		return regionLogic;
	}

	public void setRegionLogic(RegionLogic regionLogic) {
		this.regionLogic = regionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPais=false;
	public Boolean esParaAccionDesdeFormularioPais=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PaisSessionBeanAdditional paisSessionBeanAdditional=null;
	
	public PaisSessionBeanAdditional getPaisSessionBeanAdditional() {
		return this.paisSessionBeanAdditional;
	}
	
	public void setPaisSessionBeanAdditional(PaisSessionBeanAdditional paisSessionBeanAdditional) {
		try {
			this.paisSessionBeanAdditional=paisSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PaisBeanSwingJInternalFrameAdditional paisBeanSwingJInternalFrameAdditional=null;
	//public class PaisBeanSwingJInternalFrame
	
	public PaisBeanSwingJInternalFrameAdditional getPaisBeanSwingJInternalFrameAdditional() {
		return this.paisBeanSwingJInternalFrameAdditional;
	}
	
	public void setPaisBeanSwingJInternalFrameAdditional(PaisBeanSwingJInternalFrameAdditional paisBeanSwingJInternalFrameAdditional) {
		try {
			this.paisBeanSwingJInternalFrameAdditional=paisBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PaisLogic paisLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Pais paisBean;
	public PaisConstantesFunciones paisConstantesFunciones;
	//public PaisParameterReturnGeneral paisReturnGeneral;
	
	//FK
	
	public ContinenteLogic continenteLogic;
	
	//PARAMETROS
	
	
	//public List<Pais> paiss;	
	//public List<Pais> paissEliminados;
	//public List<Pais> paissAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPais=false;
	public Boolean isVisibilidadCeldaDuplicarPais=true;
	public Boolean isVisibilidadCeldaCopiarPais=true;
	public Boolean isVisibilidadCeldaVerFormPais=true;
	public Boolean isVisibilidadCeldaOrdenPais=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPais=false;
	public Boolean isVisibilidadCeldaModificarPais=false;
	public Boolean isVisibilidadCeldaActualizarPais=false;
	public Boolean isVisibilidadCeldaEliminarPais=false;
	public Boolean isVisibilidadCeldaCancelarPais=false;
	public Boolean isVisibilidadCeldaGuardarPais=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPais=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdContinentePorNombre=false;
	public Boolean isVisibilidadFK_IdContinente=false;
	
	public Long getiIdNuevoPais() {
		return this.iIdNuevoPais;
	}

	public void setiIdNuevoPais(Long iIdNuevoPais) {
		this.iIdNuevoPais = iIdNuevoPais;
	}
	
	public Long getidPaisActual() {
		return this.idPaisActual;
	}

	public void setidPaisActual(Long idPaisActual) {
		this.idPaisActual = idPaisActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Pais getpais() {
		return this.pais;
	}

	public void setpais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getpaisAux() {
		return this.paisAux;
	}

	public void setpaisAux(Pais paisAux) {
		this.paisAux = paisAux;
	}				
	
	public Pais getpaisAnterior() {
		return this.paisAnterior;
	}

	public void setpaisAnterior(Pais paisAnterior) {
		this.paisAnterior = paisAnterior;
	}	
	
	public Pais getpaisTotales() {
		return this.paisTotales;
	}

	public void setpaisTotales(Pais paisTotales) {
		this.paisTotales = paisTotales;
	}	
	
	public Pais getpaisBean() {
		return this.paisBean;
	}

	public void setpaisBean(Pais paisBean) {
		this.paisBean = paisBean;
	}	
	
	public PaisParameterReturnGeneral getpaisReturnGeneral() {
		return this.paisReturnGeneral;
	}

	public void setpaisReturnGeneral(PaisParameterReturnGeneral paisReturnGeneral) {
		this.paisReturnGeneral = paisReturnGeneral;
	}	
	
	
	public Long id_continenteBusquedaPorIdContinentePorNombre=-1L;

	public Long getid_continenteBusquedaPorIdContinentePorNombre() {
		return this.id_continenteBusquedaPorIdContinentePorNombre;
	}

	public void setid_continenteBusquedaPorIdContinentePorNombre(Long id_continenteBusquedaPorIdContinentePorNombre) {
		this.id_continenteBusquedaPorIdContinentePorNombre = id_continenteBusquedaPorIdContinentePorNombre;
	}

;
	public String nombreBusquedaPorIdContinentePorNombre="";

	public String getnombreBusquedaPorIdContinentePorNombre() {
		return this.nombreBusquedaPorIdContinentePorNombre;
	}

	public void setnombreBusquedaPorIdContinentePorNombre(String nombreBusquedaPorIdContinentePorNombre) {
		this.nombreBusquedaPorIdContinentePorNombre = nombreBusquedaPorIdContinentePorNombre;
	}

	public Long id_continenteFK_IdContinente=-1L;

	public Long getid_continenteFK_IdContinente() {
		return this.id_continenteFK_IdContinente;
	}

	public void setid_continenteFK_IdContinente(Long id_continenteFK_IdContinente) {
		this.id_continenteFK_IdContinente = id_continenteFK_IdContinente;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PaisLogic getPaisLogic()	{		
		return paisLogic;
	}

	public void setPaisLogic(PaisLogic paisLogic) {
		this.paisLogic = paisLogic;
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
	
	public Boolean getIsEsNuevoPais() {
		return isEsNuevoPais;
	}

	public void setIsEsNuevoPais(Boolean isEsNuevoPais) {
		this.isEsNuevoPais = isEsNuevoPais;
	}

	public Boolean getEsParaAccionDesdeFormularioPais() {
		return esParaAccionDesdeFormularioPais;
	}
	
	public void setEsParaAccionDesdeFormularioPais(Boolean esParaAccionDesdeFormularioPais) {
		this.esParaAccionDesdeFormularioPais = esParaAccionDesdeFormularioPais;
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
	
	
	public void cargarCombosContinentesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.continentesForeignKey=new ArrayList<Continente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ContinenteLogic continenteLogic=new ContinenteLogic();

			continenteLogic.getContinenteDataAccess().setIsForForeingKeyData(true);

			if(this.paisSessionBean==null) {
				this.paisSessionBean=new PaisSessionBean();
			}

			if(!this.paisSessionBean.getisBusquedaDesdeForeignKeySesionContinente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					continenteLogic.getContinenteDataAccess().setIsForForeingKeyData(true);

					continenteLogic.getTodosContinentesWithConnection(sFinalQuery,new Pagination());

					this.continentesForeignKey=continenteLogic.getContinentes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaContinente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					continenteLogic.getEntityWithConnection(paisSessionBean.getlidContinenteActual());
					this.continentesForeignKey.add(continenteLogic.getContinente());
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

	
	
	public void setActualContinenteForeignKey(Long idContinenteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Continente  continenteTemp=null;

			for(Continente continenteAux:continentesForeignKey) {
				if(continenteAux.getId()!=null && continenteAux.getId().equals(idContinenteSeleccionado)) {
					continenteTemp=continenteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(continenteTemp!=null) {

					if(this.pais!=null) {
						this.pais.setContinente(continenteTemp);
					}

					if(this.jInternalFrameDetalleFormPais!=null) {
						this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setSelectedItem(continenteTemp);
					}
				} else {
					//jComboBoxid_continentePais.setSelectedItem(continenteTemp);
					if(this.jInternalFrameDetalleFormPais!=null) {
						if(this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.getItemCount()>0) {
							this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdContinentePorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(continenteTemp!=null && jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais!=null) {
						jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setSelectedItem(continenteTemp);
					} else {
						if(jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais!=null) {
							//jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setSelectedItem(continenteTemp);
							if(jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.getItemCount()>0) {
								jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdContinente") || sFormularioTipoBusqueda.equals("Todos")){
					if(continenteTemp!=null && jComboBoxid_continenteFK_IdContinentePais!=null) {
						jComboBoxid_continenteFK_IdContinentePais.setSelectedItem(continenteTemp);
					} else {
						if(jComboBoxid_continenteFK_IdContinentePais!=null) {
							//jComboBoxid_continenteFK_IdContinentePais.setSelectedItem(continenteTemp);
							if(jComboBoxid_continenteFK_IdContinentePais.getItemCount()>0) {
								jComboBoxid_continenteFK_IdContinentePais.setSelectedIndex(0);
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

	public String getActualContinenteForeignKeyDescripcion(Long idContinenteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Continente  continenteTemp=null;

			for(Continente continenteAux:continentesForeignKey) {
				if(continenteAux.getId()!=null && continenteAux.getId().equals(idContinenteSeleccionado)) {
					continenteTemp=continenteAux;
					break;
				}
			}


			sDescripcion=ContinenteConstantesFunciones.getContinenteDescripcion(continenteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualContinenteForeignKeyGenerico(Long idContinenteSeleccionado,JComboBox jComboBoxid_continentePaisGenerico)throws Exception
	{
		try
		{
			Continente  continenteTemp=null;

			for(Continente continenteAux:continentesForeignKey) {
				if(continenteAux.getId()!=null && continenteAux.getId().equals(idContinenteSeleccionado)) {
					continenteTemp=continenteAux;
					break;
				}
			}

			if(continenteTemp!=null) {
				jComboBoxid_continentePaisGenerico.setSelectedItem(continenteTemp);
			} else {
				if(jComboBoxid_continentePaisGenerico!=null && jComboBoxid_continentePaisGenerico.getItemCount()>0) {
					jComboBoxid_continentePaisGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarContinenteForeignKey(Pais pais,JComboBox jComboBoxid_continentePaisGenerico)throws Exception
	{
		try
		{
			Continente  continenteAux=new Continente();

			if(jComboBoxid_continentePaisGenerico==null) {
				continenteAux=(Continente)this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.getSelectedItem();
			} else {
				continenteAux=(Continente)jComboBoxid_continentePaisGenerico.getSelectedItem();
			}

			if(continenteAux!=null && continenteAux.getId()!=null) {
				pais.setid_continente(continenteAux.getId());
				pais.setcontinente_descripcion(PaisConstantesFunciones.getContinenteDescripcion(continenteAux));
				pais.setContinente(continenteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameContinentesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingContinente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PaisJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPais!=null) { 
							this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.removeAllItems();

							for(Continente continente:this.continentesForeignKey) {
								this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.addItem(continente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPais!=null) { 
					}

					if(!PaisJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdContinentePorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PaisJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.removeAllItems();

							for(Continente continente:this.continentesForeignKey) {
								this.jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.addItem(continente);
							}
						}

						if(!PaisJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdContinente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PaisJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_continenteFK_IdContinentePais.removeAllItems();

							for(Continente continente:this.continentesForeignKey) {
								this.jComboBoxid_continenteFK_IdContinentePais.addItem(continente);
							}
						}

						if(!PaisJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameContinenteForeignKey(Continente continente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPais!=null) {
							this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setSelectedItem(continente);
						}
					} else {
						if(this.jInternalFrameDetalleFormPais!=null) {
							this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setSelectedItem(continente);
						} else {
							this.jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_continenteFK_IdContinentePais.setSelectedItem(continente);
						} else {
							this.jComboBoxid_continenteFK_IdContinentePais.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPais() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PaisConstantesFunciones.refrescarForeignKeysDescripcionesPais(this.paisLogic.getPaiss());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PaisConstantesFunciones.refrescarForeignKeysDescripcionesPais(this.paiss);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Continente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//paisLogic.setPaiss(this.paiss);
			paisLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PaisParameterReturnGeneral getPaisParameterGeneral() {
		return this.paisParameterGeneral;
	}
	
	public void setPaisParameterGeneral(PaisParameterReturnGeneral paisParameterGeneral) {
		this.paisParameterGeneral = paisParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPais() {
		return isPermisoTodoPais;
	}

	public void setIsPermisoTodoPais(Boolean isPermisoTodoPais) {
		this.isPermisoTodoPais = isPermisoTodoPais;
	}

	public Boolean getIsPermisoNuevoPais() {
		return isPermisoNuevoPais;
	}

	public void setIsPermisoNuevoPais(Boolean isPermisoNuevoPais) {
		this.isPermisoNuevoPais = isPermisoNuevoPais;
	}

	public Boolean getIsPermisoActualizarPais() {
		return isPermisoActualizarPais;
	}

	public void setIsPermisoActualizarPais(Boolean isPermisoActualizarPais) {
		this.isPermisoActualizarPais = isPermisoActualizarPais;
	}

	public Boolean getIsPermisoEliminarPais() {
		return isPermisoEliminarPais;
	}

	public void setIsPermisoEliminarPais(Boolean isPermisoEliminarPais) {
		this.isPermisoEliminarPais = isPermisoEliminarPais;
	}

	public Boolean getIsPermisoGuardarCambiosPais() {
		return isPermisoGuardarCambiosPais;
	}

	public void setIsPermisoGuardarCambiosPais(Boolean isPermisoGuardarCambiosPais) {
		this.isPermisoGuardarCambiosPais = isPermisoGuardarCambiosPais;
	}
	
	public Boolean getIsPermisoConsultaPais() {
		return isPermisoConsultaPais;
	}

	public void setIsPermisoConsultaPais(Boolean isPermisoConsultaPais) {
		this.isPermisoConsultaPais = isPermisoConsultaPais;
	}

	public Boolean getIsPermisoBusquedaPais() {
		return isPermisoBusquedaPais;
	}

	public void setIsPermisoBusquedaPais(Boolean isPermisoBusquedaPais) {
		this.isPermisoBusquedaPais = isPermisoBusquedaPais;
	}

	public Boolean getIsPermisoReportePais() {
		return isPermisoReportePais;
	}

	public void setIsPermisoReportePais(Boolean isPermisoReportePais) {
		this.isPermisoReportePais = isPermisoReportePais;
	}
	
	public Boolean getIsPermisoPaginacionMedioPais() {
		return isPermisoPaginacionMedioPais;
	}

	public void setIsPermisoPaginacionMedioPais(Boolean isPermisoPaginacionMedioPais) {
		this.isPermisoPaginacionMedioPais = isPermisoPaginacionMedioPais;
	}
	
	public Boolean getIsPermisoPaginacionTodoPais() {
		return isPermisoPaginacionTodoPais;
	}

	public void setIsPermisoPaginacionTodoPais(Boolean isPermisoPaginacionTodoPais) {
		this.isPermisoPaginacionTodoPais = isPermisoPaginacionTodoPais;
	}
	
	public Boolean getIsPermisoPaginacionAltoPais() {
		return isPermisoPaginacionAltoPais;
	}

	public void setIsPermisoPaginacionAltoPais(Boolean isPermisoPaginacionAltoPais) {
		this.isPermisoPaginacionAltoPais = isPermisoPaginacionAltoPais;
	}
	
	public Boolean getIsPermisoCopiarPais() {
		return isPermisoCopiarPais;
	}

	public void setIsPermisoCopiarPais(Boolean isPermisoCopiarPais) {
		this.isPermisoCopiarPais = isPermisoCopiarPais;
	}
	
	public Boolean getIsPermisoVerFormPais() {
		return isPermisoVerFormPais;
	}

	public void setIsPermisoVerFormPais(Boolean isPermisoVerFormPais) {
		this.isPermisoVerFormPais = isPermisoVerFormPais;
	}
	
	public Boolean getIsPermisoDuplicarPais() {
		return isPermisoDuplicarPais;
	}

	public void setIsPermisoDuplicarPais(Boolean isPermisoDuplicarPais) {
		this.isPermisoDuplicarPais = isPermisoDuplicarPais;
	}
	
	public Boolean getIsPermisoOrdenPais() {
		return isPermisoOrdenPais;
	}

	public void setIsPermisoOrdenPais(Boolean isPermisoOrdenPais) {
		this.isPermisoOrdenPais = isPermisoOrdenPais;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPais() {
		return isVisibilidadCeldaNuevoPais;
	}

	public void setIsVisibilidadCeldaNuevoPais(Boolean isVisibilidadCeldaNuevoPais) {
		this.isVisibilidadCeldaNuevoPais = isVisibilidadCeldaNuevoPais;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPais() {
		return isVisibilidadCeldaDuplicarPais;
	}

	public void setIsVisibilidadCeldaDuplicarPais(Boolean isVisibilidadCeldaDuplicarPais) {
		this.isVisibilidadCeldaDuplicarPais = isVisibilidadCeldaDuplicarPais;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPais() {
		return isVisibilidadCeldaCopiarPais;
	}

	public void setIsVisibilidadCeldaCopiarPais(Boolean isVisibilidadCeldaCopiarPais) {
		this.isVisibilidadCeldaCopiarPais = isVisibilidadCeldaCopiarPais;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPais() {
		return isVisibilidadCeldaVerFormPais;
	}

	public void setIsVisibilidadCeldaVerFormPais(Boolean isVisibilidadCeldaVerFormPais) {
		this.isVisibilidadCeldaVerFormPais = isVisibilidadCeldaVerFormPais;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPais() {
		return isVisibilidadCeldaOrdenPais;
	}

	public void setIsVisibilidadCeldaOrdenPais(Boolean isVisibilidadCeldaOrdenPais) {
		this.isVisibilidadCeldaOrdenPais = isVisibilidadCeldaOrdenPais;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPais() {
		return isVisibilidadCeldaNuevoRelacionesPais;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPais(Boolean isVisibilidadCeldaNuevoRelacionesPais) {
		this.isVisibilidadCeldaNuevoRelacionesPais = isVisibilidadCeldaNuevoRelacionesPais;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPais() {
		return isVisibilidadCeldaModificarPais;
	}

	public void setIsVisibilidadCeldaModificarPais(Boolean isVisibilidadCeldaModificarPais) {
		this.isVisibilidadCeldaModificarPais = isVisibilidadCeldaModificarPais;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPais() {
		return isVisibilidadCeldaActualizarPais;
	}

	public void setIsVisibilidadCeldaActualizarPais(Boolean isVisibilidadCeldaActualizarPais) {
		this.isVisibilidadCeldaActualizarPais = isVisibilidadCeldaActualizarPais;
	}

	public Boolean getIsVisibilidadCeldaEliminarPais() {
		return isVisibilidadCeldaEliminarPais;
	}

	public void setIsVisibilidadCeldaEliminarPais(Boolean isVisibilidadCeldaEliminarPais) {
		this.isVisibilidadCeldaEliminarPais = isVisibilidadCeldaEliminarPais;
	}

	public Boolean getIsVisibilidadCeldaCancelarPais() {
		return isVisibilidadCeldaCancelarPais;
	}

	public void setIsVisibilidadCeldaCancelarPais(Boolean isVisibilidadCeldaCancelarPais) {
		this.isVisibilidadCeldaCancelarPais = isVisibilidadCeldaCancelarPais;
	}

	public Boolean getIsVisibilidadCeldaGuardarPais() {
		return isVisibilidadCeldaGuardarPais;
	}

	public void setIsVisibilidadCeldaGuardarPais(Boolean isVisibilidadCeldaGuardarPais) {
		this.isVisibilidadCeldaGuardarPais = isVisibilidadCeldaGuardarPais;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPais() {
		return isVisibilidadCeldaGuardarCambiosPais;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPais(Boolean isVisibilidadCeldaGuardarCambiosPais) {
		this.isVisibilidadCeldaGuardarCambiosPais = isVisibilidadCeldaGuardarCambiosPais;
	}
		
	public PaisSessionBean getpaisSessionBean() {
		return this.paisSessionBean;
	}
	
	public void setpaisSessionBean(PaisSessionBean paisSessionBean) {
		this.paisSessionBean=paisSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdContinentePorNombre() {
		return this.isVisibilidadBusquedaPorIdContinentePorNombre;
	}

	public void setisVisibilidadBusquedaPorIdContinentePorNombre(Boolean isVisibilidadBusquedaPorIdContinentePorNombre) {
		this.isVisibilidadBusquedaPorIdContinentePorNombre=isVisibilidadBusquedaPorIdContinentePorNombre;
	}

	public Boolean getisVisibilidadFK_IdContinente() {
		return this.isVisibilidadFK_IdContinente;
	}

	public void setisVisibilidadFK_IdContinente(Boolean isVisibilidadFK_IdContinente) {
		this.isVisibilidadFK_IdContinente=isVisibilidadFK_IdContinente;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPais(Pais pais)throws Exception {
		try {
			
				this.setActualParaGuardarContinenteForeignKey(pais,null);
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
	
	public void bugActualizarReferenciaActual(Pais pais,Pais paisAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPais(pais);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		paisAux.setId(pais.getId());
		paisAux.setVersionRow(pais.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPais();
		
			int intSelectedRow = this.jTableDatosPais.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPais(this.pais,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = paisValidator.getInvalidValues(this.pais);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			paisLogic.setDatosCliente(datosCliente);
			paisLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				paisAux=new  Pais();
				
				paisAux.setIsNew(true);
				paisAux.setIsChanged(true);
				
				paisAux.setPaisOriginal(this.pais);
				
				paisAux.setId(this.pais.getId());	
				paisAux.setVersionRow(this.pais.getVersionRow());	
				paisAux.setid_continente(this.pais.getid_continente());	
				paisAux.setcodigo(this.pais.getcodigo());	
				paisAux.setnombre(this.pais.getnombre());	
				paisAux.setnacionalidad(this.pais.getnacionalidad());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.paisSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.paisSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(paisAux,paisLogic.getPaiss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paisAux,paiss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.paisSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.paisSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paisLogic.savePaiss();//WithConnection
						//paisLogic.getSetVersionRowPaiss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pais,paisAux);
					
					this.refrescarForeignKeysDescripcionesPais();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.paisSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads().addAll(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias().addAll(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions().addAll(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads.addAll(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias.addAll(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions.addAll(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.paisSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								paisLogic.savePaisRelaciones(paisAux,this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads(),this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias(),this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());//WithConnection
								//paisLogic.getSetVersionRowPaiss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.pais,paisAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(new ArrayList<Ciudad>());
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(new ArrayList<Provincia>());
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.setRegions(new ArrayList<Region>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads= new ArrayList<Ciudad>();
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias= new ArrayList<Provincia>();
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions= new ArrayList<Region>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setCiudads(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());

							if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setProvincias(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());

							if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setRegions(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.paisSessionBean.getEstaModoGuardarRelaciones() 
									|| this.paisSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(paisAux,paisLogic.getPaiss());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(paisAux,paiss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.pais,paisAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				paisAux=new  Pais();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.paisSessionBean.getEsGuardarRelacionado() 
					|| (this.paisSessionBean.getEsGuardarRelacionado() && this.pais.getId()>=0)) {
						
					paisAux.setIsNew(false);
				}
				
				paisAux.setIsDeleted(false);
			
				paisAux.setId(this.pais.getId());	
				paisAux.setVersionRow(this.pais.getVersionRow());	
				paisAux.setid_continente(this.pais.getid_continente());	
				paisAux.setcodigo(this.pais.getcodigo());	
				paisAux.setnombre(this.pais.getnombre());	
				paisAux.setnacionalidad(this.pais.getnacionalidad());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(paisAux,paisLogic.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paisAux,paiss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.paisSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.paisSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paisLogic.savePaiss();//WithConnection
						//paisLogic.getSetVersionRowPaiss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pais,paisAux);
					
					this.refrescarForeignKeysDescripcionesPais();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.paisSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads().addAll(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias().addAll(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions().addAll(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads.addAll(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias.addAll(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions.addAll(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.paisSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								paisLogic.savePaisRelaciones(paisAux,this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads(),this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias(),this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());//WithConnection
								//paisLogic.getSetVersionRowPaiss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.pais,paisAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(new ArrayList<Ciudad>());
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(new ArrayList<Provincia>());
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.setRegions(new ArrayList<Region>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads= new ArrayList<Ciudad>();
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias= new ArrayList<Provincia>();
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions= new ArrayList<Region>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setCiudads(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());

							if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setProvincias(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());

							if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setRegions(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.paisSessionBean.getEstaModoGuardarRelaciones() 
									|| this.paisSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(paisAux,paisLogic.getPaiss());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(paisAux,paiss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.pais,paisAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				paisAux=new  Pais();
				
				paisAux.setIsNew(false);
				paisAux.setIsChanged(false);
				
				paisAux.setIsDeleted(true);
				
				paisAux.setId(this.pais.getId());	
				paisAux.setVersionRow(this.pais.getVersionRow());	
				paisAux.setid_continente(this.pais.getid_continente());	
				paisAux.setcodigo(this.pais.getcodigo());	
				paisAux.setnombre(this.pais.getnombre());	
				paisAux.setnacionalidad(this.pais.getnacionalidad());	
				
				if(this.paisSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.paisAux.getId()>=0) {	
						this.paissEliminados.add(paisAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(paisAux,paisLogic.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paisAux,paiss);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.paisSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.paisSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paisLogic.savePaiss();//WithConnection
						//paisLogic.getSetVersionRowPaiss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.paisSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads().addAll(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias().addAll(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions().addAll(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads.addAll(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias.addAll(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions.addAll(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.paisSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								paisLogic.savePaisRelaciones(paisAux,this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads(),this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias(),this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());//WithConnection
								//paisLogic.getSetVersionRowPaiss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(new ArrayList<Ciudad>());
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(new ArrayList<Provincia>());
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.setRegions(new ArrayList<Region>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads= new ArrayList<Ciudad>();
							this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias= new ArrayList<Provincia>();
							this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions= new ArrayList<Region>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setCiudads(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());

							if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setProvincias(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());

							if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.quitarFilaTotales();}
							paisAux.setRegions(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.paisSessionBean.getEstaModoGuardarRelaciones() 
								|| this.paisSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(paisAux,paisLogic.getPaiss());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(paisAux,paiss);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getPaiss().addAll(this.paissEliminados);
					
					paisLogic.savePaiss();//WithConnection
					//paisLogic.getSetVersionRowPaiss();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPais();
				
				this.paissEliminados= new ArrayList<Pais>();		
			}
			
			if(this.paisSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pais GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.pais=paisAux;
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
      		//this.finishProcessPais();
      	}
		
	}	
	
	public void actualizarRelaciones(Pais paisLocal) throws Exception {
		
		if(this.paisSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				paisLocal.setCiudads(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());
				paisLocal.setProvincias(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());
				paisLocal.setRegions(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());
			
			} else {
			
				paisLocal.setCiudads(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudads);
				paisLocal.setProvincias(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provincias);
				paisLocal.setRegions(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Pais paisLocal) throws Exception {	
		if(this.paisSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ContinenteDetalleFormJInternalFrame.class)) {
				ContinenteBeanSwingJInternalFrame continenteBeanSwingJInternalFrameLocal=(ContinenteBeanSwingJInternalFrame) ((ContinenteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				continenteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoContinente(continenteBeanSwingJInternalFrameLocal.getcontinente(),true);
				continenteBeanSwingJInternalFrameLocal.actualizarLista(continenteBeanSwingJInternalFrameLocal.continente,this.continentesForeignKey);

				continenteBeanSwingJInternalFrameLocal.actualizarRelaciones(continenteBeanSwingJInternalFrameLocal.continente);

				paisLocal.setContinente(continenteBeanSwingJInternalFrameLocal.continente);

				this.addItemDefectoCombosForeignKeyContinente();
				this.cargarCombosFrameContinentesForeignKey("Formulario");
				this.setActualContinenteForeignKey(continenteBeanSwingJInternalFrameLocal.continente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPaisActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPais.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = paisValidator.getInvalidValues(this.pais);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Pais pais,List<Pais> paiss) throws Exception {
		try	{		
			PaisConstantesFunciones.actualizarLista(pais,paiss,this.paisSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Pais pais,List<Pais> paiss) throws Exception {
		try	{			
			PaisConstantesFunciones.actualizarSelectedLista(pais,paiss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Pais> paissLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				paissLocal=this.paisLogic.getPaiss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				paissLocal=this.paiss;
			}
			//ARCHITECTURE
		
			for(Pais paisLocal:paissLocal) {
				if(this.permiteMantenimiento(paisLocal) && paisLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PaisConstantesFunciones.getPaisLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PaisConstantesFunciones.IDCONTINENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelid_continentePais,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PaisConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelcodigoPais,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PaisConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelnombrePais,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PaisConstantesFunciones.NACIONALIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelnacionalidadPais,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPais!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPais.jLabelid_continentePais,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPais.jLabelcodigoPais,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPais.jLabelnombrePais,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPais.jLabelnacionalidadPais,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Ciudad")) {
			if(this.pais==null) {
				this.pais= new Pais();
			}

			if(this.paisSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPais
				this.setVariablesFormularioToObjetoActualPais(this.pais,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);

				this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.getciudad().setPais(this.pais);
			}

			return;
		}
		 else  if(sTipo.equals("Provincia")) {
			if(this.pais==null) {
				this.pais= new Pais();
			}

			if(this.paisSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPais
				this.setVariablesFormularioToObjetoActualPais(this.pais,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);

				this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.getprovincia().setPais(this.pais);
			}

			return;
		}
		 else  if(sTipo.equals("Region")) {
			if(this.pais==null) {
				this.pais= new Pais();
			}

			if(this.paisSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPais
				this.setVariablesFormularioToObjetoActualPais(this.pais,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);

				this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.getregion().setPais(this.pais);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPais--;	
		
		
		this.paisAux=new Pais();
		
		this.paisAux.setId(this.iIdNuevoPais);
		this.paisAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.paisLogic.getPaiss().add(this.paisAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.paiss.add(this.paisAux);
		}
		//ARCHITECTURE
		
		this.pais=this.paisAux;
		
		if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPais(this.pais);
			this.setVariablesObjetoActualToFormularioForeignKeyPais(this.pais);
		}
				
		//this.setDefaultControlesPais();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPais();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPais();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPais();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPais(this.paisBean,this.pais,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PaisConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.paisSessionBean.getConGuardarRelaciones()) {
			classes=PaisConstantesFunciones.getClassesRelationshipsOfPais(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.paisReturnGeneral=paisLogic.procesarEventosPaissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.paisLogic.getPaiss(),this.pais,this.paisParameterGeneral,this.isEsNuevoPais,classes);//this.paisLogic.getPais()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPais(this.paisReturnGeneral,this.paisBean,false);
		
		if(this.paisReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPais(this.paisReturnGeneral.getPais());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPais(this.paisReturnGeneral.getPais());
		}
		
		if(this.paisReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPais(this.paisReturnGeneral.getPais(),classes);//this.paisBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPais(this.pais,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPais();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPais();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PaisBeanSwingJInternalFrameAdditional.RecargarFormPais(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPais(false);
						
			if(paisSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadSessionBean.getEsGuardarRelacionado() && CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCiudadActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaSessionBean.getEsGuardarRelacionado() && ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvinciaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionSessionBean.getEsGuardarRelacionado() && RegionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRegionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPais();
			}
			
			this.actualizarVisualTableDatosPais();
			
			this.jTableDatosPais.setRowSelectionInterval(this.getIndiceNuevoPais(), this.getIndiceNuevoPais());
			
			this.seleccionarFilaTablaPaisActual();
						
			this.actualizarEstadoCeldasBotonesPais("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPais(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setEnabled(isHabilitar && this.paisConstantesFunciones.activarcodigoPais);
		this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setEnabled(isHabilitar && this.paisConstantesFunciones.activarnombrePais);
		this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setEnabled(isHabilitar && this.paisConstantesFunciones.activarnacionalidadPais);	
		
		this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setEnabled(isHabilitar && this.paisConstantesFunciones.activarid_continentePais);
	};
	
	public void setDefaultControlesPais() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPais(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.paisSessionBean.setConGuardarRelaciones(true);			
			this.paisSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.paisSessionBean.setConGuardarRelaciones(false);			
			this.paisSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPais() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pais paisAux:this.paisLogic.getPaiss()) {
				if(paisAux.getId().equals(this.iIdNuevoPais)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pais paisAux:this.paiss) {
				if(paisAux.getId().equals(this.iIdNuevoPais)) {
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
	
	public int getIndiceActualPais(Pais pais,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pais paisAux:this.paisLogic.getPaiss()) {
				if(paisAux.getId().equals(pais.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pais paisAux:this.paiss) {
				if(paisAux.getId().equals(pais.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPais(Pais paisOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pais paisAux:this.paisLogic.getPaiss()) {
				if(paisAux.getPaisOriginal().getId().equals(paisOriginal.getId())) {
					existe=true;
					paisOriginal.setId(paisAux.getId());
					paisOriginal.setVersionRow(paisAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pais paisAux:this.paiss) {
				if(paisAux.getPaisOriginal().getId().equals(paisOriginal.getId())) {
					existe=true;
					paisOriginal.setId(paisAux.getId());
					paisOriginal.setVersionRow(paisAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPais(Boolean esParaCancelar) throws Exception {
		paissAux=new ArrayList<Pais>();
		paisAux=new Pais();
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Pais paisAux:this.paisLogic.getPaiss()) {
					if(paisAux.getId()<0) {
						paissAux.add(paisAux);
					}		
				}
				this.iIdNuevoPais=0L;
				this.paisLogic.getPaiss().removeAll(paissAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pais paisAux:this.paiss) {
					if(paisAux.getId()<0) {
						paissAux.add(paisAux);
					}		
				}
				this.iIdNuevoPais=0L;
				this.paiss.removeAll(paissAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPais 
					&& this.paisLogic.getPaiss().size()>0
					) {
					paisAux=this.paisLogic.getPaiss().get(this.paisLogic.getPaiss().size() - 1);
				
					if(paisAux.getId()<0) {
						this.paisLogic.getPaiss().remove(paisAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPais && this.paiss.size()>0) {
					paisAux=this.paiss.get(this.paiss.size() - 1);
				
					if(paisAux.getId()<0) {
						this.paiss.remove(paisAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPais(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pais.getId()<0) {
				this.paisLogic.getPaiss().remove(this.pais);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pais.getId()<0) {
				this.paiss.remove(this.pais);
			}
		}			
	}
	
	public void setEstadosInicialesPais(List<Pais> paissAux) throws Exception {
		PaisConstantesFunciones.setEstadosInicialesPais(paissAux);
	}
	
	public void setEstadosInicialesPais(Pais paisAux) throws Exception {
		PaisConstantesFunciones.setEstadosInicialesPais(paisAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPaisActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPais("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPaisActual()) {
				if(!this.isEsNuevoPais) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPais("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPais=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPaisActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pais ?", "MANTENIMIENTO DE Pais", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPais("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Pais pais) throws Exception {
		PaisConstantesFunciones.seleccionarAsignar(this.pais,pais);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPais=this.isPermisoActualizarOriginalPais;
			
			
			this.seleccionarAsignar(pais);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PaisConstantesFunciones.quitarEspaciosPais(this.pais,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPais("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.paisSessionBean.setsFuncionBusquedaRapida(this.paisSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPais) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPais(esParaCancelar);				
				this.cancelarNuevoPais(esParaCancelar);								
			}
			
			this.pais=new Pais();
			
			this.inicializarPais();
			
			this.actualizarEstadoCeldasBotonesPais("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPais() throws Exception {
		try {
			PaisConstantesFunciones.inicializarPais(this.pais);
			
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
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.paisLogic.getPaiss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePaiss(String sAccionBusqueda,List<Pais> paissParaReportes) throws Exception {
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
					sPathReporteFinal="Pais"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PaisMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PaisMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Pais"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Paises");		
		parameters.put("busquedapor", PaisConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Ciudad.class));
			classes.add(new Classe(Provincia.class));
			classes.add(new Classe(Region.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PaisLogic paisLogicAuxiliar=new PaisLogic();
					paisLogicAuxiliar.setDatosCliente(paisLogic.getDatosCliente());				
					paisLogicAuxiliar.setPaiss(paissParaReportes);
					
					paisLogicAuxiliar.cargarRelacionesLoteForeignKeyPaisWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					paissParaReportes=paisLogicAuxiliar.getPaiss();
					
					//paisLogic.getNewConnexionToDeep();
					
					//for (Pais pais:paissParaReportes) {
					//	paisLogic.deepLoad(pais, false, DeepLoadType.INCLUDE, classes);
					//}						
					//paisLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//paisLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCiudad = AuxiliarReportes.class.getResourceAsStream("CiudadDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ciudad", reportFileCiudad);

			InputStream reportFileProvincia = AuxiliarReportes.class.getResourceAsStream("ProvinciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_provincia", reportFileProvincia);

			InputStream reportFileRegion = AuxiliarReportes.class.getResourceAsStream("RegionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_region", reportFileRegion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePais=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PaisConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PaisConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePais=new JRBeanArrayDataSource(PaisJInternalFrame.TraerPaisBeans(paissParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePais);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PaisConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PaisConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PaisBean.TraerPaisBeans(paissParaReportes).toArray()));
							
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
				this.generarExcelReportePaiss(sAccionBusqueda,sTipoArchivoReporte,paissParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPaiss(sAccionBusqueda,sTipoArchivoReporte,paissParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPaisActionPerformed(null);
					//this.generarExcelReportePaiss(sAccionBusqueda,sTipoArchivoReporte,paissParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPaiss(sAccionBusqueda,sTipoArchivoReporte,paissParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPaiss(sAccionBusqueda,sTipoArchivoReporte,paissParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPaiss(sAccionBusqueda,sTipoArchivoReporte,paissParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePaiss(String sAccionBusqueda,String sTipoArchivoReporte,List<Pais> paissParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Paiss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPais("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Pais pais : paissParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PaisConstantesFunciones.generarExcelReporteDataPais("NORMAL",row,workbook,pais,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPais(String sTipo,Row row,Workbook workbook) {
		
		PaisConstantesFunciones.generarExcelReporteHeaderPais(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPaiss(String sAccionBusqueda,String sTipoArchivoReporte,List<Pais> paissParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Paiss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Pais pais : paissParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PaisConstantesFunciones.getPaisDescripcion(pais));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaisConstantesFunciones.LABEL_IDCONTINENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaisConstantesFunciones.LABEL_IDCONTINENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pais.getcontinente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaisConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaisConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pais.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaisConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaisConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pais.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaisConstantesFunciones.LABEL_NACIONALIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaisConstantesFunciones.LABEL_NACIONALIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pais.getnacionalidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPaiss(String sAccionBusqueda,String sTipoArchivoReporte,List<Pais> paissParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Pais> paissRespaldo=null;
		
		classes=PaisConstantesFunciones.getClassesRelationshipsOfPais(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.paisLogic.setDatosCliente(this.datosCliente);
		this.paisLogic.setDatosDeep(this.datosDeep);
		this.paisLogic.setIsConDeep(true);
		
		paissRespaldo=this.paisLogic.getPaiss();
		
		this.paisLogic.setPaiss(paissParaReportes);	
		this.paisLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		paissParaReportes=this.paisLogic.getPaiss();
		this.paisLogic.setPaiss(paissRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Paiss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPais("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Pais pais : paissParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPais("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PaisConstantesFunciones.generarExcelReporteDataPais("NORMAL",row,workbook,pais,cellStyleDataAux);
		
			
			


				//Ciudad
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CiudadConstantesFunciones.SCLASSWEBTITULO))) {

				if(pais.getCiudads()!=null && pais.getCiudads().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CiudadConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CiudadConstantesFunciones.generarExcelReporteHeaderCiudad("RELACIONADO",row,workbook);
				}

				if(pais.getCiudads()!=null) {
					i2=0;
					for(Ciudad ciudad : pais.getCiudads()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CiudadConstantesFunciones.generarExcelReporteDataCiudad("RELACIONADO",row,workbook,ciudad,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Provincia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProvinciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(pais.getProvincias()!=null && pais.getProvincias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProvinciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProvinciaConstantesFunciones.generarExcelReporteHeaderProvincia("RELACIONADO",row,workbook);
				}

				if(pais.getProvincias()!=null) {
					i2=0;
					for(Provincia provincia : pais.getProvincias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProvinciaConstantesFunciones.generarExcelReporteDataProvincia("RELACIONADO",row,workbook,provincia,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Region
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RegionConstantesFunciones.SCLASSWEBTITULO))) {

				if(pais.getRegions()!=null && pais.getRegions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RegionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RegionConstantesFunciones.generarExcelReporteHeaderRegion("RELACIONADO",row,workbook);
				}

				if(pais.getRegions()!=null) {
					i2=0;
					for(Region region : pais.getRegions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RegionConstantesFunciones.generarExcelReporteDataRegion("RELACIONADO",row,workbook,region,cellStyleDataAuxHijo);
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
		cell.setCellValue(PaisConstantesFunciones.getPaisDescripcion(pais));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPais.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPais.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPais() throws Exception {		
		this.startProcessPais(true);
	}
	
	public void startProcessPais(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPais ,this.jPanelParametrosReportesPais, this.jScrollPanelDatosPais,this.jPanelPaginacionPais, this.jScrollPanelDatosEdicionPais, this.jPanelAccionesPais,this.jPanelAccionesFormularioPais,this.jmenuBarPais,this.jmenuBarDetallePais,this.jTtoolBarPais,this.jTtoolBarDetallePais);		
		
		final JTabbedPane jTabbedPaneBusquedasPais=this.jTabbedPaneBusquedasPais; 
		
		final JPanel jPanelParametrosReportesPais=this.jPanelParametrosReportesPais;
		//final JScrollPane jScrollPanelDatosPais=this.jScrollPanelDatosPais;
		final JTable jTableDatosPais=this.jTableDatosPais;		
		final JPanel jPanelPaginacionPais=this.jPanelPaginacionPais;
		//final JScrollPane jScrollPanelDatosEdicionPais=this.jScrollPanelDatosEdicionPais;
		final JPanel jPanelAccionesPais=this.jPanelAccionesPais;
		
		JPanel jPanelCamposAuxiliarPais=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPais=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPais!=null) {
			jPanelCamposAuxiliarPais=this.jInternalFrameDetalleFormPais.jPanelCamposPais;
			jPanelAccionesFormularioAuxiliarPais=this.jInternalFrameDetalleFormPais.jPanelAccionesFormularioPais;
		}
		
		final JPanel jPanelCamposPais=jPanelCamposAuxiliarPais;
		final JPanel jPanelAccionesFormularioPais=jPanelAccionesFormularioAuxiliarPais;
		
		
		final JMenuBar jmenuBarPais=this.jmenuBarPais;
		final JToolBar jTtoolBarPais=this.jTtoolBarPais;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPais=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPais=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPais!=null) {
			jmenuBarDetalleAuxiliarPais=this.jInternalFrameDetalleFormPais.jmenuBarDetallePais;
			jTtoolBarDetalleAuxiliarPais=this.jInternalFrameDetalleFormPais.jTtoolBarDetallePais;
		}
		
		final JMenuBar jmenuBarDetallePais=jmenuBarDetalleAuxiliarPais;
		final JToolBar jTtoolBarDetallePais=jTtoolBarDetalleAuxiliarPais;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPais;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPais;
			processRunnable.jTableDatos=jTableDatosPais;
			processRunnable.jPanelCampos=jPanelCamposPais;
			processRunnable.jPanelPaginacion=jPanelPaginacionPais;
			processRunnable.jPanelAcciones=jPanelAccionesPais;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPais;
			
			
			processRunnable.jmenuBar=jmenuBarPais;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePais;
			processRunnable.jTtoolBar=jTtoolBarPais;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePais;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPais ,jPanelParametrosReportesPais,jTableDatosPais, /*jScrollPanelDatosPais,*/jPanelCamposPais,jPanelPaginacionPais, /*jScrollPanelDatosEdicionPais,*/ jPanelAccionesPais,jPanelAccionesFormularioPais,jmenuBarPais,jmenuBarDetallePais,jTtoolBarPais,jTtoolBarDetallePais);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPais ,jPanelParametrosReportesPais, jScrollPanelDatosPais,jPanelPaginacionPais, jScrollPanelDatosEdicionPais, jPanelAccionesPais,jPanelAccionesFormularioPais,jmenuBarPais,jmenuBarDetallePais,jTtoolBarPais,jTtoolBarDetallePais);
						
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
	
	public void finishProcessPais() {// throws Exception 
		this.finishProcessPais(true);
	}
	
	public void finishProcessPais(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPais ,this.jPanelParametrosReportesPais, this.jScrollPanelDatosPais,this.jPanelPaginacionPais, this.jScrollPanelDatosEdicionPais, this.jPanelAccionesPais,this.jPanelAccionesFormularioPais,this.jmenuBarPais,this.jmenuBarDetallePais,this.jTtoolBarPais,this.jTtoolBarDetallePais);		
		
		final JTabbedPane jTabbedPaneBusquedasPais=this.jTabbedPaneBusquedasPais; 
		
		final JPanel jPanelParametrosReportesPais=this.jPanelParametrosReportesPais;
		//final JScrollPane jScrollPanelDatosPais=this.jScrollPanelDatosPais;
		final JTable jTableDatosPais=this.jTableDatosPais;		
		final JPanel jPanelPaginacionPais=this.jPanelPaginacionPais;
		//final JScrollPane jScrollPanelDatosEdicionPais=this.jScrollPanelDatosEdicionPais;
		final JPanel jPanelAccionesPais=this.jPanelAccionesPais;
		
		JPanel jPanelCamposAuxiliarPais=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPais=new JPanel();
		
		if(this.jInternalFrameDetalleFormPais!=null) {
			jPanelCamposAuxiliarPais=this.jInternalFrameDetalleFormPais.jPanelCamposPais;
			jPanelAccionesFormularioAuxiliarPais=this.jInternalFrameDetalleFormPais.jPanelAccionesFormularioPais;
		}
		
		final JPanel jPanelCamposPais=jPanelCamposAuxiliarPais;
		final JPanel jPanelAccionesFormularioPais=jPanelAccionesFormularioAuxiliarPais;
		
		
		final JMenuBar jmenuBarPais=this.jmenuBarPais;		
		final JToolBar jTtoolBarPais=this.jTtoolBarPais;
				
		JMenuBar jmenuBarDetalleAuxiliarPais=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPais=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPais!=null) {
			jmenuBarDetalleAuxiliarPais=this.jInternalFrameDetalleFormPais.jmenuBarDetallePais;
			jTtoolBarDetalleAuxiliarPais=this.jInternalFrameDetalleFormPais.jTtoolBarDetallePais;		
		}
		
		final JMenuBar jmenuBarDetallePais=jmenuBarDetalleAuxiliarPais;
		final JToolBar jTtoolBarDetallePais=jTtoolBarDetalleAuxiliarPais;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPais;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPais;
			processRunnable.jTableDatos=jTableDatosPais;
			processRunnable.jPanelCampos=jPanelCamposPais;
			processRunnable.jPanelPaginacion=jPanelPaginacionPais;
			processRunnable.jPanelAcciones=jPanelAccionesPais;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPais;
			
			
			processRunnable.jmenuBar=jmenuBarPais;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePais;
			processRunnable.jTtoolBar=jTtoolBarPais;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePais;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPais ,jPanelParametrosReportesPais, jTableDatosPais,/*jScrollPanelDatosPais,*/jPanelCamposPais,jPanelPaginacionPais, /*jScrollPanelDatosEdicionPais,*/ jPanelAccionesPais,jPanelAccionesFormularioPais,jmenuBarPais,jmenuBarDetallePais,jTtoolBarPais,jTtoolBarDetallePais));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPais(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPais(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPais(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPais(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPais,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePais,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPais(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPais,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePais,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.paisConstantesFunciones.getsFinalQueryPais();
		String  finalQueryPaginacionTodos=this.paisConstantesFunciones.getsFinalQueryPais();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PaisConstantesFunciones.getArrayColumnasGlobalesNoPais(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.paissEliminados= new ArrayList<Pais>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPais();
		
				///*PaisSessionBean*/this.paisSessionBean=new PaisSessionBean();
			
			if(this.paisSessionBean==null) {
				this.paisSessionBean=new PaisSessionBean();
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
					this.iNumeroPaginacion=PaisConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PaisConstantesFunciones.getClassesForeignKeysOfPais(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pais."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			paissAux= new ArrayList<Pais>();
			
				
			paisLogic.setDatosCliente(this.datosCliente);
			paisLogic.setDatosDeep(this.datosDeep);
			paisLogic.setIsConDeep(true);
			
			
			paisLogic.getPaisDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					paisLogic.getTodosPaiss(finalQueryGlobal,pagination);
					
					//paisLogic.getTodosPaissWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(paisLogic.getPaiss()==null|| paisLogic.getPaiss().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							paissAux= new ArrayList<Pais>();
							paissAux.addAll(paisLogic.getPaiss());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paissAux= new ArrayList<Pais>();
							paissAux.addAll(paiss);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							paisLogic.getTodosPaiss(finalQueryGlobal+"",this.pagination);												
							
							//paisLogic.getTodosPaissWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePaiss("Todos",paisLogic.getPaiss() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							paisLogic.setPaiss(new ArrayList<Pais>());					
							paisLogic.getPaiss().addAll(paissAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paiss=new ArrayList<Pais>();
							paiss.addAll(paissAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPais=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPais=this.idActual;
				
				} else if(this.idPaisActual!=null && this.idPaisActual!=0L) {
					idPais=idPaisActual;
				}
				
					
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndicePorId(idPais);
				
				this.paiss=new ArrayList<Pais>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					paisLogic.getEntity(idPais);
					
					//paisLogic.getEntityWithConnection(idPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.setPaiss(new ArrayList<Pais>());
					paisLogic.getPaiss().add(paisLogic.getPais());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.paiss=new ArrayList<Pais>();
					this.paiss.add(pais);
				}
				
				if(paisLogic.getPais()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdContinentePorNombre")) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceBusquedaPorIdContinentePorNombre(id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					paisLogic.getPaissBusquedaPorIdContinentePorNombre(finalQueryGlobal,pagination,id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceBusquedaPorIdContinentePorNombre(id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceBusquedaPorIdContinentePorNombre(id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=paisLogic.getPaiss()==null||paisLogic.getPaiss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=paiss==null|| paiss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						paissAux=new ArrayList<Pais>();
						paissAux.addAll(paisLogic.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paissAux=new ArrayList<Pais>();
							paissAux.addAll(paiss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							paisLogic.getPaissBusquedaPorIdContinentePorNombre(finalQueryGlobal,pagination,id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceBusquedaPorIdContinentePorNombre(id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceBusquedaPorIdContinentePorNombre(id_continenteBusquedaPorIdContinentePorNombre,nombreBusquedaPorIdContinentePorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePaiss("BusquedaPorIdContinentePorNombre",paisLogic.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePaiss("BusquedaPorIdContinentePorNombre",paiss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						paisLogic.setPaiss(new ArrayList<Pais>());
						paisLogic.getPaiss().addAll(paissAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paiss=new ArrayList<Pais>();
							paiss.addAll(paissAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdContinente")) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceFK_IdContinente(id_continenteFK_IdContinente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					paisLogic.getPaissFK_IdContinente(finalQueryGlobal,pagination,id_continenteFK_IdContinente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceFK_IdContinente(id_continenteFK_IdContinente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceFK_IdContinente(id_continenteFK_IdContinente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=paisLogic.getPaiss()==null||paisLogic.getPaiss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=paiss==null|| paiss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						paissAux=new ArrayList<Pais>();
						paissAux.addAll(paisLogic.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paissAux=new ArrayList<Pais>();
							paissAux.addAll(paiss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							paisLogic.getPaissFK_IdContinente(finalQueryGlobal,pagination,id_continenteFK_IdContinente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceFK_IdContinente(id_continenteFK_IdContinente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PaisConstantesFunciones.getDetalleIndiceFK_IdContinente(id_continenteFK_IdContinente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePaiss("FK_IdContinente",paisLogic.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePaiss("FK_IdContinente",paiss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						paisLogic.setPaiss(new ArrayList<Pais>());
						paisLogic.getPaiss().addAll(paissAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paiss=new ArrayList<Pais>();
							paiss.addAll(paissAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPais();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPais();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=paisLogic.getPaiss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=paiss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=paisLogic.getPaiss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=paiss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Pais pais) {
		Boolean permite=true;
		
		if(this.pais.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PaisConstantesFunciones.getOrderByListaPais();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PaisConstantesFunciones.getOrderByListaPais();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pais pais:paisLogic.getPaiss()) {
				if(pais.getsType().equals(Constantes2.S_TOTALES)) {
					paisTotales=pais;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pais pais:this.paiss) {
				if(pais.getsType().equals(Constantes2.S_TOTALES)) {
					paisTotales=pais;
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
			this.paisAux=new Pais();
			this.paisAux.setsType(Constantes2.S_TOTALES);
			this.paisAux.setIsNew(false);
			this.paisAux.setIsChanged(false);
			this.paisAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PaisConstantesFunciones.TotalizarValoresFilaPais(this.paisLogic.getPaiss(),this.paisAux);
				
				this.paisLogic.getPaiss().add(this.paisAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PaisConstantesFunciones.TotalizarValoresFilaPais(this.paiss,this.paisAux);
				
				this.paiss.add(this.paisAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		paisTotales=new Pais();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.paisLogic.getPaiss().remove(paisTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.paiss.remove(paisTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		paisTotales=new Pais();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pais pais:paisLogic.getPaiss()) {
				if(pais.getsType().equals(Constantes2.S_TOTALES)) {
					paisTotales=pais;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PaisConstantesFunciones.TotalizarValoresFilaPais(this.paisLogic.getPaiss(),paisTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pais pais:this.paiss) {
				if(pais.getsType().equals(Constantes2.S_TOTALES)) {
					paisTotales=pais;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PaisConstantesFunciones.TotalizarValoresFilaPais(this.paiss,paisTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPaissBusquedaPorIdContinentePorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdContinentePorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPaissFK_IdContinente()throws Exception {
		try {
			sAccionBusqueda="FK_IdContinente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPaisPorIdContinentePorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdContinentePorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getPaissBusquedaPorIdContinentePorNombre(String sFinalQuery,Long id_continente,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaissBusquedaPorIdContinentePorNombre(sFinalQuery,this.pagination,id_continente,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPaissFK_IdContinente(String sFinalQuery,Long id_continente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaissFK_IdContinente(sFinalQuery,this.pagination,id_continente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPaisPorIdContinentePorNombre(Long id_continente,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisPorIdContinentePorNombre(id_continente,nombre);
				
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
	
	public void inicializarPermisosPais() {
		this.isPermisoTodoPais=false;
		this.isPermisoNuevoPais=false;
		this.isPermisoActualizarPais=false;
		this.isPermisoActualizarOriginalPais=false;
		this.isPermisoEliminarPais=false;
		this.isPermisoGuardarCambiosPais=false;
		this.isPermisoConsultaPais=false;
		this.isPermisoBusquedaPais=false;
		this.isPermisoReportePais=false;		
		this.isPermisoOrdenPais=false;		
		this.isPermisoPaginacionMedioPais=false;		
		this.isPermisoPaginacionAltoPais=false;
		this.isPermisoPaginacionTodoPais=false;
		this.isPermisoCopiarPais=false;		
		this.isPermisoVerFormPais=false;		
		this.isPermisoDuplicarPais=false;		
		this.isPermisoOrdenPais=false;		
	}
	
	public void setPermisosUsuarioPais(Boolean isPermiso) {
		this.isPermisoTodoPais=isPermiso;
		this.isPermisoNuevoPais=isPermiso;
		this.isPermisoActualizarPais=isPermiso;
		this.isPermisoActualizarOriginalPais=isPermiso;
		this.isPermisoEliminarPais=isPermiso;
		this.isPermisoGuardarCambiosPais=isPermiso;
		this.isPermisoConsultaPais=isPermiso;
		this.isPermisoBusquedaPais=isPermiso;
		this.isPermisoReportePais=isPermiso;
		this.isPermisoOrdenPais=isPermiso;		
		this.isPermisoPaginacionMedioPais=isPermiso;		
		this.isPermisoPaginacionAltoPais=isPermiso;		
		this.isPermisoPaginacionTodoPais=isPermiso;		
		this.isPermisoCopiarPais=isPermiso;		
		this.isPermisoVerFormPais=isPermiso;		
		this.isPermisoDuplicarPais=isPermiso;
		this.isPermisoOrdenPais=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPais(Boolean isPermiso) {
		//this.isPermisoTodoPais=isPermiso;
		this.isPermisoNuevoPais=isPermiso;
		this.isPermisoActualizarPais=isPermiso;
		this.isPermisoActualizarOriginalPais=isPermiso;
		this.isPermisoEliminarPais=isPermiso;
		this.isPermisoGuardarCambiosPais=isPermiso;
		//this.isPermisoConsultaPais=isPermiso;
		//this.isPermisoBusquedaPais=isPermiso;
		//this.isPermisoReportePais=isPermiso;
		//this.isPermisoOrdenPais=isPermiso;		
		//this.isPermisoPaginacionMedioPais=isPermiso;		
		//this.isPermisoPaginacionAltoPais=isPermiso;		
		//this.isPermisoPaginacionTodoPais=isPermiso;		
		//this.isPermisoCopiarPais=isPermiso;		
		//this.isPermisoDuplicarPais=isPermiso;
		//this.isPermisoOrdenPais=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPaisClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CiudadConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProvinciaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(RegionConstantesFunciones.SNOMBREOPCION);
		
		if(PaisJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCiudad=false;
		this.isTienePermisosCiudad=this.verificarGetPermisosUsuarioOpcionPaisClaseRelacionada(this.opcionsRelacionadas,CiudadConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProvincia=false;
		this.isTienePermisosProvincia=this.verificarGetPermisosUsuarioOpcionPaisClaseRelacionada(this.opcionsRelacionadas,ProvinciaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosRegion=false;
		this.isTienePermisosRegion=this.verificarGetPermisosUsuarioOpcionPaisClaseRelacionada(this.opcionsRelacionadas,RegionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPais(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPaisClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCiudad=conPermiso;
		this.isTienePermisosProvincia=conPermiso;
		this.isTienePermisosRegion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPaisClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPaisClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPaisClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCiudad && this.jInternalFrameDetalleFormPais!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.remove(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProvincia && this.jInternalFrameDetalleFormPais!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.remove(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosRegion && this.jInternalFrameDetalleFormPais!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.remove(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPais() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PaisJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.paisSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PaisConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPais=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPais=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPais=this.isPermisoActualizarPais;
			this.isPermisoEliminarPais=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPais=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPais=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPais=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPais=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePais=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPais=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPais=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPais=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPais=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPais=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPais=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPais=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPais=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.paisSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPais.setToolTipText(this.jTableDatosPais.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPais(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPais(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PaisJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PaisJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPais() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCiudad && this.paisConstantesFunciones.mostrarCiudadPais && !PaisConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Ciudad");
			reporte.setsDescripcion("Ciudad");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProvincia && this.paisConstantesFunciones.mostrarProvinciaPais && !PaisConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Provincia");
			reporte.setsDescripcion("Provincia");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosRegion && this.paisConstantesFunciones.mostrarRegionPais && !PaisConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Region");
			reporte.setsDescripcion("Region");
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
	public void inicializarCombosForeignKeyPaisListas()throws Exception {
		try	{						
			
				this.continentesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPaisListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PaisJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPaisListas(false);
			} else {
			
				this.cargarCombosForeignKeyContinenteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyContinenteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.continentesForeignKey==null||this.continentesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ContinenteConstantesFunciones.getArrayColumnasGlobalesContinente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ContinenteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ContinenteConstantesFunciones.SFINALQUERY;

				this.cargarCombosContinentesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPaisListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PaisParameterReturnGeneral paisReturnGeneral=new PaisParameterReturnGeneral();
						
			


				String finalQueryGlobalContinente="";

				if(((this.continentesForeignKey==null||this.continentesForeignKey.size()<=0) && this.paisConstantesFunciones.cargarid_continentePais)
					 || (this.esRecargarFks && this.paisConstantesFunciones.cargarid_continentePais)) {

					if(!this.paisSessionBean.getisBusquedaDesdeForeignKeySesionContinente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ContinenteConstantesFunciones.getArrayColumnasGlobalesContinente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalContinente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ContinenteConstantesFunciones.TABLENAME);

						finalQueryGlobalContinente=Funciones.GetFinalQueryAppend(finalQueryGlobalContinente, "");
						finalQueryGlobalContinente+=ContinenteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosContinentesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalContinente=" WHERE " + ConstantesSql.ID + "="+paisSessionBean.getlidContinenteActual();
					}
				} else {
					finalQueryGlobalContinente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				paisReturnGeneral=paisLogic.cargarCombosLoteForeignKeyPais(finalQueryGlobalContinente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalContinente.equals("NONE")) {
				this.continentesForeignKey=paisReturnGeneral.getcontinentesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPais()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyContinente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyContinente()throws Exception {
		try {
			if(this.paisSessionBean==null) {
				this.paisSessionBean=new PaisSessionBean();
			}

			if(!this.paisSessionBean.getisBusquedaDesdeForeignKeySesionContinente()) {
				Continente continente=new Continente();
				ContinenteConstantesFunciones.setContinenteDescripcion(continente,Constantes.SMENSAJE_ESCOJA_OPCION);
				continente.setId(null);

				if(!ContinenteConstantesFunciones.ExisteEnLista(this.continentesForeignKey,continente,true)) {

					this.continentesForeignKey.add(0,continente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPais()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPais()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPais();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPais(Pais pais)throws Exception {	
		try {
			
			this.setActualContinenteForeignKey(pais.getid_continente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPais(Pais pais,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPais()throws Exception {	
		try {
			
			this.setActualContinenteForeignKey(this.paisConstantesFunciones.getid_continente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPais()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPais()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPais()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPais()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPais()throws Exception {
		try {
			

			this.cargarCombosFrameContinentesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameContinentesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais!=null && this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.getItemCount()>0) {
				this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PaisBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PaisBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PaisBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.paisSessionBean=new PaisSessionBean(); 
		this.paisConstantesFunciones=new PaisConstantesFunciones(); 
		this.paisBean=new Pais();//(this.paisConstantesFunciones); 		
		this.paisReturnGeneral=new PaisParameterReturnGeneral(); 
		
		this.paisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.paisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PaisBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PaisBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PaisBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPais(true);
			
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
			
			this.paisConstantesFunciones=new PaisConstantesFunciones(); 
			this.paisBean=new Pais();//this.paisConstantesFunciones); 			
			this.paisReturnGeneral=new PaisParameterReturnGeneral(); 
		
			PaisBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pais Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.pais=new Pais();
			this.paiss = new ArrayList<Pais>();
			this.paissAux = new ArrayList<Pais>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic=new PaisLogic();
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			//this.paisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.paisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPais);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPais!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPais);	
					}
					
					if(this.jInternalFrameImportacionPais!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPais);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPais!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPais);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPais!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPais);
				this.jInternalFrameDetalleFormPais.setVisible(false);
				this.jInternalFrameDetalleFormPais.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPais!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPais);
					this.jInternalFrameReporteDinamicoPais.setVisible(false);
					this.jInternalFrameReporteDinamicoPais.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPais!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPais);
					this.jInternalFrameImportacionPais.setVisible(false);
					this.jInternalFrameImportacionPais.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPais!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPais);
					this.jInternalFrameOrderByPais.setVisible(false);
					this.jInternalFrameOrderByPais.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPaisActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PaisConstantesFunciones.INUMEROPAGINACION;
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
			
			this.paisReturnGeneral=new PaisParameterReturnGeneral();
			
			this.paisParameterGeneral=new PaisParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.paisLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.paisSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PaisJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.paisSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CiudadConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProvinciaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(RegionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PaisConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.paisSessionBean.getEsGuardarRelacionado(),this.paisSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PaisConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.paisSessionBean.getEsGuardarRelacionado(),this.paisSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaDuplicarPais=true;
			this.isVisibilidadCeldaCopiarPais=true;
			this.isVisibilidadCeldaVerFormPais=true;
			this.isVisibilidadCeldaOrdenPais=true;
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
			this.isVisibilidadCeldaModificarPais=false;
			this.isVisibilidadCeldaActualizarPais=false;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=false;
			this.isVisibilidadCeldaGuardarPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
			
			
			this.isVisibilidadBusquedaPorIdContinentePorNombre=true;
			this.isVisibilidadFK_IdContinente=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPais("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPais();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPais(false);
			
			this.setPermisosUsuarioPais();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.paisSessionBean.getEsGuardarRelacionado() 
				|| (this.paisSessionBean.getEsGuardarRelacionado() && this.paisSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPaisClasesRelacionadas();
			}
			
			if(this.paisSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPaisClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PaisJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPais();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPais();
			}
			
			if(!this.isPermisoBusquedaPais) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPais.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.paisSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPais,this.isPermisoPaginacionMedioPais,this.isPermisoPaginacionTodoPais);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PaisConstantesFunciones.getTiposSeleccionarPais());
				
				this.tiposColumnasSelect=PaisConstantesFunciones.getTiposSeleccionarPais(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPais();				
				//this.tiposRelacionesSelect=PaisConstantesFunciones.getTiposRelacionesPais(true);
				
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
			//if(!this.paisSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPais();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPais(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPais(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPais() ;
			
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
			
			
			this.ciudadLogic=new CiudadLogic();
			this.provinciaLogic=new ProvinciaLogic();
			this.regionLogic=new RegionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.continenteLogic=new ContinenteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				paisImplementable= (PaisImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PaisConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				paisImplementableHome= (PaisImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PaisConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.paiss= new ArrayList<Pais>();
			this.paissEliminados= new ArrayList<Pais>();
						
			this.isEsNuevoPais=false;
			this.esParaAccionDesdeFormularioPais=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.continentesForeignKey=new ArrayList<Continente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPais(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPais();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.paisSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PaisBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PaisConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPais("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPais(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPais!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPais();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPais();
			}
			
			PaisBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPais.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPais.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPais.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPais(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Pais: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPais() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CiudadConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CiudadConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(RegionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RegionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPais")) {
				iIndex=this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPais.getSelectedRow();	
				
				

				if(sTitle.equals("Ciudades")) {
					if(!CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPais();

						this.cargarParteTabPanelRelacionadaCiudad(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Provinciaes")) {
					if(!ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPais();

						this.cargarParteTabPanelRelacionadaProvincia(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Regiones")) {
					if(!RegionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPais();

						this.cargarParteTabPanelRelacionadaRegion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPais();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCiudad(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPais.cargarSessionConBeanSwingJInternalFrameCiudad(false,true,iIndex);
		this.jButtonCiudadActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCiudad();

		//this.jTabbedPaneRelacionesPais.updateUI();
		//this.jTabbedPaneRelacionesPais.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPais.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProvincia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPais.cargarSessionConBeanSwingJInternalFrameProvincia(false,true,iIndex);
		this.jButtonProvinciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProvincia();

		//this.jTabbedPaneRelacionesPais.updateUI();
		//this.jTabbedPaneRelacionesPais.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPais.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaRegion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPais.cargarSessionConBeanSwingJInternalFrameRegion(false,true,iIndex);
		this.jButtonRegionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRegion();

		//this.jTabbedPaneRelacionesPais.updateUI();
		//this.jTabbedPaneRelacionesPais.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPais.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Ciudad")) {
				int row=this.jTableDatosPais.getSelectedRow();
				jButtonCiudadActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Provincia")) {
				int row=this.jTableDatosPais.getSelectedRow();
				jButtonProvinciaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Region")) {
				int row=this.jTableDatosPais.getSelectedRow();
				jButtonRegionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Ciudad")) {

					if(this.isTienePermisosCiudad && this.paisConstantesFunciones.mostrarCiudadPais && !PaisConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Ciudades"+"("+CiudadConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Ciudades");

						if(paisConstantesFunciones.resaltarCiudadPais!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(paisConstantesFunciones.resaltarCiudadPais);
						}

						jmenuItem.setEnabled(this.paisConstantesFunciones.activarCiudadPais);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Ciudad"));

						

						this.jInternalFrameDetalleFormPais.jmenuDetallePais.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Provincia")) {

					if(this.isTienePermisosProvincia && this.paisConstantesFunciones.mostrarProvinciaPais && !PaisConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Provinciaes"+"("+ProvinciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Provinciaes");

						if(paisConstantesFunciones.resaltarProvinciaPais!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(paisConstantesFunciones.resaltarProvinciaPais);
						}

						jmenuItem.setEnabled(this.paisConstantesFunciones.activarProvinciaPais);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Provincia"));

						

						this.jInternalFrameDetalleFormPais.jmenuDetallePais.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Region")) {

					if(this.isTienePermisosRegion && this.paisConstantesFunciones.mostrarRegionPais && !PaisConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Regiones"+"("+RegionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Regiones");

						if(paisConstantesFunciones.resaltarRegionPais!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(paisConstantesFunciones.resaltarRegionPais);
						}

						jmenuItem.setEnabled(this.paisConstantesFunciones.activarRegionPais);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Region"));

						

						this.jInternalFrameDetalleFormPais.jmenuDetallePais.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPais(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPaisListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPais();
		
		this.cargarCombosFrameForeignKeyPais();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPais();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPais();
		}
	}
	
	

	public void cargarCombosForeignKeyContinente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyContinenteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyContinente();
				this.cargarCombosFrameContinentesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaContinente(this.continentesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPaisActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.paisSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			
			if(jTableDatosPais.getRowCount()>=1) {
				jTableDatosPais.removeRowSelectionInterval(0, jTableDatosPais.getRowCount()-1);						
			}
			
			this.isEsNuevoPais=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPais(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPais(true);			
			//this.pais=new Pais();
			//this.pais.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPais(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPais() ;
			
			if(PaisJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePais(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pais);	
			this.actualizarInformacion("INFO_PADRE",false,this.pais);				
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			if(this.paisSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Pais: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPaisActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPais.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPais.getSelectedRows().length;			
			}
			
			paissSeleccionados=this.getPaissSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPais--;			
				//Pais paisAux= new Pais();			
				//paisAux.setId(this.iIdNuevoPais);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Pais paisOrigen=new Pais();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Pais paisOrigen : paissSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPais.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							paisOrigen =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paisOrigen =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPais();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pais.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPais(paisOrigen,this.pais,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.paisLogic.getPaiss().add(this.paisAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.paiss.add(this.paisAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPais(false);
				
				this.jTableDatosPais.setRowSelectionInterval(this.getIndiceNuevoPais(), this.getIndiceNuevoPais());
				
				int iLastRow =  this.jTableDatosPais.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPais.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPais.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPais(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();									
		
			Pais paisOrigen=new Pais();
			Pais paisDestino=new Pais();
				
			paissSeleccionados=this.getPaissSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPais.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || paissSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPais.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paisOrigen =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						paisOrigen =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paisDestino =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						paisDestino =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				paisOrigen =paissSeleccionados.get(0);
				paisDestino =paissSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPais(paisOrigen,paisDestino,true,false);
				
				paisDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(paisDestino,paisLogic.getPaiss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paisDestino,paiss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPais(false);
				
				//this.jTableDatosPais.setRowSelectionInterval(this.getIndiceNuevoPais(), this.getIndiceNuevoPais());
				
				int iLastRow =  this.jTableDatosPais.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPais.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPais.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPais(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPais.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPais.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPais.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPais.setVisible(!isVisible);
			this.jPanelPaginacionPais.setVisible(!isVisible);
			this.jPanelAccionesPais.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePais();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPais();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPais();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPais();
			
			this.abrirFrameOrderByPais();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPais();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePais(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPais);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPais.isMaximum()) {
					this.jInternalFrameDetalleFormPais.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPais.setSize(this.jInternalFrameDetalleFormPais.iWidthFormulario,this.jInternalFrameDetalleFormPais.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPais.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPais.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPais.isMaximum()) {
						this.jInternalFrameDetalleFormPais.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth(),PaisConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth(),PaisConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth(),PaisConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCiudad();
					}

					if(ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProvincia();
					}

					if(RegionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRegion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPais.setVisible(true);
	        this.jInternalFrameDetalleFormPais.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPais() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPais==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPais=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPais,false,this);
				} else {
					this.jInternalFrameOrderByPais=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPais,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPais);
				this.jInternalFrameOrderByPais.setVisible(false);
				this.jInternalFrameOrderByPais.setSelected(false);
				
				this.jInternalFrameOrderByPais.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPais"));
				
				this.inicializarActualizarBindingTablaOrderByPais();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPais() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPais==null) {
				
				this.jInternalFrameImportacionPais=new ImportacionJInternalFrame(PaisConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPais);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPais);
				this.jInternalFrameImportacionPais.setVisible(false);
				this.jInternalFrameImportacionPais.setSelected(false);


				this.jInternalFrameImportacionPais.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPais"));
				this.jInternalFrameImportacionPais.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPais"));
				this.jInternalFrameImportacionPais.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPais"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPais() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPais==null) {
				this.jInternalFrameReporteDinamicoPais=new ReporteDinamicoJInternalFrame(PaisConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPais);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPais);
				this.jInternalFrameReporteDinamicoPais.setVisible(false);
				this.jInternalFrameReporteDinamicoPais.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPais.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPais"));
				this.jInternalFrameReporteDinamicoPais.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPais"));
				this.jInternalFrameReporteDinamicoPais.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPais"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPais();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCiudad() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProvincia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaRegion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPais.jContentPaneDetallePais.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePais() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPais);
			
	       	this.jInternalFrameDetalleFormPais.setVisible(false);
	        this.jInternalFrameDetalleFormPais.setSelected(false);
			
			//this.jInternalFrameDetalleFormPais.dispose();
			//this.jInternalFrameDetalleFormPais=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPais() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPais.setVisible(true);
	        this.jInternalFrameReporteDinamicoPais.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPais() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPais.setVisible(true);
	        this.jInternalFrameImportacionPais.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPais() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPais.setVisible(true);
	        this.jInternalFrameOrderByPais.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPais() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPais.setVisible(false);
	        this.jInternalFrameOrderByPais.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPais() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPais.setVisible(false);
	        this.jInternalFrameReporteDinamicoPais.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPais() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPais.setVisible(false);
	        this.jInternalFrameImportacionPais.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPaisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPais(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPais(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPais.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPais(true);
			//this.isEsNuevoPais=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPais("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPais(false) ;
			
			if(paisSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadSessionBean.getEsGuardarRelacionado() && CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCiudadActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaSessionBean.getEsGuardarRelacionado() && ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvinciaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionSessionBean.getEsGuardarRelacionado() && RegionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRegionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PaisJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePais(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPais(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPaisActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPais(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPais.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPais(true);
			//this.isEsNuevoPais=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pais.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPais("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPais(false) ;
			
			if(PaisJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePais(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPais(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaContinente(List<Continente> continentesForeignKey)throws Exception{
		TableColumn tableColumnContinente=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,PaisConstantesFunciones.LABEL_IDCONTINENTE));
		TableCellEditor tableCellEditorContinente =tableColumnContinente.getCellEditor();

		ContinenteTableCell continenteTableCellFk=(ContinenteTableCell)tableCellEditorContinente;

		if(continenteTableCellFk!=null) {
			continenteTableCellFk.setcontinentesForeignKey(continentesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPais.getSelectedRow();

		//if(intSelectedRow<=0) {
			//continenteTableCellFk.setRowActual(intSelectedRow);
			//continenteTableCellFk.setcontinentesForeignKeyActual(continentesForeignKey);
		//}


		if(continenteTableCellFk!=null) {
			continenteTableCellFk.RecargarContinentesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPaisActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPais(false);
			
			//if(!this.isEsNuevoPais) {								
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPais(this.pais,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				
			}
			
			if(this.permiteMantenimiento(this.pais)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.paisSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPais=true;
					this.inicializarActualizarBindingTablaPais(false);
					this.isEsNuevoPais=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPais=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPais=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPais(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPais(false);
				
				this.habilitarDeshabilitarControlesPais(false);
			
												
				
				if(PaisJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePais();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPaisActionPerformed(evt,paisSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPais(this.pais,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPais.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,paisSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pais.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPaisActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPais.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				this.pais.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				this.pais.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pais)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.paisSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PaisModel) this.jTableDatosPais.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPais=true;
				this.inicializarActualizarBindingTablaPais(false);
				this.isEsNuevoPais=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPais(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPais(false);
				
				this.habilitarDeshabilitarControlesPais(false);
				
				
				
				if(PaisJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePais();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPaisActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPais.getRowCount()>=1) {
				jTableDatosPais.removeRowSelectionInterval(0, jTableDatosPais.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPais(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPais(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPais(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPais(false) ;
			
			this.isEsNuevoPais=false;
			
			if(PaisJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePais();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPaisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPais(false);
				
				//SI ES MANUAL
				if(PaisJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPais();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPaisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPais--;			
			//Pais paisAux= new Pais();			
			//paisAux.setId(this.iIdNuevoPais);
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPais();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
			
			this.pais.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.paisLogic.getPaiss().add(this.paisAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.paiss.add(this.paisAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPais(false);
			
			this.jTableDatosPais.setRowSelectionInterval(this.getIndiceNuevoPais(), this.getIndiceNuevoPais());
			
			int iLastRow =  this.jTableDatosPais.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPais.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPais.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPais(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPaisActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPais(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPais(false);
			
			//SI ES MANUAL
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPais();
			}
			
			//this.abrirFrameTreePais();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPaisActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PaisES ?", "MANTENIMIENTO DE Pais", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPais.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPais();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.paisReturnGeneral=paisLogic.procesarImportacionPaissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.paisParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPaisReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPaisActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPais.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPais.setFileImportacion(this.jInternalFrameImportacionPais.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPais.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPais.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPais.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPais.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPaisActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		

		paissSeleccionados=this.getPaissSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PaisBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PaisBaseDesign.jrxml";
			
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
			
			this.generarReportePaiss("Todos",paissSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PaisConstantesFunciones.LABEL_IDCONTINENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Continente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Continente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Continente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Continente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PaisConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PaisConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PaisConstantesFunciones.LABEL_NACIONALIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cionalidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cionalidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cionalidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cionalidad_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPais.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PaisConstantesFunciones.LABEL_IDCONTINENTE:
					sNombreCampoCategoria="id_continente";
					break;

				case PaisConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PaisConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PaisConstantesFunciones.LABEL_NACIONALIDAD:
					sNombreCampoCategoria="nacionalidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PaisConstantesFunciones.LABEL_IDCONTINENTE:
					sNombreCampoCategoriaValor="id_continente";
					break;

				case PaisConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PaisConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PaisConstantesFunciones.LABEL_NACIONALIDAD:
					sNombreCampoCategoriaValor="nacionalidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPais.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPais.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PaisConstantesFunciones.LABEL_IDCONTINENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Continente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_continente");
					break;

				case PaisConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PaisConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PaisConstantesFunciones.LABEL_NACIONALIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nacionalidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nacionalidad");
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
	
	public void jButtonGenerarExcelReporteDinamicoPaisActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Paiss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PaisConstantesFunciones.LABEL_IDCONTINENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaisConstantesFunciones.LABEL_IDCONTINENTE);
					iRow++;

					for(Pais pais:paissSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pais.getcontinente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PaisConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaisConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Pais pais:paissSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pais.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PaisConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaisConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Pais pais:paissSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pais.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PaisConstantesFunciones.LABEL_NACIONALIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaisConstantesFunciones.LABEL_NACIONALIDAD);
					iRow++;

					for(Pais pais:paissSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pais.getnacionalidad());
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
			//	this.getFilaCabeceraExportarExcelPais(row);				
			//	iRow++;
			//}				
			
			//for(Pais paisAux:paissSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPais(paisAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
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
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPais(false);
			
			//SI ES MANUAL
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPais();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPaisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPais(false);
			
			//SI ES MANUAL
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPais();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPaisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPais(false);
			
			//SI ES MANUAL
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPais();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPais() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPais.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPais.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPais.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPais.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPais.setMinimumSize(dimensionMinimum);
		this.jTableDatosPais.setMaximumSize(dimensionMaximum);
		this.jTableDatosPais.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPais(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPais(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPais(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPais(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPais(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPais(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPais(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPais(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PaisJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PaisJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPais() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPais();
		
		this.inicializarActualizarBindingBotonesManualPais(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPais();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPais() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPais(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPais(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPais.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPais.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePais.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPais!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPais.jCheckBoxPostAccionNuevoPais.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPais.jCheckBoxPostAccionSinCerrarPais.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPais.jCheckBoxPostAccionSinMensajePais.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPais.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPais.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePais.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPais!=null) {
				this.jInternalFrameDetalleFormPais.jCheckBoxPostAccionNuevoPais.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPais.jCheckBoxPostAccionSinCerrarPais.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPais.jCheckBoxPostAccionSinMensajePais.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPais.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPais.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPais.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPais!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPais.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPais.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPais.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPais.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPais!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPais.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPais.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPais(Boolean esInicializar) throws Exception {
		try	{	
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPais(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPais() throws Exception {
		try	{
			if(PaisJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPais();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePais() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPais() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPais.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPais.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPais.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPais.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPais.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPais.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPais.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPais.addItem(reporte);
			}
			
			
			if(!this.paisSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPais.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPais.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPais.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPais.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPais.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPais.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPais.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPais.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPais.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPais();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPais() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPais!=null) {
				this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPais!=null) {
				this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPais.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPais!=null) {
				
				if(this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPais.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPais.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPais.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPais.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPais()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.getSelectedItem()!=null){this.id_continenteBusquedaPorIdContinentePorNombre=((Continente)this.jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdContinentePorNombre=this.jTextAreanombreBusquedaPorIdContinentePorNombrePais.getText();
		if(this.jComboBoxid_continenteFK_IdContinentePais.getSelectedItem()!=null){this.id_continenteFK_IdContinente=((Continente)this.jComboBoxid_continenteFK_IdContinentePais.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPais(Boolean esInicializar) throws Exception {				
		if(PaisJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPais();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPais() throws Exception {
		this.inicializarActualizarBindingTablaPais(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPais() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPais.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPais.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPais.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPais.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPais.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPaisOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaisOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPais.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPais.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPais.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPais(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=paisLogic.getPaiss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=paiss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPais.setModel(new PaisModel(this.paisLogic.getPaiss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPais.setModel(new PaisModel(this.paiss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPais!=null && this.jInternalFrameOrderByPais.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPais();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PaisConstantesFunciones.SCLASSWEBTITULO,paisConstantesFunciones.resaltarSeleccionarPais,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PaisConstantesFunciones.SCLASSWEBTITULO,paisConstantesFunciones.resaltarSeleccionarPais,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,PaisConstantesFunciones.LABEL_ID));

		if(this.paisConstantesFunciones.mostraridPais && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaisConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.paisConstantesFunciones.resaltaridPais,this.paisConstantesFunciones.activaridPais,this,true,"idPais","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paisConstantesFunciones.resaltaridPais,this.paisConstantesFunciones.activaridPais,this,true,"idPais","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,PaisConstantesFunciones.LABEL_IDCONTINENTE));

		if(this.paisConstantesFunciones.mostrarid_continentePais && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaisConstantesFunciones.LABEL_IDCONTINENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ContinenteTableCell(this.continentesForeignKey,this.paisConstantesFunciones.resaltarid_continentePais,this,this.paisConstantesFunciones.activarid_continentePais));
			tableColumn.setCellEditor(new ContinenteTableCell(this.continentesForeignKey,this.paisConstantesFunciones.resaltarid_continentePais,this,this.paisConstantesFunciones.activarid_continentePais,true,"id_continentePais","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,PaisConstantesFunciones.LABEL_CODIGO));

		if(this.paisConstantesFunciones.mostrarcodigoPais && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaisConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.paisConstantesFunciones.resaltarcodigoPais,this.paisConstantesFunciones.activarcodigoPais,this,true,"codigoPais","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paisConstantesFunciones.resaltarcodigoPais,this.paisConstantesFunciones.activarcodigoPais,this,true,"codigoPais","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,PaisConstantesFunciones.LABEL_NOMBRE));

		if(this.paisConstantesFunciones.mostrarnombrePais && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaisConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.paisConstantesFunciones.resaltarnombrePais,this.paisConstantesFunciones.activarnombrePais,this,true,"nombrePais","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paisConstantesFunciones.resaltarnombrePais,this.paisConstantesFunciones.activarnombrePais,this,true,"nombrePais","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPais,PaisConstantesFunciones.LABEL_NACIONALIDAD));

		if(this.paisConstantesFunciones.mostrarnacionalidadPais && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaisConstantesFunciones.LABEL_NACIONALIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.paisConstantesFunciones.resaltarnacionalidadPais,this.paisConstantesFunciones.activarnacionalidadPais,this,true,"nacionalidadPais","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paisConstantesFunciones.resaltarnacionalidadPais,this.paisConstantesFunciones.activarnacionalidadPais,this,true,"nacionalidadPais","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaisPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.paisSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCiudad && this.paisConstantesFunciones.mostrarCiudadPais && !PaisConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Ciudades");
				tableColumn.setHeaderValue("Ciudades");
				tableColumn.setCellRenderer(new CiudadTableCell(paisConstantesFunciones.resaltarCiudadPais,this,this.paisConstantesFunciones.activarCiudadPais));
				tableColumn.setCellEditor(new CiudadTableCell(paisConstantesFunciones.resaltarCiudadPais,this,this.paisConstantesFunciones.activarCiudadPais));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPais.addColumn(tableColumn);
			}

			if(this.isTienePermisosProvincia && this.paisConstantesFunciones.mostrarProvinciaPais && !PaisConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Provinciaes");
				tableColumn.setHeaderValue("Provinciaes");
				tableColumn.setCellRenderer(new ProvinciaTableCell(paisConstantesFunciones.resaltarProvinciaPais,this,this.paisConstantesFunciones.activarProvinciaPais));
				tableColumn.setCellEditor(new ProvinciaTableCell(paisConstantesFunciones.resaltarProvinciaPais,this,this.paisConstantesFunciones.activarProvinciaPais));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPais.addColumn(tableColumn);
			}

			if(this.isTienePermisosRegion && this.paisConstantesFunciones.mostrarRegionPais && !PaisConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Regiones");
				tableColumn.setHeaderValue("Regiones");
				tableColumn.setCellRenderer(new RegionTableCell(paisConstantesFunciones.resaltarRegionPais,this,this.paisConstantesFunciones.activarRegionPais));
				tableColumn.setCellEditor(new RegionTableCell(paisConstantesFunciones.resaltarRegionPais,this,this.paisConstantesFunciones.activarRegionPais));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPais.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.paisSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.paisSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPais.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.paisSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.paisSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPais.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPais && this.isPermisoGuardarCambiosPais) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.paisSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.paisSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPais.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.paisSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPais.addColumn(tableColumn);
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
			
			this.jTableDatosPais.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPais && this.isPermisoGuardarCambiosPais) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.paisSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPais && this.isPermisoGuardarCambiosPais) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPais.moveColumn(this.jTableDatosPais.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPais.moveColumn(this.jTableDatosPais.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.paisSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPais.moveColumn(this.jTableDatosPais.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPais.moveColumn(this.jTableDatosPais.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPais.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPais.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPais,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPais.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPais.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPais.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPais.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPais.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=paisLogic.getPaiss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=paiss.size()-1;
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
		//this.jTableDatosPais.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPais.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPais();
			
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
				
				//this.isEsNuevoPais=false;
					
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
				if(this.paisSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPais==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPais.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPais.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pais.getsType().equals("DUPLICADO")
				   || this.pais.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPais=true;
				
				} else {
					this.isEsNuevoPais=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.paisSessionBean.getEsGuardarRelacionado()) {
					if(this.pais.getId()>=0 && !this.pais.getIsNew()) {						
						this.isEsNuevoPais=false;
						
					} else {
						this.isEsNuevoPais=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPais(esRelaciones);						
				
				this.seleccionarPais(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pais.getId()<0) {
					this.isEsNuevoPais=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPais(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPais(evt,rowIndex);
				}	
				
				if(this.paisSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Pais: " + this.dDif); 
					}
				}								
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPais(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pais)) {
					if(this.pais.getId()>0) {
						this.pais.setIsDeleted(true);
						
						this.paissEliminados.add(this.pais);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.paisLogic.getPaiss().remove(this.pais);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.paiss.remove(this.pais);				
					}
					
					
					((PaisModel) this.jTableDatosPais.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPais(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPais(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPais) {
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPais.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPais.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPais(this.pais);
				}
				
				//ARCHITECTURE
				try {
					

					//Continente
					if(!this.paisConstantesFunciones.cargarid_continentePais || this.paisConstantesFunciones.event_dependid_continentePais) {
						//this.cargarCombosContinentesForeignKeyLista(" where id="+this.pais.getid_continente());
									//this.inicializarActualizarBindingPais(false,false);
						this.continentesForeignKey=new ArrayList<Continente>();

						if(pais.getContinente()!=null) {
							this.continentesForeignKey.add(pais.getContinente());
						}

						this.addItemDefectoCombosForeignKeyContinente();
						this.cargarCombosFrameContinentesForeignKey("Todos");
					}
					this.setActualContinenteForeignKey(this.pais.getid_continente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPais("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPais(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPais() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPais(Pais pais) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPais(pais,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPais(Pais pais,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPais(pais);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPais(pais,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPais(pais);
	}
	
	public void setVariablesObjetoActualToFormularioPais(Pais pais) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPais.jLabelidPais.setText(pais.getId().toString());
			this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setText(pais.getcodigo());
			this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setText(pais.getnombre());
			this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setText(pais.getnacionalidad());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Pais paisLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,paisLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Pais paisLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				paisLocal=this.pais;
			} else {
				paisLocal=this.paisAnterior;
			}
		}
		
		if(this.permiteMantenimiento(paisLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPais(paisLocal,true);
					
					if(paisSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(paisLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.paisSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(paisLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPais(Pais pais,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPais(pais,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPais(pais);
	}
	
	public void setVariablesFormularioToObjetoActualPais(Pais pais,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPais(pais,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPais(Pais pais,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPais.jLabelidPais.getText()==null || this.jInternalFrameDetalleFormPais.jLabelidPais.getText()=="" || this.jInternalFrameDetalleFormPais.jLabelidPais.getText()=="Id") {
				this.jInternalFrameDetalleFormPais.jLabelidPais.setText("0");
			}

			if(conColumnasBase) {pais.setId(Long.parseLong(this.jInternalFrameDetalleFormPais.jLabelidPais.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaisConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelIdPais,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pais.setcodigo(this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaisConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelcodigoPais,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pais.setnombre(this.jInternalFrameDetalleFormPais.jTextAreanombrePais.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaisConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelnombrePais,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pais.setnacionalidad(this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaisConstantesFunciones.LABEL_NACIONALIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPais.jLabelnacionalidadPais,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPais(Pais paisBean,Pais pais,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && paisBean.getid_continente()!=null && !paisBean.getid_continente().equals(-1L))) {pais.setid_continente(paisBean.getid_continente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPais(Pais paisOrigen,Pais pais,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && paisOrigen.getId()!=null && !paisOrigen.getId().equals(0L))) {pais.setId(paisOrigen.getId());}}
			if(conDefault || (!conDefault && paisOrigen.getid_continente()!=null && !paisOrigen.getid_continente().equals(-1L))) {pais.setid_continente(paisOrigen.getid_continente());}
			if(conDefault || (!conDefault && paisOrigen.getcodigo()!=null && !paisOrigen.getcodigo().equals(""))) {pais.setcodigo(paisOrigen.getcodigo());}
			if(conDefault || (!conDefault && paisOrigen.getnombre()!=null && !paisOrigen.getnombre().equals(""))) {pais.setnombre(paisOrigen.getnombre());}
			if(conDefault || (!conDefault && paisOrigen.getnacionalidad()!=null && !paisOrigen.getnacionalidad().equals(""))) {pais.setnacionalidad(paisOrigen.getnacionalidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPais(Pais pais) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPais.jLabelidPais.setText(pais.getId().toString());
			this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setText(pais.getcodigo());
			this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setText(pais.getnombre());
			this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setText(pais.getnacionalidad());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPais(PaisBean paisBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPais.jLabelidPais.setText(paisBean.getId().toString());
			this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setText(paisBean.getcodigo());
			this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setText(paisBean.getnombre());
			this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setText(paisBean.getnacionalidad());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPais(PaisParameterReturnGeneral paisReturnGeneral,PaisBean paisBean,Boolean conDefault) throws Exception { 
		try {
			Pais paisLocal=new Pais();
			
			paisLocal=paisReturnGeneral.getPais();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && paisLocal.getId()!=null && !paisLocal.getId().equals(0L))) {paisBean.setId(paisLocal.getId());}}
			if(conDefault || (!conDefault && paisLocal.getid_continente()!=null && !paisLocal.getid_continente().equals(-1L))) {paisBean.setid_continente(paisLocal.getid_continente());}
			if(conDefault || (!conDefault && paisLocal.getcodigo()!=null && !paisLocal.getcodigo().equals(""))) {paisBean.setcodigo(paisLocal.getcodigo());}
			if(conDefault || (!conDefault && paisLocal.getnombre()!=null && !paisLocal.getnombre().equals(""))) {paisBean.setnombre(paisLocal.getnombre());}
			if(conDefault || (!conDefault && paisLocal.getnacionalidad()!=null && !paisLocal.getnacionalidad().equals(""))) {paisBean.setnacionalidad(paisLocal.getnacionalidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPaisGenerico(Long idPaisSeleccionado,JComboBox jComboBoxPais,List<Pais> paissLocal)throws Exception {
		try {
			Pais  paisTemp=null;

			for(Pais paisAux:paissLocal) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			jComboBoxPais.setSelectedItem(paisTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPaisGenerico(JComboBox jComboBoxPais,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPais.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPais.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPais.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPais.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Ciudad")) {
			jButtonCiudadActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Provincia")) {
			jButtonProvinciaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Region")) {
			jButtonRegionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pais=(Pais) paisLogic.getPaiss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pais =(Pais) paiss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Continente")) {
			//sDescripcion=this.getActualContinenteForeignKeyDescripcion((Long)value);
			if(!pais.getIsNew() && !pais.getIsChanged() && !pais.getIsDeleted()) {
				sDescripcion=pais.getcontinente_descripcion();
			} else {
				//sDescripcion=this.getActualContinenteForeignKeyDescripcion((Long)value);
				sDescripcion=pais.getcontinente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Pais paisRow=new Pais();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			paisRow=(Pais) paisLogic.getPaiss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			paisRow=(Pais) paiss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCiudadActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Pais pais) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPais==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais = (Pais)this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.pais = (Pais)this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(pais!=null) {
						this.pais = pais;
					} else {
						this.pais = new Pais();
					}
				}

				if(this.isTienePermisosCiudad && this.permiteMantenimiento(this.pais)) {
					CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup=new CiudadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ciudadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup;
					} else {
						ciudadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame;
					}

					List<Pais> paiss=new ArrayList<Pais>();
					paiss.add(this.pais);
					if(!esRelacionado) {
						//ciudadBeanSwingJInternalFrame.ciudadSessionBean.setConGuardarRelaciones(false);
						//ciudadBeanSwingJInternalFrame.ciudadSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ciudadBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPais.cargarCiudadBeanSwingJInternalFrame(paiss,this.pais,ciudadBeanSwingJInternalFrame,/*conInicializar,*/ciudadBeanSwingJInternalFrame.ciudadSessionBean.getConGuardarRelaciones(),ciudadBeanSwingJInternalFrame.ciudadSessionBean.getEsGuardarRelacionado());
					ciudadBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ciudadBeanSwingJInternalFrame.actualizarEstadoPanelsCiudad("no_relacionado");

						ciudadBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CiudadConstantesFunciones.ITAMANIOFILATABLA + (CiudadConstantesFunciones.ITAMANIOFILATABLA/2));

						ciudadBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPais=(TitledBorder)this.jScrollPanelDatosPais.getBorder();
						TitledBorder titledBorderCiudad=(TitledBorder)ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

						titledBorderCiudad.setTitle(titledBorderPais.getTitle() + " -> Ciudad");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ciudadBeanSwingJInternalFrame);
						}

						ciudadBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ciudadBeanSwingJInternalFrame);

						ciudadBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.paisSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Ciudad",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProvinciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Pais pais) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPais==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais = (Pais)this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.pais = (Pais)this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(pais!=null) {
						this.pais = pais;
					} else {
						this.pais = new Pais();
					}
				}

				if(this.isTienePermisosProvincia && this.permiteMantenimiento(this.pais)) {
					ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup=new ProvinciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						provinciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup;
					} else {
						provinciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame;
					}

					List<Pais> paiss=new ArrayList<Pais>();
					paiss.add(this.pais);
					if(!esRelacionado) {
						//provinciaBeanSwingJInternalFrame.provinciaSessionBean.setConGuardarRelaciones(false);
						//provinciaBeanSwingJInternalFrame.provinciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					provinciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPais.cargarProvinciaBeanSwingJInternalFrame(paiss,this.pais,provinciaBeanSwingJInternalFrame,/*conInicializar,*/provinciaBeanSwingJInternalFrame.provinciaSessionBean.getConGuardarRelaciones(),provinciaBeanSwingJInternalFrame.provinciaSessionBean.getEsGuardarRelacionado());
					provinciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						provinciaBeanSwingJInternalFrame.actualizarEstadoPanelsProvincia("no_relacionado");

						provinciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProvinciaConstantesFunciones.ITAMANIOFILATABLA + (ProvinciaConstantesFunciones.ITAMANIOFILATABLA/2));

						provinciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPais=(TitledBorder)this.jScrollPanelDatosPais.getBorder();
						TitledBorder titledBorderProvincia=(TitledBorder)provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

						titledBorderProvincia.setTitle(titledBorderPais.getTitle() + " -> Provincia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,provinciaBeanSwingJInternalFrame);
						}

						provinciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(provinciaBeanSwingJInternalFrame);

						provinciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.paisSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Provincia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonRegionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Pais pais) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPais==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais = (Pais)this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.pais = (Pais)this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(pais!=null) {
						this.pais = pais;
					} else {
						this.pais = new Pais();
					}
				}

				if(this.isTienePermisosRegion && this.permiteMantenimiento(this.pais)) {
					RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup=new RegionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						regionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup;
					} else {
						regionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame;
					}

					List<Pais> paiss=new ArrayList<Pais>();
					paiss.add(this.pais);
					if(!esRelacionado) {
						//regionBeanSwingJInternalFrame.regionSessionBean.setConGuardarRelaciones(false);
						//regionBeanSwingJInternalFrame.regionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					regionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPais.cargarRegionBeanSwingJInternalFrame(paiss,this.pais,regionBeanSwingJInternalFrame,/*conInicializar,*/regionBeanSwingJInternalFrame.regionSessionBean.getConGuardarRelaciones(),regionBeanSwingJInternalFrame.regionSessionBean.getEsGuardarRelacionado());
					regionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						regionBeanSwingJInternalFrame.actualizarEstadoPanelsRegion("no_relacionado");

						regionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RegionConstantesFunciones.ITAMANIOFILATABLA + (RegionConstantesFunciones.ITAMANIOFILATABLA/2));

						regionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPais=(TitledBorder)this.jScrollPanelDatosPais.getBorder();
						TitledBorder titledBorderRegion=(TitledBorder)regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.getBorder();

						titledBorderRegion.setTitle(titledBorderPais.getTitle() + " -> Region");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,regionBeanSwingJInternalFrame);
						}

						regionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(regionBeanSwingJInternalFrame);

						regionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.paisSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Region",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPais(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPais.setVisible((this.isVisibilidadCeldaNuevoPais && this.isPermisoNuevoPais));			
			this.jButtonDuplicarPais.setVisible((this.isVisibilidadCeldaDuplicarPais && this.isPermisoDuplicarPais));			
			this.jButtonCopiarPais.setVisible((this.isVisibilidadCeldaCopiarPais && this.isPermisoCopiarPais));
			this.jButtonVerFormPais.setVisible((this.isVisibilidadCeldaVerFormPais && this.isPermisoVerFormPais));
			
			this.jButtonAbrirOrderByPais.setVisible((this.isVisibilidadCeldaOrdenPais && this.isPermisoOrdenPais));			
			
			this.jButtonNuevoRelacionesPais.setVisible((this.isVisibilidadCeldaNuevoRelacionesPais && this.isPermisoNuevoPais));			
			this.jButtonNuevoGuardarCambiosPais.setVisible((this.isVisibilidadCeldaNuevoPais && this.isPermisoNuevoPais && this.isPermisoGuardarCambiosPais));
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.jInternalFrameDetalleFormPais.jButtonModificarPais.setVisible((this.isVisibilidadCeldaModificarPais && this.isPermisoActualizarPais));	
			this.jInternalFrameDetalleFormPais.jButtonActualizarPais.setVisible((this.isVisibilidadCeldaActualizarPais && this.isPermisoActualizarPais));	
			this.jInternalFrameDetalleFormPais.jButtonEliminarPais.setVisible((this.isVisibilidadCeldaEliminarPais && this.isPermisoEliminarPais));
			this.jInternalFrameDetalleFormPais.jButtonCancelarPais.setVisible(this.isVisibilidadCeldaCancelarPais);							
			this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.setVisible((this.isVisibilidadCeldaGuardarPais && this.isPermisoGuardarCambiosPais));			
			
			}
						
			this.jButtonGuardarCambiosTablaPais.setVisible((this.isVisibilidadCeldaGuardarCambiosPais && this.isPermisoGuardarCambiosPais));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPais.setVisible((this.isVisibilidadCeldaNuevoPais && this.isPermisoNuevoPais));						
			this.jButtonDuplicarToolBarPais.setVisible((this.isVisibilidadCeldaDuplicarPais && this.isPermisoDuplicarPais));						
			this.jButtonCopiarToolBarPais.setVisible((this.isVisibilidadCeldaCopiarPais && this.isPermisoCopiarPais));			
			this.jButtonVerFormToolBarPais.setVisible((this.isVisibilidadCeldaVerFormPais && this.isPermisoVerFormPais));			
			this.jButtonAbrirOrderByToolBarPais.setVisible((this.isVisibilidadCeldaOrdenPais && this.isPermisoOrdenPais));
			this.jButtonNuevoRelacionesToolBarPais.setVisible((this.isVisibilidadCeldaNuevoRelacionesPais && this.isPermisoNuevoPais));			
			this.jButtonNuevoGuardarCambiosToolBarPais.setVisible((this.isVisibilidadCeldaNuevoPais && this.isPermisoNuevoPais && this.isPermisoGuardarCambiosPais));			
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.jInternalFrameDetalleFormPais.jButtonModificarToolBarPais.setVisible((this.isVisibilidadCeldaModificarPais && this.isPermisoActualizarPais));	
			this.jInternalFrameDetalleFormPais.jButtonActualizarToolBarPais.setVisible((this.isVisibilidadCeldaActualizarPais  && this.isPermisoActualizarPais));	
			this.jInternalFrameDetalleFormPais.jButtonEliminarToolBarPais.setVisible((this.isVisibilidadCeldaEliminarPais && this.isPermisoEliminarPais));
			this.jInternalFrameDetalleFormPais.jButtonCancelarToolBarPais.setVisible(this.isVisibilidadCeldaCancelarPais);				
			this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosToolBarPais.setVisible((this.isVisibilidadCeldaGuardarPais && this.isPermisoGuardarCambiosPais));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPais.setVisible((this.isVisibilidadCeldaGuardarCambiosPais && this.isPermisoGuardarCambiosPais));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPais.setVisible((this.isVisibilidadCeldaNuevoPais && this.isPermisoNuevoPais));			
			this.jMenuItemDuplicarPais.setVisible((this.isVisibilidadCeldaDuplicarPais && this.isPermisoDuplicarPais));			
			this.jMenuItemCopiarPais.setVisible((this.isVisibilidadCeldaCopiarPais && this.isPermisoCopiarPais));			
			this.jMenuItemVerFormPais.setVisible((this.isVisibilidadCeldaVerFormPais && this.isPermisoVerFormPais));			
			this.jMenuItemAbrirOrderByPais.setVisible((this.isVisibilidadCeldaOrdenPais && this.isPermisoOrdenPais));			
			//this.jMenuItemMostrarOcultarPais.setVisible((this.isVisibilidadCeldaOrdenPais && this.isPermisoOrdenPais));
			this.jMenuItemDetalleAbrirOrderByPais.setVisible((this.isVisibilidadCeldaOrdenPais && this.isPermisoOrdenPais));			
			//this.jMenuItemDetalleMostrarOcultarPais.setVisible((this.isVisibilidadCeldaOrdenPais && this.isPermisoOrdenPais));			
			this.jMenuItemNuevoRelacionesPais.setVisible((this.isVisibilidadCeldaNuevoRelacionesPais && this.isPermisoNuevoPais));			
			this.jMenuItemNuevoGuardarCambiosPais.setVisible((this.isVisibilidadCeldaNuevoPais && this.isPermisoNuevoPais && this.isPermisoGuardarCambiosPais));									
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.jInternalFrameDetalleFormPais.jMenuItemModificarPais.setVisible((this.isVisibilidadCeldaModificarPais && this.isPermisoActualizarPais));	
			this.jInternalFrameDetalleFormPais.jMenuItemActualizarPais.setVisible((this.isVisibilidadCeldaActualizarPais && this.isPermisoActualizarPais));	
			this.jInternalFrameDetalleFormPais.jMenuItemEliminarPais.setVisible((this.isVisibilidadCeldaEliminarPais && this.isPermisoEliminarPais));
			this.jInternalFrameDetalleFormPais.jMenuItemCancelarPais.setVisible(this.isVisibilidadCeldaCancelarPais);				
			}
			
			this.jMenuItemGuardarCambiosPais.setVisible((this.isVisibilidadCeldaGuardarPais && this.isPermisoGuardarCambiosPais));						
			this.jMenuItemGuardarCambiosTablaPais.setVisible((this.isVisibilidadCeldaGuardarCambiosPais && this.isPermisoGuardarCambiosPais));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPais=this.jButtonNuevoPais.isVisible();
			this.isVisibilidadCeldaDuplicarPais=this.jButtonDuplicarPais.isVisible();
			this.isVisibilidadCeldaCopiarPais=this.jButtonCopiarPais.isVisible();
			this.isVisibilidadCeldaVerFormPais=this.jButtonVerFormPais.isVisible();
			
			this.isVisibilidadCeldaOrdenPais=this.jButtonAbrirOrderByPais.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPais=this.jButtonNuevoRelacionesPais.isVisible();
			this.isVisibilidadCeldaModificarPais=this.jButtonModificarPais.isVisible();
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.isVisibilidadCeldaActualizarPais=this.jInternalFrameDetalleFormPais.jButtonActualizarPais.isVisible();
			this.isVisibilidadCeldaEliminarPais=this.jInternalFrameDetalleFormPais.jButtonEliminarPais.isVisible();
			this.isVisibilidadCeldaCancelarPais=this.jInternalFrameDetalleFormPais.jButtonCancelarPais.isVisible();
			this.isVisibilidadCeldaGuardarPais=this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPais=this.jButtonGuardarCambiosTablaPais.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPais=this.jButtonNuevoToolBarPais.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPais=this.jButtonNuevoRelacionesToolBarPais.isVisible();
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.isVisibilidadCeldaModificarPais=this.jInternalFrameDetalleFormPais.jButtonModificarToolBarPais.isVisible();
			this.isVisibilidadCeldaActualizarPais=this.jInternalFrameDetalleFormPais.jButtonActualizarToolBarPais.isVisible();
			this.isVisibilidadCeldaEliminarPais=this.jInternalFrameDetalleFormPais.jButtonEliminarToolBarPais.isVisible();
			this.isVisibilidadCeldaCancelarPais=this.jInternalFrameDetalleFormPais.jButtonCancelarToolBarPais.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPais=this.jButtonGuardarCambiosToolBarPais.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPais=this.jButtonGuardarCambiosTablaToolBarPais.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPais=this.jMenuItemNuevoPais.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPais=this.jMenuItemNuevoRelacionesPais.isVisible();
			
			if(this.jInternalFrameDetalleFormPais!=null) {
			this.isVisibilidadCeldaModificarPais=this.jInternalFrameDetalleFormPais.jMenuItemModificarPais.isVisible();
			this.isVisibilidadCeldaActualizarPais=this.jInternalFrameDetalleFormPais.jMenuItemActualizarPais.isVisible();
			this.isVisibilidadCeldaEliminarPais=this.jInternalFrameDetalleFormPais.jMenuItemEliminarPais.isVisible();
			this.isVisibilidadCeldaCancelarPais=this.jInternalFrameDetalleFormPais.jMenuItemCancelarPais.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPais=this.jMenuItemGuardarCambiosPais.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPais=this.jMenuItemGuardarCambiosTablaPais.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPais(Boolean esInicializar) {
		if(PaisJInternalFrame.ISBINDING_MANUAL) {			
			if(this.paisSessionBean.getConGuardarRelaciones()) {
				//if(this.paisSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPais();
			}
			
			this.inicializarActualizarBindingBotonesManualPais(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPais() {
		this.jButtonNuevoPais.setVisible(this.isPermisoNuevoPais);			
		this.jButtonDuplicarPais.setVisible(this.isPermisoDuplicarPais);			
		this.jButtonCopiarPais.setVisible(this.isPermisoCopiarPais);			
		this.jButtonVerFormPais.setVisible(this.isPermisoVerFormPais);			
		
		this.jButtonAbrirOrderByPais.setVisible(this.isPermisoOrdenPais);					
		
		this.jButtonNuevoRelacionesPais.setVisible(this.isPermisoNuevoPais);			
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonModificarPais.setVisible(this.isPermisoActualizarPais);	
			this.jInternalFrameDetalleFormPais.jButtonActualizarPais.setVisible(this.isPermisoActualizarPais);	
			this.jInternalFrameDetalleFormPais.jButtonEliminarPais.setVisible(this.isPermisoEliminarPais);
			this.jInternalFrameDetalleFormPais.jButtonCancelarPais.setVisible(this.isVisibilidadCeldaCancelarPais);						
			this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.setVisible(this.isPermisoGuardarCambiosPais);							
		}
		
		this.jButtonGuardarCambiosTablaPais.setVisible(this.isPermisoActualizarPais);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePais() {
		this.jInternalFrameDetalleFormPais.jButtonModificarPais.setVisible(this.isPermisoActualizarPais);	
		this.jInternalFrameDetalleFormPais.jButtonActualizarPais.setVisible(this.isPermisoActualizarPais);	
		this.jInternalFrameDetalleFormPais.jButtonEliminarPais.setVisible(this.isPermisoEliminarPais);
		this.jInternalFrameDetalleFormPais.jButtonCancelarPais.setVisible(this.isVisibilidadCeldaCancelarPais);							
		this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.setVisible((this.isVisibilidadCeldaGuardarPais && this.isPermisoGuardarCambiosPais));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPais() {
		if(PaisJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPais();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPais() {
	}
	
	public void jTableDatosPaisListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPais(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPaisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPais(this.getpais(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pais==null) {
						this.pais = new Pais();
					}

					this.setVariablesFormularioToObjetoActualPais(this.pais,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				}

				if(this.pais.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pais.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPais(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_continentePaisUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocontinente=true;

			idTienePermisocontinente=this.tienePermisosUsuarioEnPaginaWebPais(ContinenteConstantesFunciones.CLASSNAME);

			if(idTienePermisocontinente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPais.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPais.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPais(this.getpais(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);

				this.continenteBeanSwingJInternalFrame=new ContinenteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.continenteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.continenteBeanSwingJInternalFrame.getContinenteLogic().setConnexion(this.paisLogic.getConnexion());

				if(this.pais.getid_continente()!=null) {
					this.continenteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.continenteBeanSwingJInternalFrame.setIdActual(this.pais.getid_continente());
					this.continenteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.continenteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.continenteBeanSwingJInternalFrame.inicializarActualizarBindingTablaContinente();
				}

				JInternalFrameBase jinternalFrame =this.continenteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPais=(TitledBorder)this.jScrollPanelDatosPais.getBorder();
				TitledBorder titledBordercontinente=(TitledBorder)this.continenteBeanSwingJInternalFrame.jScrollPanelDatosContinente.getBorder();

				titledBordercontinente.setTitle(titledBorderPais.getTitle() + " -> Continente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_continentePaisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPais(this.getpais(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pais==null) {
						this.pais = new Pais();
					}

					this.setVariablesFormularioToObjetoActualPais(this.pais,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				}

				if(this.pais.getid_continente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_continente = "+this.pais.getid_continente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPais(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPaisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPais(this.getpais(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pais==null) {
						this.pais = new Pais();
					}

					this.setVariablesFormularioToObjetoActualPais(this.pais,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				}

				if(this.pais.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.pais.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPais(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePaisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPais(this.getpais(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pais==null) {
						this.pais = new Pais();
					}

					this.setVariablesFormularioToObjetoActualPais(this.pais,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				}

				if(this.pais.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.pais.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPais(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnacionalidadPaisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPais.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPais(this.getpais(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pais==null) {
						this.pais = new Pais();
					}

					this.setVariablesFormularioToObjetoActualPais(this.pais,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);
				}

				if(this.pais.getnacionalidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nacionalidad like '%"+this.pais.getnacionalidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPais(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdContinentePorNombrePaisActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPais(false,false);

			this.getPaissBusquedaPorIdContinentePorNombre();

			this.inicializarActualizarBindingPais(false);

			//if(PaisBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPais(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdContinentePaisActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPais(false,false);

			this.getPaissFK_IdContinente();

			this.inicializarActualizarBindingPais(false);

			//if(PaisBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPais(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paisLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePais() {
		if(this.jInternalFrameDetalleFormPais!=null) {
		

		if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPais!=null) {
			this.jInternalFrameDetalleFormPais.setVisible(false);	    			
			this.jInternalFrameDetalleFormPais.dispose();
			this.jInternalFrameDetalleFormPais=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPais!=null) {
			this.jInternalFrameReporteDinamicoPais.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPais.dispose();
			this.jInternalFrameReporteDinamicoPais=null;
		}
		
		if(this.jInternalFrameImportacionPais!=null) {
			this.jInternalFrameImportacionPais.setVisible(false);	    			
			this.jInternalFrameImportacionPais.dispose();
			this.jInternalFrameImportacionPais=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPais();
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			
			if(sTipo.equals("NuevoPais")) {
				jButtonNuevoPaisActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPais")) {
				jButtonDuplicarPaisActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPais")) {
				jButtonCopiarPaisActionPerformed(evt);
			} else if(sTipo.equals("VerFormPais")) {
				jButtonVerFormPaisActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPais")) {
				jButtonNuevoPaisActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPais")) {
				jButtonDuplicarPaisActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPais")) {
				jButtonNuevoPaisActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPais")) {
				jButtonDuplicarPaisActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPais")) {
				jButtonNuevoPaisActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPais")) {
				jButtonNuevoPaisActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPais")) {
				jButtonNuevoPaisActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPais")) {
				jButtonModificarPaisActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPais")) {
				jButtonModificarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPais")) {
				jButtonModificarPaisActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPais")) {
				jButtonActualizarPaisActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPais")) {
				jButtonActualizarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPais")) {
				jButtonActualizarPaisActionPerformed(evt);
			} else if(sTipo.equals("EliminarPais")) {
				jButtonEliminarPaisActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPais")) {
				jButtonEliminarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPais")) {
				jButtonEliminarPaisActionPerformed(evt);
			} else if(sTipo.equals("CancelarPais")) {
				jButtonCancelarPaisActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPais")) {
				jButtonCancelarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPais")) {
				jButtonCancelarPaisActionPerformed(evt);
			} else if(sTipo.equals("CerrarPais")) {
				jButtonCerrarPaisActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPais")) {
				jButtonCerrarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPais")) {
				jButtonCerrarPaisActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPais")) {
				jButtonMostrarOcultarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPais")) {
				jButtonCancelarPaisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPais")) {
				jButtonCopiarPaisActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPais")) {
				jButtonVerFormPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPais")) {
				jButtonCopiarPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPais")) {
				jButtonVerFormPaisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPais")) {
				jButtonRecargarInformacionPaisActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPais")) {
				jButtonRecargarInformacionPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPais")) {
				jButtonRecargarInformacionPaisActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPais")) {
				jButtonAnterioresPaisActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPais")) {
				jButtonAnterioresPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePais")) {
				jButtonAnterioresPaisActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPais")) {
				jButtonSiguientesPaisActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPais")) {
				jButtonSiguientesPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPais")) {
				jButtonSiguientesPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPais") || sTipo.equals("MenuItemDetalleAbrirOrderByPais")) {
				jButtonAbrirOrderByPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPais") || sTipo.equals("MenuItemDetalleMostrarOcultarPais")) {
				jButtonMostrarOcultarPaisActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPais")) {
				jButtonNuevoGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPais")) {
				jButtonNuevoGuardarCambiosPaisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPais")) {
				jButtonNuevoGuardarCambiosPaisActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPais")) {
				jButtonCerrarReporteDinamicoPaisActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPais")) {
				jButtonGenerarReporteDinamicoPaisActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPais")) {
				
				jButtonGenerarExcelReporteDinamicoPaisActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPais")) {
				jButtonCerrarImportacionPaisActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPais")) {
				
				jButtonGenerarImportacionPaisActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPais")) {
				
				jButtonAbrirImportacionPaisActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPais")) {
				jComboBoxTiposAccionesPaisActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPais")) {
				jComboBoxTiposRelacionesPaisActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPais")) {
				jComboBoxTiposAccionesPaisActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPais")) {
				
				jComboBoxTiposSeleccionarPaisActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPais")) {
				jTextFieldValorCampoGeneralPaisActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPais")) {
				jButtonAbrirOrderByPaisActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPais")) {
				jButtonAbrirOrderByPaisActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPais")) {
				jButtonCerrarOrderByPaisActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPaisBusqueda")) {
				this.jButtonidPaisBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_continentePaisUpdate")) {
				this.jButtonid_continentePaisUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_continentePaisBusqueda")) {
				this.jButtonid_continentePaisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPaisBusqueda")) {
				this.jButtoncodigoPaisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePaisBusqueda")) {
				this.jButtonnombrePaisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nacionalidadPaisBusqueda")) {
				this.jButtonnacionalidadPaisBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdContinentePorNombrePais")) {
				this.jButtonBusquedaPorIdContinentePorNombrePaisActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdContinentePais")) {
				this.jButtonFK_IdContinentePaisActionPerformed(evt);
			}
			
			;
			
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPais();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Pais paisLocal=null;
			
			if(!this.getEsControlTabla()) {
				paisLocal=this.pais;
			} else {
				paisLocal=this.paisAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
							
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
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
			
			


			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
								
						
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
								
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
							
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
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
			
			


			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
								
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPais")) {
					jCheckBoxSeleccionarTodosPaisItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPais")) {
					jCheckBoxSeleccionadosPaisItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPais")) {
					
				}
				
				


				
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
												
				
				


				
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
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
			
			


			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaisActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pais);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pais);
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
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
				
				


				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pais.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pais.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paisAnterior =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paisAnterior =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPais")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPaisListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPais.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pais =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pais =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pais);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPais")) {
				
				}
				
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPais")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPais.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPais")) {
			
			}
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPais();
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			if(sTipo.equals("NuevoPais")) {
				jButtonNuevoPaisActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPais")) {
				jButtonDuplicarPaisActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPais")) {
				jButtonCopiarPaisActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPais")) {
				jButtonVerFormPaisActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPais")) {
				jButtonNuevoPaisActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPais")) {
				jButtonModificarPaisActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPais")) {
				jButtonActualizarPaisActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPais")) {
				jButtonEliminarPaisActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPais")) {
				jButtonCancelarPaisActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPais")) {
				jButtonCerrarPaisActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPais")) {
				jButtonGuardarCambiosPaisActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPais")) {
				jButtonNuevoGuardarCambiosPaisActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPais")) {
				jButtonAbrirOrderByPaisActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPais")) {
				jButtonRecargarInformacionPaisActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPais")) {
				jButtonAnterioresPaisActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPais")) {
				jButtonSiguientesPaisActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPaisBusqueda")) {
				this.jButtonidPaisBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_continentePaisUpdate")) {
				this.jButtonid_continentePaisUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_continentePaisBusqueda")) {
				this.jButtonid_continentePaisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPaisBusqueda")) {
				this.jButtoncodigoPaisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePaisBusqueda")) {
				this.jButtonnombrePaisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nacionalidadPaisBusqueda")) {
				this.jButtonnacionalidadPaisBusquedaActionPerformed(evt);
			}
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPais();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePais")) {
				closingInternalFramePais();
				
			} else if(sTipo.equals("jButtonCancelarPais")) {
				JInternalFrameBase jInternalFrameDetalleFormPais = (JInternalFrameBase)evt.getSource();
	            	
	            PaisBeanSwingJInternalFrame jInternalFrameParent=(PaisBeanSwingJInternalFrame)jInternalFrameDetalleFormPais.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPaisActionPerformed(null);
			}
			
			PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pais,new Object(),this.paisParameterGeneral,this.paisReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPais(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPais(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPais(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pais)) {
			if(!esControlTabla) {
				if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPais(this.pais,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);			
				}
				
				if(this.paisSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPais(this.pais,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.paisReturnGeneral=paisLogic.procesarEventosPaissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.paisLogic.getPaiss(),this.pais,this.paisParameterGeneral,this.isEsNuevoPais,classes);//this.paisLogic.getPais()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPais(this.paisReturnGeneral,this.paisBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.paisSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPais(classes,this.paisReturnGeneral,this.paisBean,false);
					}
						
					if(this.paisReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPais(this.paisReturnGeneral.getPais());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPais(this.paisReturnGeneral.getPais());	
					}
						
					if(this.paisReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPais(this.paisReturnGeneral.getPais(),classes);//this.paisBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPais(this.pais,classes);//this.paisBean);									
				}
			
				if(PaisJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPais(this.pais,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPais(this.pais);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.paisAnterior!=null) {
						this.pais=this.paisAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.paisReturnGeneral=paisLogic.procesarEventosPaissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.paisLogic.getPaiss(),this.pais,this.paisParameterGeneral,this.isEsNuevoPais,classes);//this.paisLogic.getPais()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.paisSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.paisSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.paisReturnGeneral.getPais(),paisLogic.getPaiss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.paisReturnGeneral.getPais(),this.paiss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPais.repaint();
				
				//((AbstractTableModel) this.jTableDatosPais.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPais();
			}
		}
	}
	
	public void actualizarVisualTableDatosPais() throws Exception {
		
		PaisModel paisModel=(PaisModel)this.jTableDatosPais.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			paisModel.paiss=this.paisLogic.getPaiss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			paisModel.paiss=this.paiss;
		}
		
		
		((PaisModel) this.jTableDatosPais.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPais() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpaisAnterior(),this.paisLogic.getPaiss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpaisAnterior(),this.paiss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPais();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPais(Pais pais,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Ciudad.class)) {
					this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(pais.getCiudads());
					this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Provincia.class)) {
					this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(pais.getProvincias());
					this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Region.class)) {
					this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.setRegions(pais.getRegions());
					this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
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
										
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pais,new Object(),generalEntityParameterGeneral,this.paisReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.paisSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PaisConstantesFunciones.getClassesRelationshipsOfPais(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PaisConstantesFunciones.getClassesRelationshipsFromStringsOfPais(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPais(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PaisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pais,new Object(),generalEntityParameterGeneral,this.paisReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaisConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPais(PaisBean paisBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Ciudad.class)) {
					this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(pais.getCiudads());
					this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Provincia.class)) {
					this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(pais.getProvincias());
					this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Region.class)) {
					this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.setRegions(pais.getRegions());
					this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPais(ArrayList<Classe> classes,PaisReturnGeneral paisReturnGeneral,PaisBean paisBean,Boolean conDefault) throws Exception {
		
			this.paisBean.setCiudads(paisReturnGeneral.getPais().getCiudads());
			this.paisBean.setProvincias(paisReturnGeneral.getPais().getProvincias());
			this.paisBean.setRegions(paisReturnGeneral.getPais().getRegions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPais(Pais pais,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Ciudad.class)) {
					pais.setCiudads(this.jInternalFrameDetalleFormPais.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Provincia.class)) {
					pais.setProvincias(this.jInternalFrameDetalleFormPais.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Region.class)) {
					pais.setRegions(this.jInternalFrameDetalleFormPais.regionBeanSwingJInternalFrame.regionLogic.getRegions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.pais)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPais = new PaisDetalleFormJInternalFrame(jDesktopPane,this.paisSessionBean.getConGuardarRelaciones(),this.paisSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPais);
		this.jInternalFrameDetalleFormPais.setVisible(false);
		this.jInternalFrameDetalleFormPais.setSelected(false);						
		
		this.jInternalFrameDetalleFormPais.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPais.paisLogic=this.paisLogic;
		
		this.cargarCombosFrameForeignKeyPais("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePais();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePais();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPais("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPais();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPais.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPais"));
		
		this.jInternalFrameDetalleFormPais.jButtonModificarPais.addActionListener(new ButtonActionListener(this,"ModificarPais"));

		
		this.jInternalFrameDetalleFormPais.jButtonModificarToolBarPais.addActionListener(new ButtonActionListener(this,"ModificarToolBarPais"));
					
		this.jInternalFrameDetalleFormPais.jMenuItemModificarPais.addActionListener(new ButtonActionListener(this,"MenuItemModificarPais"));		
		
		
		
		this.jInternalFrameDetalleFormPais.jButtonActualizarPais.addActionListener (new ButtonActionListener(this,"ActualizarPais"));
		
		
		this.jInternalFrameDetalleFormPais.jButtonActualizarToolBarPais.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPais"));
						
		this.jInternalFrameDetalleFormPais.jMenuItemActualizarPais.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPais"));		
		
		
		
		this.jInternalFrameDetalleFormPais.jButtonEliminarPais.addActionListener (new ButtonActionListener(this,"EliminarPais"));
		
		
		this.jInternalFrameDetalleFormPais.jButtonEliminarToolBarPais.addActionListener (new ButtonActionListener(this,"EliminarToolBarPais"));
								
		this.jInternalFrameDetalleFormPais.jMenuItemEliminarPais.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPais"));		
		
		
		
		this.jInternalFrameDetalleFormPais.jButtonCancelarPais.addActionListener (new ButtonActionListener(this,"CancelarPais"));
		
		
		this.jInternalFrameDetalleFormPais.jButtonCancelarToolBarPais.addActionListener (new ButtonActionListener(this,"CancelarToolBarPais"));
					
		this.jInternalFrameDetalleFormPais.jMenuItemCancelarPais.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPais"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPais.jMenuItemDetalleCerrarPais.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPais"));		
		
		
		
		this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosToolBarPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPais"));
		
		
		
		this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosToolBarPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPais"));
		
		
		
		this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPais"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonidPaisBusqueda.addActionListener(new ButtonActionListener(this,"idPaisBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPais.jButtonid_continentePaisUpdate.addActionListener(new ButtonActionListener(this,"id_continentePaisUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonid_continentePaisBusqueda.addActionListener(new ButtonActionListener(this,"id_continentePaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtoncodigoPaisBusqueda.addActionListener(new ButtonActionListener(this,"codigoPaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonnombrePaisBusqueda.addActionListener(new ButtonActionListener(this,"nombrePaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonnacionalidadPaisBusqueda.addActionListener(new ButtonActionListener(this,"nacionalidadPaisBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPais"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePais"));
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPais"));
		}
		
		this.jTableDatosPais.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPais"));
		
		this.jTableDatosPais.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPais"));
		
		this.jButtonNuevoPais.addActionListener(new ButtonActionListener(this,"NuevoPais"));
		
		this.jButtonDuplicarPais.addActionListener(new ButtonActionListener(this,"DuplicarPais"));
		
		this.jButtonCopiarPais.addActionListener(new ButtonActionListener(this,"CopiarPais"));
		
		this.jButtonVerFormPais.addActionListener(new ButtonActionListener(this,"VerFormPais"));
		
		
		this.jButtonNuevoToolBarPais.addActionListener(new ButtonActionListener(this,"NuevoToolBarPais"));
			
		this.jButtonDuplicarToolBarPais.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPais"));
			
		this.jMenuItemNuevoPais.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPais"));
			
		this.jMenuItemDuplicarPais.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPais"));		
		
		
		this.jButtonNuevoRelacionesPais.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPais"));
		
		
		this.jButtonNuevoRelacionesToolBarPais.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPais"));
			
		this.jMenuItemNuevoRelacionesPais.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPais"));		
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonModificarPais.addActionListener(new ButtonActionListener(this,"ModificarPais"));
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonModificarToolBarPais.addActionListener(new ButtonActionListener(this,"ModificarToolBarPais"));
			
			this.jInternalFrameDetalleFormPais.jMenuItemModificarPais.addActionListener(new ButtonActionListener(this,"MenuItemModificarPais"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPais.jButtonActualizarPais.addActionListener (new ButtonActionListener(this,"ActualizarPais"));
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonActualizarToolBarPais.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPais"));
				
			this.jInternalFrameDetalleFormPais.jMenuItemActualizarPais.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPais"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonEliminarPais.addActionListener (new ButtonActionListener(this,"EliminarPais"));
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonEliminarToolBarPais.addActionListener (new ButtonActionListener(this,"EliminarToolBarPais"));
						
			this.jInternalFrameDetalleFormPais.jMenuItemEliminarPais.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPais"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonCancelarPais.addActionListener (new ButtonActionListener(this,"CancelarPais"));
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonCancelarToolBarPais.addActionListener (new ButtonActionListener(this,"CancelarToolBarPais"));
			
			this.jInternalFrameDetalleFormPais.jMenuItemCancelarPais.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPais"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPais.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPais"));		
		
		
		this.jButtonCerrarPais.addActionListener (new ButtonActionListener(this,"CerrarPais"));
		
		
		this.jButtonCerrarToolBarPais.addActionListener (new ButtonActionListener(this,"CerrarToolBarPais"));
			
		this.jMenuItemCerrarPais.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPais"));
			
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jMenuItemDetalleCerrarPais.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPais"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosPais"));
		}
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosToolBarPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPais"));
		}
		
		this.jButtonCopiarToolBarPais.addActionListener (new ButtonActionListener(this,"CopiarToolBarPais"));
			
		this.jButtonVerFormToolBarPais.addActionListener (new ButtonActionListener(this,"VerFormToolBarPais"));
		
		this.jMenuItemGuardarCambiosPais.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPais"));
			
		this.jMenuItemCopiarPais.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPais"));		
		
		this.jMenuItemVerFormPais.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPais"));		
		
		
		this.jButtonGuardarCambiosTablaPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPais"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPais"));
			
		this.jMenuItemGuardarCambiosTablaPais.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPais"));		
		
		
		
		this.jButtonRecargarInformacionPais.addActionListener (new ButtonActionListener(this,"RecargarInformacionPais"));
					
		this.jButtonRecargarInformacionToolBarPais.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPais"));
		
		this.jMenuItemRecargarInformacionPais.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPais"));		
		
		
		
		this.jButtonAnterioresPais.addActionListener (new ButtonActionListener(this,"AnterioresPais"));
		
		
		this.jButtonAnterioresToolBarPais.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPais"));
		
		this.jMenuItemAnterioresPais.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPais"));		
		
		
		this.jButtonSiguientesPais.addActionListener (new ButtonActionListener(this,"SiguientesPais"));
		
		
		this.jButtonSiguientesToolBarPais.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPais"));
			
		this.jMenuItemSiguientesPais.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPais"));
			
		this.jMenuItemAbrirOrderByPais.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPais"));
			
		this.jMenuItemMostrarOcultarPais.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPais"));
			
		this.jMenuItemDetalleAbrirOrderByPais.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPais"));
			
		this.jMenuItemDetalleMostarOcultarPais.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPais"));		
		
		
		this.jButtonNuevoGuardarCambiosPais.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPais"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPais.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPais"));
			
		this.jMenuItemNuevoGuardarCambiosPais.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPais"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPais.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPais"));

		this.jCheckBoxSeleccionadosPais.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPais"));
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPais"));
		}
		
		
		this.jComboBoxTiposRelacionesPais.addActionListener (new ButtonActionListener(this,"TiposRelacionesPais"));
			
		this.jComboBoxTiposAccionesPais.addActionListener (new ButtonActionListener(this,"TiposAccionesPais"));
					
		this.jComboBoxTiposSeleccionarPais.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPais"));
			
		this.jTextFieldValorCampoGeneralPais.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPais"));		
		
		
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonidPaisBusqueda.addActionListener(new ButtonActionListener(this,"idPaisBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPais.jButtonid_continentePaisUpdate.addActionListener(new ButtonActionListener(this,"id_continentePaisUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonid_continentePaisBusqueda.addActionListener(new ButtonActionListener(this,"id_continentePaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtoncodigoPaisBusqueda.addActionListener(new ButtonActionListener(this,"codigoPaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonnombrePaisBusqueda.addActionListener(new ButtonActionListener(this,"nombrePaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonnacionalidadPaisBusqueda.addActionListener(new ButtonActionListener(this,"nacionalidadPaisBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdContinentePorNombrePais.addActionListener(new ButtonActionListener(this,"BusquedaPorIdContinentePorNombrePais"));

			this.jButtonFK_IdContinentePais.addActionListener(new ButtonActionListener(this,"FK_IdContinentePais"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPais!=null) {
				this.jInternalFrameReporteDinamicoPais.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPais"));
				this.jInternalFrameReporteDinamicoPais.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPais"));
				this.jInternalFrameReporteDinamicoPais.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPais"));
			}
			
			//this.jButtonCerrarReporteDinamicoPais.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPais"));				
			//this.jButtonGenerarReporteDinamicoPais.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPais"));
			//this.jButtonGenerarExcelReporteDinamicoPais.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPais"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPais!=null) {
				this.jInternalFrameImportacionPais.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPais"));
				this.jInternalFrameImportacionPais.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPais"));
				this.jInternalFrameImportacionPais.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPais"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPais.addActionListener (new ButtonActionListener(this,"AbrirOrderByPais"));
			
			this.jButtonAbrirOrderByToolBarPais.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPais"));			
			
			if(this.jInternalFrameOrderByPais!=null) {
				this.jInternalFrameOrderByPais.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPais"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPais!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPais.jTabbedPaneRelacionesPais.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPais"));
		
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
            		closingInternalFramePais();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPais.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPais = (JInternalFrameBase)event.getSource();
	            	
	            PaisBeanSwingJInternalFrame jInternalFrameParent=(PaisBeanSwingJInternalFrame)jInternalFrameDetalleFormPais.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPaisActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPais.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPaisListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPais.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPais.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaisActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaisActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaisActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPais";
		inputMap = this.jButtonNuevoPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPaisActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaisActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaisActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaisActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPais";
		inputMap = this.jButtonNuevoRelacionesPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPaisActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPais";
		inputMap = this.jButtonModificarPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPaisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPais";
		inputMap = this.jButtonActualizarPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPaisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPais";
		inputMap = this.jButtonEliminarPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPaisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPais";
		inputMap = this.jButtonCancelarPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPaisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPais";
		inputMap = this.jButtonCerrarPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPaisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPais";
		inputMap = this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPais.jButtonGuardarCambiosPais.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPaisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPais.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPaisItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPais.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPaisActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPais.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPaisActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPais.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPaisActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonidPaisBusqueda.addActionListener(new ButtonActionListener(this,"idPaisBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPais.jButtonid_continentePaisUpdate.addActionListener(new ButtonActionListener(this,"id_continentePaisUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonid_continentePaisBusqueda.addActionListener(new ButtonActionListener(this,"id_continentePaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtoncodigoPaisBusqueda.addActionListener(new ButtonActionListener(this,"codigoPaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonnombrePaisBusqueda.addActionListener(new ButtonActionListener(this,"nombrePaisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPais.jButtonnacionalidadPaisBusqueda.addActionListener(new ButtonActionListener(this,"nacionalidadPaisBusqueda"));
		
		
		this.jButtonBusquedaPorIdContinentePorNombrePais.addActionListener(new ButtonActionListener(this,"BusquedaPorIdContinentePorNombrePais"));

		this.jButtonFK_IdContinentePais.addActionListener(new ButtonActionListener(this,"FK_IdContinentePais"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPais.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPaisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPaisActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPais.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPais(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Pais paisAux:this.paisLogic.getPaiss()) {
					paisAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pais paisAux:paiss) {
					paisAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPaisItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPais(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Pais paisAux:this.paisLogic.getPaiss()) {
						paisAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Pais paisAux:paiss) {
						paisAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Pais paisAux:this.paisLogic.getPaiss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Pais paisAux:paiss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPais(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPais.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPais.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPais,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPaisItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPais(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPais.getSelectedRows();
			
			Pais paisLocal=new Pais();
			
			//this.seleccionarTodosPais(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLocal =(Pais) this.paisLogic.getPaiss().toArray()[this.jTableDatosPais.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					paisLocal =(Pais) this.paiss.toArray()[this.jTableDatosPais.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				paisLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Pais paisAux:this.paisLogic.getPaiss()) {
						paisAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Pais paisAux:paiss) {
						paisAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPais(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPais.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPais.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPais,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPaisItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPaisParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPaisActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPais(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPais.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Pais paisAux:this.paisLogic.getPaiss()) {
				
						if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							paisAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							paisAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_NACIONALIDAD)) {
							existe=true;
							paisAux.setnacionalidad(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pais paisAux:paiss) {
					
						if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							paisAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							paisAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_NACIONALIDAD)) {
							existe=true;
							paisAux.setnacionalidad(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPais(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPaisActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPais(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPais=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPais.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePais) {				
					conSplash=true;//false;										
					
					//this.startProcessPais(conSplash);
				
					this.generarReportePaissSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPaissSeleccionados();
				//this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPaissSeleccionados(false);
				//this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPaissSeleccionados(true);
				//this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPais();
				
				this.exportarPaissSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPaiss();
				//this.importarPaiss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPais();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPaissSeleccionados();
				//this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pais", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPais();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPais)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPais(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
				}	
			} 			
			else if(PaisBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePais) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPais(conSplash);
					
						//this.actualizarParametrosGeneralPais();
						
						this.generarReporteProcesoAccionPaissSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PaisBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PaisES SELECCIONADOS?", "MANTENIMIENTO DE Pais", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPais();
				
						this.actualizarParametrosGeneralPais();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.paisReturnGeneral=paisLogic.procesarAccionPaissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.paisLogic.getPaiss(),this.paisParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPaisReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPais();
					
					PaisBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPaisReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPais.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPais.jComboBoxTiposAccionesFormularioPais.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPais(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPaisActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPais();
			
			if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
			Pais pais=new Pais();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPais(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPais.getSelectedItem();
			
			
			
			
			paissSeleccionados=this.getPaissSeleccionados(true);
			//this.sTipoAccion;
			
			if(paissSeleccionados.size()==1) {
				for(Pais paisAux:paissSeleccionados) {
					pais=paisAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Ciudad")) {
					jButtonCiudadActionPerformed(null,rowIndex,true,false,pais);
				}
				else if(this.sTipoRelacion.equals("Provincia")) {
					jButtonProvinciaActionPerformed(null,rowIndex,true,false,pais);
				}
				else if(this.sTipoRelacion.equals("Region")) {
					jButtonRegionActionPerformed(null,rowIndex,true,false,pais);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPais();
			
      		//this.finishProcessPais(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPaisReturnGeneral() throws Exception {
		if(this.paisReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.paisReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.paisReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.paisReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.paisReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.paisReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPais(false);
		}
		
		if(this.paisReturnGeneral.getConRetornoLista() || this.paisReturnGeneral.getConRetornoObjeto()) {
			if(this.paisReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.paisLogic.setPaiss(this.paisReturnGeneral.getPaiss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.paisReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.paisLogic.setPais(this.paisReturnGeneral.getPais());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPais(false);
		}
	}
	
	public void actualizarParametrosGeneralPais() throws Exception {
		
		
	}
	
	public ArrayList<Pais> getPaissSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPais) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Pais paisAux:paisLogic.getPaiss()) {
					if(paisAux.getIsSelected()) {
						paissSeleccionados.add(paisAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pais paisAux:this.paiss) {
					if(paisAux.getIsSelected()) {
						paissSeleccionados.add(paisAux);				
					}
				}
			}
			
			if(paissSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						paissSeleccionados.addAll(this.paisLogic.getPaiss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						paissSeleccionados.addAll(this.paiss);				
					}
				}
			}
		} else {
			paissSeleccionados.add(this.pais);
		}
		
		return paissSeleccionados;
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
	
	public void generarReportePaissSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPaissSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPaissSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPaissSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPaissSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPaissSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pais",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPaissSeleccionados() throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePaiss("Todos",paissSeleccionados);
		
	}	
	
	public void generarReporteNormalPaissSeleccionados() throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePaiss("Todos",paissSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPaissSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePaiss("Todos",paissSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPaissSeleccionados() throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPais();
		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPais();
		
		
		//this.generarReportePaiss("Todos",paissSeleccionados ,paisImplementable,paisImplementableHome);
	}
	
	public void mostrarImportacionPaiss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPais();
		
		this.abrirFrameImportacionPais();		
		
			
		//this.generarReportePaiss("Todos",paissSeleccionados ,paisImplementable,paisImplementableHome);
	}
	
	public void importarPaiss() throws Exception {		
	
	}
	
	public void exportarPaissSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPaissSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPaissSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPaissSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pais",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPaissSeleccionados() throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPais(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Pais paisAux:paissSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPais(paisAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//paisAux.setsDetalleGeneralEntityReporte(paisAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPais(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PaisConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaisConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaisConstantesFunciones.LABEL_IDCONTINENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaisConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaisConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaisConstantesFunciones.LABEL_NACIONALIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPais(Pais pais,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pais.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pais.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pais.getcontinente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pais.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pais.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pais.getnacionalidad();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPaissSeleccionados() throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Paiss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPais(row);				
				iRow++;
			}				
			
			for(Pais paisAux:paissSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPais(paisAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPaissSeleccionados() throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();		
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pais.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("paiss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pais");
			//elementRoot.appendChild(element);
		
			for(Pais paisAux:paissSeleccionados) {
				element = document.createElement("pais");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPais(paisAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pais",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPais(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PaisConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PaisConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PaisConstantesFunciones.LABEL_IDCONTINENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PaisConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PaisConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PaisConstantesFunciones.LABEL_NACIONALIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPais(Pais pais,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pais.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pais.getcontinente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pais.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(pais.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(pais.getnacionalidad());				
	}
	
	public void setFilaDatosExportarXmlPais(Pais pais,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PaisConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pais.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PaisConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pais.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcontinente_descripcion = document.createElement(PaisConstantesFunciones.IDCONTINENTE);
		elementcontinente_descripcion.appendChild(document.createTextNode(pais.getcontinente_descripcion()));
		element.appendChild(elementcontinente_descripcion);

		Element elementcodigo = document.createElement(PaisConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(pais.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PaisConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(pais.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnacionalidad = document.createElement(PaisConstantesFunciones.NACIONALIDAD);
		elementnacionalidad.appendChild(document.createTextNode(pais.getnacionalidad().trim()));
		element.appendChild(elementnacionalidad);
	}
	
	public void generarReporteGroupGenericoPaissSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Pais> paissSeleccionados=new ArrayList<Pais>();
		
		paissSeleccionados=this.getPaissSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPais(paissSeleccionados);
		
		this.generarReportePaiss("Todos",paissSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPais(ArrayList<Pais> paissSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Pais paisAux:paissSeleccionados) {
				paisAux.setsDetalleGeneralEntityReporte(paisAux.toString());
			
				if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_IDCONTINENTE)) {
					existe=true;
					paisAux.setsDescripcionGeneralEntityReporte1(paisAux.getcontinente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					paisAux.setsDescripcionGeneralEntityReporte1(paisAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					paisAux.setsDescripcionGeneralEntityReporte1(paisAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PaisConstantesFunciones.LABEL_NACIONALIDAD)) {
					existe=true;
					paisAux.setsDescripcionGeneralEntityReporte1(paisAux.getnacionalidad());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPais(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPais=true;
				this.isVisibilidadCeldaNuevoRelacionesPais=true;
				this.isVisibilidadCeldaGuardarCambiosPais=true;
			}
			
			this.isVisibilidadCeldaModificarPais=false;
			this.isVisibilidadCeldaActualizarPais=false;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=true;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
			this.isVisibilidadCeldaModificarPais=false;
			this.isVisibilidadCeldaActualizarPais=true;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=true;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
			this.isVisibilidadCeldaModificarPais=false;
			this.isVisibilidadCeldaActualizarPais=true;
			this.isVisibilidadCeldaEliminarPais=true;
			this.isVisibilidadCeldaCancelarPais=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=true;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
			this.isVisibilidadCeldaModificarPais=false;
			this.isVisibilidadCeldaActualizarPais=true;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=false;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPais=true;
			this.isVisibilidadCeldaNuevoRelacionesPais=true;
			this.isVisibilidadCeldaGuardarCambiosPais=true;
			this.isVisibilidadCeldaModificarPais=false;
			this.isVisibilidadCeldaActualizarPais=false;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=true;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
			this.isVisibilidadCeldaActualizarPais=false;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=false;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
			this.isVisibilidadCeldaModificarPais=true;
			this.isVisibilidadCeldaActualizarPais=false;
			this.isVisibilidadCeldaEliminarPais=false;
			this.isVisibilidadCeldaCancelarPais=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPais=false;
				} else {
					this.isVisibilidadCeldaGuardarPais=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PaisJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPais=true;
			this.isVisibilidadCeldaNuevoRelacionesPais=true;
			this.isVisibilidadCeldaGuardarCambiosPais=true;
		} else {
			this.actualizarEstadoPanelsPais(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPais=false;
			//this.isVisibilidadCeldaVerFormPais=false;
			this.isVisibilidadCeldaDuplicarPais=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!paisSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
		} else {
			this.isVisibilidadCeldaNuevoPais=false;
			this.isVisibilidadCeldaGuardarCambiosPais=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(paisSessionBean.getEsGuardarRelacionado()) {
			if(!paisSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPais=false;												
			}
			
			this.jButtonCerrarPais.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPais=false;
		}
		
		if(!this.permiteMantenimiento(this.pais)) {
			this.isVisibilidadCeldaActualizarPais=false;
			this.isVisibilidadCeldaEliminarPais=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPais() {
		this.isVisibilidadCeldaNuevoPais=false;
		this.isVisibilidadCeldaGuardarCambiosPais=false;
	}
	
	public void actualizarEstadoPanelsPais(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(true);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(false);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(false);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(false);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(true);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(true);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPais!=null) {
				this.jScrollPanelDatosEdicionPais.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPais!=null) {
				this.jScrollPanelDatosPais.setVisible(true);
			}
			
			if(this.jPanelPaginacionPais!=null) {
				this.jPanelPaginacionPais.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.paisSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPais!=null) {
					this.jTabbedPaneBusquedasPais.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.paisSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPais!=null) {
				this.jTabbedPaneBusquedasPais.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPais!=null) {
				this.jPanelParametrosReportesPais.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaContinente(Boolean isParaContinente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaContinenteNegation=!isParaContinente;

			this.isVisibilidadBusquedaPorIdContinentePorNombre=isParaContinente;
			if(!this.isVisibilidadBusquedaPorIdContinentePorNombre) {this.jTabbedPaneBusquedasPais.remove(jPanelBusquedaPorIdContinentePorNombrePais);}

			this.isVisibilidadFK_IdContinente=isParaContinente;
			if(!this.isVisibilidadFK_IdContinente) {this.jTabbedPaneBusquedasPais.remove(jPanelFK_IdContinentePais);}
		}
		
	}
	
	

	public String registrarSesionPaisParaCiudades() throws Exception {
		Boolean isPaginaPopupCiudad=false;

		try {

			if(this.paisSessionBean==null) {
				this.paisSessionBean=new PaisSessionBean();
			}

			if(this.jInternalFrameDetalleFormPais.ciudadSessionBean==null) {
				this.jInternalFrameDetalleFormPais.ciudadSessionBean=new CiudadSessionBean();
			}

			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setsPathNavegacionActual(paisSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CiudadConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCiudad=this.jInternalFrameDetalleFormPais.ciudadSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCiudad(false);
			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad(PaisConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setisBusquedaDesdeForeignKeySesionPais(true);
			this.jInternalFrameDetalleFormPais.ciudadSessionBean.setlidPaisActual(this.idPaisActual);

			paisSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPais(true);
			paisSessionBean.setlIdPaisActualForeignKey(this.idPaisActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPaisParaProvinciaes() throws Exception {
		Boolean isPaginaPopupProvincia=false;

		try {

			if(this.paisSessionBean==null) {
				this.paisSessionBean=new PaisSessionBean();
			}

			if(this.jInternalFrameDetalleFormPais.provinciaSessionBean==null) {
				this.jInternalFrameDetalleFormPais.provinciaSessionBean=new ProvinciaSessionBean();
			}

			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setsPathNavegacionActual(paisSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProvincia=this.jInternalFrameDetalleFormPais.provinciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProvincia(false);
			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia(PaisConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setisBusquedaDesdeForeignKeySesionPais(true);
			this.jInternalFrameDetalleFormPais.provinciaSessionBean.setlidPaisActual(this.idPaisActual);

			paisSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPais(true);
			paisSessionBean.setlIdPaisActualForeignKey(this.idPaisActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPaisParaRegiones() throws Exception {
		Boolean isPaginaPopupRegion=false;

		try {

			if(this.paisSessionBean==null) {
				this.paisSessionBean=new PaisSessionBean();
			}

			if(this.jInternalFrameDetalleFormPais.regionSessionBean==null) {
				this.jInternalFrameDetalleFormPais.regionSessionBean=new RegionSessionBean();
			}

			this.jInternalFrameDetalleFormPais.regionSessionBean.setsPathNavegacionActual(paisSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RegionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPais.regionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRegion=this.jInternalFrameDetalleFormPais.regionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPais.regionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormPais.regionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRegion(false);
			this.jInternalFrameDetalleFormPais.regionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRegion(PaisConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPais.regionSessionBean.setisBusquedaDesdeForeignKeySesionPais(true);
			this.jInternalFrameDetalleFormPais.regionSessionBean.setlidPaisActual(this.idPaisActual);

			paisSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPais(true);
			paisSessionBean.setlIdPaisActualForeignKey(this.idPaisActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PaisSessionBean paisSessionBean=new PaisSessionBean();
		
		if(this.paisSessionBean==null) {
			this.paisSessionBean=new PaisSessionBean();
		}
		
		this.paisSessionBean.setsUltimaBusquedaPais(this.getsAccionBusqueda());
		this.paisSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.paisSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdContinentePorNombre")) {
			paisSessionBean.setid_continente(this.getid_continenteBusquedaPorIdContinentePorNombre());	
			paisSessionBean.setnombre(this.getnombreBusquedaPorIdContinentePorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdContinente")) {
			paisSessionBean.setid_continente(this.getid_continenteFK_IdContinente());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PaisSessionBean paisSessionBean=new PaisSessionBean();
		
		if(this.paisSessionBean==null) {
			this.paisSessionBean=new PaisSessionBean();
		}
		
		if(this.paisSessionBean.getsUltimaBusquedaPais()!=null&&!this.paisSessionBean.getsUltimaBusquedaPais().equals("")) {
			this.setsAccionBusqueda(paisSessionBean.getsUltimaBusquedaPais());
			this.setiNumeroPaginacion(paisSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(paisSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdContinentePorNombre")) {
				this.setid_continenteBusquedaPorIdContinentePorNombre(paisSessionBean.getid_continente());
				paisSessionBean.setid_continente(-1L);
				this.setnombreBusquedaPorIdContinentePorNombre(paisSessionBean.getnombre());
				paisSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdContinente")) {
				this.setid_continenteFK_IdContinente(paisSessionBean.getid_continente());
				paisSessionBean.setid_continente(-1L);
			}
		}
		
		this.paisSessionBean.setsUltimaBusquedaPais("");
		this.paisSessionBean.setiNumeroPaginacion(PaisConstantesFunciones.INUMEROPAGINACION);
		this.paisSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPais(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPais() {
		this.updateBorderResaltarBusquedasFormularioPais();
		this.updateVisibilidadBusquedasFormularioPais();
		this.updateHabilitarBusquedasFormularioPais();
	}
	
	public void updateBorderResaltarBusquedasFormularioPais() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPais.getComponents().length>0) {
	

		if(this.paisConstantesFunciones.resaltarBusquedaPorIdContinentePorNombrePais!=null) {
			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelBusquedaPorIdContinentePorNombrePais);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);
				jPanel.setBorder(this.paisConstantesFunciones.resaltarBusquedaPorIdContinentePorNombrePais);
			}
		}

		if(this.paisConstantesFunciones.resaltarFK_IdContinentePais!=null) {
			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelFK_IdContinentePais);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);
				jPanel.setBorder(this.paisConstantesFunciones.resaltarFK_IdContinentePais);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPais() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPais.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelBusquedaPorIdContinentePorNombrePais);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.paisConstantesFunciones.mostrarBusquedaPorIdContinentePorNombrePais);
			if(!this.paisConstantesFunciones.mostrarBusquedaPorIdContinentePorNombrePais && index>-1) {
				this.jTabbedPaneBusquedasPais.remove(index);
			}

			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelFK_IdContinentePais);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.paisConstantesFunciones.mostrarFK_IdContinentePais);
			if(!this.paisConstantesFunciones.mostrarFK_IdContinentePais && index>-1) {
				this.jTabbedPaneBusquedasPais.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPais() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPais.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelBusquedaPorIdContinentePorNombrePais);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.paisConstantesFunciones.activarBusquedaPorIdContinentePorNombrePais);
				this.jTabbedPaneBusquedasPais.setEnabledAt(index,this.paisConstantesFunciones.activarBusquedaPorIdContinentePorNombrePais);
			}

			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelFK_IdContinentePais);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.paisConstantesFunciones.activarFK_IdContinentePais);
				this.jTabbedPaneBusquedasPais.setEnabledAt(index,this.paisConstantesFunciones.activarFK_IdContinentePais);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPais(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdContinentePorNombre")) {
			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelBusquedaPorIdContinentePorNombrePais);

			this.jTabbedPaneBusquedasPais.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);

			this.paisConstantesFunciones.setResaltarBusquedaPorIdContinentePorNombrePais(resaltar);

			jPanel.setBorder(this.paisConstantesFunciones.resaltarBusquedaPorIdContinentePorNombrePais);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdContinente")) {
			index= this.jTabbedPaneBusquedasPais.indexOfComponent(this.jPanelFK_IdContinentePais);

			this.jTabbedPaneBusquedasPais.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPais.getComponent(index);

			this.paisConstantesFunciones.setResaltarFK_IdContinentePais(resaltar);

			jPanel.setBorder(this.paisConstantesFunciones.resaltarFK_IdContinentePais);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPais.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPais() throws Exception {

		if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPais();
		this.updateVisibilidadResaltarControlesFormularioPais();
		this.updateHabilitarResaltarControlesFormularioPais();
		
	}
	
	public void updateBorderResaltarControlesFormularioPais() throws Exception {
		if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.paisConstantesFunciones.resaltaridPais!=null && this.jInternalFrameDetalleFormPais!=null) {this.jInternalFrameDetalleFormPais.jLabelidPais.setBorder(this.paisConstantesFunciones.resaltaridPais);}
		if(this.paisConstantesFunciones.resaltarid_continentePais!=null && this.jInternalFrameDetalleFormPais!=null) {this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setBorder(this.paisConstantesFunciones.resaltarid_continentePais);}
		if(this.paisConstantesFunciones.resaltarcodigoPais!=null && this.jInternalFrameDetalleFormPais!=null) {this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setBorder(this.paisConstantesFunciones.resaltarcodigoPais);}
		if(this.paisConstantesFunciones.resaltarnombrePais!=null && this.jInternalFrameDetalleFormPais!=null) {this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setBorder(this.paisConstantesFunciones.resaltarnombrePais);}
		if(this.paisConstantesFunciones.resaltarnacionalidadPais!=null && this.jInternalFrameDetalleFormPais!=null) {this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setBorder(this.paisConstantesFunciones.resaltarnacionalidadPais);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPais() throws Exception {		
		if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPais!=null) {
	
		//this.jInternalFrameDetalleFormPais.jLabelidPais.setVisible(this.paisConstantesFunciones.mostraridPais);
		this.jInternalFrameDetalleFormPais.jPanelidPais.setVisible(this.paisConstantesFunciones.mostraridPais);
		//this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setVisible(this.paisConstantesFunciones.mostrarid_continentePais);
		this.jInternalFrameDetalleFormPais.jPanelid_continentePais.setVisible(this.paisConstantesFunciones.mostrarid_continentePais);
		//this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setVisible(this.paisConstantesFunciones.mostrarcodigoPais);
		this.jInternalFrameDetalleFormPais.jPanelcodigoPais.setVisible(this.paisConstantesFunciones.mostrarcodigoPais);
		//this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setVisible(this.paisConstantesFunciones.mostrarnombrePais);
		this.jInternalFrameDetalleFormPais.jPanelnombrePais.setVisible(this.paisConstantesFunciones.mostrarnombrePais);
		//this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setVisible(this.paisConstantesFunciones.mostrarnacionalidadPais);
		this.jInternalFrameDetalleFormPais.jPanelnacionalidadPais.setVisible(this.paisConstantesFunciones.mostrarnacionalidadPais);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPais() throws Exception {
		if(this.jInternalFrameDetalleFormPais==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPais!=null) {
	
		this.jInternalFrameDetalleFormPais.jLabelidPais.setEnabled(this.paisConstantesFunciones.activaridPais);
		this.jInternalFrameDetalleFormPais.jComboBoxid_continentePais.setEnabled(this.paisConstantesFunciones.activarid_continentePais);
		this.jInternalFrameDetalleFormPais.jTextFieldcodigoPais.setEnabled(this.paisConstantesFunciones.activarcodigoPais);
		this.jInternalFrameDetalleFormPais.jTextAreanombrePais.setEnabled(this.paisConstantesFunciones.activarnombrePais);
		this.jInternalFrameDetalleFormPais.jTextFieldnacionalidadPais.setEnabled(this.paisConstantesFunciones.activarnacionalidadPais);
		}
	}
	
		
}