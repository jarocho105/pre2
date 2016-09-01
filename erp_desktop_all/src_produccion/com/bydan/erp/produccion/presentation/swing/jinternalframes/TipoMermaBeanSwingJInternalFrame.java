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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.TipoMermaConstantesFunciones;
import com.bydan.erp.produccion.util.TipoMermaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoMermaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoMermaBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoMermaBeanSwingJInternalFrame extends TipoMermaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMermaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMerma> tipomermaValidator = new ClassValidator<TipoMerma>(TipoMerma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMerma tipomerma;	
	public TipoMerma tipomermaAux;
	public TipoMerma tipomermaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMerma tipomermaTotales;
	public Long idTipoMermaActual;
	public Long iIdNuevoTipoMerma=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoMerma;
	public Boolean isPermisoNuevoTipoMerma;
	public Boolean isPermisoActualizarTipoMerma;
	public Boolean isPermisoActualizarOriginalTipoMerma;
	public Boolean isPermisoEliminarTipoMerma;
	public Boolean isPermisoGuardarCambiosTipoMerma;
	public Boolean isPermisoConsultaTipoMerma;
	public Boolean isPermisoBusquedaTipoMerma;
	public Boolean isPermisoReporteTipoMerma;
	public Boolean isPermisoPaginacionMedioTipoMerma;
	public Boolean isPermisoPaginacionAltoTipoMerma;
	public Boolean isPermisoPaginacionTodoTipoMerma;
	public Boolean isPermisoCopiarTipoMerma;
	public Boolean isPermisoVerFormTipoMerma;
	public Boolean isPermisoDuplicarTipoMerma;
	public Boolean isPermisoOrdenTipoMerma;
	
	
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
	
	public TipoMermaParameterReturnGeneral tipomermaReturnGeneral;
	public TipoMermaParameterReturnGeneral tipomermaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMerma=false;
	public Boolean esParaAccionDesdeFormularioTipoMerma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMermaLogic tipomermaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMerma tipomermaBean;
	public TipoMermaConstantesFunciones tipomermaConstantesFunciones;
	//public TipoMermaParameterReturnGeneral tipomermaReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMerma> tipomermas;	
	//public List<TipoMerma> tipomermasEliminados;
	//public List<TipoMerma> tipomermasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMerma=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMerma=true;
	public Boolean isVisibilidadCeldaCopiarTipoMerma=true;
	public Boolean isVisibilidadCeldaVerFormTipoMerma=true;
	public Boolean isVisibilidadCeldaOrdenTipoMerma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
	public Boolean isVisibilidadCeldaModificarTipoMerma=false;
	public Boolean isVisibilidadCeldaActualizarTipoMerma=false;
	public Boolean isVisibilidadCeldaEliminarTipoMerma=false;
	public Boolean isVisibilidadCeldaCancelarTipoMerma=false;
	public Boolean isVisibilidadCeldaGuardarTipoMerma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMerma=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoMerma() {
		return this.iIdNuevoTipoMerma;
	}

	public void setiIdNuevoTipoMerma(Long iIdNuevoTipoMerma) {
		this.iIdNuevoTipoMerma = iIdNuevoTipoMerma;
	}
	
	public Long getidTipoMermaActual() {
		return this.idTipoMermaActual;
	}

	public void setidTipoMermaActual(Long idTipoMermaActual) {
		this.idTipoMermaActual = idTipoMermaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMerma gettipomerma() {
		return this.tipomerma;
	}

	public void settipomerma(TipoMerma tipomerma) {
		this.tipomerma = tipomerma;
	}
	
	public TipoMerma gettipomermaAux() {
		return this.tipomermaAux;
	}

	public void settipomermaAux(TipoMerma tipomermaAux) {
		this.tipomermaAux = tipomermaAux;
	}				
	
	public TipoMerma gettipomermaAnterior() {
		return this.tipomermaAnterior;
	}

	public void settipomermaAnterior(TipoMerma tipomermaAnterior) {
		this.tipomermaAnterior = tipomermaAnterior;
	}	
	
	public TipoMerma gettipomermaTotales() {
		return this.tipomermaTotales;
	}

	public void settipomermaTotales(TipoMerma tipomermaTotales) {
		this.tipomermaTotales = tipomermaTotales;
	}	
	
	public TipoMerma gettipomermaBean() {
		return this.tipomermaBean;
	}

	public void settipomermaBean(TipoMerma tipomermaBean) {
		this.tipomermaBean = tipomermaBean;
	}	
	
	public TipoMermaParameterReturnGeneral gettipomermaReturnGeneral() {
		return this.tipomermaReturnGeneral;
	}

	public void settipomermaReturnGeneral(TipoMermaParameterReturnGeneral tipomermaReturnGeneral) {
		this.tipomermaReturnGeneral = tipomermaReturnGeneral;
	}	
	
	
	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoMermaLogic getTipoMermaLogic()	{		
		return tipomermaLogic;
	}

	public void setTipoMermaLogic(TipoMermaLogic tipomermaLogic) {
		this.tipomermaLogic = tipomermaLogic;
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
	
	public Boolean getIsEsNuevoTipoMerma() {
		return isEsNuevoTipoMerma;
	}

	public void setIsEsNuevoTipoMerma(Boolean isEsNuevoTipoMerma) {
		this.isEsNuevoTipoMerma = isEsNuevoTipoMerma;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMerma() {
		return esParaAccionDesdeFormularioTipoMerma;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMerma(Boolean esParaAccionDesdeFormularioTipoMerma) {
		this.esParaAccionDesdeFormularioTipoMerma = esParaAccionDesdeFormularioTipoMerma;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipomermaSessionBean==null) {
				this.tipomermaSessionBean=new TipoMermaSessionBean();
			}

			if(!this.tipomermaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipomermaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipomerma!=null) {
						this.tipomerma.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMerma!=null) {
						this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoMerma.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoMerma!=null) {
						if(this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoMerma!=null) {
						jComboBoxid_paisFK_IdPaisTipoMerma.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoMerma!=null) {
							//jComboBoxid_paisFK_IdPaisTipoMerma.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoMerma.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoMerma.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoMermaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoMermaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoMermaGenerico!=null && jComboBoxid_paisTipoMermaGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoMermaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoMerma tipomerma,JComboBox jComboBoxid_paisTipoMermaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoMermaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoMermaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipomerma.setid_pais(paisAux.getId());
				tipomerma.setpais_descripcion(TipoMermaConstantesFunciones.getPaisDescripcion(paisAux));
				tipomerma.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMerma!=null) { 
							this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMerma!=null) { 
					}

					if(!TipoMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoMerma.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoMerma.addItem(pais);
							}
						}

						if(!TipoMermaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMerma!=null) {
							this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMerma!=null) {
							this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoMerma.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoMerma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoMerma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMermaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMerma(this.tipomermaLogic.getTipoMermas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMermaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMerma(this.tipomermas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomermaLogic.setTipoMermas(this.tipomermas);
			tipomermaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMermaParameterReturnGeneral getTipoMermaParameterGeneral() {
		return this.tipomermaParameterGeneral;
	}
	
	public void setTipoMermaParameterGeneral(TipoMermaParameterReturnGeneral tipomermaParameterGeneral) {
		this.tipomermaParameterGeneral = tipomermaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMerma() {
		return isPermisoTodoTipoMerma;
	}

	public void setIsPermisoTodoTipoMerma(Boolean isPermisoTodoTipoMerma) {
		this.isPermisoTodoTipoMerma = isPermisoTodoTipoMerma;
	}

	public Boolean getIsPermisoNuevoTipoMerma() {
		return isPermisoNuevoTipoMerma;
	}

	public void setIsPermisoNuevoTipoMerma(Boolean isPermisoNuevoTipoMerma) {
		this.isPermisoNuevoTipoMerma = isPermisoNuevoTipoMerma;
	}

	public Boolean getIsPermisoActualizarTipoMerma() {
		return isPermisoActualizarTipoMerma;
	}

	public void setIsPermisoActualizarTipoMerma(Boolean isPermisoActualizarTipoMerma) {
		this.isPermisoActualizarTipoMerma = isPermisoActualizarTipoMerma;
	}

	public Boolean getIsPermisoEliminarTipoMerma() {
		return isPermisoEliminarTipoMerma;
	}

	public void setIsPermisoEliminarTipoMerma(Boolean isPermisoEliminarTipoMerma) {
		this.isPermisoEliminarTipoMerma = isPermisoEliminarTipoMerma;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMerma() {
		return isPermisoGuardarCambiosTipoMerma;
	}

	public void setIsPermisoGuardarCambiosTipoMerma(Boolean isPermisoGuardarCambiosTipoMerma) {
		this.isPermisoGuardarCambiosTipoMerma = isPermisoGuardarCambiosTipoMerma;
	}
	
	public Boolean getIsPermisoConsultaTipoMerma() {
		return isPermisoConsultaTipoMerma;
	}

	public void setIsPermisoConsultaTipoMerma(Boolean isPermisoConsultaTipoMerma) {
		this.isPermisoConsultaTipoMerma = isPermisoConsultaTipoMerma;
	}

	public Boolean getIsPermisoBusquedaTipoMerma() {
		return isPermisoBusquedaTipoMerma;
	}

	public void setIsPermisoBusquedaTipoMerma(Boolean isPermisoBusquedaTipoMerma) {
		this.isPermisoBusquedaTipoMerma = isPermisoBusquedaTipoMerma;
	}

	public Boolean getIsPermisoReporteTipoMerma() {
		return isPermisoReporteTipoMerma;
	}

	public void setIsPermisoReporteTipoMerma(Boolean isPermisoReporteTipoMerma) {
		this.isPermisoReporteTipoMerma = isPermisoReporteTipoMerma;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMerma() {
		return isPermisoPaginacionMedioTipoMerma;
	}

	public void setIsPermisoPaginacionMedioTipoMerma(Boolean isPermisoPaginacionMedioTipoMerma) {
		this.isPermisoPaginacionMedioTipoMerma = isPermisoPaginacionMedioTipoMerma;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMerma() {
		return isPermisoPaginacionTodoTipoMerma;
	}

	public void setIsPermisoPaginacionTodoTipoMerma(Boolean isPermisoPaginacionTodoTipoMerma) {
		this.isPermisoPaginacionTodoTipoMerma = isPermisoPaginacionTodoTipoMerma;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMerma() {
		return isPermisoPaginacionAltoTipoMerma;
	}

	public void setIsPermisoPaginacionAltoTipoMerma(Boolean isPermisoPaginacionAltoTipoMerma) {
		this.isPermisoPaginacionAltoTipoMerma = isPermisoPaginacionAltoTipoMerma;
	}
	
	public Boolean getIsPermisoCopiarTipoMerma() {
		return isPermisoCopiarTipoMerma;
	}

	public void setIsPermisoCopiarTipoMerma(Boolean isPermisoCopiarTipoMerma) {
		this.isPermisoCopiarTipoMerma = isPermisoCopiarTipoMerma;
	}
	
	public Boolean getIsPermisoVerFormTipoMerma() {
		return isPermisoVerFormTipoMerma;
	}

	public void setIsPermisoVerFormTipoMerma(Boolean isPermisoVerFormTipoMerma) {
		this.isPermisoVerFormTipoMerma = isPermisoVerFormTipoMerma;
	}
	
	public Boolean getIsPermisoDuplicarTipoMerma() {
		return isPermisoDuplicarTipoMerma;
	}

	public void setIsPermisoDuplicarTipoMerma(Boolean isPermisoDuplicarTipoMerma) {
		this.isPermisoDuplicarTipoMerma = isPermisoDuplicarTipoMerma;
	}
	
	public Boolean getIsPermisoOrdenTipoMerma() {
		return isPermisoOrdenTipoMerma;
	}

	public void setIsPermisoOrdenTipoMerma(Boolean isPermisoOrdenTipoMerma) {
		this.isPermisoOrdenTipoMerma = isPermisoOrdenTipoMerma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMerma() {
		return isVisibilidadCeldaNuevoTipoMerma;
	}

	public void setIsVisibilidadCeldaNuevoTipoMerma(Boolean isVisibilidadCeldaNuevoTipoMerma) {
		this.isVisibilidadCeldaNuevoTipoMerma = isVisibilidadCeldaNuevoTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMerma() {
		return isVisibilidadCeldaDuplicarTipoMerma;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMerma(Boolean isVisibilidadCeldaDuplicarTipoMerma) {
		this.isVisibilidadCeldaDuplicarTipoMerma = isVisibilidadCeldaDuplicarTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMerma() {
		return isVisibilidadCeldaCopiarTipoMerma;
	}

	public void setIsVisibilidadCeldaCopiarTipoMerma(Boolean isVisibilidadCeldaCopiarTipoMerma) {
		this.isVisibilidadCeldaCopiarTipoMerma = isVisibilidadCeldaCopiarTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMerma() {
		return isVisibilidadCeldaVerFormTipoMerma;
	}

	public void setIsVisibilidadCeldaVerFormTipoMerma(Boolean isVisibilidadCeldaVerFormTipoMerma) {
		this.isVisibilidadCeldaVerFormTipoMerma = isVisibilidadCeldaVerFormTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMerma() {
		return isVisibilidadCeldaOrdenTipoMerma;
	}

	public void setIsVisibilidadCeldaOrdenTipoMerma(Boolean isVisibilidadCeldaOrdenTipoMerma) {
		this.isVisibilidadCeldaOrdenTipoMerma = isVisibilidadCeldaOrdenTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMerma() {
		return isVisibilidadCeldaNuevoRelacionesTipoMerma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMerma(Boolean isVisibilidadCeldaNuevoRelacionesTipoMerma) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMerma = isVisibilidadCeldaNuevoRelacionesTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMerma() {
		return isVisibilidadCeldaModificarTipoMerma;
	}

	public void setIsVisibilidadCeldaModificarTipoMerma(Boolean isVisibilidadCeldaModificarTipoMerma) {
		this.isVisibilidadCeldaModificarTipoMerma = isVisibilidadCeldaModificarTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMerma() {
		return isVisibilidadCeldaActualizarTipoMerma;
	}

	public void setIsVisibilidadCeldaActualizarTipoMerma(Boolean isVisibilidadCeldaActualizarTipoMerma) {
		this.isVisibilidadCeldaActualizarTipoMerma = isVisibilidadCeldaActualizarTipoMerma;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMerma() {
		return isVisibilidadCeldaEliminarTipoMerma;
	}

	public void setIsVisibilidadCeldaEliminarTipoMerma(Boolean isVisibilidadCeldaEliminarTipoMerma) {
		this.isVisibilidadCeldaEliminarTipoMerma = isVisibilidadCeldaEliminarTipoMerma;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMerma() {
		return isVisibilidadCeldaCancelarTipoMerma;
	}

	public void setIsVisibilidadCeldaCancelarTipoMerma(Boolean isVisibilidadCeldaCancelarTipoMerma) {
		this.isVisibilidadCeldaCancelarTipoMerma = isVisibilidadCeldaCancelarTipoMerma;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMerma() {
		return isVisibilidadCeldaGuardarTipoMerma;
	}

	public void setIsVisibilidadCeldaGuardarTipoMerma(Boolean isVisibilidadCeldaGuardarTipoMerma) {
		this.isVisibilidadCeldaGuardarTipoMerma = isVisibilidadCeldaGuardarTipoMerma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMerma() {
		return isVisibilidadCeldaGuardarCambiosTipoMerma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMerma(Boolean isVisibilidadCeldaGuardarCambiosTipoMerma) {
		this.isVisibilidadCeldaGuardarCambiosTipoMerma = isVisibilidadCeldaGuardarCambiosTipoMerma;
	}
		
	public TipoMermaSessionBean gettipomermaSessionBean() {
		return this.tipomermaSessionBean;
	}
	
	public void settipomermaSessionBean(TipoMermaSessionBean tipomermaSessionBean) {
		this.tipomermaSessionBean=tipomermaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMerma(TipoMerma tipomerma)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipomerma,null);
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
	
	public void bugActualizarReferenciaActual(TipoMerma tipomerma,TipoMerma tipomermaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMerma(tipomerma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomermaAux.setId(tipomerma.getId());
		tipomermaAux.setVersionRow(tipomerma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMerma();
		
			int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomermaValidator.getInvalidValues(this.tipomerma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomermaLogic.setDatosCliente(datosCliente);
			tipomermaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomermaAux=new  TipoMerma();
				
				tipomermaAux.setIsNew(true);
				tipomermaAux.setIsChanged(true);
				
				tipomermaAux.setTipoMermaOriginal(this.tipomerma);
				
				tipomermaAux.setId(this.tipomerma.getId());	
				tipomermaAux.setVersionRow(this.tipomerma.getVersionRow());	
				tipomermaAux.setid_pais(this.tipomerma.getid_pais());	
				tipomermaAux.setnombre(this.tipomerma.getnombre());	
				tipomermaAux.setdescripcion(this.tipomerma.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomermaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomermaAux,tipomermaLogic.getTipoMermas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaAux,tipomermas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaLogic.saveTipoMermas();//WithConnection
						//tipomermaLogic.getSetVersionRowTipoMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomerma,tipomermaAux);
					
					this.refrescarForeignKeysDescripcionesTipoMerma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomermaAux=new  TipoMerma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomermaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomermaSessionBean.getEsGuardarRelacionado() && this.tipomerma.getId()>=0)) {
						
					tipomermaAux.setIsNew(false);
				}
				
				tipomermaAux.setIsDeleted(false);
			
				tipomermaAux.setId(this.tipomerma.getId());	
				tipomermaAux.setVersionRow(this.tipomerma.getVersionRow());	
				tipomermaAux.setid_pais(this.tipomerma.getid_pais());	
				tipomermaAux.setnombre(this.tipomerma.getnombre());	
				tipomermaAux.setdescripcion(this.tipomerma.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomermaAux,tipomermaLogic.getTipoMermas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaAux,tipomermas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaLogic.saveTipoMermas();//WithConnection
						//tipomermaLogic.getSetVersionRowTipoMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomerma,tipomermaAux);
					
					this.refrescarForeignKeysDescripcionesTipoMerma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomermaAux=new  TipoMerma();
				
				tipomermaAux.setIsNew(false);
				tipomermaAux.setIsChanged(false);
				
				tipomermaAux.setIsDeleted(true);
				
				tipomermaAux.setId(this.tipomerma.getId());	
				tipomermaAux.setVersionRow(this.tipomerma.getVersionRow());	
				tipomermaAux.setid_pais(this.tipomerma.getid_pais());	
				tipomermaAux.setnombre(this.tipomerma.getnombre());	
				tipomermaAux.setdescripcion(this.tipomerma.getdescripcion());	
				
				if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomermaAux.getId()>=0) {	
						this.tipomermasEliminados.add(tipomermaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomermaAux,tipomermaLogic.getTipoMermas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaAux,tipomermas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaLogic.saveTipoMermas();//WithConnection
						//tipomermaLogic.getSetVersionRowTipoMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomermaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomermaAux,tipomermaLogic.getTipoMermas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomermaAux,tipomermas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.getTipoMermas().addAll(this.tipomermasEliminados);
					
					tipomermaLogic.saveTipoMermas();//WithConnection
					//tipomermaLogic.getSetVersionRowTipoMermas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMerma();
				
				this.tipomermasEliminados= new ArrayList<TipoMerma>();		
			}
			
			if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Merma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomerma=tipomermaAux;
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
      		//this.finishProcessTipoMerma();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMerma tipomermaLocal) throws Exception {
		
		if(this.tipomermaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMerma tipomermaLocal) throws Exception {	
		if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipomermaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMermaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomermaValidator.getInvalidValues(this.tipomerma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMerma tipomerma,List<TipoMerma> tipomermas) throws Exception {
		try	{		
			TipoMermaConstantesFunciones.actualizarLista(tipomerma,tipomermas,this.tipomermaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMerma tipomerma,List<TipoMerma> tipomermas) throws Exception {
		try	{			
			TipoMermaConstantesFunciones.actualizarSelectedLista(tipomerma,tipomermas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMerma> tipomermasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomermasLocal=this.tipomermaLogic.getTipoMermas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomermasLocal=this.tipomermas;
			}
			//ARCHITECTURE
		
			for(TipoMerma tipomermaLocal:tipomermasLocal) {
				if(this.permiteMantenimiento(tipomermaLocal) && tipomermaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMermaConstantesFunciones.getTipoMermaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMermaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMerma.jLabelid_paisTipoMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMermaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMerma.jLabelnombreTipoMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMermaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMerma.jLabeldescripcionTipoMerma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMerma.jLabelid_paisTipoMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMerma.jLabelnombreTipoMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMerma.jLabeldescripcionTipoMerma,"");
		
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
		this.iIdNuevoTipoMerma--;	
		
		
		this.tipomermaAux=new TipoMerma();
		
		this.tipomermaAux.setId(this.iIdNuevoTipoMerma);
		this.tipomermaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomermaLogic.getTipoMermas().add(this.tipomermaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomermas.add(this.tipomermaAux);
		}
		//ARCHITECTURE
		
		this.tipomerma=this.tipomermaAux;
		
		if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMerma(this.tipomerma);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMerma(this.tipomerma);
		}
				
		//this.setDefaultControlesTipoMerma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMerma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMerma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMerma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMerma(this.tipomermaBean,this.tipomerma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMermaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
			classes=TipoMermaConstantesFunciones.getClassesRelationshipsOfTipoMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomermaReturnGeneral=tipomermaLogic.procesarEventosTipoMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomermaLogic.getTipoMermas(),this.tipomerma,this.tipomermaParameterGeneral,this.isEsNuevoTipoMerma,classes);//this.tipomermaLogic.getTipoMerma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMerma(this.tipomermaReturnGeneral,this.tipomermaBean,false);
		
		if(this.tipomermaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMerma(this.tipomermaReturnGeneral.getTipoMerma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMerma(this.tipomermaReturnGeneral.getTipoMerma());
		}
		
		if(this.tipomermaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMerma(this.tipomermaReturnGeneral.getTipoMerma(),classes);//this.tipomermaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMerma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMerma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMerma(false);
						
			if(tipomermaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMerma();
			}
			
			this.actualizarVisualTableDatosTipoMerma();
			
			this.jTableDatosTipoMerma.setRowSelectionInterval(this.getIndiceNuevoTipoMerma(), this.getIndiceNuevoTipoMerma());
			
			this.seleccionarFilaTablaTipoMermaActual();
						
			this.actualizarEstadoCeldasBotonesTipoMerma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMerma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setEnabled(isHabilitar && this.tipomermaConstantesFunciones.activarnombreTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setEnabled(isHabilitar && this.tipomermaConstantesFunciones.activardescripcionTipoMerma);	
		
		this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setEnabled(isHabilitar && this.tipomermaConstantesFunciones.activarid_paisTipoMerma);
	};
	
	public void setDefaultControlesTipoMerma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMerma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomermaSessionBean.setConGuardarRelaciones(true);			
			this.tipomermaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.setVisible(true);
			
					
		} else {
			//this.tipomermaSessionBean.setConGuardarRelaciones(false);			
			this.tipomermaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoMerma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
				if(tipomermaAux.getId().equals(this.iIdNuevoTipoMerma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMerma tipomermaAux:this.tipomermas) {
				if(tipomermaAux.getId().equals(this.iIdNuevoTipoMerma)) {
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
	
	public int getIndiceActualTipoMerma(TipoMerma tipomerma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
				if(tipomermaAux.getId().equals(tipomerma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMerma tipomermaAux:this.tipomermas) {
				if(tipomermaAux.getId().equals(tipomerma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMerma(TipoMerma tipomermaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
				if(tipomermaAux.getTipoMermaOriginal().getId().equals(tipomermaOriginal.getId())) {
					existe=true;
					tipomermaOriginal.setId(tipomermaAux.getId());
					tipomermaOriginal.setVersionRow(tipomermaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMerma tipomermaAux:this.tipomermas) {
				if(tipomermaAux.getTipoMermaOriginal().getId().equals(tipomermaOriginal.getId())) {
					existe=true;
					tipomermaOriginal.setId(tipomermaAux.getId());
					tipomermaOriginal.setVersionRow(tipomermaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMerma(Boolean esParaCancelar) throws Exception {
		tipomermasAux=new ArrayList<TipoMerma>();
		tipomermaAux=new TipoMerma();
		
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
					if(tipomermaAux.getId()<0) {
						tipomermasAux.add(tipomermaAux);
					}		
				}
				this.iIdNuevoTipoMerma=0L;
				this.tipomermaLogic.getTipoMermas().removeAll(tipomermasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMerma tipomermaAux:this.tipomermas) {
					if(tipomermaAux.getId()<0) {
						tipomermasAux.add(tipomermaAux);
					}		
				}
				this.iIdNuevoTipoMerma=0L;
				this.tipomermas.removeAll(tipomermasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMerma 
					&& this.tipomermaLogic.getTipoMermas().size()>0
					) {
					tipomermaAux=this.tipomermaLogic.getTipoMermas().get(this.tipomermaLogic.getTipoMermas().size() - 1);
				
					if(tipomermaAux.getId()<0) {
						this.tipomermaLogic.getTipoMermas().remove(tipomermaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMerma && this.tipomermas.size()>0) {
					tipomermaAux=this.tipomermas.get(this.tipomermas.size() - 1);
				
					if(tipomermaAux.getId()<0) {
						this.tipomermas.remove(tipomermaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMerma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomerma.getId()<0) {
				this.tipomermaLogic.getTipoMermas().remove(this.tipomerma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomerma.getId()<0) {
				this.tipomermas.remove(this.tipomerma);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMerma(List<TipoMerma> tipomermasAux) throws Exception {
		TipoMermaConstantesFunciones.setEstadosInicialesTipoMerma(tipomermasAux);
	}
	
	public void setEstadosInicialesTipoMerma(TipoMerma tipomermaAux) throws Exception {
		TipoMermaConstantesFunciones.setEstadosInicialesTipoMerma(tipomermaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMermaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMermaActual()) {
				if(!this.isEsNuevoTipoMerma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMerma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMermaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Merma ?", "MANTENIMIENTO DE Tipo Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMerma tipomerma) throws Exception {
		TipoMermaConstantesFunciones.seleccionarAsignar(this.tipomerma,tipomerma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMerma=this.isPermisoActualizarOriginalTipoMerma;
			
			
			this.seleccionarAsignar(tipomerma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMermaConstantesFunciones.quitarEspaciosTipoMerma(this.tipomerma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomermaSessionBean.setsFuncionBusquedaRapida(this.tipomermaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMerma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMerma(esParaCancelar);				
				this.cancelarNuevoTipoMerma(esParaCancelar);								
			}
			
			this.tipomerma=new TipoMerma();
			
			this.inicializarTipoMerma();
			
			this.actualizarEstadoCeldasBotonesTipoMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMerma() throws Exception {
		try {
			TipoMermaConstantesFunciones.inicializarTipoMerma(this.tipomerma);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomermaLogic.getTipoMermas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMermas(String sAccionBusqueda,List<TipoMerma> tipomermasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMerma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMermaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMermaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMerma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Mermas");		
		parameters.put("busquedapor", TipoMermaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMerma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMermaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMermaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMerma=new JRBeanArrayDataSource(TipoMermaJInternalFrame.TraerTipoMermaBeans(tipomermasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMerma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMermaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMermaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMermaBean.TraerTipoMermaBeans(tipomermasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMermas(sAccionBusqueda,sTipoArchivoReporte,tipomermasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMermas(sAccionBusqueda,sTipoArchivoReporte,tipomermasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMermaActionPerformed(null);
					//this.generarExcelReporteTipoMermas(sAccionBusqueda,sTipoArchivoReporte,tipomermasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMermas(sAccionBusqueda,sTipoArchivoReporte,tipomermasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMermas(sAccionBusqueda,sTipoArchivoReporte,tipomermasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMermas(sAccionBusqueda,sTipoArchivoReporte,tipomermasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMerma> tipomermasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMermas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMerma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMerma tipomerma : tipomermasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMermaConstantesFunciones.generarExcelReporteDataTipoMerma("NORMAL",row,workbook,tipomerma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMerma(String sTipo,Row row,Workbook workbook) {
		
		TipoMermaConstantesFunciones.generarExcelReporteHeaderTipoMerma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMerma> tipomermasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMermas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMerma tipomerma : tipomermasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMermaConstantesFunciones.getTipoMermaDescripcion(tipomerma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMermaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMermaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomerma.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMermaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMermaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomerma.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMermaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMermaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomerma.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMerma> tipomermasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMerma> tipomermasRespaldo=null;
		
		classes=TipoMermaConstantesFunciones.getClassesRelationshipsOfTipoMerma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomermaLogic.setDatosCliente(this.datosCliente);
		this.tipomermaLogic.setDatosDeep(this.datosDeep);
		this.tipomermaLogic.setIsConDeep(true);
		
		tipomermasRespaldo=this.tipomermaLogic.getTipoMermas();
		
		this.tipomermaLogic.setTipoMermas(tipomermasParaReportes);	
		this.tipomermaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomermasParaReportes=this.tipomermaLogic.getTipoMermas();
		this.tipomermaLogic.setTipoMermas(tipomermasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMermas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMerma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMerma tipomerma : tipomermasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMerma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMermaConstantesFunciones.generarExcelReporteDataTipoMerma("NORMAL",row,workbook,tipomerma,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoMermaConstantesFunciones.getTipoMermaDescripcion(tipomerma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMerma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMerma() throws Exception {		
		this.startProcessTipoMerma(true);
	}
	
	public void startProcessTipoMerma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMerma ,this.jPanelParametrosReportesTipoMerma, this.jScrollPanelDatosTipoMerma,this.jPanelPaginacionTipoMerma, this.jScrollPanelDatosEdicionTipoMerma, this.jPanelAccionesTipoMerma,this.jPanelAccionesFormularioTipoMerma,this.jmenuBarTipoMerma,this.jmenuBarDetalleTipoMerma,this.jTtoolBarTipoMerma,this.jTtoolBarDetalleTipoMerma);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMerma=this.jTabbedPaneBusquedasTipoMerma; 
		
		final JPanel jPanelParametrosReportesTipoMerma=this.jPanelParametrosReportesTipoMerma;
		//final JScrollPane jScrollPanelDatosTipoMerma=this.jScrollPanelDatosTipoMerma;
		final JTable jTableDatosTipoMerma=this.jTableDatosTipoMerma;		
		final JPanel jPanelPaginacionTipoMerma=this.jPanelPaginacionTipoMerma;
		//final JScrollPane jScrollPanelDatosEdicionTipoMerma=this.jScrollPanelDatosEdicionTipoMerma;
		final JPanel jPanelAccionesTipoMerma=this.jPanelAccionesTipoMerma;
		
		JPanel jPanelCamposAuxiliarTipoMerma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMerma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			jPanelCamposAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jPanelCamposTipoMerma;
			jPanelAccionesFormularioAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jPanelAccionesFormularioTipoMerma;
		}
		
		final JPanel jPanelCamposTipoMerma=jPanelCamposAuxiliarTipoMerma;
		final JPanel jPanelAccionesFormularioTipoMerma=jPanelAccionesFormularioAuxiliarTipoMerma;
		
		
		final JMenuBar jmenuBarTipoMerma=this.jmenuBarTipoMerma;
		final JToolBar jTtoolBarTipoMerma=this.jTtoolBarTipoMerma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMerma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMerma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			jmenuBarDetalleAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jmenuBarDetalleTipoMerma;
			jTtoolBarDetalleAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jTtoolBarDetalleTipoMerma;
		}
		
		final JMenuBar jmenuBarDetalleTipoMerma=jmenuBarDetalleAuxiliarTipoMerma;
		final JToolBar jTtoolBarDetalleTipoMerma=jTtoolBarDetalleAuxiliarTipoMerma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMerma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMerma;
			processRunnable.jTableDatos=jTableDatosTipoMerma;
			processRunnable.jPanelCampos=jPanelCamposTipoMerma;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMerma;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMerma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMerma;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMerma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMerma;
			processRunnable.jTtoolBar=jTtoolBarTipoMerma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMerma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMerma ,jPanelParametrosReportesTipoMerma,jTableDatosTipoMerma, /*jScrollPanelDatosTipoMerma,*/jPanelCamposTipoMerma,jPanelPaginacionTipoMerma, /*jScrollPanelDatosEdicionTipoMerma,*/ jPanelAccionesTipoMerma,jPanelAccionesFormularioTipoMerma,jmenuBarTipoMerma,jmenuBarDetalleTipoMerma,jTtoolBarTipoMerma,jTtoolBarDetalleTipoMerma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMerma ,jPanelParametrosReportesTipoMerma, jScrollPanelDatosTipoMerma,jPanelPaginacionTipoMerma, jScrollPanelDatosEdicionTipoMerma, jPanelAccionesTipoMerma,jPanelAccionesFormularioTipoMerma,jmenuBarTipoMerma,jmenuBarDetalleTipoMerma,jTtoolBarTipoMerma,jTtoolBarDetalleTipoMerma);
						
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
	
	public void finishProcessTipoMerma() {// throws Exception 
		this.finishProcessTipoMerma(true);
	}
	
	public void finishProcessTipoMerma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMerma ,this.jPanelParametrosReportesTipoMerma, this.jScrollPanelDatosTipoMerma,this.jPanelPaginacionTipoMerma, this.jScrollPanelDatosEdicionTipoMerma, this.jPanelAccionesTipoMerma,this.jPanelAccionesFormularioTipoMerma,this.jmenuBarTipoMerma,this.jmenuBarDetalleTipoMerma,this.jTtoolBarTipoMerma,this.jTtoolBarDetalleTipoMerma);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMerma=this.jTabbedPaneBusquedasTipoMerma; 
		
		final JPanel jPanelParametrosReportesTipoMerma=this.jPanelParametrosReportesTipoMerma;
		//final JScrollPane jScrollPanelDatosTipoMerma=this.jScrollPanelDatosTipoMerma;
		final JTable jTableDatosTipoMerma=this.jTableDatosTipoMerma;		
		final JPanel jPanelPaginacionTipoMerma=this.jPanelPaginacionTipoMerma;
		//final JScrollPane jScrollPanelDatosEdicionTipoMerma=this.jScrollPanelDatosEdicionTipoMerma;
		final JPanel jPanelAccionesTipoMerma=this.jPanelAccionesTipoMerma;
		
		JPanel jPanelCamposAuxiliarTipoMerma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMerma=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			jPanelCamposAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jPanelCamposTipoMerma;
			jPanelAccionesFormularioAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jPanelAccionesFormularioTipoMerma;
		}
		
		final JPanel jPanelCamposTipoMerma=jPanelCamposAuxiliarTipoMerma;
		final JPanel jPanelAccionesFormularioTipoMerma=jPanelAccionesFormularioAuxiliarTipoMerma;
		
		
		final JMenuBar jmenuBarTipoMerma=this.jmenuBarTipoMerma;		
		final JToolBar jTtoolBarTipoMerma=this.jTtoolBarTipoMerma;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMerma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMerma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			jmenuBarDetalleAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jmenuBarDetalleTipoMerma;
			jTtoolBarDetalleAuxiliarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jTtoolBarDetalleTipoMerma;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMerma=jmenuBarDetalleAuxiliarTipoMerma;
		final JToolBar jTtoolBarDetalleTipoMerma=jTtoolBarDetalleAuxiliarTipoMerma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMerma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMerma;
			processRunnable.jTableDatos=jTableDatosTipoMerma;
			processRunnable.jPanelCampos=jPanelCamposTipoMerma;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMerma;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMerma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMerma;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMerma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMerma;
			processRunnable.jTtoolBar=jTtoolBarTipoMerma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMerma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMerma ,jPanelParametrosReportesTipoMerma, jTableDatosTipoMerma,/*jScrollPanelDatosTipoMerma,*/jPanelCamposTipoMerma,jPanelPaginacionTipoMerma, /*jScrollPanelDatosEdicionTipoMerma,*/ jPanelAccionesTipoMerma,jPanelAccionesFormularioTipoMerma,jmenuBarTipoMerma,jmenuBarDetalleTipoMerma,jTtoolBarTipoMerma,jTtoolBarDetalleTipoMerma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMerma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMerma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMerma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMerma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMerma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMerma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMerma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMerma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMerma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomermaConstantesFunciones.getsFinalQueryTipoMerma();
		String  finalQueryPaginacionTodos=this.tipomermaConstantesFunciones.getsFinalQueryTipoMerma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMermaConstantesFunciones.getArrayColumnasGlobalesNoTipoMerma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMermaConstantesFunciones.getArrayColumnasGlobalesTipoMerma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMermaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomermasEliminados= new ArrayList<TipoMerma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMerma();
		
				///*TipoMermaSessionBean*/this.tipomermaSessionBean=new TipoMermaSessionBean();
			
			if(this.tipomermaSessionBean==null) {
				this.tipomermaSessionBean=new TipoMermaSessionBean();
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
					this.iNumeroPaginacion=TipoMermaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMermaConstantesFunciones.getClassesForeignKeysOfTipoMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomerma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomermasAux= new ArrayList<TipoMerma>();
			
				
			tipomermaLogic.setDatosCliente(this.datosCliente);
			tipomermaLogic.setDatosDeep(this.datosDeep);
			tipomermaLogic.setIsConDeep(true);
			
			
			tipomermaLogic.getTipoMermaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomermaLogic.getTodosTipoMermas(finalQueryGlobal,pagination);
					
					//tipomermaLogic.getTodosTipoMermasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomermaLogic.getTipoMermas()==null|| tipomermaLogic.getTipoMermas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomermasAux= new ArrayList<TipoMerma>();
							tipomermasAux.addAll(tipomermaLogic.getTipoMermas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermasAux= new ArrayList<TipoMerma>();
							tipomermasAux.addAll(tipomermas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomermaLogic.getTodosTipoMermas(finalQueryGlobal+"",this.pagination);												
							
							//tipomermaLogic.getTodosTipoMermasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMermas("Todos",tipomermaLogic.getTipoMermas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomermaLogic.setTipoMermas(new ArrayList<TipoMerma>());					
							tipomermaLogic.getTipoMermas().addAll(tipomermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermas=new ArrayList<TipoMerma>();
							tipomermas.addAll(tipomermasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMerma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMerma=this.idActual;
				
				} else if(this.idTipoMermaActual!=null && this.idTipoMermaActual!=0L) {
					idTipoMerma=idTipoMermaActual;
				}
				
					
				this.sDetalleReporte=TipoMermaConstantesFunciones.getDetalleIndicePorId(idTipoMerma);
				
				this.tipomermas=new ArrayList<TipoMerma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomermaLogic.getEntity(idTipoMerma);
					
					//tipomermaLogic.getEntityWithConnection(idTipoMerma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaLogic.setTipoMermas(new ArrayList<TipoMerma>());
					tipomermaLogic.getTipoMermas().add(tipomermaLogic.getTipoMerma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomermas=new ArrayList<TipoMerma>();
					this.tipomermas.add(tipomerma);
				}
				
				if(tipomermaLogic.getTipoMerma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoMermaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomermaLogic.getTipoMermasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMermaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMermaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomermaLogic.getTipoMermas()==null||tipomermaLogic.getTipoMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomermas==null|| tipomermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermasAux=new ArrayList<TipoMerma>();
						tipomermasAux.addAll(tipomermaLogic.getTipoMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermasAux=new ArrayList<TipoMerma>();
							tipomermasAux.addAll(tipomermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomermaLogic.getTipoMermasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMermaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMermaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMermas("FK_IdPais",tipomermaLogic.getTipoMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMermas("FK_IdPais",tipomermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaLogic.setTipoMermas(new ArrayList<TipoMerma>());
						tipomermaLogic.getTipoMermas().addAll(tipomermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermas=new ArrayList<TipoMerma>();
							tipomermas.addAll(tipomermasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMerma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMerma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomermaLogic.getTipoMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomermas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomermaLogic.getTipoMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomermas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMerma tipomerma) {
		Boolean permite=true;
		
		if(this.tipomerma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMermaConstantesFunciones.getOrderByListaTipoMerma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMermaConstantesFunciones.getOrderByListaTipoMerma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMerma tipomerma:tipomermaLogic.getTipoMermas()) {
				if(tipomerma.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaTotales=tipomerma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMerma tipomerma:this.tipomermas) {
				if(tipomerma.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaTotales=tipomerma;
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
			this.tipomermaAux=new TipoMerma();
			this.tipomermaAux.setsType(Constantes2.S_TOTALES);
			this.tipomermaAux.setIsNew(false);
			this.tipomermaAux.setIsChanged(false);
			this.tipomermaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMermaConstantesFunciones.TotalizarValoresFilaTipoMerma(this.tipomermaLogic.getTipoMermas(),this.tipomermaAux);
				
				this.tipomermaLogic.getTipoMermas().add(this.tipomermaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMermaConstantesFunciones.TotalizarValoresFilaTipoMerma(this.tipomermas,this.tipomermaAux);
				
				this.tipomermas.add(this.tipomermaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomermaTotales=new TipoMerma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomermaLogic.getTipoMermas().remove(tipomermaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomermas.remove(tipomermaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomermaTotales=new TipoMerma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMerma tipomerma:tipomermaLogic.getTipoMermas()) {
				if(tipomerma.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaTotales=tipomerma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMermaConstantesFunciones.TotalizarValoresFilaTipoMerma(this.tipomermaLogic.getTipoMermas(),tipomermaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMerma tipomerma:this.tipomermas) {
				if(tipomerma.getsType().equals(Constantes2.S_TOTALES)) {
					tipomermaTotales=tipomerma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMermaConstantesFunciones.TotalizarValoresFilaTipoMerma(this.tipomermas,tipomermaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMermasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoMermasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaLogic.getTipoMermasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosTipoMerma() {
		this.isPermisoTodoTipoMerma=false;
		this.isPermisoNuevoTipoMerma=false;
		this.isPermisoActualizarTipoMerma=false;
		this.isPermisoActualizarOriginalTipoMerma=false;
		this.isPermisoEliminarTipoMerma=false;
		this.isPermisoGuardarCambiosTipoMerma=false;
		this.isPermisoConsultaTipoMerma=false;
		this.isPermisoBusquedaTipoMerma=false;
		this.isPermisoReporteTipoMerma=false;		
		this.isPermisoOrdenTipoMerma=false;		
		this.isPermisoPaginacionMedioTipoMerma=false;		
		this.isPermisoPaginacionAltoTipoMerma=false;
		this.isPermisoPaginacionTodoTipoMerma=false;
		this.isPermisoCopiarTipoMerma=false;		
		this.isPermisoVerFormTipoMerma=false;		
		this.isPermisoDuplicarTipoMerma=false;		
		this.isPermisoOrdenTipoMerma=false;		
	}
	
	public void setPermisosUsuarioTipoMerma(Boolean isPermiso) {
		this.isPermisoTodoTipoMerma=isPermiso;
		this.isPermisoNuevoTipoMerma=isPermiso;
		this.isPermisoActualizarTipoMerma=isPermiso;
		this.isPermisoActualizarOriginalTipoMerma=isPermiso;
		this.isPermisoEliminarTipoMerma=isPermiso;
		this.isPermisoGuardarCambiosTipoMerma=isPermiso;
		this.isPermisoConsultaTipoMerma=isPermiso;
		this.isPermisoBusquedaTipoMerma=isPermiso;
		this.isPermisoReporteTipoMerma=isPermiso;
		this.isPermisoOrdenTipoMerma=isPermiso;		
		this.isPermisoPaginacionMedioTipoMerma=isPermiso;		
		this.isPermisoPaginacionAltoTipoMerma=isPermiso;		
		this.isPermisoPaginacionTodoTipoMerma=isPermiso;		
		this.isPermisoCopiarTipoMerma=isPermiso;		
		this.isPermisoVerFormTipoMerma=isPermiso;		
		this.isPermisoDuplicarTipoMerma=isPermiso;
		this.isPermisoOrdenTipoMerma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMerma(Boolean isPermiso) {
		//this.isPermisoTodoTipoMerma=isPermiso;
		this.isPermisoNuevoTipoMerma=isPermiso;
		this.isPermisoActualizarTipoMerma=isPermiso;
		this.isPermisoActualizarOriginalTipoMerma=isPermiso;
		this.isPermisoEliminarTipoMerma=isPermiso;
		this.isPermisoGuardarCambiosTipoMerma=isPermiso;
		//this.isPermisoConsultaTipoMerma=isPermiso;
		//this.isPermisoBusquedaTipoMerma=isPermiso;
		//this.isPermisoReporteTipoMerma=isPermiso;
		//this.isPermisoOrdenTipoMerma=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMerma=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMerma=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMerma=isPermiso;		
		//this.isPermisoCopiarTipoMerma=isPermiso;		
		//this.isPermisoDuplicarTipoMerma=isPermiso;
		//this.isPermisoOrdenTipoMerma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMermaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMerma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMermaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMermaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMermaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMermaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoMerma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMermaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMerma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMerma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMerma=this.isPermisoActualizarTipoMerma;
			this.isPermisoEliminarTipoMerma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMerma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMerma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMerma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMerma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMerma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMerma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMerma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMerma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMerma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMerma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMerma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMerma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMerma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMerma.setToolTipText(this.jTableDatosTipoMerma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMerma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMerma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMerma() throws Exception {
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
	public void inicializarCombosForeignKeyTipoMermaListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMermaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMermaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMermaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoMermaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMermaParameterReturnGeneral tipomermaReturnGeneral=new TipoMermaParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipomermaConstantesFunciones.cargarid_paisTipoMerma)
					 || (this.esRecargarFks && this.tipomermaConstantesFunciones.cargarid_paisTipoMerma)) {

					if(!this.tipomermaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipomermaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomermaReturnGeneral=tipomermaLogic.cargarCombosLoteForeignKeyTipoMerma(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipomermaReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMerma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipomermaSessionBean==null) {
				this.tipomermaSessionBean=new TipoMermaSessionBean();
			}

			if(!this.tipomermaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoMerma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMerma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMerma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMerma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMerma(TipoMerma tipomerma)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipomerma.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMerma(TipoMerma tipomerma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMerma()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipomermaConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMerma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMerma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMerma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMerma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMerma()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMerma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMerma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma!=null && this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoMermaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMermaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMermaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomermaSessionBean=new TipoMermaSessionBean(); 
		this.tipomermaConstantesFunciones=new TipoMermaConstantesFunciones(); 
		this.tipomermaBean=new TipoMerma();//(this.tipomermaConstantesFunciones); 		
		this.tipomermaReturnGeneral=new TipoMermaParameterReturnGeneral(); 
		
		this.tipomermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMerma(true);
			
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
			
			this.tipomermaConstantesFunciones=new TipoMermaConstantesFunciones(); 
			this.tipomermaBean=new TipoMerma();//this.tipomermaConstantesFunciones); 			
			this.tipomermaReturnGeneral=new TipoMermaParameterReturnGeneral(); 
		
			TipoMermaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Merma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomerma=new TipoMerma();
			this.tipomermas = new ArrayList<TipoMerma>();
			this.tipomermasAux = new ArrayList<TipoMerma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic=new TipoMermaLogic();
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMerma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMerma);	
					}
					
					if(this.jInternalFrameImportacionTipoMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMerma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMerma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMerma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMerma);
				this.jInternalFrameDetalleFormTipoMerma.setVisible(false);
				this.jInternalFrameDetalleFormTipoMerma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMerma);
					this.jInternalFrameReporteDinamicoTipoMerma.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMerma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMerma);
					this.jInternalFrameImportacionTipoMerma.setVisible(false);
					this.jInternalFrameImportacionTipoMerma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMerma);
					this.jInternalFrameOrderByTipoMerma.setVisible(false);
					this.jInternalFrameOrderByTipoMerma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMermaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMermaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomermaReturnGeneral=new TipoMermaParameterReturnGeneral();
			
			this.tipomermaParameterGeneral=new TipoMermaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomermaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMermaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomermaSessionBean.getEsGuardarRelacionado(),this.tipomermaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMermaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomermaSessionBean.getEsGuardarRelacionado(),this.tipomermaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaDuplicarTipoMerma=true;
			this.isVisibilidadCeldaCopiarTipoMerma=true;
			this.isVisibilidadCeldaVerFormTipoMerma=true;
			this.isVisibilidadCeldaOrdenTipoMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
			this.isVisibilidadCeldaModificarTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=false;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=false;
			this.isVisibilidadCeldaGuardarTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMerma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMerma(false);
			
			this.setPermisosUsuarioTipoMerma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomermaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomermaSessionBean.getEsGuardarRelacionado() && this.tipomermaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMermaClasesRelacionadas();
			}
			
			if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMermaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMermaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMerma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMerma();
			}
			
			if(!this.isPermisoBusquedaTipoMerma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMerma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMerma,this.isPermisoPaginacionMedioTipoMerma,this.isPermisoPaginacionTodoTipoMerma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMermaConstantesFunciones.getTiposSeleccionarTipoMerma());
				
				this.tiposColumnasSelect=TipoMermaConstantesFunciones.getTiposSeleccionarTipoMerma(true);
				
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
			//if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMerma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoMerma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoMerma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMerma() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipomermaImplementable= (TipoMermaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMermaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomermaImplementableHome= (TipoMermaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMermaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomermas= new ArrayList<TipoMerma>();
			this.tipomermasEliminados= new ArrayList<TipoMerma>();
						
			this.isEsNuevoTipoMerma=false;
			this.esParaAccionDesdeFormularioTipoMerma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMerma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMerma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMermaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMerma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMerma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMerma();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMerma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMerma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMerma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMerma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMerma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMerma() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMerma")) {
				iIndex=this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMerma();	
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
	
	public void cargarCombosForeignKeyTipoMerma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMerma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMerma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMermaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMerma();
		
		this.cargarCombosFrameForeignKeyTipoMerma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMerma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMerma();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoMermaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			
			if(jTableDatosTipoMerma.getRowCount()>=1) {
				jTableDatosTipoMerma.removeRowSelectionInterval(0, jTableDatosTipoMerma.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMerma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMerma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMerma(true);			
			//this.tipomerma=new TipoMerma();
			//this.tipomerma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMerma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMerma() ;
			
			if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMerma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomerma);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);				
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMerma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMermaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMerma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMerma.getSelectedRows().length;			
			}
			
			tipomermasSeleccionados=this.getTipoMermasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMerma--;			
				//TipoMerma tipomermaAux= new TipoMerma();			
				//tipomermaAux.setId(this.iIdNuevoTipoMerma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMerma tipomermaOrigen=new TipoMerma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMerma tipomermaOrigen : tipomermasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomermaOrigen =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomermaOrigen =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMerma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomerma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMerma(tipomermaOrigen,this.tipomerma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomermaLogic.getTipoMermas().add(this.tipomermaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomermas.add(this.tipomermaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMerma(false);
				
				this.jTableDatosTipoMerma.setRowSelectionInterval(this.getIndiceNuevoTipoMerma(), this.getIndiceNuevoTipoMerma());
				
				int iLastRow =  this.jTableDatosTipoMerma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMerma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMerma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMerma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();									
		
			TipoMerma tipomermaOrigen=new TipoMerma();
			TipoMerma tipomermaDestino=new TipoMerma();
				
			tipomermasSeleccionados=this.getTipoMermasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMerma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomermasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMerma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaOrigen =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomermaOrigen =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomermaDestino =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomermaDestino =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomermaOrigen =tipomermasSeleccionados.get(0);
				tipomermaDestino =tipomermasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMerma(tipomermaOrigen,tipomermaDestino,true,false);
				
				tipomermaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomermaDestino,tipomermaLogic.getTipoMermas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomermaDestino,tipomermas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMerma(false);
				
				//this.jTableDatosTipoMerma.setRowSelectionInterval(this.getIndiceNuevoTipoMerma(), this.getIndiceNuevoTipoMerma());
				
				int iLastRow =  this.jTableDatosTipoMerma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMerma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMerma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMerma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMerma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMerma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMerma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMerma.setVisible(!isVisible);
			this.jPanelPaginacionTipoMerma.setVisible(!isVisible);
			this.jPanelAccionesTipoMerma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMerma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMerma();
			
			this.abrirFrameOrderByTipoMerma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMerma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMerma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMerma.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMerma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMerma.setSize(this.jInternalFrameDetalleFormTipoMerma.iWidthFormulario,this.jInternalFrameDetalleFormTipoMerma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMerma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMerma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMerma.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMerma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMerma.jContentPaneDetalleTipoMerma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMerma.jContentPaneDetalleTipoMerma.getWidth(),TipoMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMerma.jContentPaneDetalleTipoMerma.getWidth(),TipoMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMerma.jContentPaneDetalleTipoMerma.getWidth(),TipoMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMerma.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMerma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMerma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMerma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMerma,false,this);
				} else {
					this.jInternalFrameOrderByTipoMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMerma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMerma);
				this.jInternalFrameOrderByTipoMerma.setVisible(false);
				this.jInternalFrameOrderByTipoMerma.setSelected(false);
				
				this.jInternalFrameOrderByTipoMerma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMerma"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMerma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMerma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMerma==null) {
				
				this.jInternalFrameImportacionTipoMerma=new ImportacionJInternalFrame(TipoMermaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMerma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMerma);
				this.jInternalFrameImportacionTipoMerma.setVisible(false);
				this.jInternalFrameImportacionTipoMerma.setSelected(false);


				this.jInternalFrameImportacionTipoMerma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMerma"));
				this.jInternalFrameImportacionTipoMerma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMerma"));
				this.jInternalFrameImportacionTipoMerma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMerma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMerma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMerma==null) {
				this.jInternalFrameReporteDinamicoTipoMerma=new ReporteDinamicoJInternalFrame(TipoMermaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMerma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMerma);
				this.jInternalFrameReporteDinamicoTipoMerma.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMerma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMerma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMerma"));
				this.jInternalFrameReporteDinamicoTipoMerma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMerma"));
				this.jInternalFrameReporteDinamicoTipoMerma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMerma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMerma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoMerma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMerma);
			
	       	this.jInternalFrameDetalleFormTipoMerma.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMerma.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMerma.dispose();
			//this.jInternalFrameDetalleFormTipoMerma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMerma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMerma.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMerma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMerma.setVisible(true);
	        this.jInternalFrameImportacionTipoMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMerma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMerma.setVisible(true);
	        this.jInternalFrameOrderByTipoMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMerma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMerma.setVisible(false);
	        this.jInternalFrameOrderByTipoMerma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMerma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMerma.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMerma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMerma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMerma.setVisible(false);
	        this.jInternalFrameImportacionTipoMerma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMerma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMerma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMerma(true);
			//this.isEsNuevoTipoMerma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMerma(false) ;
			
			if(tipomermaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMerma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMerma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMermaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMerma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMerma(true);
			//this.isEsNuevoTipoMerma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomerma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMerma(false) ;
			
			if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMerma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMerma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,TipoMermaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoMerma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMerma(false);
			
			//if(!this.isEsNuevoTipoMerma) {								
				int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
				
			}
			
			if(this.permiteMantenimiento(this.tipomerma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMerma=true;
					this.inicializarActualizarBindingTablaTipoMerma(false);
					this.isEsNuevoTipoMerma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMerma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMerma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMerma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMerma(false);
				
				this.habilitarDeshabilitarControlesTipoMerma(false);
			
												
				
				if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMerma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMermaActionPerformed(evt,tipomermaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMerma(this.tipomerma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMerma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomermaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomerma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMermaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				this.tipomerma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				this.tipomerma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomerma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMermaModel) this.jTableDatosTipoMerma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMerma=true;
				this.inicializarActualizarBindingTablaTipoMerma(false);
				this.isEsNuevoTipoMerma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMerma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMerma(false);
				
				this.habilitarDeshabilitarControlesTipoMerma(false);
				
				
				
				if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMerma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMermaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMerma.getRowCount()>=1) {
				jTableDatosTipoMerma.removeRowSelectionInterval(0, jTableDatosTipoMerma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMerma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMerma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMerma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMerma(false) ;
			
			this.isEsNuevoTipoMerma=false;
			
			if(TipoMermaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMerma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMerma(false);
				
				//SI ES MANUAL
				if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMerma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMerma--;			
			//TipoMerma tipomermaAux= new TipoMerma();			
			//tipomermaAux.setId(this.iIdNuevoTipoMerma);
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMerma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
			
			this.tipomerma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomermaLogic.getTipoMermas().add(this.tipomermaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomermas.add(this.tipomermaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMerma(false);
			
			this.jTableDatosTipoMerma.setRowSelectionInterval(this.getIndiceNuevoTipoMerma(), this.getIndiceNuevoTipoMerma());
			
			int iLastRow =  this.jTableDatosTipoMerma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMerma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMerma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMerma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMerma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMerma(false);
			
			//SI ES MANUAL
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMerma();
			}
			
			//this.abrirFrameTreeTipoMerma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMermaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo MermaS ?", "MANTENIMIENTO DE Tipo Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMerma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMerma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomermaReturnGeneral=tipomermaLogic.procesarImportacionTipoMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomermaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMermaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMermaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMerma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMerma.setFileImportacion(this.jInternalFrameImportacionTipoMerma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMerma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMerma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMerma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMerma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMermaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		

		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMermaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMermaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMermas("Todos",tipomermasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMermaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMermaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMermaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoMerma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMermaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoMermaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoMermaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMermaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoMermaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoMermaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMermaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoMermaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoMermaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMermaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMermas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMermaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMermaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoMerma tipomerma:tipomermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomerma.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMermaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMermaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMerma tipomerma:tipomermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomerma.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMermaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMermaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoMerma tipomerma:tipomermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomerma.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoMerma(row);				
			//	iRow++;
			//}				
			
			//for(TipoMerma tipomermaAux:tipomermasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMerma(tipomermaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMerma(false);
			
			//SI ES MANUAL
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMerma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMerma(false);
			
			//SI ES MANUAL
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMerma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMerma(false);
			
			//SI ES MANUAL
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMerma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMerma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMerma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMerma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMerma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMerma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMerma.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMerma.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMerma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMerma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMerma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMerma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMerma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMerma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMerma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMerma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMerma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMermaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMerma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMerma();
		
		this.inicializarActualizarBindingBotonesManualTipoMerma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMerma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMerma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMerma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMerma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMerma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMerma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMerma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMerma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMerma.jCheckBoxPostAccionNuevoTipoMerma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMerma.jCheckBoxPostAccionSinCerrarTipoMerma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMerma.jCheckBoxPostAccionSinMensajeTipoMerma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMerma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMerma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMerma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMerma!=null) {
				this.jInternalFrameDetalleFormTipoMerma.jCheckBoxPostAccionNuevoTipoMerma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMerma.jCheckBoxPostAccionSinCerrarTipoMerma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMerma.jCheckBoxPostAccionSinMensajeTipoMerma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMerma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMerma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMerma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMerma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMerma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMerma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMerma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMerma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMerma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMerma(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMerma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMerma() throws Exception {
		try	{
			if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMerma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMerma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMerma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMerma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMerma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMerma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMerma.addItem(reporte);
			}
			
			
			if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMerma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMerma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMerma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMerma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMerma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMerma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMerma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMerma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
				this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
				this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMerma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMerma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMerma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMerma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMerma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMerma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoMerma.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoMerma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMerma(Boolean esInicializar) throws Exception {				
		if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMerma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMerma() throws Exception {
		this.inicializarActualizarBindingTablaTipoMerma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMerma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMermaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMermaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMerma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomermaLogic.getTipoMermas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomermas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMerma.setModel(new TipoMermaModel(this.tipomermaLogic.getTipoMermas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMerma.setModel(new TipoMermaModel(this.tipomermas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMerma!=null && this.jInternalFrameOrderByTipoMerma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMerma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMermaConstantesFunciones.SCLASSWEBTITULO,tipomermaConstantesFunciones.resaltarSeleccionarTipoMerma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMermaConstantesFunciones.SCLASSWEBTITULO,tipomermaConstantesFunciones.resaltarSeleccionarTipoMerma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,TipoMermaConstantesFunciones.LABEL_ID));

		if(this.tipomermaConstantesFunciones.mostraridTipoMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomermaConstantesFunciones.resaltaridTipoMerma,this.tipomermaConstantesFunciones.activaridTipoMerma,this,true,"idTipoMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomermaConstantesFunciones.resaltaridTipoMerma,this.tipomermaConstantesFunciones.activaridTipoMerma,this,true,"idTipoMerma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,TipoMermaConstantesFunciones.LABEL_IDPAIS));

		if(this.tipomermaConstantesFunciones.mostrarid_paisTipoMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipomermaConstantesFunciones.resaltarid_paisTipoMerma,this,this.tipomermaConstantesFunciones.activarid_paisTipoMerma));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipomermaConstantesFunciones.resaltarid_paisTipoMerma,this,this.tipomermaConstantesFunciones.activarid_paisTipoMerma,true,"id_paisTipoMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,TipoMermaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomermaConstantesFunciones.mostrarnombreTipoMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomermaConstantesFunciones.resaltarnombreTipoMerma,this.tipomermaConstantesFunciones.activarnombreTipoMerma,this,true,"nombreTipoMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomermaConstantesFunciones.resaltarnombreTipoMerma,this.tipomermaConstantesFunciones.activarnombreTipoMerma,this,true,"nombreTipoMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,TipoMermaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipomermaConstantesFunciones.mostrardescripcionTipoMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMermaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomermaConstantesFunciones.resaltardescripcionTipoMerma,this.tipomermaConstantesFunciones.activardescripcionTipoMerma,this,true,"descripcionTipoMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomermaConstantesFunciones.resaltardescripcionTipoMerma,this.tipomermaConstantesFunciones.activardescripcionTipoMerma,this,true,"descripcionTipoMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomermaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomermaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomermaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMerma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomermaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomermaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMerma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMerma && this.isPermisoGuardarCambiosTipoMerma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomermaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomermaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMerma.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMerma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMerma && this.isPermisoGuardarCambiosTipoMerma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMerma && this.isPermisoGuardarCambiosTipoMerma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMerma.moveColumn(this.jTableDatosTipoMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMerma.moveColumn(this.jTableDatosTipoMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMerma.moveColumn(this.jTableDatosTipoMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMerma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMerma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMerma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMerma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMerma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMerma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMerma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMerma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomermaLogic.getTipoMermas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomermas.size()-1;
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
		//this.jTableDatosTipoMerma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMerma();
			
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
				
				//this.isEsNuevoTipoMerma=false;
					
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
				if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMerma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMerma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMerma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomerma.getsType().equals("DUPLICADO")
				   || this.tipomerma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMerma=true;
				
				} else {
					this.isEsNuevoTipoMerma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomermaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomerma.getId()>=0 && !this.tipomerma.getIsNew()) {						
						this.isEsNuevoTipoMerma=false;
						
					} else {
						this.isEsNuevoTipoMerma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMerma(esRelaciones);						
				
				this.seleccionarTipoMerma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomerma.getId()<0) {
					this.isEsNuevoTipoMerma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMerma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMerma(evt,rowIndex);
				}	
				
				if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMerma: " + this.dDif); 
					}
				}								
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMerma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomerma)) {
					if(this.tipomerma.getId()>0) {
						this.tipomerma.setIsDeleted(true);
						
						this.tipomermasEliminados.add(this.tipomerma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomermaLogic.getTipoMermas().remove(this.tipomerma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomermas.remove(this.tipomerma);				
					}
					
					
					((TipoMermaModel) this.jTableDatosTipoMerma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMerma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMerma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMerma) {
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMerma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMerma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMerma(this.tipomerma);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipomermaConstantesFunciones.cargarid_paisTipoMerma || this.tipomermaConstantesFunciones.event_dependid_paisTipoMerma) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipomerma.getid_pais());
									//this.inicializarActualizarBindingTipoMerma(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipomerma.getPais()!=null) {
							this.paissForeignKey.add(tipomerma.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipomerma.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMerma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMerma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMerma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMerma(TipoMerma tipomerma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMerma(tipomerma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMerma(TipoMerma tipomerma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMerma(tipomerma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMerma(tipomerma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMerma(tipomerma);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMerma(TipoMerma tipomerma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setText(tipomerma.getId().toString());
			this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setText(tipomerma.getnombre());
			this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setText(tipomerma.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMerma tipomermaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomermaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMerma tipomermaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomermaLocal=this.tipomerma;
			} else {
				tipomermaLocal=this.tipomermaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomermaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMerma(tipomermaLocal,true);
					
					if(tipomermaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomermaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomermaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMerma(TipoMerma tipomerma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMerma(tipomerma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(tipomerma);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMerma(TipoMerma tipomerma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMerma(tipomerma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMerma(TipoMerma tipomerma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.getText()==null || this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.getText()=="" || this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setText("0");
			}

			if(conColumnasBase) {tipomerma.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMermaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMerma.jLabelIdTipoMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomerma.setnombre(this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMermaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMerma.jLabelnombreTipoMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomerma.setdescripcion(this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMermaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMerma.jLabeldescripcionTipoMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMerma(TipoMerma tipomermaBean,TipoMerma tipomerma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipomermaBean.getid_pais()!=null && !tipomermaBean.getid_pais().equals(-1L))) {tipomerma.setid_pais(tipomermaBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMerma(TipoMerma tipomermaOrigen,TipoMerma tipomerma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomermaOrigen.getId()!=null && !tipomermaOrigen.getId().equals(0L))) {tipomerma.setId(tipomermaOrigen.getId());}}
			if(conDefault || (!conDefault && tipomermaOrigen.getid_pais()!=null && !tipomermaOrigen.getid_pais().equals(-1L))) {tipomerma.setid_pais(tipomermaOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipomermaOrigen.getnombre()!=null && !tipomermaOrigen.getnombre().equals(""))) {tipomerma.setnombre(tipomermaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipomermaOrigen.getdescripcion()!=null && !tipomermaOrigen.getdescripcion().equals(""))) {tipomerma.setdescripcion(tipomermaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMerma(TipoMerma tipomerma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setText(tipomerma.getId().toString());
			this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setText(tipomerma.getnombre());
			this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setText(tipomerma.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMerma(TipoMermaBean tipomermaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setText(tipomermaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setText(tipomermaBean.getnombre());
			this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setText(tipomermaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMerma(TipoMermaParameterReturnGeneral tipomermaReturnGeneral,TipoMermaBean tipomermaBean,Boolean conDefault) throws Exception { 
		try {
			TipoMerma tipomermaLocal=new TipoMerma();
			
			tipomermaLocal=tipomermaReturnGeneral.getTipoMerma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomermaLocal.getId()!=null && !tipomermaLocal.getId().equals(0L))) {tipomermaBean.setId(tipomermaLocal.getId());}}
			if(conDefault || (!conDefault && tipomermaLocal.getid_pais()!=null && !tipomermaLocal.getid_pais().equals(-1L))) {tipomermaBean.setid_pais(tipomermaLocal.getid_pais());}
			if(conDefault || (!conDefault && tipomermaLocal.getnombre()!=null && !tipomermaLocal.getnombre().equals(""))) {tipomermaBean.setnombre(tipomermaLocal.getnombre());}
			if(conDefault || (!conDefault && tipomermaLocal.getdescripcion()!=null && !tipomermaLocal.getdescripcion().equals(""))) {tipomermaBean.setdescripcion(tipomermaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMermaGenerico(Long idTipoMermaSeleccionado,JComboBox jComboBoxTipoMerma,List<TipoMerma> tipomermasLocal)throws Exception {
		try {
			TipoMerma  tipomermaTemp=null;

			for(TipoMerma tipomermaAux:tipomermasLocal) {
				if(tipomermaAux.getId()!=null && tipomermaAux.getId().equals(idTipoMermaSeleccionado)) {
					tipomermaTemp=tipomermaAux;
					break;
				}
			}

			jComboBoxTipoMerma.setSelectedItem(tipomermaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMermaGenerico(JComboBox jComboBoxTipoMerma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMerma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMerma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMerma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMerma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomerma=(TipoMerma) tipomermaLogic.getTipoMermas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomerma =(TipoMerma) tipomermas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipomerma.getIsNew() && !tipomerma.getIsChanged() && !tipomerma.getIsDeleted()) {
				sDescripcion=tipomerma.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipomerma.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMerma tipomermaRow=new TipoMerma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomermaRow=(TipoMerma) tipomermaLogic.getTipoMermas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomermaRow=(TipoMerma) tipomermas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMerma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMerma.setVisible((this.isVisibilidadCeldaNuevoTipoMerma && this.isPermisoNuevoTipoMerma));			
			this.jButtonDuplicarTipoMerma.setVisible((this.isVisibilidadCeldaDuplicarTipoMerma && this.isPermisoDuplicarTipoMerma));			
			this.jButtonCopiarTipoMerma.setVisible((this.isVisibilidadCeldaCopiarTipoMerma && this.isPermisoCopiarTipoMerma));
			this.jButtonVerFormTipoMerma.setVisible((this.isVisibilidadCeldaVerFormTipoMerma && this.isPermisoVerFormTipoMerma));
			
			this.jButtonAbrirOrderByTipoMerma.setVisible((this.isVisibilidadCeldaOrdenTipoMerma && this.isPermisoOrdenTipoMerma));			
			
			this.jButtonNuevoRelacionesTipoMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMerma && this.isPermisoNuevoTipoMerma));			
			this.jButtonNuevoGuardarCambiosTipoMerma.setVisible((this.isVisibilidadCeldaNuevoTipoMerma && this.isPermisoNuevoTipoMerma && this.isPermisoGuardarCambiosTipoMerma));
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonModificarTipoMerma.setVisible((this.isVisibilidadCeldaModificarTipoMerma && this.isPermisoActualizarTipoMerma));	
			this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarTipoMerma.setVisible((this.isVisibilidadCeldaActualizarTipoMerma && this.isPermisoActualizarTipoMerma));	
			this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarTipoMerma.setVisible((this.isVisibilidadCeldaEliminarTipoMerma && this.isPermisoEliminarTipoMerma));
			this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarTipoMerma.setVisible(this.isVisibilidadCeldaCancelarTipoMerma);							
			this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.setVisible((this.isVisibilidadCeldaGuardarTipoMerma && this.isPermisoGuardarCambiosTipoMerma));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMerma && this.isPermisoGuardarCambiosTipoMerma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMerma.setVisible((this.isVisibilidadCeldaNuevoTipoMerma && this.isPermisoNuevoTipoMerma));						
			this.jButtonDuplicarToolBarTipoMerma.setVisible((this.isVisibilidadCeldaDuplicarTipoMerma && this.isPermisoDuplicarTipoMerma));						
			this.jButtonCopiarToolBarTipoMerma.setVisible((this.isVisibilidadCeldaCopiarTipoMerma && this.isPermisoCopiarTipoMerma));			
			this.jButtonVerFormToolBarTipoMerma.setVisible((this.isVisibilidadCeldaVerFormTipoMerma && this.isPermisoVerFormTipoMerma));			
			this.jButtonAbrirOrderByToolBarTipoMerma.setVisible((this.isVisibilidadCeldaOrdenTipoMerma && this.isPermisoOrdenTipoMerma));
			this.jButtonNuevoRelacionesToolBarTipoMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMerma && this.isPermisoNuevoTipoMerma));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMerma.setVisible((this.isVisibilidadCeldaNuevoTipoMerma && this.isPermisoNuevoTipoMerma && this.isPermisoGuardarCambiosTipoMerma));			
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonModificarToolBarTipoMerma.setVisible((this.isVisibilidadCeldaModificarTipoMerma && this.isPermisoActualizarTipoMerma));	
			this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarToolBarTipoMerma.setVisible((this.isVisibilidadCeldaActualizarTipoMerma  && this.isPermisoActualizarTipoMerma));	
			this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarToolBarTipoMerma.setVisible((this.isVisibilidadCeldaEliminarTipoMerma && this.isPermisoEliminarTipoMerma));
			this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarToolBarTipoMerma.setVisible(this.isVisibilidadCeldaCancelarTipoMerma);				
			this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosToolBarTipoMerma.setVisible((this.isVisibilidadCeldaGuardarTipoMerma && this.isPermisoGuardarCambiosTipoMerma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMerma && this.isPermisoGuardarCambiosTipoMerma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMerma.setVisible((this.isVisibilidadCeldaNuevoTipoMerma && this.isPermisoNuevoTipoMerma));			
			this.jMenuItemDuplicarTipoMerma.setVisible((this.isVisibilidadCeldaDuplicarTipoMerma && this.isPermisoDuplicarTipoMerma));			
			this.jMenuItemCopiarTipoMerma.setVisible((this.isVisibilidadCeldaCopiarTipoMerma && this.isPermisoCopiarTipoMerma));			
			this.jMenuItemVerFormTipoMerma.setVisible((this.isVisibilidadCeldaVerFormTipoMerma && this.isPermisoVerFormTipoMerma));			
			this.jMenuItemAbrirOrderByTipoMerma.setVisible((this.isVisibilidadCeldaOrdenTipoMerma && this.isPermisoOrdenTipoMerma));			
			//this.jMenuItemMostrarOcultarTipoMerma.setVisible((this.isVisibilidadCeldaOrdenTipoMerma && this.isPermisoOrdenTipoMerma));
			this.jMenuItemDetalleAbrirOrderByTipoMerma.setVisible((this.isVisibilidadCeldaOrdenTipoMerma && this.isPermisoOrdenTipoMerma));			
			//this.jMenuItemDetalleMostrarOcultarTipoMerma.setVisible((this.isVisibilidadCeldaOrdenTipoMerma && this.isPermisoOrdenTipoMerma));			
			this.jMenuItemNuevoRelacionesTipoMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMerma && this.isPermisoNuevoTipoMerma));			
			this.jMenuItemNuevoGuardarCambiosTipoMerma.setVisible((this.isVisibilidadCeldaNuevoTipoMerma && this.isPermisoNuevoTipoMerma && this.isPermisoGuardarCambiosTipoMerma));									
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemModificarTipoMerma.setVisible((this.isVisibilidadCeldaModificarTipoMerma && this.isPermisoActualizarTipoMerma));	
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemActualizarTipoMerma.setVisible((this.isVisibilidadCeldaActualizarTipoMerma && this.isPermisoActualizarTipoMerma));	
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemEliminarTipoMerma.setVisible((this.isVisibilidadCeldaEliminarTipoMerma && this.isPermisoEliminarTipoMerma));
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemCancelarTipoMerma.setVisible(this.isVisibilidadCeldaCancelarTipoMerma);				
			}
			
			this.jMenuItemGuardarCambiosTipoMerma.setVisible((this.isVisibilidadCeldaGuardarTipoMerma && this.isPermisoGuardarCambiosTipoMerma));						
			this.jMenuItemGuardarCambiosTablaTipoMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMerma && this.isPermisoGuardarCambiosTipoMerma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMerma=this.jButtonNuevoTipoMerma.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMerma=this.jButtonDuplicarTipoMerma.isVisible();
			this.isVisibilidadCeldaCopiarTipoMerma=this.jButtonCopiarTipoMerma.isVisible();
			this.isVisibilidadCeldaVerFormTipoMerma=this.jButtonVerFormTipoMerma.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMerma=this.jButtonAbrirOrderByTipoMerma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=this.jButtonNuevoRelacionesTipoMerma.isVisible();
			this.isVisibilidadCeldaModificarTipoMerma=this.jButtonModificarTipoMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.isVisibilidadCeldaActualizarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarTipoMerma.isVisible();
			this.isVisibilidadCeldaEliminarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarTipoMerma.isVisible();
			this.isVisibilidadCeldaCancelarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarTipoMerma.isVisible();
			this.isVisibilidadCeldaGuardarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=this.jButtonGuardarCambiosTablaTipoMerma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMerma=this.jButtonNuevoToolBarTipoMerma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=this.jButtonNuevoRelacionesToolBarTipoMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.isVisibilidadCeldaModificarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonModificarToolBarTipoMerma.isVisible();
			this.isVisibilidadCeldaActualizarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarToolBarTipoMerma.isVisible();
			this.isVisibilidadCeldaEliminarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarToolBarTipoMerma.isVisible();
			this.isVisibilidadCeldaCancelarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarToolBarTipoMerma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMerma=this.jButtonGuardarCambiosToolBarTipoMerma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=this.jButtonGuardarCambiosTablaToolBarTipoMerma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMerma=this.jMenuItemNuevoTipoMerma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=this.jMenuItemNuevoRelacionesTipoMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.isVisibilidadCeldaModificarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jMenuItemModificarTipoMerma.isVisible();
			this.isVisibilidadCeldaActualizarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jMenuItemActualizarTipoMerma.isVisible();
			this.isVisibilidadCeldaEliminarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jMenuItemEliminarTipoMerma.isVisible();
			this.isVisibilidadCeldaCancelarTipoMerma=this.jInternalFrameDetalleFormTipoMerma.jMenuItemCancelarTipoMerma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMerma=this.jMenuItemGuardarCambiosTipoMerma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=this.jMenuItemGuardarCambiosTablaTipoMerma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMerma(Boolean esInicializar) {
		if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomermaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMerma();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMerma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMerma() {
		this.jButtonNuevoTipoMerma.setVisible(this.isPermisoNuevoTipoMerma);			
		this.jButtonDuplicarTipoMerma.setVisible(this.isPermisoDuplicarTipoMerma);			
		this.jButtonCopiarTipoMerma.setVisible(this.isPermisoCopiarTipoMerma);			
		this.jButtonVerFormTipoMerma.setVisible(this.isPermisoVerFormTipoMerma);			
		
		this.jButtonAbrirOrderByTipoMerma.setVisible(this.isPermisoOrdenTipoMerma);					
		
		this.jButtonNuevoRelacionesTipoMerma.setVisible(this.isPermisoNuevoTipoMerma);			
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonModificarTipoMerma.setVisible(this.isPermisoActualizarTipoMerma);	
			this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarTipoMerma.setVisible(this.isPermisoActualizarTipoMerma);	
			this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarTipoMerma.setVisible(this.isPermisoEliminarTipoMerma);
			this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarTipoMerma.setVisible(this.isVisibilidadCeldaCancelarTipoMerma);						
			this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.setVisible(this.isPermisoGuardarCambiosTipoMerma);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMerma.setVisible(this.isPermisoActualizarTipoMerma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMerma() {
		this.jInternalFrameDetalleFormTipoMerma.jButtonModificarTipoMerma.setVisible(this.isPermisoActualizarTipoMerma);	
		this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarTipoMerma.setVisible(this.isPermisoActualizarTipoMerma);	
		this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarTipoMerma.setVisible(this.isPermisoEliminarTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarTipoMerma.setVisible(this.isVisibilidadCeldaCancelarTipoMerma);							
		this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.setVisible((this.isVisibilidadCeldaGuardarTipoMerma && this.isPermisoGuardarCambiosTipoMerma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMerma() {
		if(TipoMermaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMerma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMerma() {
	}
	
	public void jTableDatosTipoMermaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMerma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMerma(this.gettipomerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomerma==null) {
						this.tipomerma = new TipoMerma();
					}

					this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
				}

				if(this.tipomerma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomerma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoMerma(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMerma(this.gettipomerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipomermaLogic.getConnexion());

				if(this.tipomerma.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipomerma.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMerma=(TitledBorder)this.jScrollPanelDatosTipoMerma.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoMerma.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMerma(this.gettipomerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomerma==null) {
						this.tipomerma = new TipoMerma();
					}

					this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
				}

				if(this.tipomerma.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipomerma.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMerma(this.gettipomerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomerma==null) {
						this.tipomerma = new TipoMerma();
					}

					this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
				}

				if(this.tipomerma.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomerma.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMerma(this.gettipomerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomerma==null) {
						this.tipomerma = new TipoMerma();
					}

					this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);
				}

				if(this.tipomerma.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipomerma.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMerma(false,false);

			this.getTipoMermasFK_IdPais();

			this.inicializarActualizarBindingTipoMerma(false);

			//if(TipoMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMerma() {
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
			this.jInternalFrameDetalleFormTipoMerma.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMerma.dispose();
			this.jInternalFrameDetalleFormTipoMerma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
			this.jInternalFrameReporteDinamicoTipoMerma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMerma.dispose();
			this.jInternalFrameReporteDinamicoTipoMerma=null;
		}
		
		if(this.jInternalFrameImportacionTipoMerma!=null) {
			this.jInternalFrameImportacionTipoMerma.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMerma.dispose();
			this.jInternalFrameImportacionTipoMerma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMerma();
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMerma")) {
				jButtonDuplicarTipoMermaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMerma")) {
				jButtonCopiarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMerma")) {
				jButtonVerFormTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMerma")) {
				jButtonDuplicarTipoMermaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMerma")) {
				jButtonDuplicarTipoMermaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMerma")) {
				jButtonModificarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMerma")) {
				jButtonModificarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMerma")) {
				jButtonModificarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMerma")) {
				jButtonActualizarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMerma")) {
				jButtonActualizarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMerma")) {
				jButtonActualizarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMerma")) {
				jButtonEliminarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMerma")) {
				jButtonEliminarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMerma")) {
				jButtonEliminarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMerma")) {
				jButtonCancelarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMerma")) {
				jButtonCancelarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMerma")) {
				jButtonCancelarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMerma")) {
				jButtonCerrarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMerma")) {
				jButtonCerrarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMerma")) {
				jButtonCerrarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMerma")) {
				jButtonMostrarOcultarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMerma")) {
				jButtonCancelarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMerma")) {
				jButtonCopiarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMerma")) {
				jButtonVerFormTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMerma")) {
				jButtonCopiarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMerma")) {
				jButtonVerFormTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMerma")) {
				jButtonRecargarInformacionTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMerma")) {
				jButtonRecargarInformacionTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMerma")) {
				jButtonRecargarInformacionTipoMermaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMerma")) {
				jButtonAnterioresTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMerma")) {
				jButtonAnterioresTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMerma")) {
				jButtonAnterioresTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMerma")) {
				jButtonSiguientesTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMerma")) {
				jButtonSiguientesTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMerma")) {
				jButtonSiguientesTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMerma") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMerma")) {
				jButtonAbrirOrderByTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMerma") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMerma")) {
				jButtonMostrarOcultarTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMerma")) {
				jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMerma")) {
				jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMerma")) {
				jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMerma")) {
				jButtonCerrarReporteDinamicoTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMerma")) {
				jButtonGenerarReporteDinamicoTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMerma")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMerma")) {
				jButtonCerrarImportacionTipoMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMerma")) {
				
				jButtonGenerarImportacionTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMerma")) {
				
				jButtonAbrirImportacionTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMerma")) {
				jComboBoxTiposAccionesTipoMermaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMerma")) {
				jComboBoxTiposRelacionesTipoMermaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMerma")) {
				jComboBoxTiposAccionesTipoMermaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMerma")) {
				
				jComboBoxTiposSeleccionarTipoMermaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMerma")) {
				jTextFieldValorCampoGeneralTipoMermaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMerma")) {
				jButtonAbrirOrderByTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMerma")) {
				jButtonAbrirOrderByTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMerma")) {
				jButtonCerrarOrderByTipoMermaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMermaBusqueda")) {
				this.jButtonidTipoMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoMermaUpdate")) {
				this.jButtonid_paisTipoMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoMermaBusqueda")) {
				this.jButtonid_paisTipoMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMermaBusqueda")) {
				this.jButtonnombreTipoMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoMermaBusqueda")) {
				this.jButtondescripcionTipoMermaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoMerma")) {
				this.jButtonFK_IdPaisTipoMermaActionPerformed(evt);
			}
			
			;
			
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMerma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMerma tipomermaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomermaLocal=this.tipomerma;
			} else {
				tipomermaLocal=this.tipomermaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
							
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
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
			
			


			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
								
						
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
								
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
							
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
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
			
			


			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
								
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMerma")) {
					jCheckBoxSeleccionarTodosTipoMermaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMerma")) {
					jCheckBoxSeleccionadosTipoMermaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMerma")) {
					
				}
				
				


				
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
												
				
				


				
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
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
			
			


			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMermaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomerma);
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
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
				
				


				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMerma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomermaAnterior =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMerma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMermaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMerma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomerma =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomerma =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomerma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMerma")) {
				
				}
				
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMerma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMerma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMerma")) {
			
			}
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMerma();
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMerma")) {
				jButtonDuplicarTipoMermaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMerma")) {
				jButtonCopiarTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMerma")) {
				jButtonVerFormTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMerma")) {
				jButtonNuevoTipoMermaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMerma")) {
				jButtonModificarTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMerma")) {
				jButtonActualizarTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMerma")) {
				jButtonEliminarTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMerma")) {
				jButtonCancelarTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMerma")) {
				jButtonCerrarTipoMermaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMerma")) {
				jButtonGuardarCambiosTipoMermaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMerma")) {
				jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMerma")) {
				jButtonAbrirOrderByTipoMermaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMerma")) {
				jButtonRecargarInformacionTipoMermaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMerma")) {
				jButtonAnterioresTipoMermaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMerma")) {
				jButtonSiguientesTipoMermaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMermaBusqueda")) {
				this.jButtonidTipoMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoMermaUpdate")) {
				this.jButtonid_paisTipoMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoMermaBusqueda")) {
				this.jButtonid_paisTipoMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMermaBusqueda")) {
				this.jButtonnombreTipoMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoMermaBusqueda")) {
				this.jButtondescripcionTipoMermaBusquedaActionPerformed(evt);
			}
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMerma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMerma")) {
				closingInternalFrameTipoMerma();
				
			} else if(sTipo.equals("jButtonCancelarTipoMerma")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMerma = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMermaBeanSwingJInternalFrame jInternalFrameParent=(TipoMermaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMerma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMermaActionPerformed(null);
			}
			
			TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomerma,new Object(),this.tipomermaParameterGeneral,this.tipomermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMerma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMerma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMerma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomerma)) {
			if(!esControlTabla) {
				if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);			
				}
				
				if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMerma(this.tipomerma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomermaReturnGeneral=tipomermaLogic.procesarEventosTipoMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomermaLogic.getTipoMermas(),this.tipomerma,this.tipomermaParameterGeneral,this.isEsNuevoTipoMerma,classes);//this.tipomermaLogic.getTipoMerma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMerma(this.tipomermaReturnGeneral,this.tipomermaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMerma(classes,this.tipomermaReturnGeneral,this.tipomermaBean,false);
					}
						
					if(this.tipomermaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMerma(this.tipomermaReturnGeneral.getTipoMerma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMerma(this.tipomermaReturnGeneral.getTipoMerma());	
					}
						
					if(this.tipomermaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMerma(this.tipomermaReturnGeneral.getTipoMerma(),classes);//this.tipomermaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMerma(this.tipomerma,classes);//this.tipomermaBean);									
				}
			
				if(TipoMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMerma(this.tipomerma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMerma(this.tipomerma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomermaAnterior!=null) {
						this.tipomerma=this.tipomermaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomermaReturnGeneral=tipomermaLogic.procesarEventosTipoMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomermaLogic.getTipoMermas(),this.tipomerma,this.tipomermaParameterGeneral,this.isEsNuevoTipoMerma,classes);//this.tipomermaLogic.getTipoMerma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomermaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomermaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomermaReturnGeneral.getTipoMerma(),tipomermaLogic.getTipoMermas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomermaReturnGeneral.getTipoMerma(),this.tipomermas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMerma.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMerma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMerma();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMerma() throws Exception {
		
		TipoMermaModel tipomermaModel=(TipoMermaModel)this.jTableDatosTipoMerma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomermaModel.tipomermas=this.tipomermaLogic.getTipoMermas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomermaModel.tipomermas=this.tipomermas;
		}
		
		
		((TipoMermaModel) this.jTableDatosTipoMerma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMerma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomermaAnterior(),this.tipomermaLogic.getTipoMermas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomermaAnterior(),this.tipomermas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMerma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMerma(TipoMerma tipomerma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
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
										
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomerma,new Object(),generalEntityParameterGeneral,this.tipomermaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomermaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMermaConstantesFunciones.getClassesRelationshipsOfTipoMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMermaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMerma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMerma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomerma,new Object(),generalEntityParameterGeneral,this.tipomermaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMerma(TipoMermaBean tipomermaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMerma(ArrayList<Classe> classes,TipoMermaReturnGeneral tipomermaReturnGeneral,TipoMermaBean tipomermaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMerma(TipoMerma tipomerma,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipomerma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMerma = new TipoMermaDetalleFormJInternalFrame(jDesktopPane,this.tipomermaSessionBean.getConGuardarRelaciones(),this.tipomermaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.setVisible(false);
		this.jInternalFrameDetalleFormTipoMerma.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMerma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMerma.tipomermaLogic=this.tipomermaLogic;
		
		this.cargarCombosFrameForeignKeyTipoMerma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMerma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMerma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMerma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMerma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMerma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMerma"));
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonModificarTipoMerma.addActionListener(new ButtonActionListener(this,"ModificarTipoMerma"));

		
		this.jInternalFrameDetalleFormTipoMerma.jButtonModificarToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMerma"));
					
		this.jInternalFrameDetalleFormTipoMerma.jMenuItemModificarTipoMerma.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMerma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarTipoMerma.addActionListener (new ButtonActionListener(this,"ActualizarTipoMerma"));
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMerma"));
						
		this.jInternalFrameDetalleFormTipoMerma.jMenuItemActualizarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMerma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarTipoMerma.addActionListener (new ButtonActionListener(this,"EliminarTipoMerma"));
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMerma"));
								
		this.jInternalFrameDetalleFormTipoMerma.jMenuItemEliminarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMerma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarTipoMerma.addActionListener (new ButtonActionListener(this,"CancelarTipoMerma"));
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMerma"));
					
		this.jInternalFrameDetalleFormTipoMerma.jMenuItemCancelarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMerma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jMenuItemDetalleCerrarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMerma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMerma"));
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMerma"));
		
		
		
		this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMerma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonidTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMerma.jButtonid_paisTipoMermaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonid_paisTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonnombreTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtondescripcionTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoMermaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMerma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMerma"));
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMerma"));
		}
		
		this.jTableDatosTipoMerma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMerma"));
		
		this.jTableDatosTipoMerma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMerma"));
		
		this.jButtonNuevoTipoMerma.addActionListener(new ButtonActionListener(this,"NuevoTipoMerma"));
		
		this.jButtonDuplicarTipoMerma.addActionListener(new ButtonActionListener(this,"DuplicarTipoMerma"));
		
		this.jButtonCopiarTipoMerma.addActionListener(new ButtonActionListener(this,"CopiarTipoMerma"));
		
		this.jButtonVerFormTipoMerma.addActionListener(new ButtonActionListener(this,"VerFormTipoMerma"));
		
		
		this.jButtonNuevoToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMerma"));
			
		this.jButtonDuplicarToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMerma"));
			
		this.jMenuItemNuevoTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMerma"));
			
		this.jMenuItemDuplicarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMerma"));		
		
		
		this.jButtonNuevoRelacionesTipoMerma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMerma"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMerma"));
			
		this.jMenuItemNuevoRelacionesTipoMerma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMerma"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonModificarTipoMerma.addActionListener(new ButtonActionListener(this,"ModificarTipoMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonModificarToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMerma"));
			
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemModificarTipoMerma.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarTipoMerma.addActionListener (new ButtonActionListener(this,"ActualizarTipoMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonActualizarToolBarTipoMerma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMerma"));
				
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemActualizarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarTipoMerma.addActionListener (new ButtonActionListener(this,"EliminarTipoMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonEliminarToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMerma"));
						
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemEliminarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarTipoMerma.addActionListener (new ButtonActionListener(this,"CancelarTipoMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonCancelarToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMerma"));
			
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemCancelarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMerma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMerma"));		
		
		
		this.jButtonCerrarTipoMerma.addActionListener (new ButtonActionListener(this,"CerrarTipoMerma"));
		
		
		this.jButtonCerrarToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMerma"));
			
		this.jMenuItemCerrarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMerma"));
			
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jMenuItemDetalleCerrarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMerma"));
		}
		
		this.jButtonCopiarToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMerma"));
			
		this.jButtonVerFormToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMerma"));
		
		this.jMenuItemGuardarCambiosTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMerma"));
			
		this.jMenuItemCopiarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMerma"));		
		
		this.jMenuItemVerFormTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMerma"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMerma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMerma"));
			
		this.jMenuItemGuardarCambiosTablaTipoMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMerma"));		
		
		
		
		this.jButtonRecargarInformacionTipoMerma.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMerma"));
					
		this.jButtonRecargarInformacionToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMerma"));
		
		this.jMenuItemRecargarInformacionTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMerma"));		
		
		
		
		this.jButtonAnterioresTipoMerma.addActionListener (new ButtonActionListener(this,"AnterioresTipoMerma"));
		
		
		this.jButtonAnterioresToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMerma"));
		
		this.jMenuItemAnterioresTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMerma"));		
		
		
		this.jButtonSiguientesTipoMerma.addActionListener (new ButtonActionListener(this,"SiguientesTipoMerma"));
		
		
		this.jButtonSiguientesToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMerma"));
			
		this.jMenuItemSiguientesTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMerma"));
			
		this.jMenuItemAbrirOrderByTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMerma"));
			
		this.jMenuItemMostrarOcultarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMerma"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMerma"));
			
		this.jMenuItemDetalleMostarOcultarTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMerma"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMerma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMerma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMerma"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMerma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMerma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMerma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMerma"));

		this.jCheckBoxSeleccionadosTipoMerma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMerma"));
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMerma"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMerma.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMerma"));
			
		this.jComboBoxTiposAccionesTipoMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMerma"));
					
		this.jComboBoxTiposSeleccionarTipoMerma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMerma"));
			
		this.jTextFieldValorCampoGeneralTipoMerma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMerma"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonidTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMerma.jButtonid_paisTipoMermaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonid_paisTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonnombreTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtondescripcionTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoMermaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoMerma.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoMerma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMerma!=null) {
				this.jInternalFrameReporteDinamicoTipoMerma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMerma"));
				this.jInternalFrameReporteDinamicoTipoMerma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMerma"));
				this.jInternalFrameReporteDinamicoTipoMerma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMerma"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMerma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMerma"));				
			//this.jButtonGenerarReporteDinamicoTipoMerma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMerma"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMerma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMerma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMerma!=null) {
				this.jInternalFrameImportacionTipoMerma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMerma"));
				this.jInternalFrameImportacionTipoMerma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMerma"));
				this.jInternalFrameImportacionTipoMerma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMerma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMerma.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMerma"));
			
			this.jButtonAbrirOrderByToolBarTipoMerma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMerma"));			
			
			if(this.jInternalFrameOrderByTipoMerma!=null) {
				this.jInternalFrameOrderByTipoMerma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMerma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMerma.jTabbedPaneRelacionesTipoMerma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMerma"));
		
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
            		closingInternalFrameTipoMerma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMerma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMerma = (JInternalFrameBase)event.getSource();
	            	
	            TipoMermaBeanSwingJInternalFrame jInternalFrameParent=(TipoMermaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMerma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMermaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMerma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMermaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMerma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMerma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMerma";
		inputMap = this.jButtonNuevoTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMermaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMerma";
		inputMap = this.jButtonNuevoRelacionesTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMermaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMerma";
		inputMap = this.jButtonModificarTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMerma";
		inputMap = this.jButtonActualizarTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMerma";
		inputMap = this.jButtonEliminarTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMerma";
		inputMap = this.jButtonCancelarTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMerma";
		inputMap = this.jButtonCerrarTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMerma";
		inputMap = this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMerma.jButtonGuardarCambiosTipoMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMerma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMermaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonidTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMerma.jButtonid_paisTipoMermaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonid_paisTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtonnombreTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMerma.jButtondescripcionTipoMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoMermaBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoMerma.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoMerma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMermaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMerma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMerma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
					tipomermaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMerma tipomermaAux:tipomermas) {
					tipomermaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMermaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMerma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
						tipomermaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMerma tipomermaAux:tipomermas) {
						tipomermaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMerma tipomermaAux:tipomermas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMerma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMerma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMerma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMermaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMerma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMerma.getSelectedRows();
			
			TipoMerma tipomermaLocal=new TipoMerma();
			
			//this.seleccionarTodosTipoMerma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaLocal =(TipoMerma) this.tipomermaLogic.getTipoMermas().toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomermaLocal =(TipoMerma) this.tipomermas.toArray()[this.jTableDatosTipoMerma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomermaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
						tipomermaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMerma tipomermaAux:tipomermas) {
						tipomermaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMerma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMerma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMerma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMerma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMermaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMermaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMermaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMerma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMerma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMerma tipomermaAux:this.tipomermaLogic.getTipoMermas()) {
				
						if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomermaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipomermaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMerma tipomermaAux:tipomermas) {
					
						if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomermaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipomermaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMerma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMermaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMerma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMerma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMerma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMerma) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMerma(conSplash);
				
					this.generarReporteTipoMermasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMermasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMermasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMermasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMerma();
				
				this.exportarTipoMermasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMermas();
				//this.importarTipoMermas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMerma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMermasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMerma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMerma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMerma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMerma.jComboBoxTiposAccionesFormularioTipoMerma.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMerma();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMerma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMermaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMerma();
			
			if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
			TipoMerma tipomerma=new TipoMerma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMerma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMerma.getSelectedItem();
			
			
			
			
			tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomermasSeleccionados.size()==1) {
				for(TipoMerma tipomermaAux:tipomermasSeleccionados) {
					tipomerma=tipomermaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMerma();
			
      		//this.finishProcessTipoMerma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMermaReturnGeneral() throws Exception {
		if(this.tipomermaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomermaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomermaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomermaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomermaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomermaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMerma(false);
		}
		
		if(this.tipomermaReturnGeneral.getConRetornoLista() || this.tipomermaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomermaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomermaLogic.setTipoMermas(this.tipomermaReturnGeneral.getTipoMermas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomermaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomermaLogic.setTipoMerma(this.tipomermaReturnGeneral.getTipoMerma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMerma(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMerma() throws Exception {
		
		
	}
	
	public ArrayList<TipoMerma> getTipoMermasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMerma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMerma tipomermaAux:tipomermaLogic.getTipoMermas()) {
					if(tipomermaAux.getIsSelected()) {
						tipomermasSeleccionados.add(tipomermaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMerma tipomermaAux:this.tipomermas) {
					if(tipomermaAux.getIsSelected()) {
						tipomermasSeleccionados.add(tipomermaAux);				
					}
				}
			}
			
			if(tipomermasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomermasSeleccionados.addAll(this.tipomermaLogic.getTipoMermas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomermasSeleccionados.addAll(this.tipomermas);				
					}
				}
			}
		} else {
			tipomermasSeleccionados.add(this.tipomerma);
		}
		
		return tipomermasSeleccionados;
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
	
	public void generarReporteTipoMermasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMermasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMermasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMermasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMermasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Merma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMermasSeleccionados() throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMermas("Todos",tipomermasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMermasSeleccionados() throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMermas("Todos",tipomermasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMermasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMermas("Todos",tipomermasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMermasSeleccionados() throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMerma();
		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMerma();
		
		
		//this.generarReporteTipoMermas("Todos",tipomermasSeleccionados ,tipomermaImplementable,tipomermaImplementableHome);
	}
	
	public void mostrarImportacionTipoMermas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMerma();
		
		this.abrirFrameImportacionTipoMerma();		
		
			
		//this.generarReporteTipoMermas("Todos",tipomermasSeleccionados ,tipomermaImplementable,tipomermaImplementableHome);
	}
	
	public void importarTipoMermas() throws Exception {		
	
	}
	
	public void exportarTipoMermasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMermasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMermasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMermasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Merma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMermasSeleccionados() throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMerma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMerma tipomermaAux:tipomermasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMerma(tipomermaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomermaAux.setsDetalleGeneralEntityReporte(tipomermaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMerma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMermaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMermaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMerma(TipoMerma tipomerma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomerma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomerma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomerma.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomerma.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomerma.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMermasSeleccionados() throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMermas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMerma(row);				
				iRow++;
			}				
			
			for(TipoMerma tipomermaAux:tipomermasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMerma(tipomermaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMermasSeleccionados() throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();		
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomerma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomermas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomerma");
			//elementRoot.appendChild(element);
		
			for(TipoMerma tipomermaAux:tipomermasSeleccionados) {
				element = document.createElement("tipomerma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMerma(tipomermaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Merma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMerma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMermaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMerma(TipoMerma tipomerma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomerma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomerma.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomerma.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomerma.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoMerma(TipoMerma tipomerma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMermaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomerma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMermaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomerma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoMermaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipomerma.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoMermaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomerma.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoMermaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipomerma.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoMermasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMerma> tipomermasSeleccionados=new ArrayList<TipoMerma>();
		
		tipomermasSeleccionados=this.getTipoMermasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMerma(tipomermasSeleccionados);
		
		this.generarReporteTipoMermas("Todos",tipomermasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMerma(ArrayList<TipoMerma> tipomermasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMerma tipomermaAux:tipomermasSeleccionados) {
				tipomermaAux.setsDetalleGeneralEntityReporte(tipomermaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipomermaAux.setsDescripcionGeneralEntityReporte1(tipomermaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomermaAux.setsDescripcionGeneralEntityReporte1(tipomermaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoMermaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipomermaAux.setsDescripcionGeneralEntityReporte1(tipomermaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMerma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMerma=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMerma=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMerma=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=false;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
			this.isVisibilidadCeldaModificarTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=true;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
			this.isVisibilidadCeldaModificarTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=true;
			this.isVisibilidadCeldaEliminarTipoMerma=true;
			this.isVisibilidadCeldaCancelarTipoMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
			this.isVisibilidadCeldaModificarTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=true;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=true;
			this.isVisibilidadCeldaModificarTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=false;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
			this.isVisibilidadCeldaActualizarTipoMerma=false;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
			this.isVisibilidadCeldaModificarTipoMerma=true;
			this.isVisibilidadCeldaActualizarTipoMerma=false;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
			this.isVisibilidadCeldaCancelarTipoMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMerma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMermaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=true;
		} else {
			this.actualizarEstadoPanelsTipoMerma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMerma=false;
			//this.isVisibilidadCeldaVerFormTipoMerma=false;
			this.isVisibilidadCeldaDuplicarTipoMerma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomermaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMerma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMerma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomermaSessionBean.getEsGuardarRelacionado()) {
			if(!tipomermaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;												
			}
			
			this.jButtonCerrarTipoMerma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMerma=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomerma)) {
			this.isVisibilidadCeldaActualizarTipoMerma=false;
			this.isVisibilidadCeldaEliminarTipoMerma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMerma() {
	}
	
	public void actualizarEstadoPanelsTipoMerma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMerma!=null) {
				this.jScrollPanelDatosEdicionTipoMerma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMerma!=null) {
				this.jScrollPanelDatosTipoMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMerma!=null) {
				this.jPanelPaginacionTipoMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMerma!=null) {
					this.jTabbedPaneBusquedasTipoMerma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomermaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMerma!=null) {
				this.jTabbedPaneBusquedasTipoMerma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMerma!=null) {
				this.jPanelParametrosReportesTipoMerma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoMerma.remove(jPanelFK_IdPaisTipoMerma);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMermaSessionBean tipomermaSessionBean=new TipoMermaSessionBean();
		
		if(this.tipomermaSessionBean==null) {
			this.tipomermaSessionBean=new TipoMermaSessionBean();
		}
		
		this.tipomermaSessionBean.setsUltimaBusquedaTipoMerma(this.getsAccionBusqueda());
		this.tipomermaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomermaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipomermaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMermaSessionBean tipomermaSessionBean=new TipoMermaSessionBean();
		
		if(this.tipomermaSessionBean==null) {
			this.tipomermaSessionBean=new TipoMermaSessionBean();
		}
		
		if(this.tipomermaSessionBean.getsUltimaBusquedaTipoMerma()!=null&&!this.tipomermaSessionBean.getsUltimaBusquedaTipoMerma().equals("")) {
			this.setsAccionBusqueda(tipomermaSessionBean.getsUltimaBusquedaTipoMerma());
			this.setiNumeroPaginacion(tipomermaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomermaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipomermaSessionBean.getid_pais());
				tipomermaSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipomermaSessionBean.setsUltimaBusquedaTipoMerma("");
		this.tipomermaSessionBean.setiNumeroPaginacion(TipoMermaConstantesFunciones.INUMEROPAGINACION);
		this.tipomermaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMerma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMerma() {
		this.updateBorderResaltarBusquedasFormularioTipoMerma();
		this.updateVisibilidadBusquedasFormularioTipoMerma();
		this.updateHabilitarBusquedasFormularioTipoMerma();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMerma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMerma.getComponents().length>0) {
	

		if(this.tipomermaConstantesFunciones.resaltarFK_IdPaisTipoMerma!=null) {
			index= this.jTabbedPaneBusquedasTipoMerma.indexOfComponent(this.jPanelFK_IdPaisTipoMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMerma.getComponent(index);
				jPanel.setBorder(this.tipomermaConstantesFunciones.resaltarFK_IdPaisTipoMerma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMerma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMerma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMerma.indexOfComponent(this.jPanelFK_IdPaisTipoMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomermaConstantesFunciones.mostrarFK_IdPaisTipoMerma);
			if(!this.tipomermaConstantesFunciones.mostrarFK_IdPaisTipoMerma && index>-1) {
				this.jTabbedPaneBusquedasTipoMerma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMerma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMerma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMerma.indexOfComponent(this.jPanelFK_IdPaisTipoMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomermaConstantesFunciones.activarFK_IdPaisTipoMerma);
				this.jTabbedPaneBusquedasTipoMerma.setEnabledAt(index,this.tipomermaConstantesFunciones.activarFK_IdPaisTipoMerma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMerma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoMerma.indexOfComponent(this.jPanelFK_IdPaisTipoMerma);

			this.jTabbedPaneBusquedasTipoMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMerma.getComponent(index);

			this.tipomermaConstantesFunciones.setResaltarFK_IdPaisTipoMerma(resaltar);

			jPanel.setBorder(this.tipomermaConstantesFunciones.resaltarFK_IdPaisTipoMerma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoMerma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMerma() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMerma();
		this.updateVisibilidadResaltarControlesFormularioTipoMerma();
		this.updateHabilitarResaltarControlesFormularioTipoMerma();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMerma() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomermaConstantesFunciones.resaltaridTipoMerma!=null && this.jInternalFrameDetalleFormTipoMerma!=null) {this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setBorder(this.tipomermaConstantesFunciones.resaltaridTipoMerma);}
		if(this.tipomermaConstantesFunciones.resaltarid_paisTipoMerma!=null && this.jInternalFrameDetalleFormTipoMerma!=null) {this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setBorder(this.tipomermaConstantesFunciones.resaltarid_paisTipoMerma);}
		if(this.tipomermaConstantesFunciones.resaltarnombreTipoMerma!=null && this.jInternalFrameDetalleFormTipoMerma!=null) {this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setBorder(this.tipomermaConstantesFunciones.resaltarnombreTipoMerma);}
		if(this.tipomermaConstantesFunciones.resaltardescripcionTipoMerma!=null && this.jInternalFrameDetalleFormTipoMerma!=null) {this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setBorder(this.tipomermaConstantesFunciones.resaltardescripcionTipoMerma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMerma() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
	
		//this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostraridTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jPanelidTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostraridTipoMerma);
		//this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostrarid_paisTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jPanelid_paisTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostrarid_paisTipoMerma);
		//this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostrarnombreTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jPanelnombreTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostrarnombreTipoMerma);
		//this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostrardescripcionTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jPaneldescripcionTipoMerma.setVisible(this.tipomermaConstantesFunciones.mostrardescripcionTipoMerma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMerma() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMerma!=null) {
	
		this.jInternalFrameDetalleFormTipoMerma.jTextFieldidTipoMerma.setEnabled(this.tipomermaConstantesFunciones.activaridTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jComboBoxid_paisTipoMerma.setEnabled(this.tipomermaConstantesFunciones.activarid_paisTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jTextAreanombreTipoMerma.setEnabled(this.tipomermaConstantesFunciones.activarnombreTipoMerma);
		this.jInternalFrameDetalleFormTipoMerma.jTextAreadescripcionTipoMerma.setEnabled(this.tipomermaConstantesFunciones.activardescripcionTipoMerma);
		}
	}
	
		
}